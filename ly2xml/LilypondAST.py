from enum import Enum, auto
import re

from LilypondParser import LilypondParser as LP
from LilypondDataclasses import *

rehearsalCounter = RehearsalCounter()

# Methods to create AST nodes
def ScoreFileToLyAst(self): #verified

    rehearsalCounter.resetMark()
    # Only the first header (metadata) block, first version, and
    # first score commands are accepted.
    return ScoreFile(
        Header=self.header_block()[0].toLyAst(),
        SchemeCmds=[scheme_cmd.toLyAst() for scheme_cmd in self.scheme_cmds()],
        Score=self.score_block()[0].toLyAst(),
        Version=self.version_cmd()[0].toLyAst()
    )

LP.Score_fileContext.toLyAst = ScoreFileToLyAst

def HeaderBlockToLyAst(self): #verified
    return Header(
        # Currently this does not handle the case where Value is
        # a scheme_cmd
        Metadata=[Metadata(Field=line.ID().getText(), Value=line.STRING().getText()) for line in self.assignment() if line.STRING() is not None]
    )

LP.Header_blockContext.toLyAst = HeaderBlockToLyAst

def AssignmentToLyAst(self): #verified
    # Handled by parent node (HeaderBlock)
    pass

LP.AssignmentContext.toLyAst = AssignmentToLyAst

def ScoreBlockToLyAst(self): #verified
    return Score(StaffGroups=[staffgroup.toLyAst() for staffgroup in self.staffgroup_block()])

LP.Score_blockContext.toLyAst = ScoreBlockToLyAst

def StaffGroupBlockToLyAst(self): #verified
    return StaffGroup(Staves=[staff.toLyAst() for staff in self.staff_block()])

LP.Staffgroup_blockContext.toLyAst = StaffGroupBlockToLyAst

def StaffBlockToLyAst(self): #verified
    (firstTimeSig, firstKeySig) = self.prefix_block().toLyAst() if self.prefix_block() is not None else (Time(4, 4), Key())

    return Staff(
        # For now, we will assume there is only one note block.
        # We could do the below for multiple blocks to get a list
        # of lists, then use a reducer to concatenate them into one.
        # WithCmd=self.with_block().toLyAst(),
        Notes=self.note_block()[0].toLyAst(firstTimeSig=firstTimeSig, firstKeySig=firstKeySig)
    )

LP.Staff_blockContext.toLyAst = StaffBlockToLyAst

def PrefixBlockToLyAst(self): #verified
    # Handled by parent node
    pass

LP.Prefix_blockContext.toLyAst = PrefixBlockToLyAst

def WithBlockToLyAst(self): #verified
    # We will ignore the \with command for now, which
    # involves formatting issues.
    pass

LP.With_blockContext.toLyAst = WithBlockToLyAst

def NoteBlockToLyAst(self, voiceNumber=1, firstTimeSig=None, firstKeySig=None, octaveStyle=OctaveStyle.DEFAULT): #need to add polyphony, but otherwise verified
    blockEvents = []

    if firstTimeSig is not None:
        blockEvents.append(firstTimeSig)
    if firstKeySig is not None:
        blockEvents.append(firstKeySig)

    for child in self.children:
        if type(child) == LP.Relative_blockContext:
            # For now, extract only the first note_block
            # from a relative_block
            blockEvents.append(child.note_block().toLyAst(octaveStyle=OctaveStyle.RELATIVE))
        elif type(child) == LP.Polyphony_blockContext:
            raise ValueError('Currently, polyphony blocks are not supported. Try a sample file without polyphony blocks, like sample_nopoly.ly')
        elif type(child) == LP.Note_cmdContext:
            blockEvents.append(child.toLyAst())
        elif type(child) == LP.NoteContext:
            blockEvents.append(child.toLyAst())
        else:
            raise ValueError('Unknown event type found in note block')


    return NoteGroup(NoteEvents=blockEvents, octaveStyle=octaveStyle, voiceNumber=voiceNumber)

LP.Note_blockContext.toLyAst = NoteBlockToLyAst

def RelativeBlockToLyAst(self): #verified
    # Relative blocks are handled at the NoteBlock level.
    pass

