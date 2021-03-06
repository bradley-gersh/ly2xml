from typing import List, Optional
from dataclasses import dataclass
from enum import Enum, auto
from numbers import Number

# Enum constants
class CommandName(Enum):
    # There are many Lilypond commands omitted here.
    CONSISTS = auto()
    OVERRIDE = auto()
    REMOVE = auto()
    SET = auto()

class MetadataField(Enum):
    TITLE = auto()
    SUBTITLE = auto()
    COMPOSER = auto()

class NoteLength(Enum):
    WHOLE = auto()
    HALF = auto()
    QUARTER = auto()
    EIGHTH = auto()
    SIXTEENTH = auto()
    THIRTYSECOND = auto()
    SIXTYFOURTH = auto()
    ONETWENTYEIGHTH = auto()
    TWOFIFTYSIXTH = auto()
    FIVETWELFTH = auto()
    THOUSANDTWENTYFOURTH = auto()

class DiaClass(Enum):
    A = auto()
    B = auto()
    C = auto()
    D = auto()
    E = auto()
    F = auto()
    G = auto()
    R = auto()

    # @classmethod
    # def numericDiaClass(cls, dpc):
    #     if dpc == cls.C:
    #         return 0
    #     elif dpc == cls.D:
    #         return 2
    #     elif dpc == cls.E:
    #         return 4
    #     elif dpc == cls.F:
    #         return 5
    #     elif dpc == cls.G:
    #         return 7
    #     elif dpc == cls.A:
    #         return 9
    #     elif dpc == cls.B:
    #         return 11
    #     else:
    #         raise ValueError('Unable to convert diatonic class to pc number')

class Accidental(Enum):
    FLAT = auto()
    SHARP = auto()
    NATURAL = auto()
    DOUBLEFLAT = auto()
    DOUBLESHARP = auto()
    NATURALSHARP = auto()
    NATURALFLAT = auto()

    @classmethod
    def fromLyStr(cls, lyAcc):
        if lyAcc == 'is':
            return cls.SHARP
        elif lyAcc in ('s', 'es'):
            return cls.FLAT
        elif lyAcc == 'isis':
            return cls.DOUBLESHARP
        elif lyAcc in ('ses', 'eses'):
            return cls.DOUBLEFLAT
        else:
            raise ValueError('Unable to parse Lilypond accidental')

    @classmethod
    def toInt(cls, acc):
        if acc in (cls.FLAT, cls.NATURALFLAT):
            return -1
        elif acc == cls.NATURAL:
            return 0
        elif acc in (cls.SHARP, cls.NATURALSHARP):
            return 1
        elif acc == cls.DOUBLEFLAT:
            return -2
        elif acc == cls.DOUBLESHARP:
            return 2
        else:
            raise ValueError('Unable to convert accidental to number')


class Mode(Enum):
    MAJOR = auto()
    MINOR = auto()
    IONIAN = auto()
    DORIAN = auto()
    PHRYGIAN = auto()
    LYDIAN = auto()
    MIXOLYDIAN = auto()
    AEOLIAN = auto()
    LOCRIAN = auto()

class ClefType(Enum):
    TREBLE = 'treble'
    BASS = 'bass'

class BarlineType(Enum):
    SINGLE = auto()
    DOUBLE = auto()
    FINAL = auto()
    START_REPEAT = auto()
    END_REPEAT = auto()
    DOUBLE_REPEAT = auto()
    DOTTED = auto()
    DASHED = auto()

    @classmethod
    def fromLyStr(cls, string):
        if string == '.|:':
            return cls.START_REPEAT
        elif string == ':|.':
            return cls.END_REPEAT
        elif string == ':|.|:':
            return cls.DOUBLE_REPEAT
        elif string == '|':
            return cls.SINGLE
        elif string == '||':
            return cls.DOUBLE
        elif string == '.|':
            return cls.FINAL
        elif string == ';':
            return cls.DOTTED
        elif string == '!':
            return cls.DASHED
        else:
            raise ValueError('')

# Enum constants
class OctaveStyle(Enum):
    DEFAULT = auto()
    RELATIVE = auto()

# Node types
class Node:
    def __init__(self):
        self.children = []

    def setChildren(self, newChildren):
        self.children = newChildren

    def appendChildren(self, newChildren):
        self.children += newChildren

    def getChildren(self):
        return self.children

@dataclass
class Group(Node):
    pass

@dataclass
class Command(Node):
    Command: CommandName
    Argument: str

@dataclass
class Metadata(Node):
    Field: MetadataField
    Value: str

@dataclass
class Header(Group):
    Metadata: Optional[List[Metadata]]

    def __post_init__(self):
        self.children = [self.Metadata] if self.Metadata else []

@dataclass
class SchemeCmd(Node):
    Command: str

@dataclass
class Version(Node):
    LilypondVer: str

@dataclass
class WithCmd(Group):
    Commands: List[Command]

    def __post_init__(self):
        self.children = [self.Commands]

