from typing import List, Optional
from dataclasses import dataclass
from enum import Enum, auto
from datetime import date

# Enum constants
class Node:
    def __init__(self):
        self.children = []

    def getChildren(self):
        return self.children

@dataclass
class Event(Node):
    pass

@dataclass
class Direction(Event):
    Text: str

@dataclass
class Barline(Event):
    Type: str

@dataclass
class Pitch(Node):
    Step: str
    Octave: int
    Alter: int

@dataclass
class Rest(Event):
    pass

@dataclass
class Note(Event):
    Pitch: Optional[Pitch]
    Rest: Optional[Rest]
    Duration: int
    Type: str
    Chord: bool
    Voice: int
    Accidental: str

@dataclass
class Clef(Node):
    Sign: str
    Line: int

@dataclass
class Time(Node):
    Beats: int
    BeatType: str

@dataclass
class Key(Node):
    Fifths: int
    Mode: str

@dataclass
class Attribute(Node):
    Divisions: int
    Key: Key
    Time: Time
    Clef: Clef
    Transpose: Optional[int]

class Measure(Node):
    Attributes: List[Attribute]
    Events: List[Event]

@dataclass
class Part(Node):
    PartName: str
    Measures: List[Measure]

@dataclass
class Encoding(Node):
    EncodingDate: date
    Encoder: str = 'Bradley Gersh'
    Software: str = 'Ly2XML v0.01'
    EncodingDescription: str = 'Converted from Lilypond source with Ly2XML https://github.com/bradley-gersh/ly2xml'

@dataclass
class Identification(Node):
    Creator: Creator
    Encoding: Encoding

class Creator(Node):
    Type: str
    Content: str

@dataclass
class WorkTitle(Node):
    Content: str

@dataclass
class Work(Node):
    WorkTitle: WorkTitle

@dataclass
class ScorePart(Node):
    PartName: str

@dataclass
class Header(Node):
    Work: Work
    Identification: Identification
    PartList: List[ScorePart]

@dataclass
class ScorePartwise(Node):
    Header: Header
    Parts: List[Part]
