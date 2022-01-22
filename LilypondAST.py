from LilypondParser import LilypondParser as LP
from LilypondDataclasses import *

def ScoreFileToAst(self):
    return ScoreFile(
        Header=self.header_block().toAst(),
        SchemeCmds=[scheme_cmd.toAst() for scheme_cmd in self.scheme_cmds()],
        Score=self.score_block().toAst(),
        Version=self.version_cmd().toAst()
    )

LP.Score_fileContext.toAst = ScoreFileToAst

def HeaderBlockToAst(self):
    return Header(
        Metadata=[Metadata(Field=line.ID(), Value=line.STRING()) for line in self.assignment()]
    )

LP.Header_blockContext.toAst = HeaderBlockToAst

def AssignmentToAst(self):
    pass

LP.AssignmentContext.toAst = AssignmentToAst

def ScoreBlockToAst(self):
    pass

LP.Score_blockContext.toAst = ScoreBlockToAst

def StaffGroupBlockToAst(self):
    pass

LP.Staffgroup_blockContext.toAst = StaffGroupBlockToAst

def StaffBlockToAst(self):
    pass

LP.Staff_blockContext.toAst = StaffBlockToAst

def PrefixBlockToAst(self):
    pass

LP.Prefix_blockContext = PrefixBlockToAst

def WithBlockToAst(self):
    pass

LP.With_blockContext = WithBlockToAst

def VoiceBlockToAst(self):
    pass

LP.Voice_blockContext = VoiceBlockToAst

def NoteBlockToAst(self):
    pass

LP.Note_blockContext = NoteBlockToAst

def RelativeBlockToAst(self):
    pass

LP.Relative_blockContext = RelativeBlockToAst

def PolyphonyBlockToAst(self):
    pass

LP.Polyphony_blockContext = PolyphonyBlockToAst

def ChordToAst(self):
    pass

LP.ChordContext = ChordToAst

def NoteCmdToAst(self):
    pass

LP.Note_cmdContext = NoteCmdToAst

def BarCmdToAst(self):
    pass

LP.Bar_cmdContext = BarCmdToAst

def ClefCmdToAst(self):
    pass

LP.Clef_cmdContext = ClefCmdToAst

def FermataCmdToAst(self):
    pass

LP.Fermata_cmdContext = FermataCmdToAst

def KeyCmdToAst(self):
    pass

LP.Key_cmdContext = KeyCmdToAst

def MarkCmdToAst(self):
    pass

LP.Mark_cmdContext = MarkCmdToAst

def SchemeCmdToAst(self):
    pass

LP.Scheme_cmdContext = SchemeCmdToAst

def TempoCmdToAst(self):
    pass

LP.Tempo_cmdContext = TempoCmdToAst

def TimeCmdToAst(self):
    pass

LP.Time_cmdContext = TimeCmdToAst

def VersionCmdToAst(self):
    pass

LP.Version_cmdContext = VersionCmdToAst
