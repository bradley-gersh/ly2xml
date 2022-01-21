from typing import List, Optional
from dataclasses import dataclass, field
from enum import Enum, auto
from numbers import Number

from LilypondParser import LilypondParser
from Node import Node

@dataclass
class Group(Node):
    pass

@dataclass
class Book(Group):
    Scores:
