from typing import List, Optional
from dataclasses import dataclass
from enum import Enum, auto
from datetime import date

from .LilypondDataclasses import Node

# class Node:
#     def __init__(self):
#         self.children = []

#     def getChildren(self):
#         return self.children

@dataclass
class Event(Node):
    pass

# For now, we will silently pass over Directions
# because they involve positioning on the page.
@dataclass
class Direction(Event): # done
    Text: str

    def __post_init__(self):
        checkStrings(self.Text)

    def enter(self):
        pass

    def leave(self):
        pass

@dataclass
class Barline(Event): # done
    BarStyle: Optional[str]

    def __post_init__(self):
        checkStrings(self.BarStyle)

    def enter(self):
        if self.BarStyle:
            return '<barline> <bar-style>{}</bar-style>'.format(self.BarStyle)

        return '<barline>'

    def leave(self):
        return '</barline>'


@dataclass
class Pitch(Node): # done
    Step: str
    Octave: int
    Alter: Optional[int]

    def __post_init__(self):
        checkStrings(self.Step)

    def enter(self):
        return '<pitch> <step>{}</step> <octave>{}</octave>'.format(self.Step, str(self.Octave))

    def leave(self):
        return '</pitch>'


@dataclass
class Rest(Event): # done
    Measure: Optional[str]

    def __post_init__(self):
        if self.Measure:
            checkStrings(self.Measure)

    def enter(self):
        if self.Measure and self.Measure == 'yes':
            return '<rest measure="yes" />'

        return '<rest />'

    def leave(self):
        pass


@dataclass
class Note(Event): # done
    Pitch: Optional[Pitch]
    Rest: Optional[Rest]
    Duration: int
    Type: str
    Chord: bool
    Voice: int
    Accidental: Optional[str]

    def __post_init__(self):
        checkStrings(self.Type)
        if self.Accidental:
            checkStrings(self.Accidental)

    def enter(self):
        outStr = '<note> '

        if self.chord:
            outStr += '<chord /> '

        if self.Pitch:
            outStr += self.Pitch.enter() + self.Pitch.leave()
        if self.Rest:
            outStr += self.Rest.enter() + self.Rest.leave()

        outStr += '<duration>{}</duration> <voice>{}</voice> <type>{}</type> '.format(str(self.Duration), str(self.Voice), self.Type)

        if self.Accidental:
            outStr += '<accidental>{}</accidental>'.format(self.Accidental)

        return outStr


    def leave(self):
        return '</note>'


@dataclass
class Clef(Node): # done
    Sign: str
    Line: int

    def __post_init__(self):
        checkStrings(self.Sign)

    def enter(self):
        return '<clef> <sign>{}</sign> <line>{}</line>'.format(self.Sign, str(self.Line))

    def leave(self):
        return '</clef>'


@dataclass
class Time(Node): # done
    Beats: int
    BeatType: str

    def __post_init__(self):
        checkStrings(self.BeatType)

    def enter(self):
        return '<time> <beats>{}</beats> <beat-type>{}</beat-type>'.format(str(self.Beats), self.BeatType)

    def leave(self):
        return '</time>'


@dataclass
class Key(Node): # done
    Fifths: int
    Mode: str

    def __post_init__(self):
        checkStrings(self.Mode)

    def enter(self):
        return '<key> <fifths>{}</fifths> <mode>{}</mode>'.format(str(self.Fifths), self.Mode)

    def leave(self):
        return '</key>'

@dataclass
class Divisions(Node): # done
    Content: int

    def enter(self):
        return '<divisions>' + str(self.Content)

    def leave(self):
        return '</divisions>'

@dataclass
class Attributes(Node): # done
    Divisions: Divisions
    Key: Key
    Time: Time
    Clef: Clef

    def __post_init__(self):
        self.children([self.Key, self.Time, self.Clef])

    def enter(self):
        return '<attributes>'

    def leave(self):
        return '</attributes>'

# What if clef changes in middle of measure?
class Measure(Node): # done
    Attributes: Attributes
    Events: List[Event]
    Number: int
    Implicit: str = 'no'

    def __post_init__(self):
        checkStrings([self.Implicit])
        self.children = [self.Attributes] + self.Events

    def enter(self):
        if self.Implicit == 'yes':
            return '<measure number="{}" implicit="yes">'.format(int(self.Number))

        return '<measure number="{}">'.format(int(self.Number))

    def leave(self):
        return '</measure>'

