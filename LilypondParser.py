# Generated from /Users/Brad/Code/Scores/ly2musicxml/Lilypond.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24")
        buf.write("M\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\3\2\3\2\3\2\5\2\24\n\2\3\2\3\2\3\3\3\3\3\3\5\3\33")
        buf.write("\n\3\3\3\3\3\5\3\37\n\3\3\3\5\3\"\n\3\3\3\3\3\3\4\3\4")
        buf.write("\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\3\5\6\5\61\n\5\r")
        buf.write("\5\16\5\62\3\6\3\6\7\6\67\n\6\f\6\16\6:\13\6\3\7\3\7\3")
        buf.write("\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bF\n\b\f\b\16\bI\13\b")
        buf.write("\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\22\22\2M\2\20")
        buf.write("\3\2\2\2\4\27\3\2\2\2\6%\3\2\2\2\b\60\3\2\2\2\n\64\3\2")
        buf.write("\2\2\f;\3\2\2\2\16A\3\2\2\2\20\21\7\f\2\2\21\23\7\3\2")
        buf.write("\2\22\24\5\4\3\2\23\22\3\2\2\2\23\24\3\2\2\2\24\25\3\2")
        buf.write("\2\2\25\26\7\4\2\2\26\3\3\2\2\2\27\30\7\r\2\2\30\32\7")
        buf.write("\5\2\2\31\33\5\6\4\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34")
        buf.write("\3\2\2\2\34\36\7\3\2\2\35\37\5\b\5\2\36\35\3\2\2\2\36")
        buf.write("\37\3\2\2\2\37!\3\2\2\2 \"\5\16\b\2! \3\2\2\2!\"\3\2\2")
        buf.write("\2\"#\3\2\2\2#$\7\4\2\2$\5\3\2\2\2%&\7\17\2\2&*\7\3\2")
        buf.write("\2\')\5\f\7\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2")
        buf.write("+-\3\2\2\2,*\3\2\2\2-.\7\4\2\2.\7\3\2\2\2/\61\5\n\6\2")
        buf.write("\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2")
        buf.write("\63\t\3\2\2\2\648\7\20\2\2\65\67\n\2\2\2\66\65\3\2\2\2")
        buf.write("\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\13\3\2\2\2:8\3\2\2")
        buf.write("\2;<\7\21\2\2<=\7\6\2\2=>\7\7\2\2>?\7\21\2\2?@\7\7\2\2")
        buf.write("@\r\3\2\2\2AB\7\r\2\2BC\7\b\2\2CG\7\3\2\2DF\7\t\2\2ED")
        buf.write("\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2")
        buf.write("\2\2JK\7\4\2\2K\17\3\2\2\2\n\23\32\36!*\628G")
        return buf.getvalue()


