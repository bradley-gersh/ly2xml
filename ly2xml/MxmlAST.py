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
def LyCommandToMxAst(self):
    pass

Ly.Command.toMxAst = LyCommandToMxAst

def LyMetadataToMxAst(self):
    pass

Ly.Metadata.toMxAst = LyMetadataToMxAst

def LyHeaderToMxAst(self):
    pass

Ly.Header.toMxAst = LyHeaderToMxAst

def LySchemeCmdToMxAst(self):
    pass

Ly.SchemeCmd.toMxAst = LySchemeCmdToMxAst

def LyVersionToMxAst(self):
    pass

Ly.Version.toMxAst = LyVersionToMxAst

def LyWithCmdToMxAst(self):
    pass

Ly.WithCmd.toMxAst = LyWithCmdToMxAst

def LyBarlineToMxAst(self):
    pass

Ly.Barline.toMxAst = LyBarlineToMxAst

def LyClefToMxAst(self):
    pass

Ly.Clef.toMxAst = LyClefToMxAst

def LyDurationToMxAst(self):
    pass

Ly.Duration.toMxAst = LyDurationToMxAst

def LyFermataToMxAst(self):
    pass

Ly.Fermata.toMxAst = LyFermataToMxAst

def LyPitchToMxAst(self):
    pass

Ly.Pitch.toMxAst = LyPitchToMxAst

def LyNoteToMxAst(self):
    pass

Ly.Note.toMxAst = LyNoteToMxAst

def LyChordToMxAst(self):
    pass

Ly.Chord.toMxAst = LyChordToMxAst

def LyKeyToMxAst(self):
    pass

Ly.Key.toMxAst = LyKeyToMxAst

def LyNoteGroupToMxAst(self):
    pass

Ly.NoteGroup.toMxAst = LyNoteGroupToMxAst

def LyRehearsalMarkToMxAst(self):
    pass

Ly.RehearsalMark.toMxAst = LyRehearsalMarkToMxAst

def LyStaffToMxAst(self):
    pass

Ly.Staff.toMxAst = LyStaffToMxAst

def LyStaffGroupToMxAst(self):
    pass

Ly.StaffGroup.toMxAst = LyStaffGroupToMxAst

def LyScoreToMxAst(self):
    pass

Ly.Score.toMxAst = LyScoreToMxAst

def LyScoreFileToMxAst(self):
    return MusXMLFile(Score=ScorePartwise(Header=self.Header))
    pass

Ly.ScoreFile.toMxAst = LyScoreFileToMxAst

def LyTempoToMxAst(self):
    pass

Ly.Tempo.toMxAst = LyTempoToMxAst

def LyTimeToMxAst(self):
    pass

Ly.Time.toMxAst = LyTimeToMxAst

def LyVoiceToMxAst(self):
    pass

Ly.Voice.toMxAst = LyVoiceToMxAst
