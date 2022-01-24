# Generated from lypy/LilypondParser.g4 by ANTLR 4.9.3
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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<")
        buf.write("\u00d9\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3")
        buf.write("\2\6\2\63\n\2\r\2\16\2\64\3\3\3\3\3\3\7\3:\n\3\f\3\16")
        buf.write("\3=\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4E\n\4\f\4\16\4H\13")
        buf.write("\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13\5\3\5")
        buf.write("\3\5\3\5\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\6\6_\n\6\r\6\16")
        buf.write("\6`\3\6\3\6\3\7\5\7f\n\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b")
        buf.write("\7\bo\n\b\f\b\16\br\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3")
        buf.write("\t\6\t|\n\t\r\t\16\t}\3\n\3\n\3\n\3\n\3\13\3\13\6\13\u0086")
        buf.write("\n\13\r\13\16\13\u0087\3\13\3\13\3\13\3\13\3\13\3\13\3")
        buf.write("\13\3\13\3\13\3\13\3\13\7\13\u0095\n\13\f\13\16\13\u0098")
        buf.write("\13\13\3\13\3\13\5\13\u009c\n\13\3\f\3\f\6\f\u00a0\n\f")
        buf.write("\r\f\16\f\u00a1\3\f\3\f\3\f\3\f\5\f\u00a8\n\f\3\r\3\r")
        buf.write("\3\r\3\r\3\r\3\r\3\r\5\r\u00b1\n\r\3\16\3\16\3\16\3\17")
        buf.write("\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22")
        buf.write("\5\22\u00c2\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5")
        buf.write("\24\u00cb\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27")
        buf.write("\3\27\3\27\5\27\u00d7\n\27\3\27\2\2\30\2\4\6\b\n\f\16")
        buf.write("\20\22\24\26\30\32\34\36 \"$&(*,\2\4\5\2\5\5\36\3688\3")
        buf.write("\2\13\f\2\u00e8\2\62\3\2\2\2\4\66\3\2\2\2\6@\3\2\2\2\b")
        buf.write("K\3\2\2\2\nW\3\2\2\2\fi\3\2\2\2\16k\3\2\2\2\20{\3\2\2")
        buf.write("\2\22\177\3\2\2\2\24\u009b\3\2\2\2\26\u009d\3\2\2\2\30")
        buf.write("\u00b0\3\2\2\2\32\u00b2\3\2\2\2\34\u00b5\3\2\2\2\36\u00b8")
        buf.write("\3\2\2\2 \u00ba\3\2\2\2\"\u00be\3\2\2\2$\u00c3\3\2\2\2")
        buf.write("&\u00c5\3\2\2\2(\u00cc\3\2\2\2*\u00cf\3\2\2\2,\u00d2\3")
        buf.write("\2\2\2.\63\5\4\3\2/\63\5\6\4\2\60\63\5*\26\2\61\63\5$")
        buf.write("\23\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2")
        buf.write("\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\3\3")
        buf.write("\2\2\2\66\67\7\6\2\2\67;\7\21\2\28:\5,\27\298\3\2\2\2")
        buf.write(":=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7")
        buf.write("\22\2\2?\5\3\2\2\2@A\7\b\2\2AF\7\21\2\2BE\5\n\6\2CE\5")
        buf.write("\b\5\2DB\3\2\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2")
        buf.write("\2GI\3\2\2\2HF\3\2\2\2IJ\7\22\2\2J\7\3\2\2\2KL\7\3\2\2")
        buf.write("LM\7\23\2\2MQ\7\23\2\2NP\5\n\6\2ON\3\2\2\2PS\3\2\2\2Q")
        buf.write("O\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\24\2\2UV\7")
        buf.write("\24\2\2V\t\3\2\2\2WY\7\4\2\2XZ\5\f\7\2YX\3\2\2\2YZ\3\2")
        buf.write("\2\2Z^\3\2\2\2[_\5\20\t\2\\_\5\24\13\2]_\5\16\b\2^[\3")
        buf.write("\2\2\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2")
        buf.write("\2\2ab\3\2\2\2bc\7\35\2\2c\13\3\2\2\2df\5(\25\2ed\3\2")
        buf.write("\2\2ef\3\2\2\2fg\3\2\2\2gj\5 \21\2hj\5(\25\2ie\3\2\2\2")
        buf.write("ih\3\2\2\2j\r\3\2\2\2kp\t\2\2\2lo\5\20\t\2mo\5\24\13\2")
        buf.write("nl\3\2\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3")
        buf.write("\2\2\2rp\3\2\2\2st\7\35\2\2t\17\3\2\2\2u|\5\22\n\2v|\5")
        buf.write("\30\r\2w|\5\24\13\2x|\5\26\f\2y|\7!\2\2z|\5\16\b\2{u\3")
        buf.write("\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2")
        buf.write("\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\21\3\2\2\2\177\u0080")
        buf.write("\7\37\2\2\u0080\u0081\5\20\t\2\u0081\u0082\7\35\2\2\u0082")
        buf.write("\23\3\2\2\2\u0083\u0085\7 \2\2\u0084\u0086\5\16\b\2\u0085")
        buf.write("\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2")
        buf.write("\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7")
        buf.write("9\2\2\u008a\u009c\3\2\2\2\u008b\u008c\7 \2\2\u008c\u008d")
        buf.write("\7\67\2\2\u008d\u008e\5\20\t\2\u008e\u0096\7\35\2\2\u008f")
        buf.write("\u0090\7\66\2\2\u0090\u0091\7\67\2\2\u0091\u0092\5\20")
        buf.write("\t\2\u0092\u0093\7\35\2\2\u0093\u0095\3\2\2\2\u0094\u008f")
        buf.write("\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096")
        buf.write("\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2")
        buf.write("\u0099\u009a\79\2\2\u009a\u009c\3\2\2\2\u009b\u0083\3")
        buf.write("\2\2\2\u009b\u008b\3\2\2\2\u009c\25\3\2\2\2\u009d\u009f")
        buf.write("\7\23\2\2\u009e\u00a0\7!\2\2\u009f\u009e\3\2\2\2\u00a0")
        buf.write("\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2")
        buf.write("\u00a2\u00a3\3\2\2\2\u00a3\u00a7\7\24\2\2\u00a4\u00a8")
        buf.write("\7\31\2\2\u00a5\u00a6\7\31\2\2\u00a6\u00a8\7\26\2\2\u00a7")
        buf.write("\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2")
        buf.write("\u00a8\27\3\2\2\2\u00a9\u00b1\5\32\16\2\u00aa\u00b1\5")
        buf.write("\34\17\2\u00ab\u00b1\5\36\20\2\u00ac\u00b1\5 \21\2\u00ad")
        buf.write("\u00b1\5\"\22\2\u00ae\u00b1\5&\24\2\u00af\u00b1\5(\25")
        buf.write("\2\u00b0\u00a9\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ab")
        buf.write("\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0")
        buf.write("\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\31\3\2\2\2\u00b2")
        buf.write("\u00b3\7%\2\2\u00b3\u00b4\7$\2\2\u00b4\33\3\2\2\2\u00b5")
        buf.write("\u00b6\7&\2\2\u00b6\u00b7\7\r\2\2\u00b7\35\3\2\2\2\u00b8")
        buf.write("\u00b9\7(\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\7)\2\2\u00bb")
        buf.write("\u00bc\7!\2\2\u00bc\u00bd\7+\2\2\u00bd!\3\2\2\2\u00be")
        buf.write("\u00c1\7*\2\2\u00bf\u00c2\5$\23\2\u00c0\u00c2\7\'\2\2")
        buf.write("\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3")
        buf.write("\2\2\2\u00c2#\3\2\2\2\u00c3\u00c4\t\3\2\2\u00c4%\3\2\2")
        buf.write("\2\u00c5\u00c6\7/\2\2\u00c6\u00ca\7\16\2\2\u00c7\u00c8")
        buf.write("\7\31\2\2\u00c8\u00c9\7\25\2\2\u00c9\u00cb\7\31\2\2\u00ca")
        buf.write("\u00c7\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\'\3\2\2\2\u00cc")
        buf.write("\u00cd\7\60\2\2\u00cd\u00ce\7#\2\2\u00ce)\3\2\2\2\u00cf")
        buf.write("\u00d0\7\n\2\2\u00d0\u00d1\7\17\2\2\u00d1+\3\2\2\2\u00d2")
        buf.write("\u00d3\7\r\2\2\u00d3\u00d6\7\25\2\2\u00d4\u00d7\7\16\2")
        buf.write("\2\u00d5\u00d7\5$\23\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5")
        buf.write("\3\2\2\2\u00d7-\3\2\2\2\32\62\64;DFQY^`einp{}\u0087\u0096")
        buf.write("\u009b\u00a1\u00a7\u00b0\u00c1\u00ca\u00d6")
        return buf.getvalue()


