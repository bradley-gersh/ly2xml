from optparse import Option
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

class MetadataField(Enum):
    TITLE = Optional[auto()]
    SUBTITLE = Optional[auto()]
    COMPOSER = Optional[auto()]

class Metadata(Group):
    field: MetadataField
    value: str

@dataclass
class Header(Group):
    metadata: Optional[List(Metadata)]

@dataclass
class SchemeCmd(Node):
    command: str

@dataclass
class Version(Node):
    lilypond_ver: str

@dataclass
class Staff(Group):
    with_cmd: Optional[WithCmd]
    prefix: Optional[Prefix]
    notes: Notes

@dataclass
class StaffGroup(Group):
    staves: List(Staff)
@dataclass
class Score(Group):
    staff_groups: List(StaffGroup)
@dataclass
class Score_File(Group):
    header: Optional[Header]
    scheme_cmds: SchemeCmd
    score: Score
    version: Version
