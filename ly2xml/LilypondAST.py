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

LP.Prefix_blockContext.toLyAst = PrefixBlockToLyAst

def WithBlockToLyAst(self):
    pass

LP.With_blockContext.toLyAst = WithBlockToLyAst

def VoiceBlockToLyAst(self):
    pass

LP.Voice_blockContext.toLyAst = VoiceBlockToLyAst

def NoteBlockToLyAst(self):
    blockEvents = []

    return NoteGroup(NoteEvents=blockEvents)

LP.Note_blockContext.toLyAst = NoteBlockToLyAst

def RelativeBlockToLyAst(self):
    pass

LP.Relative_blockContext.toLyAst = RelativeBlockToLyAst

def PolyphonyBlockToLyAst(self):
    pass

LP.Polyphony_blockContext.toLyAst = PolyphonyBlockToLyAst

def ChordToLyAst(self):
    return Chord(Notes=[note.toLyAst() for note in self.NOTE()])

LP.ChordContext.toLyAst = ChordToLyAst

def NoteCmdToLyAst(self):
    if self.bar_cmd() is not None:
        return self.bar_cmd().toLyAst()

    if self.clef_cmd() is not None:
        return self.clef_cmd().toLyAst()

    if self.fermata_cmd() is not None:
        return self.fermata_cmd().toLyAst()

    if self.key_cmd() is not None:
        return self.key_cmd().toLyAst()

    if self.mark_cmd() is not None:
        return self.mark_cmd().toLyAst()

    if self.tempo_cmd() is not None:
        return self.tempo_cmd().toLyAst()

    if self.time_cmd() is not None:
        return self.time_cmd().toLyAst()

    if self.voice_cmd() is not None:
        return self.voice_cmd().toLyAst()

LP.Note_cmdContext.toLyAst = NoteCmdToLyAst

def BarCmdToLyAst(self):
    return Barline(BarStyle=BarlineType.fromLyStr(self.BARLINE()))

LP.Bar_cmdContext.toLyAst = BarCmdToLyAst

def ClefCmdToLyAst(self):
    # return Clef(Clef.clefInfo(self.ID()))
    return Clef(Type=ClefType[self.ID().upper()])

LP.Clef_cmdContext.toLyAst = ClefCmdToLyAst

def FermataCmdToLyAst(self):
    return Fermata()

LP.Fermata_cmdContext.toLyAst = FermataCmdToLyAst

def KeyCmdToLyAst(self):
    return Key(
        Pitch=Pitch(self.NOTE()),
        Mode=Mode[self.MODE_KW().upper()]
    )

LP.Key_cmdContext.toLyAst = KeyCmdToLyAst

def MarkCmdToLyAst(self):
    return RehearsalMark()

LP.Mark_cmdContext.toLyAst = MarkCmdToLyAst

def SchemeCmdToLyAst(self):
    return SchemeCmd(Command=(self.SCHEME_GP() if self.SCHEME_GP() is not None else self.SCHEME_ATOM()))

LP.Scheme_cmdContext.toLyAst = SchemeCmdToLyAst

def TempoCmdToLyAst(self):
    return Tempo(
        Desc=self.STRING(),
        Unit=self.INTEGER()[0],
        PerMin=self.INTEGER()[1]
    )

LP.Tempo_cmdContext.toLyAst = TempoCmdToLyAst

def TimeCmdToLyAst(self):
    return Time(
        Numerator=self.TIME_SIG().INTEGER()[0],
        Denominator=self.TIME_SIG().INTEGER()[1]
    )

LP.Time_cmdContext.toLyAst = TimeCmdToLyAst

def VersionCmdToLyAst(self):
    return Version(LilypondVer=self.STRING())

LP.Version_cmdContext.toLyAst = VersionCmdToLyAst
