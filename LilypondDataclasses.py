from typing import List, Optional
from dataclasses import dataclass, field
from enum import Enum, auto
from numbers import Number

from LilypondParser import LilypondParser

class Node:
    def __init__(self):
        self.children = []

    def getChildren(self):
        return self.children

@dataclass
class Group(Node):
    pass

@dataclass
class CommandName(Enum):
    # There are many Lilypond commands I am omitting here.
    # A fuller implementation should account for them all.
    CONSISTS = auto()
    OVERRIDE = auto()
    REMOVE = auto()
    SET = auto()

@dataclass
class Command(Node):
    Command: CommandName
    Argument: str

@dataclass
class MetadataField(Enum):
    TITLE = auto()
    SUBTITLE = auto()
    COMPOSER = auto()

@dataclass
class Metadata(Node):
    Field: MetadataField
    Value: str

@dataclass
class Header(Group):
    Metadata: Optional[List(Metadata)]

@dataclass
class SchemeCmd(Node):
    Command: str

@dataclass
class Version(Node):
    LilypondVer: str

@dataclass
class WithCmd(Group):
    Commands: List(Command)


@dataclass
class NoteLength(Enum):
    WHOLE = auto()
    WHOLED = auto()
    WHOLEDD = auto()
    WHOLEDDD = auto()
    HALF = auto()
    HALFD = auto()
    HALFDD = auto()
    HALFDDD = auto()
    QUARTER = auto()
    QUARTERD = auto()
    QUARTERDD = auto()
    QUARTERDDD = auto()
    EIGHTH = auto()
    EIGHTHD = auto()
    EIGHTHDD = auto()
    EIGHTHDDD = auto()
    SIXTEENTH = auto()
    SIXTEENTHD = auto()
    SIXTEENTHDD = auto()
    SIXTEENTHDDD = auto()
    THIRTYSECOND = auto()
    THIRTYSECONDD = auto()
    THIRTYSECONDDD = auto()
    THIRTYSECONDDDD = auto()
    SIXTYFOURTH = auto()
    SIXTYFOURTHD = auto()
    SIXTYFOURTHDD = auto()
    SIXTYFOURTHDDD = auto()
    ONETWENTYEIGHTH = auto()
    ONETWENTYEIGHTHD = auto()
    ONETWENTYEIGHTHDD = auto()
    ONETWENTYEIGHTHDDD = auto()
    TWOFIFTYSIXTH = auto()
    TWOFIFTYSIXTHD = auto()
    TWOFIFTYSIXTHDD = auto()
    TWOFIFTYSIXTHDDD = auto()

@dataclass
class PitchClass(Enum):
    AESES = auto()
    AES = auto()
    A = auto()
    AIS = auto()
    AISIS = auto()
    BESES = auto()
    BES = auto()
    B = auto()
    BIS = auto()
    BISIS = auto()
    CESES = auto()
    CES = auto()
    C = auto()
    CIS = auto()
    CISIS = auto()
    DESES = auto()
    DES = auto()
    D = auto()
    DIS = auto()
    DISIS = auto()
    ESES = auto()
    ES = auto()
    E = auto()
    EIS = auto()
    EISIS = auto()
    FESES = auto()
    FES = auto()
    F = auto()
    FIS = auto()
    FISIS = auto()
    GESES = auto()
    GES = auto()
    G = auto()
    GIS = auto()
    GISIS = auto()

@dataclass
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

@dataclass
class Time(Node):
    Numerator: int
    Denominator: NoteLength

@dataclass
class Key(Node):
    Note: PitchClass
    Mode: Mode

@dataclass
class Pitch(Node):
    PitchClass: PitchClass
    Octave: Number

@dataclass
class Extra(Enum):
    CLEF_BASS = auto()
    CLEF_TREBLE = auto()
    FERMATA = auto()
    MARK = auto()
    BAR_SINGLE = auto()
    BAR_DOUBLE = auto()
    BAR_FINAL = auto()

@dataclass
class Chord(Node):
    Pitch: Pitch
    Length: NoteLength
    Extras: Optional[List(Extra)]

@dataclass
class Tempo(Node):
    Desc: str
    Unit = NoteLength
    PerMin = int

@dataclass
class NoteGroup(Group):
    Time: Optional[Time]
    Key: Optional[Key]
    Tempo: Optional[Tempo]
    Notes = List(Chord)

@dataclass
class Staff(Group):
    WithCmd: Optional[WithCmd]
    Notes: NoteGroup

@dataclass
class StaffGroup(Group):
    Staves: List(Staff)

@dataclass
class Score(Group):
    StaffGroups: List(StaffGroup)

@dataclass
class ScoreFile(Group):
    Header: Optional[Header]
    SchemeCmds: Optional[SchemeCmd]
    Score: Score
    Version: Version
