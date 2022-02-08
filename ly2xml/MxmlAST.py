from curses import halfdelay
from enum import Enum

from .LilypondAST import *
from . import LilypondDataclasses as Ly
from .MxmlDataclasses import *

class Durations(Enum):
    # For now, let's assume that there's nothing faster than 16ths
    # Tuplets are forbidden (see readme)
    DIVISIONS = 4
    SIXTEENTH = 1
    EIGHTH = 2
    DOT_EIGHTH = 3
    QUARTER = 4
    DOT_QUARTER = 6
    HALF = 8
    DOT_HALF = 12
    WHOLE = 16

def writemxml(node):
    outStr = node.enter()

    if len(node.children > 0):
        for child in node.children:
            writemxml(child)

    outStr += node.leave()

    return outStr

# Methods to migrate LyAST to MxAST

def LyCommandToMxAst(self): # done
    # We aren't parsing these right now
    pass

Ly.Command.toMxAst = LyCommandToMxAst

def LyMetadataToMxAst(self): # done
    # if self.Field == Ly.MetadataField.TITLE:
    #     field = 'title'
    # elif self.Field == Ly.MetadataField.SUBTITLE:
    #     field = 'subtitle'
    # elif self.Field == Ly.MetadataField.COMPOSER:
    #     field = 'composer'
    # else:
    #     raise ValueError('Unhandled Ly metadata for Mxml tree')

    return (self.field, self.Value)

Ly.Metadata.toMxAst = LyMetadataToMxAst

def LyHeaderToMxAst(self, staffIds, lilyVer=None): # done
    metadata = []

    if self.Metadata:
        metadata = dict([data.toMxAst() for data in self.Metadata])

    if Ly.MetadataField.TITLE in metadata:
        title = metadata[Ly.MetadataField.TITLE]

        if Ly.MetadataField.SUBTITLE in metadata:
            title += ': ' + metadata[Ly.MetadataField.SUBTITLE]

        work = Work(WorkTitle=WorkTitle(Content=title))
    else:
        work = None

    if Ly.MetadataField.COMPOSER in metadata:
        composerName = metadata[Ly.MetadataField.COMPOSER]
        creator = Creator(Type='composer', Content=composerName)
    else:
        creator = None

    encoding = Encoding(Lilyver=lilyVer) if lilyVer else Encoding()

    identification = Identification(Creators=[creator], Encoding=encoding) if creator else Identification(Encoding=encoding)

    partList = PartList(ScoreParts=[ScorePart(PartName=idx, Id=idx) for idx in staffIds])

    return Header(Work=work, Identification=identification, PartList=partList)



Ly.Header.toMxAst = LyHeaderToMxAst

def LySchemeCmdToMxAst(self): # done
    # For now, we are silently dropping these, as they involve
    # formatting tweaks.
    pass

Ly.SchemeCmd.toMxAst = LySchemeCmdToMxAst

def LyVersionToMxAst(self): # done
    # Handled by parent node
    pass

Ly.Version.toMxAst = LyVersionToMxAst

def LyWithCmdToMxAst(self): # done
    # We aren't processing \with commands
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

def getMeasureLength(timeSig):
    num = timeSig.Numerator
    den = timeSig.Denominator

    div = Durations.DIVISIONS
    divCount = 0

    if den == 16:
        divcount = 1
    elif den == 8:
        divcount = 2
    elif den == 4:
        divcount = 4
    elif den == 2:
        divcount = 8
    elif den == 1:
        divcount = 16

    return num * div * divCount


def LyStaffToMxAst(self):
    # extract Measures
    # Loop through Staff.Notes.NoteEvents
    # Each time you encounter a time signature, set the length
    # of the bar.
    # - Compute the divisions.
    # - Compute the fifths in the keysig.
    # - Compute the pitch.

    # Chew through the events, making measures as you go.

    # For each pitch ...
    # - Compute the note or rest duration.
    # - Subtract it from the bar length
    # - When bar length is zero, make a new measure

    measures = []
    measureLength = 0
    currKey = None
    currTime = None
    currClef = None

    for event in Staff.Notes.NoteEvents:
        if type(event) == Ly.Time:
            measureLength = getMeasureLength(event)
            currTime = event.toMxAst()
        elif type(event) == Ly.Key:
            currKey = event.toMxAst()
        elif type(event) == Ly.Clef:
            currClef = event.toMxAst()



    return Part()

Ly.Staff.toMxAst = LyStaffToMxAst

def LyStaffGroupToMxAst(self): # done
    # This is being handled by the ancestor node, ScoreFile
    pass

Ly.StaffGroup.toMxAst = LyStaffGroupToMxAst

def LyScoreToMxAst(self): # done
    # This is being handled by the parent node, ScoreFile
    pass

Ly.Score.toMxAst = LyScoreToMxAst

def LyScoreFileToMxAst(self): # done
    lilyVer = None

    if self.Version:
        lilyVer = self.Version.LilypondVer

    # For now, assume there's only one StaffGroup
    staves = self.Score.StaffGroups[0].Staves
    staffIds = ['P{}'.format(num) for (num, _) in enumerate(staves)]

    return MusXMLFile(Score=ScorePartwise(Header=self.Header.toMxAst(staffIds=staffIds, lilyVer=lilyVer), Parts=[staff.toMxAst(idx) for (staff, idx) in zip(staves, staffIds)]))

Ly.ScoreFile.toMxAst = LyScoreFileToMxAst

def LyTempoToMxAst(self):
    pass

Ly.Tempo.toMxAst = LyTempoToMxAst

def LyTimeToMxAst(self): #done
    # Handled by parent
    pass

Ly.Time.toMxAst = LyTimeToMxAst

def LyVoiceToMxAst(self):
    pass

Ly.Voice.toMxAst = LyVoiceToMxAst