class LilypondParser ( Parser ):

    grammarFileName = "LilypondParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'\\new StaffGroup'", "<INVALID>", "<INVALID>", 
                     "'\\header'", "'\\layout'", "'\\score'", "'\\with'", 
                     "'\\version'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "'\\bar'", "'\\clef'", 
                     "'\\default'", "'\\fermata'", "'\\key'", "'\\mark'", 
                     "<INVALID>", "'\\major'", "'\\minor'", "'\\relative'", 
                     "'\\tempo'", "'\\time'", "'\\voiceOne'", "'\\voiceTwo'" ]

    symbolicNames = [ "<INVALID>", "STAFFGROUP_CTX", "STAFF_CTX", "VOICE_CTX", 
                      "HEADER_KW", "LAYOUT_KW", "SCORE_KW", "WITH_KW", "VERSION_KW", 
                      "SCHEME_GP", "SCHEME_ATOM", "ID", "STRING", "VERSION_STR", 
                      "HASH", "LBRACE", "RBRACE", "LANGLE", "RANGLE", "EQUALS", 
                      "DOT", "BSLASH", "FSLASH", "INTEGER", "COMMENT_MULTILINE", 
                      "COMMENT_INLINE", "WS", "END_NOTEBLOCK", "VOICE_CTX_N", 
                      "REL_BLOCK_N", "START_POLYPHONY_N", "NOTE", "OCTAVE", 
                      "TIME_SIG", "BARLINE", "BAR_KW", "CLEF_KW", "DEFAULT_KW", 
                      "FERMATA_KW", "KEY_KW", "MARK_KW", "MODE_KW", "MODE_MAJ", 
                      "MODE_MIN", "RELATIVE_KW", "TEMPO_KW", "TIME_KW", 
                      "VOICE_ONE", "VOICE_TWO", "COMMENT_MULTILINE_N", "COMMENT_INLINE_N", 
                      "WS_N", "NEXT_NOTEBLOCK_P", "NEW_NOTEBLOCK_P", "VOICE_CTX_P", 
                      "END_POLYPHONY_P", "COMMENT_MULTILINE_P", "COMMENT_INLINE_P", 
                      "WS_P" ]

    RULE_score_file = 0
    RULE_header_block = 1
    RULE_score_block = 2
    RULE_staffgroup_block = 3
    RULE_staff_block = 4
    RULE_prefix_block = 5
    RULE_voice_block = 6
    RULE_note_block = 7
    RULE_relative_block = 8
    RULE_polyphony_block = 9
    RULE_chord = 10
    RULE_note_cmd = 11
    RULE_bar_cmd = 12
    RULE_clef_cmd = 13
    RULE_fermata_cmd = 14
    RULE_key_cmd = 15
    RULE_mark_cmd = 16
    RULE_scheme_cmd = 17
    RULE_tempo_cmd = 18
    RULE_time_cmd = 19
    RULE_version_cmd = 20
    RULE_assignment = 21

    ruleNames =  [ "score_file", "header_block", "score_block", "staffgroup_block", 
                   "staff_block", "prefix_block", "voice_block", "note_block", 
                   "relative_block", "polyphony_block", "chord", "note_cmd", 
                   "bar_cmd", "clef_cmd", "fermata_cmd", "key_cmd", "mark_cmd", 
                   "scheme_cmd", "tempo_cmd", "time_cmd", "version_cmd", 
                   "assignment" ]

    EOF = Token.EOF
    STAFFGROUP_CTX=1
    STAFF_CTX=2
    VOICE_CTX=3
    HEADER_KW=4
    LAYOUT_KW=5
    SCORE_KW=6
    WITH_KW=7
    VERSION_KW=8
    SCHEME_GP=9
    SCHEME_ATOM=10
    ID=11
    STRING=12
    VERSION_STR=13
    HASH=14
    LBRACE=15
    RBRACE=16
    LANGLE=17
    RANGLE=18
    EQUALS=19
    DOT=20
    BSLASH=21
    FSLASH=22
    INTEGER=23
    COMMENT_MULTILINE=24
    COMMENT_INLINE=25
    WS=26
    END_NOTEBLOCK=27
    VOICE_CTX_N=28
    REL_BLOCK_N=29
    START_POLYPHONY_N=30
    NOTE=31
    OCTAVE=32
    TIME_SIG=33
    BARLINE=34
    BAR_KW=35
    CLEF_KW=36
    DEFAULT_KW=37
    FERMATA_KW=38
    KEY_KW=39
    MARK_KW=40
    MODE_KW=41
    MODE_MAJ=42
    MODE_MIN=43
    RELATIVE_KW=44
    TEMPO_KW=45
    TIME_KW=46
    VOICE_ONE=47
    VOICE_TWO=48
    COMMENT_MULTILINE_N=49
    COMMENT_INLINE_N=50
    WS_N=51
    NEXT_NOTEBLOCK_P=52
    NEW_NOTEBLOCK_P=53
    VOICE_CTX_P=54
    END_POLYPHONY_P=55
    COMMENT_MULTILINE_P=56
    COMMENT_INLINE_P=57
    WS_P=58

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.3")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class Score_fileContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def header_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Header_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Header_blockContext,i)


        def score_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Score_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Score_blockContext,i)


        def version_cmd(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Version_cmdContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Version_cmdContext,i)


        def scheme_cmd(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Scheme_cmdContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Scheme_cmdContext,i)


        def getRuleIndex(self):
            return LilypondParser.RULE_score_file




    def score_file(self):

        localctx = LilypondParser.Score_fileContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_score_file)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 48 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 48
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [LilypondParser.HEADER_KW]:
                    self.state = 44
                    self.header_block()
                    pass
                elif token in [LilypondParser.SCORE_KW]:
                    self.state = 45
                    self.score_block()
                    pass
                elif token in [LilypondParser.VERSION_KW]:
                    self.state = 46
                    self.version_cmd()
                    pass
                elif token in [LilypondParser.SCHEME_GP, LilypondParser.SCHEME_ATOM]:
                    self.state = 47
                    self.scheme_cmd()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 50 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << LilypondParser.HEADER_KW) | (1 << LilypondParser.SCORE_KW) | (1 << LilypondParser.VERSION_KW) | (1 << LilypondParser.SCHEME_GP) | (1 << LilypondParser.SCHEME_ATOM))) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Header_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def HEADER_KW(self):
            return self.getToken(LilypondParser.HEADER_KW, 0)

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
            return LilypondParser.RULE_header_block




    def header_block(self):

        localctx = LilypondParser.Header_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_header_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 52
            self.match(LilypondParser.HEADER_KW)
            self.state = 53
            self.match(LilypondParser.LBRACE)
            self.state = 57
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==LilypondParser.ID:
                self.state = 54
                self.assignment()
                self.state = 59
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 60
            self.match(LilypondParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Score_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SCORE_KW(self):
            return self.getToken(LilypondParser.SCORE_KW, 0)

        def LBRACE(self):
            return self.getToken(LilypondParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(LilypondParser.RBRACE, 0)

        def staff_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Staff_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Staff_blockContext,i)


        def staffgroup_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Staffgroup_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Staffgroup_blockContext,i)


        def getRuleIndex(self):
            return LilypondParser.RULE_score_block




    def score_block(self):

        localctx = LilypondParser.Score_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_score_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 62
            self.match(LilypondParser.SCORE_KW)
            self.state = 63
            self.match(LilypondParser.LBRACE)
            self.state = 68
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==LilypondParser.STAFFGROUP_CTX or _la==LilypondParser.STAFF_CTX:
                self.state = 66
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [LilypondParser.STAFF_CTX]:
                    self.state = 64
                    self.staff_block()
                    pass
                elif token in [LilypondParser.STAFFGROUP_CTX]:
                    self.state = 65
                    self.staffgroup_block()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 70
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 71
            self.match(LilypondParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Staffgroup_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STAFFGROUP_CTX(self):
            return self.getToken(LilypondParser.STAFFGROUP_CTX, 0)

        def LANGLE(self, i:int=None):
            if i is None:
                return self.getTokens(LilypondParser.LANGLE)
            else:
                return self.getToken(LilypondParser.LANGLE, i)

        def RANGLE(self, i:int=None):
            if i is None:
                return self.getTokens(LilypondParser.RANGLE)
            else:
                return self.getToken(LilypondParser.RANGLE, i)

        def staff_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Staff_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Staff_blockContext,i)


        def getRuleIndex(self):
            return LilypondParser.RULE_staffgroup_block




    def staffgroup_block(self):

        localctx = LilypondParser.Staffgroup_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_staffgroup_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            self.match(LilypondParser.STAFFGROUP_CTX)
            self.state = 74
            self.match(LilypondParser.LANGLE)
            self.state = 75
            self.match(LilypondParser.LANGLE)
            self.state = 79
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==LilypondParser.STAFF_CTX:
                self.state = 76
                self.staff_block()
                self.state = 81
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 82
            self.match(LilypondParser.RANGLE)
            self.state = 83
            self.match(LilypondParser.RANGLE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Staff_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STAFF_CTX(self):
            return self.getToken(LilypondParser.STAFF_CTX, 0)

        def END_NOTEBLOCK(self):
            return self.getToken(LilypondParser.END_NOTEBLOCK, 0)

        def prefix_block(self):
            return self.getTypedRuleContext(LilypondParser.Prefix_blockContext,0)


        def note_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Note_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Note_blockContext,i)


        def polyphony_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Polyphony_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Polyphony_blockContext,i)


        def voice_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Voice_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Voice_blockContext,i)


        def getRuleIndex(self):
            return LilypondParser.RULE_staff_block




    def staff_block(self):

        localctx = LilypondParser.Staff_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_staff_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 85
            self.match(LilypondParser.STAFF_CTX)
            self.state = 87
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.state = 86
                self.prefix_block()


            self.state = 92 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 92
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
                if la_ == 1:
                    self.state = 89
                    self.note_block()
                    pass

                elif la_ == 2:
                    self.state = 90
                    self.polyphony_block()
                    pass

                elif la_ == 3:
                    self.state = 91
                    self.voice_block()
                    pass


                self.state = 94 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << LilypondParser.VOICE_CTX) | (1 << LilypondParser.LANGLE) | (1 << LilypondParser.VOICE_CTX_N) | (1 << LilypondParser.REL_BLOCK_N) | (1 << LilypondParser.START_POLYPHONY_N) | (1 << LilypondParser.NOTE) | (1 << LilypondParser.BAR_KW) | (1 << LilypondParser.CLEF_KW) | (1 << LilypondParser.FERMATA_KW) | (1 << LilypondParser.KEY_KW) | (1 << LilypondParser.MARK_KW) | (1 << LilypondParser.TEMPO_KW) | (1 << LilypondParser.TIME_KW) | (1 << LilypondParser.VOICE_CTX_P))) != 0)):
                    break

            self.state = 96
            self.match(LilypondParser.END_NOTEBLOCK)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Prefix_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def key_cmd(self):
            return self.getTypedRuleContext(LilypondParser.Key_cmdContext,0)


        def time_cmd(self):
            return self.getTypedRuleContext(LilypondParser.Time_cmdContext,0)


        def getRuleIndex(self):
            return LilypondParser.RULE_prefix_block




    def prefix_block(self):

        localctx = LilypondParser.Prefix_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_prefix_block)
        self._la = 0 # Token type
        try:
            self.state = 103
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 99
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==LilypondParser.TIME_KW:
                    self.state = 98
                    self.time_cmd()


                self.state = 101
                self.key_cmd()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 102
                self.time_cmd()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Voice_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def END_NOTEBLOCK(self):
            return self.getToken(LilypondParser.END_NOTEBLOCK, 0)

        def VOICE_CTX(self):
            return self.getToken(LilypondParser.VOICE_CTX, 0)

        def VOICE_CTX_N(self):
            return self.getToken(LilypondParser.VOICE_CTX_N, 0)

        def VOICE_CTX_P(self):
            return self.getToken(LilypondParser.VOICE_CTX_P, 0)

        def note_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Note_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Note_blockContext,i)


        def polyphony_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Polyphony_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Polyphony_blockContext,i)


        def getRuleIndex(self):
            return LilypondParser.RULE_voice_block




    def voice_block(self):

        localctx = LilypondParser.Voice_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_voice_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 105
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << LilypondParser.VOICE_CTX) | (1 << LilypondParser.VOICE_CTX_N) | (1 << LilypondParser.VOICE_CTX_P))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 110
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << LilypondParser.VOICE_CTX) | (1 << LilypondParser.LANGLE) | (1 << LilypondParser.VOICE_CTX_N) | (1 << LilypondParser.REL_BLOCK_N) | (1 << LilypondParser.START_POLYPHONY_N) | (1 << LilypondParser.NOTE) | (1 << LilypondParser.BAR_KW) | (1 << LilypondParser.CLEF_KW) | (1 << LilypondParser.FERMATA_KW) | (1 << LilypondParser.KEY_KW) | (1 << LilypondParser.MARK_KW) | (1 << LilypondParser.TEMPO_KW) | (1 << LilypondParser.TIME_KW) | (1 << LilypondParser.VOICE_CTX_P))) != 0):
                self.state = 108
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
                if la_ == 1:
                    self.state = 106
                    self.note_block()
                    pass

                elif la_ == 2:
                    self.state = 107
                    self.polyphony_block()
                    pass


                self.state = 112
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 113
            self.match(LilypondParser.END_NOTEBLOCK)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Note_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def relative_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Relative_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Relative_blockContext,i)


        def note_cmd(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Note_cmdContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Note_cmdContext,i)


        def polyphony_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Polyphony_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Polyphony_blockContext,i)


        def chord(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.ChordContext)
            else:
                return self.getTypedRuleContext(LilypondParser.ChordContext,i)


        def NOTE(self, i:int=None):
            if i is None:
                return self.getTokens(LilypondParser.NOTE)
            else:
                return self.getToken(LilypondParser.NOTE, i)

        def voice_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Voice_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Voice_blockContext,i)


        def getRuleIndex(self):
            return LilypondParser.RULE_note_block




    def note_block(self):

        localctx = LilypondParser.Note_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_note_block)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 121 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 121
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [LilypondParser.REL_BLOCK_N]:
                        self.state = 115
                        self.relative_block()
                        pass
                    elif token in [LilypondParser.BAR_KW, LilypondParser.CLEF_KW, LilypondParser.FERMATA_KW, LilypondParser.KEY_KW, LilypondParser.MARK_KW, LilypondParser.TEMPO_KW, LilypondParser.TIME_KW]:
                        self.state = 116
                        self.note_cmd()
                        pass
                    elif token in [LilypondParser.START_POLYPHONY_N]:
                        self.state = 117
                        self.polyphony_block()
                        pass
                    elif token in [LilypondParser.LANGLE]:
                        self.state = 118
                        self.chord()
                        pass
                    elif token in [LilypondParser.NOTE]:
                        self.state = 119
                        self.match(LilypondParser.NOTE)
                        pass
                    elif token in [LilypondParser.VOICE_CTX, LilypondParser.VOICE_CTX_N, LilypondParser.VOICE_CTX_P]:
                        self.state = 120
                        self.voice_block()
                        pass
                    else:
                        raise NoViableAltException(self)


                else:
                    raise NoViableAltException(self)
                self.state = 123 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,14,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Relative_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def REL_BLOCK_N(self):
            return self.getToken(LilypondParser.REL_BLOCK_N, 0)

        def note_block(self):
            return self.getTypedRuleContext(LilypondParser.Note_blockContext,0)


        def END_NOTEBLOCK(self):
            return self.getToken(LilypondParser.END_NOTEBLOCK, 0)

        def getRuleIndex(self):
            return LilypondParser.RULE_relative_block




    def relative_block(self):

        localctx = LilypondParser.Relative_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_relative_block)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 125
            self.match(LilypondParser.REL_BLOCK_N)
            self.state = 126
            self.note_block()
            self.state = 127
            self.match(LilypondParser.END_NOTEBLOCK)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Polyphony_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def START_POLYPHONY_N(self):
            return self.getToken(LilypondParser.START_POLYPHONY_N, 0)

        def END_POLYPHONY_P(self):
            return self.getToken(LilypondParser.END_POLYPHONY_P, 0)

        def voice_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Voice_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Voice_blockContext,i)


        def NEW_NOTEBLOCK_P(self, i:int=None):
            if i is None:
                return self.getTokens(LilypondParser.NEW_NOTEBLOCK_P)
            else:
                return self.getToken(LilypondParser.NEW_NOTEBLOCK_P, i)

        def note_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(LilypondParser.Note_blockContext)
            else:
                return self.getTypedRuleContext(LilypondParser.Note_blockContext,i)


        def END_NOTEBLOCK(self, i:int=None):
            if i is None:
                return self.getTokens(LilypondParser.END_NOTEBLOCK)
            else:
                return self.getToken(LilypondParser.END_NOTEBLOCK, i)

        def NEXT_NOTEBLOCK_P(self, i:int=None):
            if i is None:
                return self.getTokens(LilypondParser.NEXT_NOTEBLOCK_P)
            else:
                return self.getToken(LilypondParser.NEXT_NOTEBLOCK_P, i)

        def getRuleIndex(self):
            return LilypondParser.RULE_polyphony_block




    def polyphony_block(self):

        localctx = LilypondParser.Polyphony_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_polyphony_block)
        self._la = 0 # Token type
        try:
            self.state = 153
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 129
                self.match(LilypondParser.START_POLYPHONY_N)
                self.state = 131 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 130
                    self.voice_block()
                    self.state = 133 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << LilypondParser.VOICE_CTX) | (1 << LilypondParser.VOICE_CTX_N) | (1 << LilypondParser.VOICE_CTX_P))) != 0)):
                        break

                self.state = 135
                self.match(LilypondParser.END_POLYPHONY_P)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 137
                self.match(LilypondParser.START_POLYPHONY_N)
                self.state = 138
                self.match(LilypondParser.NEW_NOTEBLOCK_P)
                self.state = 139
                self.note_block()
                self.state = 140
                self.match(LilypondParser.END_NOTEBLOCK)
                self.state = 148
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==LilypondParser.NEXT_NOTEBLOCK_P:
                    self.state = 141
                    self.match(LilypondParser.NEXT_NOTEBLOCK_P)
                    self.state = 142
                    self.match(LilypondParser.NEW_NOTEBLOCK_P)
                    self.state = 143
                    self.note_block()
                    self.state = 144
                    self.match(LilypondParser.END_NOTEBLOCK)
                    self.state = 150
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 151
                self.match(LilypondParser.END_POLYPHONY_P)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ChordContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LANGLE(self):
            return self.getToken(LilypondParser.LANGLE, 0)

        def RANGLE(self):
            return self.getToken(LilypondParser.RANGLE, 0)

        def NOTE(self, i:int=None):
            if i is None:
                return self.getTokens(LilypondParser.NOTE)
            else:
                return self.getToken(LilypondParser.NOTE, i)

        def INTEGER(self):
            return self.getToken(LilypondParser.INTEGER, 0)

        def DOT(self):
            return self.getToken(LilypondParser.DOT, 0)

        def getRuleIndex(self):
            return LilypondParser.RULE_chord




    def chord(self):

        localctx = LilypondParser.ChordContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_chord)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 155
            self.match(LilypondParser.LANGLE)
            self.state = 157 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 156
                self.match(LilypondParser.NOTE)
                self.state = 159 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==LilypondParser.NOTE):
                    break

            self.state = 161
            self.match(LilypondParser.RANGLE)
            self.state = 165
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,19,self._ctx)
            if la_ == 1:
                self.state = 162
                self.match(LilypondParser.INTEGER)

            elif la_ == 2:
                self.state = 163
                self.match(LilypondParser.INTEGER)
                self.state = 164
                self.match(LilypondParser.DOT)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Note_cmdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def bar_cmd(self):
            return self.getTypedRuleContext(LilypondParser.Bar_cmdContext,0)


        def clef_cmd(self):
            return self.getTypedRuleContext(LilypondParser.Clef_cmdContext,0)


        def fermata_cmd(self):
            return self.getTypedRuleContext(LilypondParser.Fermata_cmdContext,0)


        def key_cmd(self):
            return self.getTypedRuleContext(LilypondParser.Key_cmdContext,0)


        def mark_cmd(self):
            return self.getTypedRuleContext(LilypondParser.Mark_cmdContext,0)


        def tempo_cmd(self):
            return self.getTypedRuleContext(LilypondParser.Tempo_cmdContext,0)


        def time_cmd(self):
            return self.getTypedRuleContext(LilypondParser.Time_cmdContext,0)


        def getRuleIndex(self):
            return LilypondParser.RULE_note_cmd




    def note_cmd(self):

        localctx = LilypondParser.Note_cmdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_note_cmd)
        try:
            self.state = 174
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [LilypondParser.BAR_KW]:
                self.enterOuterAlt(localctx, 1)
                self.state = 167
                self.bar_cmd()
                pass
            elif token in [LilypondParser.CLEF_KW]:
                self.enterOuterAlt(localctx, 2)
                self.state = 168
                self.clef_cmd()
                pass
            elif token in [LilypondParser.FERMATA_KW]:
                self.enterOuterAlt(localctx, 3)
                self.state = 169
                self.fermata_cmd()
                pass
            elif token in [LilypondParser.KEY_KW]:
                self.enterOuterAlt(localctx, 4)
                self.state = 170
                self.key_cmd()
                pass
            elif token in [LilypondParser.MARK_KW]:
                self.enterOuterAlt(localctx, 5)
                self.state = 171
                self.mark_cmd()
                pass
            elif token in [LilypondParser.TEMPO_KW]:
                self.enterOuterAlt(localctx, 6)
                self.state = 172
                self.tempo_cmd()
                pass
            elif token in [LilypondParser.TIME_KW]:
                self.enterOuterAlt(localctx, 7)
                self.state = 173
                self.time_cmd()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Bar_cmdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BAR_KW(self):
            return self.getToken(LilypondParser.BAR_KW, 0)

        def BARLINE(self):
            return self.getToken(LilypondParser.BARLINE, 0)

        def getRuleIndex(self):
            return LilypondParser.RULE_bar_cmd




    def bar_cmd(self):

        localctx = LilypondParser.Bar_cmdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_bar_cmd)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 176
            self.match(LilypondParser.BAR_KW)
            self.state = 177
            self.match(LilypondParser.BARLINE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Clef_cmdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLEF_KW(self):
            return self.getToken(LilypondParser.CLEF_KW, 0)

        def ID(self):
            return self.getToken(LilypondParser.ID, 0)

        def getRuleIndex(self):
            return LilypondParser.RULE_clef_cmd




    def clef_cmd(self):

        localctx = LilypondParser.Clef_cmdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_clef_cmd)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 179
            self.match(LilypondParser.CLEF_KW)
            self.state = 180
            self.match(LilypondParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Fermata_cmdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FERMATA_KW(self):
            return self.getToken(LilypondParser.FERMATA_KW, 0)

        def getRuleIndex(self):
            return LilypondParser.RULE_fermata_cmd




    def fermata_cmd(self):

        localctx = LilypondParser.Fermata_cmdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_fermata_cmd)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 182
            self.match(LilypondParser.FERMATA_KW)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Key_cmdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def KEY_KW(self):
            return self.getToken(LilypondParser.KEY_KW, 0)

        def NOTE(self):
            return self.getToken(LilypondParser.NOTE, 0)

        def MODE_KW(self):
            return self.getToken(LilypondParser.MODE_KW, 0)

        def getRuleIndex(self):
            return LilypondParser.RULE_key_cmd




    def key_cmd(self):

        localctx = LilypondParser.Key_cmdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_key_cmd)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 184
            self.match(LilypondParser.KEY_KW)
            self.state = 185
            self.match(LilypondParser.NOTE)
            self.state = 186
            self.match(LilypondParser.MODE_KW)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Mark_cmdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MARK_KW(self):
            return self.getToken(LilypondParser.MARK_KW, 0)

        def scheme_cmd(self):
            return self.getTypedRuleContext(LilypondParser.Scheme_cmdContext,0)


        def DEFAULT_KW(self):
            return self.getToken(LilypondParser.DEFAULT_KW, 0)

        def getRuleIndex(self):
            return LilypondParser.RULE_mark_cmd




    def mark_cmd(self):

        localctx = LilypondParser.Mark_cmdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_mark_cmd)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 188
            self.match(LilypondParser.MARK_KW)
            self.state = 191
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [LilypondParser.SCHEME_GP, LilypondParser.SCHEME_ATOM]:
                self.state = 189
                self.scheme_cmd()
                pass
            elif token in [LilypondParser.DEFAULT_KW]:
                self.state = 190
                self.match(LilypondParser.DEFAULT_KW)
                pass
            elif token in [LilypondParser.VOICE_CTX, LilypondParser.LANGLE, LilypondParser.END_NOTEBLOCK, LilypondParser.VOICE_CTX_N, LilypondParser.REL_BLOCK_N, LilypondParser.START_POLYPHONY_N, LilypondParser.NOTE, LilypondParser.BAR_KW, LilypondParser.CLEF_KW, LilypondParser.FERMATA_KW, LilypondParser.KEY_KW, LilypondParser.MARK_KW, LilypondParser.TEMPO_KW, LilypondParser.TIME_KW, LilypondParser.VOICE_CTX_P]:
                pass
            else:
                pass
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Scheme_cmdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SCHEME_GP(self):
            return self.getToken(LilypondParser.SCHEME_GP, 0)

        def SCHEME_ATOM(self):
            return self.getToken(LilypondParser.SCHEME_ATOM, 0)

        def getRuleIndex(self):
            return LilypondParser.RULE_scheme_cmd




    def scheme_cmd(self):

        localctx = LilypondParser.Scheme_cmdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_scheme_cmd)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 193
            _la = self._input.LA(1)
            if not(_la==LilypondParser.SCHEME_GP or _la==LilypondParser.SCHEME_ATOM):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Tempo_cmdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TEMPO_KW(self):
            return self.getToken(LilypondParser.TEMPO_KW, 0)

        def STRING(self):
            return self.getToken(LilypondParser.STRING, 0)

        def INTEGER(self, i:int=None):
            if i is None:
                return self.getTokens(LilypondParser.INTEGER)
            else:
                return self.getToken(LilypondParser.INTEGER, i)

        def EQUALS(self):
            return self.getToken(LilypondParser.EQUALS, 0)

        def getRuleIndex(self):
            return LilypondParser.RULE_tempo_cmd




    def tempo_cmd(self):

        localctx = LilypondParser.Tempo_cmdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_tempo_cmd)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 195
            self.match(LilypondParser.TEMPO_KW)
            self.state = 196
            self.match(LilypondParser.STRING)
            self.state = 200
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==LilypondParser.INTEGER:
                self.state = 197
                self.match(LilypondParser.INTEGER)
                self.state = 198
                self.match(LilypondParser.EQUALS)
                self.state = 199
                self.match(LilypondParser.INTEGER)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Time_cmdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TIME_KW(self):
            return self.getToken(LilypondParser.TIME_KW, 0)

        def TIME_SIG(self):
            return self.getToken(LilypondParser.TIME_SIG, 0)

        def getRuleIndex(self):
            return LilypondParser.RULE_time_cmd




    def time_cmd(self):

        localctx = LilypondParser.Time_cmdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_time_cmd)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 202
            self.match(LilypondParser.TIME_KW)
            self.state = 203
            self.match(LilypondParser.TIME_SIG)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Version_cmdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VERSION_KW(self):
            return self.getToken(LilypondParser.VERSION_KW, 0)

        def VERSION_STR(self):
            return self.getToken(LilypondParser.VERSION_STR, 0)

        def getRuleIndex(self):
            return LilypondParser.RULE_version_cmd




    def version_cmd(self):

        localctx = LilypondParser.Version_cmdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_version_cmd)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 205
            self.match(LilypondParser.VERSION_KW)
            self.state = 206
            self.match(LilypondParser.VERSION_STR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(LilypondParser.ID, 0)

        def EQUALS(self):
            return self.getToken(LilypondParser.EQUALS, 0)

        def STRING(self):
            return self.getToken(LilypondParser.STRING, 0)

        def scheme_cmd(self):
            return self.getTypedRuleContext(LilypondParser.Scheme_cmdContext,0)


        def getRuleIndex(self):
            return LilypondParser.RULE_assignment




    def assignment(self):

        localctx = LilypondParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 208
            self.match(LilypondParser.ID)
            self.state = 209
            self.match(LilypondParser.EQUALS)
            self.state = 212
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [LilypondParser.STRING]:
                self.state = 210
                self.match(LilypondParser.STRING)
                pass
            elif token in [LilypondParser.SCHEME_GP, LilypondParser.SCHEME_ATOM]:
                self.state = 211
                self.scheme_cmd()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