@dataclass
class Part(Node): # done
    PartName: str
    Measures: List[Measure]

    def __post_init__(self):
        checkStrings(self.PartName)
        self.children = self.Measures

    def enter(self):
        return '<part id="{}">'.format(self.PartName)

    def leave(self):
        return '</part>'

@dataclass
class Encoding(Node): #done
    EncodingDate: date
    Encoder: str = 'Bradley Gersh'
    Software: str = 'Ly2XML v0.01'
    EncodingDescription: str = 'Converted from Lilypond source with Ly2XML https://github.com/bradley-gersh/ly2xml'

    def __post_init__(self):
        checkStrings([self.Encoder, self.Software, self.EncodingDescription])

    def enter(self):
        return '<encoding> <encoding-date>{}</encoding-date> <encoder>{}</encoder> <software>{}</software> <encoding-descripion>{}</encoding-description>'.format(self.EncodingDate.strftime('%Y-%m-%d'), self.Encoder, self.Software, self.EncodingDescription)

    def leave(self):
        return '</encoding>'

@dataclass
class Creator(Node): #done
    Type: str
    Content: str

    def __post_init__(self):
        checkStrings([self.Type, self.Content])

    def enter(self):
        return '<creator type="{}">{}'.format(self.Type, self.Content)

    def leave(self):
        return '</creator>'

@dataclass
class Identification(Node): #done
    Creators: Optional[List[Creator]]
    Encoding: Optional[Encoding]

    def __post_init__(self):
        self.children = [self.Creator] if self.Creator else []

        if self.Encoding:
            self.children += self.Encoding

    def enter(self):
        return '<identification>'

    def leave(self):
        return '</identification>'

@dataclass
class WorkTitle(Node): # done
    Content: str

    def enter(self):
        return '<work-title>' + self.Content

    def leave(self):
        return '</work-title>'

@dataclass
class Work(Node): # done
    WorkTitle: WorkTitle

    def __post_init__(self):
        self.children = [self.WorkTitle]

    def enter(self):
        return '<work>'

    def leave(self):
        return '</work>'

@dataclass
class PartName(Node): # done
    Content: str

    def __post_init__(self):
        checkStrings(self.Content)

    def enter(self):
        return '<part-name>' + self.Content

    def leave(self):
        return '</part-name>'

@dataclass
class ScorePart(Node): # done
    PartName: PartName
    Id: str

    def __post_init__(self):
        checkStrings(self.Id)
        self.children = self.PartName

    def enter(self):
        return '<score-part id="{}">'.format(self.Id)

    def leave(self):
        return '</score-part>'



@dataclass
class PartList(Node): #done
    ScoreParts: List[ScorePart]

    def __post_init__(self):
        self.children = self.ScoreParts

    def entry(self):
        return '<part-list>'

    def leave(self):
        return '</part-list>'

@dataclass
class Header(Node): # done
    Work: Optional[Work]
    Identification: Optional[Identification]
    PartList: PartList

    def __post_init__(self):
        self.children = [self.Work] if self.Work else []

        if self.Identification:
            self.children += self.Identification

        self.children += [self.PartList]

    def enter(self):
        pass

    def leave(self):
        pass

@dataclass
class ScorePartwise(Node): # done
    Header: Header
    Parts: List[Part]

    def __post_init__(self):
        self.children = [self.Header] + self.Parts

    def enter(self):
        return '<score-partwise version="4.0">'

    def leave(self):
        return '</score-partwise>'

@dataclass
class MusXMLFile(Node): # done
    Score: ScorePartwise

    def __post_init__(self):
        self.children = [self.Score]

    def enter(self):
        return '<?xml version="1.0" encoding="UTF-8" standalone="no"?> <!DOCTYPE score-partwise PUBLIC "-//Recordare//DTD MusicXML 4.0 Partwise//EN" "http://www.musicxml.org/dtds/partwise.dtd">'

    def leave(self):
        pass

def checkStrings(strings):
    if type(strings) == str:
        strings = [strings]

    for string in strings:
        if '>' in string or '<' in string:
            raise ValueError('Invalid string format')
