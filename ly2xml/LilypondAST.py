from enum import Enum, auto

from LilypondParser import LilypondParser as LP
from LilypondDataclasses import *

# Methods to create AST nodes
def ScoreFileToLyAst(self):
    # Only the first header (metadata) block and first version
    # commands are accepted.
    return ScoreFile(
        Header=self.header_block()[0].toLyAst(),
        SchemeCmds=[scheme_cmd.toLyAst() for scheme_cmd in self.scheme_cmds()],
        Score=self.score_block().toLyAst(),
        Version=self.version_cmd()[0].toLyAst()
    )

LP.Score_fileContext.toLyAst = ScoreFileToLyAst

def HeaderBlockToLyAst(self):
    return Header(
        # Currently this does not handle the case where Value is
        # a scheme_cmd
        Metadata=[Metadata(Field=line.ID().getText(), Value=line.STRING().getText()) for line in self.assignment()]
    )

LP.Header_blockContext.toLyAst = HeaderBlockToLyAst

def AssignmentToLyAst(self):
    # Handled by parent node (HeaderBlock)
    pass

LP.AssignmentContext.toLyAst = AssignmentToLyAst

def ScoreBlockToLyAst(self):
    return Score(StaffGroups=[staffgroup.toLyAst() for staffgroup in self.staffgroup_block()])

LP.Score_blockContext.toLyAst = ScoreBlockToLyAst

def StaffGroupBlockToLyAst(self):
    return StaffGroup(Staves=[staff.toLyAst() for staff in self.staff_block()])

LP.Staffgroup_blockContext.toLyAst = StaffGroupBlockToLyAst

def StaffBlockToLyAst(self):
    (firstTime, firstKey) = self.prefix_block().toLyAst() if self.prefix_block() is not None else (Time(4, 4), Key())

    return Staff(
        WithCmd=self.with_block().toLyAst(),
        Notes=self.note_block().toLyAst()
    )

LP.Staff_blockContext.toLyAst = StaffBlockToLyAst

def PrefixBlockToLyAst(self):
    # Handled by parent node
    pass

LP.Prefix_blockContext.toLyAst = PrefixBlockToLyAst

def WithBlockToLyAst(self):
    # We will ignore the \with command for now, which
    # involves formatting issues.
    pass

LP.With_blockContext.toLyAst = WithBlockToLyAst

def NoteBlockToLyAst(self, voiceNumber=1, firstTime=None, firstKey=None):
    prefix = [] # Need to process

    if firstTime is not None:
        prefix.append(firstTime)
    if firstKey is not None:
        prefix.append(firstKey)

    blockEvents = [child for child in self.children]

    octaveStyle = OctaveStyle.RELATIVE if self.relative_block() is not None else OctaveStyle.DEFAULT

    return NoteGroup(NoteEvents=blockEvents, octaveStyle=octaveStyle, voiceNumber=voiceNumber)

LP.Note_blockContext.toLyAst = NoteBlockToLyAst

def RelativeBlockToLyAst(self):
    # Relative blocks are handled at the NoteBlock level.
    pass

LP.Relative_blockContext.toLyAst = RelativeBlockToLyAst

def VoiceBlockToLyAst(self, voiceNumber=1):
    # For now, we will not handle all the complexity of the
    # \Voice command and assume that we only need to dig out
    # a bare note block, which needs to be assigned a voice
    # number.
    return self.note_block.toLyAst(voiceNumber=voiceNumber)

LP.Voice_blockContext.toLyAst = VoiceBlockToLyAst

def PolyphonyBlockToLyAst(self):
    # It can have multiple Voice blocks, each containing a note block
    # Or multiple note blocks.
    # If it has multiple note blocks, then each note block is
    # assigned a voice number. We need an array of note blocks,
    # each with a voice number.

    # Or, if there are voice blocks, we need to dig into each one,
    # extract the note block, and assign it a voice number.

    # The voice numbers are assigned by the polyphony block
    # and stored by the note block.
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
    return Version(LilypondVer=self.VERSION_STR().getText())

LP.Version_cmdContext.toLyAst = VersionCmdToLyAst
