from LilypondParser import LilypondParser as LP
from LilypondDataclasses import *

def ScoreFileToLyAst(self):
    return ScoreFile(
        Header=self.header_block().toLyAst(),
        SchemeCmds=[scheme_cmd.toLyAst() for scheme_cmd in self.scheme_cmds()],
        Score=self.score_block().toLyAst(),
        Version=self.version_cmd().toLyAst()
    )

LP.Score_fileContext.toLyAst = ScoreFileToLyAst

def HeaderBlockToLyAst(self):
    return Header(
        # TODO: this does not handle the case where Value is
        # a scheme_cmd
        Metadata=[Metadata(Field=line.ID(), Value=line.STRING()) for line in self.assignment()]
    )

LP.Header_blockContext.toLyAst = HeaderBlockToLyAst

def AssignmentToLyAst(self):
    pass

LP.AssignmentContext.toLyAst = AssignmentToLyAst

def ScoreBlockToLyAst(self):
    return Score(StaffGroups=[staffgroup.toLyAst() for staffgroup in self.staffgroup_block()])

LP.Score_blockContext.toLyAst = ScoreBlockToLyAst

def StaffGroupBlockToLyAst(self):
    return StaffGroup(Staves=[staff.toLyAst() for staff in self.staff_block()])

LP.Staffgroup_blockContext.toLyAst = StaffGroupBlockToLyAst

def StaffBlockToLyAst(self):
    return Staff(
        WithCmd=self.with_block().toLyAst(),
        Prefix=self.prefix_block().toLyAst(),
        Notes=self.note_block().toLyAst()
    )

LP.Staff_blockContext.toLyAst = StaffBlockToLyAst

def PrefixBlockToLyAst(self):
    pass

LP.Prefix_blockContext = PrefixBlockToLyAst

def WithBlockToLyAst(self):
    pass

LP.With_blockContext = WithBlockToLyAst

def VoiceBlockToLyAst(self):
    pass

LP.Voice_blockContext = VoiceBlockToLyAst

def NoteBlockToLyAst(self):
    pass

LP.Note_blockContext = NoteBlockToLyAst

def RelativeBlockToLyAst(self):
    pass

LP.Relative_blockContext = RelativeBlockToLyAst

def PolyphonyBlockToLyAst(self):
    pass

LP.Polyphony_blockContext = PolyphonyBlockToLyAst

def ChordToLyAst(self):
    pass

LP.ChordContext = ChordToLyAst

def NoteCmdToLyAst(self):
    pass

LP.Note_cmdContext = NoteCmdToLyAst

def BarCmdToLyAst(self):
    pass

LP.Bar_cmdContext = BarCmdToLyAst

def ClefCmdToLyAst(self):
    return Clef(Clef.clefInfo(self.ID()))

LP.Clef_cmdContext = ClefCmdToLyAst

def FermataCmdToLyAst(self):
    return Fermata()

LP.Fermata_cmdContext = FermataCmdToLyAst

def KeyCmdToLyAst(self):
    return Key(
        Pitch=Pitch(self.NOTE()),
        Fifths=Key.findFifths(Pitch(self.NOTE())),
        Mode=Mode[self.MODE_KW().upper()]
    )

LP.Key_cmdContext = KeyCmdToLyAst

def MarkCmdToLyAst(self):
    return RehearsalMark()

LP.Mark_cmdContext = MarkCmdToLyAst

def SchemeCmdToLyAst(self):
    return SchemeCmd(Command=(self.SCHEME_GP() if self.SCHEME_GP() is not None else self.SCHEME_ATOM()))

LP.Scheme_cmdContext = SchemeCmdToLyAst

def TempoCmdToLyAst(self):
    return Tempo(
        Desc=self.STRING(),
        Unit=self.INTEGER()[0],
        PerMin=self.INTEGER()[1]
    )

LP.Tempo_cmdContext = TempoCmdToLyAst

def TimeCmdToLyAst(self):
    return Time(
        Numerator=self.TIME_SIG().INTEGER()[0],
        Denominator=self.TIME_SIG().INTEGER()[1]
    )

LP.Time_cmdContext = TimeCmdToLyAst

def VersionCmdToLyAst(self):
    return Version(LilypondVer=self.STRING())

LP.Version_cmdContext = VersionCmdToLyAst