class LilypondParser ( Parser ):

    grammarFileName = "Lilypond.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'{'", "'}'", "'Staff'", "'='", "'\"'", 
                     "'Voice'", "<INVALID>", "<INVALID>", "<INVALID>", "'\\score'", 
                     "'\\new'", "'\\layout'", "'\\with'", "<INVALID>", "<INVALID>", 
                     "'\\'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "NOTE", "OCTAVE", 
                      "DURATION", "SCORE_KW", "NEW_KW", "LAYOUT_KW", "WITH_KW", 
                      "KW", "NAME", "SLASH", "WS", "ALL" ]

    RULE_score = 0
    RULE_staff = 1
    RULE_with_block = 2
    RULE_prefix_block = 3
    RULE_line = 4
    RULE_assignment = 5
    RULE_voice = 6

    ruleNames =  [ "score", "staff", "with_block", "prefix_block", "line", 
                   "assignment", "voice" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    NOTE=7
    OCTAVE=8
    DURATION=9
    SCORE_KW=10
    NEW_KW=11
    LAYOUT_KW=12
    WITH_KW=13
    KW=14
    NAME=15
    SLASH=16
    WS=17
    ALL=18

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ScoreContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SCORE_KW(self):
            return self.getToken(LilypondParser.SCORE_KW, 0)

        def staff(self):
            return self.getTypedRuleContext(LilypondParser.StaffContext,0)


        def getRuleIndex(self):
            return LilypondParser.RULE_score

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterScore" ):
                listener.enterScore(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitScore" ):
                listener.exitScore(self)




    def score(self):

        localctx = LilypondParser.ScoreContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_score)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 14
            self.match(LilypondParser.SCORE_KW)
            self.state = 15
            self.match(LilypondParser.T__0)
            self.state = 17
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==LilypondParser.NEW_KW:
                self.state = 16
                self.staff()


            self.state = 19
            self.match(LilypondParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StaffContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NEW_KW(self):
            return self.getToken(LilypondParser.NEW_KW, 0)

        def with_block(self):
            return self.getTypedRuleContext(LilypondParser.With_blockContext,0)


        def prefix_block(self):
            return self.getTypedRuleContext(LilypondParser.Prefix_blockContext,0)


        def voice(self):
            return self.getTypedRuleContext(LilypondParser.VoiceContext,0)


        def getRuleIndex(self):
            return LilypondParser.RULE_staff

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStaff" ):
                listener.enterStaff(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStaff" ):
                listener.exitStaff(self)




    def staff(self):

        localctx = LilypondParser.StaffContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_staff)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 21
            self.match(LilypondParser.NEW_KW)
            self.state = 22
            self.match(LilypondParser.T__2)
            self.state = 24
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==LilypondParser.WITH_KW:
                self.state = 23
                self.with_block()


            self.state = 26
            self.match(LilypondParser.T__0)
            self.state = 28
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==LilypondParser.KW:
                self.state = 27
                self.prefix_block()


            self.state = 31
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==LilypondParser.NEW_KW:
                self.state = 30
                self.voice()


            self.state = 33
            self.match(LilypondParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class With_blockContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WITH_KW(self):
            return self.getToken(LilypondParser.WITH_KW, 0)

        def assignment(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.AssignmentContext)
            else:
                return self.getTypedRuleContext(LilypondParser.AssignmentContext,i)


        def getRuleIndex(self):
            return LilypondParser.RULE_with_block

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWith_block" ):
                listener.enterWith_block(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWith_block" ):
                listener.exitWith_block(self)




    def with_block(self):

        localctx = LilypondParser.With_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_with_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(LilypondParser.WITH_KW)
            self.state = 36
            self.match(LilypondParser.T__0)
            self.state = 40
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==LilypondParser.NAME:
                self.state = 37
                self.assignment()
                self.state = 42
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 43
            self.match(LilypondParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Prefix_blockContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def line(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.LineContext)
            else:
                return self.getTypedRuleContext(LilypondParser.LineContext,i)


        def getRuleIndex(self):
            return LilypondParser.RULE_prefix_block

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrefix_block" ):
                listener.enterPrefix_block(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrefix_block" ):
                listener.exitPrefix_block(self)




    def prefix_block(self):

        localctx = LilypondParser.Prefix_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_prefix_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 46 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 45
                self.line()
                self.state = 48 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==LilypondParser.KW):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LineContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def KW(self):
            return self.getToken(LilypondParser.KW, 0)

        def SLASH(self, i:int=None):
            if i is None:
                return self.getTokens(LilypondParser.SLASH)
            else:
                return self.getToken(LilypondParser.SLASH, i)

        def getRuleIndex(self):
            return LilypondParser.RULE_line

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLine" ):
                listener.enterLine(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLine" ):
                listener.exitLine(self)




    def line(self):

        localctx = LilypondParser.LineContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_line)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 50
            self.match(LilypondParser.KW)
            self.state = 54
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,6,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 51
                    _la = self._input.LA(1)
                    if _la <= 0 or _la==LilypondParser.SLASH:
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume() 
                self.state = 56
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,6,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NAME(self, i:int=None):
            if i is None:
                return self.getTokens(LilypondParser.NAME)
            else:
                return self.getToken(LilypondParser.NAME, i)

        def getRuleIndex(self):
            return LilypondParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)




    def assignment(self):

        localctx = LilypondParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 57
            self.match(LilypondParser.NAME)
            self.state = 58
            self.match(LilypondParser.T__3)
            self.state = 59
            self.match(LilypondParser.T__4)
            self.state = 60
            self.match(LilypondParser.NAME)
            self.state = 61
            self.match(LilypondParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VoiceContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NEW_KW(self):
            return self.getToken(LilypondParser.NEW_KW, 0)

        def NOTE(self, i:int=None):
            if i is None:
                return self.getTokens(LilypondParser.NOTE)
            else:
                return self.getToken(LilypondParser.NOTE, i)

        def getRuleIndex(self):
            return LilypondParser.RULE_voice

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVoice" ):
                listener.enterVoice(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVoice" ):
                listener.exitVoice(self)




    def voice(self):

        localctx = LilypondParser.VoiceContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_voice)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.match(LilypondParser.NEW_KW)
            self.state = 64
            self.match(LilypondParser.T__5)
            self.state = 65
            self.match(LilypondParser.T__0)
            self.state = 69
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==LilypondParser.NOTE:
                self.state = 66
                self.match(LilypondParser.NOTE)
                self.state = 71
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 72
            self.match(LilypondParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





