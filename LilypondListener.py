# Generated from Lilypond.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .LilypondParser import LilypondParser
else:
    from LilypondParser import LilypondParser

# This class defines a complete listener for a parse tree produced by LilypondParser.
class LilypondListener(ParseTreeListener):

    # Enter a parse tree produced by LilypondParser#score_file.
    def enterScore_file(self, ctx:LilypondParser.Score_fileContext):
        pass

    # Exit a parse tree produced by LilypondParser#score_file.
    def exitScore_file(self, ctx:LilypondParser.Score_fileContext):
        pass


    # Enter a parse tree produced by LilypondParser#book_block.
    def enterBook_block(self, ctx:LilypondParser.Book_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#book_block.
    def exitBook_block(self, ctx:LilypondParser.Book_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#header_block.
    def enterHeader_block(self, ctx:LilypondParser.Header_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#header_block.
    def exitHeader_block(self, ctx:LilypondParser.Header_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#score_block.
    def enterScore_block(self, ctx:LilypondParser.Score_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#score_block.
    def exitScore_block(self, ctx:LilypondParser.Score_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#staffgroup_block.
    def enterStaffgroup_block(self, ctx:LilypondParser.Staffgroup_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#staffgroup_block.
    def exitStaffgroup_block(self, ctx:LilypondParser.Staffgroup_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#staff_block.
    def enterStaff_block(self, ctx:LilypondParser.Staff_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#staff_block.
    def exitStaff_block(self, ctx:LilypondParser.Staff_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#prefix_block.
    def enterPrefix_block(self, ctx:LilypondParser.Prefix_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#prefix_block.
    def exitPrefix_block(self, ctx:LilypondParser.Prefix_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#with_block.
    def enterWith_block(self, ctx:LilypondParser.With_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#with_block.
    def exitWith_block(self, ctx:LilypondParser.With_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#voice_block.
    def enterVoice_block(self, ctx:LilypondParser.Voice_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#voice_block.
    def exitVoice_block(self, ctx:LilypondParser.Voice_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#note_block.
    def enterNote_block(self, ctx:LilypondParser.Note_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#note_block.
    def exitNote_block(self, ctx:LilypondParser.Note_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#relative_block.
    def enterRelative_block(self, ctx:LilypondParser.Relative_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#relative_block.
    def exitRelative_block(self, ctx:LilypondParser.Relative_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#polyphony_block.
    def enterPolyphony_block(self, ctx:LilypondParser.Polyphony_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#polyphony_block.
    def exitPolyphony_block(self, ctx:LilypondParser.Polyphony_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#scheme_cmd.
    def enterScheme_cmd(self, ctx:LilypondParser.Scheme_cmdContext):
        pass

    # Exit a parse tree produced by LilypondParser#scheme_cmd.
    def exitScheme_cmd(self, ctx:LilypondParser.Scheme_cmdContext):
        pass


    # Enter a parse tree produced by LilypondParser#note_cmd.
    def enterNote_cmd(self, ctx:LilypondParser.Note_cmdContext):
        pass

    # Exit a parse tree produced by LilypondParser#note_cmd.
    def exitNote_cmd(self, ctx:LilypondParser.Note_cmdContext):
        pass


    # Enter a parse tree produced by LilypondParser#bar_cmd.
    def enterBar_cmd(self, ctx:LilypondParser.Bar_cmdContext):
        pass

    # Exit a parse tree produced by LilypondParser#bar_cmd.
    def exitBar_cmd(self, ctx:LilypondParser.Bar_cmdContext):
        pass


    # Enter a parse tree produced by LilypondParser#clef_cmd.
    def enterClef_cmd(self, ctx:LilypondParser.Clef_cmdContext):
        pass

    # Exit a parse tree produced by LilypondParser#clef_cmd.
    def exitClef_cmd(self, ctx:LilypondParser.Clef_cmdContext):
        pass


    # Enter a parse tree produced by LilypondParser#fermata_cmd.
    def enterFermata_cmd(self, ctx:LilypondParser.Fermata_cmdContext):
        pass

    # Exit a parse tree produced by LilypondParser#fermata_cmd.
    def exitFermata_cmd(self, ctx:LilypondParser.Fermata_cmdContext):
        pass


    # Enter a parse tree produced by LilypondParser#key_cmd.
    def enterKey_cmd(self, ctx:LilypondParser.Key_cmdContext):
        pass

    # Exit a parse tree produced by LilypondParser#key_cmd.
    def exitKey_cmd(self, ctx:LilypondParser.Key_cmdContext):
        pass


    # Enter a parse tree produced by LilypondParser#mark_cmd.
    def enterMark_cmd(self, ctx:LilypondParser.Mark_cmdContext):
        pass

    # Exit a parse tree produced by LilypondParser#mark_cmd.
    def exitMark_cmd(self, ctx:LilypondParser.Mark_cmdContext):
        pass


    # Enter a parse tree produced by LilypondParser#tempo_cmd.
    def enterTempo_cmd(self, ctx:LilypondParser.Tempo_cmdContext):
        pass

    # Exit a parse tree produced by LilypondParser#tempo_cmd.
    def exitTempo_cmd(self, ctx:LilypondParser.Tempo_cmdContext):
        pass


    # Enter a parse tree produced by LilypondParser#time_cmd.
    def enterTime_cmd(self, ctx:LilypondParser.Time_cmdContext):
        pass

    # Exit a parse tree produced by LilypondParser#time_cmd.
    def exitTime_cmd(self, ctx:LilypondParser.Time_cmdContext):
        pass


    # Enter a parse tree produced by LilypondParser#version_cmd.
    def enterVersion_cmd(self, ctx:LilypondParser.Version_cmdContext):
        pass

    # Exit a parse tree produced by LilypondParser#version_cmd.
    def exitVersion_cmd(self, ctx:LilypondParser.Version_cmdContext):
        pass


    # Enter a parse tree produced by LilypondParser#assignment.
    def enterAssignment(self, ctx:LilypondParser.AssignmentContext):
        pass

    # Exit a parse tree produced by LilypondParser#assignment.
    def exitAssignment(self, ctx:LilypondParser.AssignmentContext):
        pass



del LilypondParser