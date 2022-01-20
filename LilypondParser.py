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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17")
        buf.write("=\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2")
        buf.write("\3\2\3\2\5\2\22\n\2\3\2\3\2\3\3\3\3\3\3\5\3\31\n\3\3\3")
        buf.write("\3\3\6\3\35\n\3\r\3\16\3\36\3\3\3\3\3\4\3\4\3\4\7\4&\n")
        buf.write("\4\f\4\16\4)\13\4\3\4\3\4\3\5\6\5.\n\5\r\5\16\5/\3\6\3")
        buf.write("\6\7\6\64\n\6\f\6\16\6\67\13\6\3\7\3\7\3\7\3\7\3\7\2\2")
        buf.write("\b\2\4\6\b\n\f\2\3\3\2\r\r\2<\2\16\3\2\2\2\4\25\3\2\2")
        buf.write("\2\6\"\3\2\2\2\b-\3\2\2\2\n\61\3\2\2\2\f8\3\2\2\2\16\17")
        buf.write("\7\t\2\2\17\21\7\13\2\2\20\22\5\4\3\2\21\20\3\2\2\2\21")
        buf.write("\22\3\2\2\2\22\23\3\2\2\2\23\24\7\f\2\2\24\3\3\2\2\2\25")
        buf.write("\26\7\t\2\2\26\30\7\5\2\2\27\31\5\6\4\2\30\27\3\2\2\2")
        buf.write("\30\31\3\2\2\2\31\32\3\2\2\2\32\34\7\13\2\2\33\35\5\n")
        buf.write("\6\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3")
        buf.write("\2\2\2\37 \3\2\2\2 !\7\f\2\2!\5\3\2\2\2\"#\7\t\2\2#\'")
        buf.write("\7\13\2\2$&\5\f\7\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(")
        buf.write("\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\f\2\2+\7\3\2\2\2,.\5")
        buf.write("\n\6\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\t")
        buf.write("\3\2\2\2\61\65\7\t\2\2\62\64\n\2\2\2\63\62\3\2\2\2\64")
        buf.write("\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\13\3\2\2\2")
        buf.write("\67\65\3\2\2\289\7\n\2\29:\7\3\2\2:;\7\4\2\2;\r\3\2\2")
        buf.write("\2\b\21\30\36\'/\65")
        return buf.getvalue()


class LilypondParser ( Parser ):

    grammarFileName = "Lilypond.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'='", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'{'", "'}'", "'\\'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "STRING", "OBJ_TYPE", "NOTE", 
                      "OCTAVE", "DURATION", "KW", "NAME", "LBRACE", "RBRACE", 
                      "SLASH", "WS", "ALL" ]

    RULE_score = 0
    RULE_staff = 1
    RULE_with_block = 2
    RULE_prefix_block = 3
    RULE_line = 4
    RULE_assignment = 5

    ruleNames =  [ "score", "staff", "with_block", "prefix_block", "line", 
                   "assignment" ]

    EOF = Token.EOF
    T__0=1
    STRING=2
    OBJ_TYPE=3
    NOTE=4
    OCTAVE=5
    DURATION=6
    KW=7
    NAME=8
    LBRACE=9
    RBRACE=10
    SLASH=11
    WS=12
    ALL=13

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ScoreContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def KW(self):
            return self.getToken(LilypondParser.KW, 0)

        def LBRACE(self):
            return self.getToken(LilypondParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(LilypondParser.RBRACE, 0)

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
            self.state = 12
            self.match(LilypondParser.KW)
            self.state = 13
            self.match(LilypondParser.LBRACE)
            self.state = 15
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==LilypondParser.KW:
                self.state = 14
                self.staff()


            self.state = 17
            self.match(LilypondParser.RBRACE)
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

        def KW(self):
            return self.getToken(LilypondParser.KW, 0)

        def OBJ_TYPE(self):
            return self.getToken(LilypondParser.OBJ_TYPE, 0)

        def LBRACE(self):
            return self.getToken(LilypondParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(LilypondParser.RBRACE, 0)

        def with_block(self):
            return self.getTypedRuleContext(LilypondParser.With_blockContext,0)


        def line(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.LineContext)
            else:
                return self.getTypedRuleContext(LilypondParser.LineContext,i)


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
            self.state = 19
            self.match(LilypondParser.KW)
            self.state = 20
            self.match(LilypondParser.OBJ_TYPE)
            self.state = 22
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==LilypondParser.KW:
                self.state = 21
                self.with_block()


            self.state = 24
            self.match(LilypondParser.LBRACE)
            self.state = 26 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 25
                self.line()
                self.state = 28 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==LilypondParser.KW):
                    break

            self.state = 30
            self.match(LilypondParser.RBRACE)
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

        def KW(self):
            return self.getToken(LilypondParser.KW, 0)

        def LBRACE(self):
            return self.getToken(LilypondParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(LilypondParser.RBRACE, 0)

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
            self.state = 32
            self.match(LilypondParser.KW)
            self.state = 33
            self.match(LilypondParser.LBRACE)
            self.state = 37
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==LilypondParser.NAME:
                self.state = 34
                self.assignment()
                self.state = 39
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 40
            self.match(LilypondParser.RBRACE)
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
            self.state = 43 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 42
                self.line()
                self.state = 45 
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
            self.state = 47
            self.match(LilypondParser.KW)
            self.state = 51
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,5,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 48
                    _la = self._input.LA(1)
                    if _la <= 0 or _la==LilypondParser.SLASH:
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume() 
                self.state = 53
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,5,self._ctx)

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

        def NAME(self):
            return self.getToken(LilypondParser.NAME, 0)

        def STRING(self):
            return self.getToken(LilypondParser.STRING, 0)

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
            self.state = 54
            self.match(LilypondParser.NAME)
            self.state = 55
            self.match(LilypondParser.T__0)
            self.state = 56
            self.match(LilypondParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





