from typing import List, Optional
from dataclasses import dataclass, field
from enum import Enum, auto
from numbers import Number

from LilypondParser import LilypondParser

# Enum constants
class CommandName(Enum):
    # There are many Lilypond commands I am omitting here.
    # A fuller implementation should account for them all.
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
    ONEOHTWENTYEIGHTH = auto()

class DiaClass(Enum):
    A = auto()
    B = auto()
    C = auto()
    D = auto()
    E = auto()
    F = auto()
    G = auto()

class Accidental(Enum):
    FLAT = auto()
    SHARP = auto()
    NATURAL = auto()
    DOUBLEFLAT = auto()
    DOUBLESHARP = auto()
    NATURALSHARP = auto()
    NATURALFLAT = auto()

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
    CLEF_TREBLE = auto()
    CLEF_BASS = auto()

class Barline(Enum):
    BAR_SINGLE = auto()
    BAR_DOUBLE = auto()
    BAR_FINAL = auto()
    BAR_START_REPEAT = auto()
    BAR_END_REPEAET = auto()

class Extra(Enum):
    FERMATA = auto()
    MARK = auto()

# Node types
class Node:
    def __init__(self):
        self.children = []

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
class Duration(Node):
    NoteLength: NoteLength
    Dots: Optional[int]

@dataclass
class Time(Node):
    Numerator: int
    Denominator: int

@dataclass
class Key(Node):
    Sharps: int
    Mode: Mode

@dataclass
class Pitch(Node):
    DiaClass: DiaClass
    Accidental: Accidental
    Octave: Number

@dataclass
class Clef(Node):
    Type: ClefType

@dataclass
class Chord(Node):
    Pitch: Pitch
    Length: NoteLength
    Extras: Optional[List(Extra)]

@dataclass
class Tempo(Node):
    Desc: str
    Unit = int
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

@dataclass
class Voice(Group):
    WithCmd: Optional[WithCmd]
    Notes: NoteGroup
