# Generated from /Users/Brad/Code/Scores/ly2musicxml/Lilypond.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .LilypondParser import LilypondParser
else:
    from LilypondParser import LilypondParser

# This class defines a complete listener for a parse tree produced by LilypondParser.
class LilypondListener(ParseTreeListener):

    # Enter a parse tree produced by LilypondParser#score.
    def enterScore(self, ctx:LilypondParser.ScoreContext):
        pass

    # Exit a parse tree produced by LilypondParser#score.
    def exitScore(self, ctx:LilypondParser.ScoreContext):
        pass


    # Enter a parse tree produced by LilypondParser#staff.
    def enterStaff(self, ctx:LilypondParser.StaffContext):
        pass

    # Exit a parse tree produced by LilypondParser#staff.
    def exitStaff(self, ctx:LilypondParser.StaffContext):
        pass


    # Enter a parse tree produced by LilypondParser#with_block.
    def enterWith_block(self, ctx:LilypondParser.With_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#with_block.
    def exitWith_block(self, ctx:LilypondParser.With_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#prefix_block.
    def enterPrefix_block(self, ctx:LilypondParser.Prefix_blockContext):
        pass

    # Exit a parse tree produced by LilypondParser#prefix_block.
    def exitPrefix_block(self, ctx:LilypondParser.Prefix_blockContext):
        pass


    # Enter a parse tree produced by LilypondParser#line.
    def enterLine(self, ctx:LilypondParser.LineContext):
        pass

    # Exit a parse tree produced by LilypondParser#line.
    def exitLine(self, ctx:LilypondParser.LineContext):
        pass


    # Enter a parse tree produced by LilypondParser#assignment.
    def enterAssignment(self, ctx:LilypondParser.AssignmentContext):
        pass

    # Exit a parse tree produced by LilypondParser#assignment.
    def exitAssignment(self, ctx:LilypondParser.AssignmentContext):
        pass


    # Enter a parse tree produced by LilypondParser#voice.
    def enterVoice(self, ctx:LilypondParser.VoiceContext):
        pass

    # Exit a parse tree produced by LilypondParser#voice.
    def exitVoice(self, ctx:LilypondParser.VoiceContext):
        pass



del LilypondParser