LP.Relative_blockContext.toLyAst = RelativeBlockToLyAst

def VoiceBlockToLyAst(self, voiceNumber=1): #verified
    # For now, we will not handle all the complexity of the
    # \Voice command and assume that we only need to dig out
    # a bare note block, which needs to be assigned a voice
    # number.
    return self.note_block()[0].toLyAst(voiceNumber=voiceNumber)

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

def NoteToLyAst(self):
    pass

def NoteCmdToLyAst(self): #verified
    if len(self.children) > 1:
        raise ValueError('Multiple commands in one note_cmd')

    cmdType = type(self.children[0])

    if cmdType == LP.Bar_cmdContext:
    # if self.bar_cmd() is not None:
        return self.bar_cmd().toLyAst()

    if cmdType == LP.Clef_cmdContext:
    # if self.clef_cmd() is not None:
        return self.clef_cmd().toLyAst()

    if cmdType == LP.Fermata_cmdContext:
    # if self.fermata_cmd() is not None:
        return self.fermata_cmd().toLyAst()

    if cmdType == LP.Key_cmdContext:
    # if self.key_cmd() is not None:
        return self.key_cmd().toLyAst()

    if cmdType == LP.Mark_cmdContext:
    # if self.mark_cmd() is not None:
        return self.mark_cmd().toLyAst()

    if cmdType == LP.Tempo_cmdContext:
    # if self.tempo_cmd() is not None:
        return self.tempo_cmd().toLyAst()

    if cmdType == LP.Time_cmdContext:
    # if self.time_cmd() is not None:
        return self.time_cmd().toLyAst()

    if cmdType == LP.Bar_cmdContext:
    # if self.voice_cmd() is not None:
        return self.voice_cmd().toLyAst()

LP.Note_cmdContext.toLyAst = NoteCmdToLyAst

def BarCmdToLyAst(self): #verified
    lyStr = self.BARLINE().getText()

    if lyStr[0] == '"':
        lyStr = lyStr[1:-1]

    return Barline(BarStyle=BarlineType.fromLyStr(lyStr))

LP.Bar_cmdContext.toLyAst = BarCmdToLyAst

def ClefCmdToLyAst(self): #verified
    # return Clef(Clef.clefInfo(self.ID()))
    return Clef(Type=ClefType[self.ID().getText().upper()])

LP.Clef_cmdContext.toLyAst = ClefCmdToLyAst

def FermataCmdToLyAst(self): #verified
    return Fermata()

LP.Fermata_cmdContext.toLyAst = FermataCmdToLyAst

def KeyCmdToLyAst(self): #verified
    modeName = self.MODE_KW().getText()[1:]

    return Key(
        Pitch=Pitch(self.NOTE().getText()),
        Mode=Mode[modeName.upper()]
    )

LP.Key_cmdContext.toLyAst = KeyCmdToLyAst

def MarkCmdToLyAst(self): #verified
    return RehearsalMark(Mark=rehearsalCounter.nextMark())

LP.Mark_cmdContext.toLyAst = MarkCmdToLyAst

def SchemeCmdToLyAst(self): #verified
    return SchemeCmd(Command=(self.SCHEME_GP().getText() if self.SCHEME_GP() is not None else self.SCHEME_ATOM().getText()))

LP.Scheme_cmdContext.toLyAst = SchemeCmdToLyAst

def TempoCmdToLyAst(self): #verified
    return Tempo(
        Desc=self.STRING().getText(),
        Unit=self.INTEGER()[0].getText(),
        PerMin=self.INTEGER()[1].getText()
    )

LP.Tempo_cmdContext.toLyAst = TempoCmdToLyAst

def TimeCmdToLyAst(self): #verified
    timestr = self.TIME_SIG().getText()
    match = re.fullmatch('([0-9]+)\/([0-9]+)', timestr)

    if not match:
        raise ValueError('Invalid time signature')

    (num, denom) = match.group(1, 2)

    return Time(Numerator=num, Denominator=denom)

LP.Time_cmdContext.toLyAst = TimeCmdToLyAst

def VersionCmdToLyAst(self): #verified
    return Version(LilypondVer=self.VERSION_STR().getText())

LP.Version_cmdContext.toLyAst = VersionCmdToLyAst
