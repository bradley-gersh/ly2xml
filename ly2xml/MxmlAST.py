from .LilypondAST import *
from . import LilypondDataclasses as Ly
from .MxmlDataclasses import *

def writemxml(node):
    outStr = node.enter()

    if len(node.children > 0):
        for child in node.children:
            writemxml(child)

    outStr += node.leave()

    return outStr

# Methods to migrate LyAST to MxAST

Node = Ly.Node

def LyCommandToMxAst(Node):
    pass

Ly.Command.toMxAst = LyCommandToMxAst

def LyMetadataToMxAst(Node):
    pass

Ly.Metadata.toMxAst = LyMetadataToMxAst

def LyHeaderToMxAst(Node):
    pass

Ly.Header.toMxAst = LyHeaderToMxAst

def LySchemeCmdToMxAst(Node):
    pass

Ly.SchemeCmd.toMxAst = LySchemeCmdToMxAst

def LyVersionToMxAst(Node):
    pass

Ly.Version.toMxAst = LyVersionToMxAst

def LyWithCmdToMxAst(Node):
    pass

Ly.WithCmd.toMxAst = LyWithCmdToMxAst

def LyBarlineToMxAst(Node):
    pass

Ly.Barline.toMxAst = LyBarlineToMxAst

def LyClefToMxAst(Node):
    pass

Ly.Clef.toMxAst = LyClefToMxAst

def LyDurationToMxAst(Node):
    pass

Ly.Duration.toMxAst = LyDurationToMxAst

def LyFermataToMxAst(Node):
    pass

Ly.Fermata.toMxAst = LyFermataToMxAst

def LyPitchToMxAst(Node):
    pass

Ly.Pitch.toMxAst = LyPitchToMxAst

def LyNoteToMxAst(Node):
    pass

Ly.Note.toMxAst = LyNoteToMxAst

def LyChordToMxAst(Node):
    pass

Ly.Chord.toMxAst = LyChordToMxAst

def LyKeyToMxAst(Node):
    pass

Ly.Key.toMxAst = LyKeyToMxAst

def LyNoteGroupToMxAst(Node):
    pass

Ly.NoteGroup.toMxAst = LyNoteGroupToMxAst

def LyRehearsalMarkToMxAst(Node):
    pass

Ly.RehearsalMark.toMxAst = LyRehearsalMarkToMxAst

def LyStaffToMxAst(Node):
    pass

Ly.Staff.toMxAst = LyStaffToMxAst

def LyStaffGroupToMxAst(Node):
    pass

Ly.StaffGroup.toMxAst = LyStaffGroupToMxAst

def LyScoreToMxAst(Node):
    pass

Ly.Score.toMxAst = LyScoreToMxAst

def LyScoreFileToMxAst(Node):
    pass

Ly.ScoreFile.toMxAst = LyScoreFileToMxAst

def LyTempoToMxAst(Node):
    pass

Ly.Tempo.toMxAst = LyTempoToMxAst

def LyTimeToMxAst(Node):
    pass

Ly.Time.toMxAst = LyTimeToMxAst

def LyVoiceToMxAst(Node):
    pass

Ly.Voice.toMxAst = LyVoiceToMxAst
