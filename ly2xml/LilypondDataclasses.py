from typing import List, Optional
from dataclasses import dataclass
from enum import Enum, auto
from numbers import Number

from LilypondParser import LilypondParser

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
def OctaveStyle(Enum):
    DEFAULT = auto()
    RELATIVE = auto()

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
class NoteEvent(Node):
    pass

@dataclass
class Barline(NoteEvent):
    BarStyle: BarlineType

@dataclass
class Note(NoteEvent):
    Pitch: Pitch
    Length: NoteLength

@dataclass
class Chord(NoteEvent):
    Notes: Note
    # Extras: Optional[List(Extra)]

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
    NoteLength: NoteLength
    Dots: Optional[int]

@dataclass
class Fermata(Node):
    pass

@dataclass
class Pitch(Node):
    DiaClass: DiaClass
    Accidental: Accidental
    Octave: Optional[int]

    # def __init__(self, pitchStr, octave=-1):
        # self.Name = pitchStr
        # self.DiaClass = DiaClass[pitchStr[0]]
        # self.Accidental = Accidental.convertAccidental(pitchStr[1:])
        # self.Octave = octave
        # self.PC = (DiaClass.numericDiaClass(self.DiaClass), Accidental.numericAccidental(self.Accidental))

@dataclass
class Key(NoteEvent):
    Pitch: Pitch = Pitch(DiaClass=DiaClass.C, Accidental=Accidental.NATURAL)
    # Fifths: int
    Mode: Mode = Mode.MAJOR

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
    NoteEvents: List(NoteEvent)
    OctaveStyle: List(OctaveStyle)
    VoiceNumber: int

@dataclass
class RehearsalMark(Node):
    pass

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
class Tempo(NoteEvent):
    Desc: str
    Unit = int
    PerMin = int

@dataclass
class Time(NoteEvent):
    Numerator: int
    Denominator: int

@dataclass
class Voice(Group):
    WithCmd: Optional[WithCmd]
    Notes: NoteGroup