@dataclass
class NoteEvent(Node):
    pass

@dataclass
class Barline(NoteEvent):
    BarStyle: BarlineType

@dataclass
class Clef(Node):
    Type: ClefType
    # Shape: str
    # Line: int

    # @staticmethod
    # def clefInfo(clefType):
    #     if (clefType.upper() == 'TREBLE'):
    #         shape = 'G'
    #         line = 2
    #     elif (clefType.upper() == 'BASS'):
    #         shape = 'F'
    #         line = 4
    #     else:
    #         raise ValueError('Invalid clef type')

    #     return (shape, line)


@dataclass
class Duration(Node):
    NoteLength: int
    Dots: Optional[int]

@dataclass
class Fermata(Node):
    pass

# @dataclass
class Pitch(Node):
#     DiaClass: DiaClass
#     Accidental: Accidental
#     Octave: Optional[int]

    def __init__(self, pitchStr, octave=-1):
        self.Name = pitchStr
        self.DiaClass = DiaClass[pitchStr[0].upper()]
        self.Accidental = Accidental.fromLyStr(pitchStr[1:]) if len(pitchStr) > 1 else Accidental.NATURAL
        self.Octave = octave
        # self.PC = (DiaClass.numericDiaClass(self.DiaClass), Accidental.numericAccidental(self.Accidental))

@dataclass
class Note(NoteEvent):
    Pitch: Pitch
    Duration: Duration

    def __post_init__(self):
        self.children = [self.Pitch, self.Duration]

@dataclass
class Chord(NoteEvent):
    Notes: List[Note]
    # Extras: Optional[List[Extra]]

    def __post_init__(self):
        self.children = self.Notes

@dataclass
class Key(NoteEvent):
    Pitch: Pitch = Pitch('c')
    # Fifths: int
    Mode: Mode = Mode.MAJOR

    def __post_init__(self):
        self.children = [self.Pitch, self.Mode]
    # @staticmethod
    # def findFifths(pitch):
    #     # We will work mod 15 then translate down to 0-center
    #     cMaj = 8
    #     fifths = cMaj

    #     if pitch.DiaClass == DiaClass.F:
    #         fifths -= 1
    #     elif pitch.DiaClass == DiaClass.C:
    #         pass
    #     elif pitch.DiaClass == DiaClass.G:
    #         fifths += 1
    #     elif pitch.DiaClass == DiaClass.D:
    #         fifths += 2
    #     elif pitch.DiaClass == DiaClass.A:
    #         fifths += 3
    #     elif pitch.DiaClass == DiaClass.E:
    #         fifths += 4
    #     elif pitch.DiaClass == DiaClass.B:
    #         fifths += 5
    #     else:
    #         raise ValueError("Invalid DiaClass in Key")

    #     if pitch.Accidental == Accidental.NATURAL:
    #         pass
    #     elif pitch.Accidental == Accidental.FLAT:
    #         fifths -= 7
    #     elif pitch.Accidental == Accidental.SHARP:
    #         fifths += 7
    #     else:
    #         raise ValueError("Invalid Accidental in Key")

    #     fifths %= 15
    #     fifths -= 8

    #     return fifths

@dataclass
class NoteGroup(Group):
    NoteEvents: List[NoteEvent]
    OctaveStyle: OctaveStyle
    VoiceNumber: int

    def __post_init__(self):
        self.children = self.NoteEvents

@dataclass
class RehearsalMark(Node):
    Mark: str

class RehearsalCounter:
    def __init__(self, markType='letters'):
        self.counter = -1
        self.markType = markType

    def resetMark(self):
        self.counter = -1

    def nextMark(self):
        self.counter += 1
        if self.markType == 'letters':
            return 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'[self.counter % 26]
        else:
            return self.counter

@dataclass
class Staff(Group):
    # WithCmd: Optional[WithCmd]
    Notes: NoteGroup

    def __post_init__(self):
        self.children = [self.Notes]

@dataclass
class StaffGroup(Group):
    Staves: List[Staff]

    def __post_init__(self):
        self.children = self.Staves

@dataclass
class Score(Group):
    StaffGroups: List[StaffGroup]

    def __post_init__(self):
        self.children = self.StaffGroups

@dataclass
class ScoreFile(Group):
    Header: Optional[Header]
    SchemeCmds: Optional[SchemeCmd]
    Score: Score
    Version: Version

    def __post_init__(self):
        self.children = [self.Header] if self.Header else []

        if self.SchemeCmds:
            self.children += self.SchemeCmds

        self.children += [Score, Version]

@dataclass
class Tempo(NoteEvent):
    Desc: Optional[str]
    Unit: Optional[int]
    PerMin: Optional[int]

@dataclass
class Time(NoteEvent):
    Numerator: int
    Denominator: int

@dataclass
class Voice(Group):
    WithCmd: Optional[WithCmd]
    Notes: NoteGroup

    def __post_init__(self):
        self.children = [self.WithCmd] if self.WithCmd else []
        self.children += [self.Notes]
