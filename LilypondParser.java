// Generated from Lilypond.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LilypondParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, STAFF_CTX=5, STAFFGROUP_CTX=6, VOICE_CTX=7, 
		BOOK_KW=8, HEADER_KW=9, LAYOUT_KW=10, SCORE_KW=11, WITH_KW=12, VERSION_KW=13, 
		SCHEME_GP=14, SCHEME_ATOM=15, BAR_KW=16, CLEF_KW=17, DEFAULT_KW=18, FERMATA_KW=19, 
		KEY_KW=20, MARK_KW=21, MODE_KW=22, MODE_MAJ=23, MODE_MIN=24, RELATIVE_KW=25, 
		TEMPO_KW=26, TIME_KW=27, KW=28, NOTE=29, TIME_SIG=30, TEMPO_EQN=31, OCTAVE=32, 
		BARLINE=33, ID=34, STRING=35, VERSION_STR=36, HASH=37, LBRACE=38, RBRACE=39, 
		SLASH=40, INTEGER=41, COMMENT_MULTILINE=42, COMMENT_INLINE=43, WS=44, 
		ALL=45;
	public static final int
		RULE_score_file = 0, RULE_book_block = 1, RULE_header_block = 2, RULE_score_block = 3, 
		RULE_staffgroup_block = 4, RULE_staff_block = 5, RULE_prefix_block = 6, 
		RULE_with_block = 7, RULE_voice_block = 8, RULE_note_block = 9, RULE_relative_block = 10, 
		RULE_polyphony_block = 11, RULE_scheme_cmd = 12, RULE_note_cmd = 13, RULE_bar_cmd = 14, 
		RULE_clef_cmd = 15, RULE_fermata_cmd = 16, RULE_key_cmd = 17, RULE_mark_cmd = 18, 
		RULE_tempo_cmd = 19, RULE_time_cmd = 20, RULE_version_cmd = 21, RULE_assignment = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"score_file", "book_block", "header_block", "score_block", "staffgroup_block", 
			"staff_block", "prefix_block", "with_block", "voice_block", "note_block", 
			"relative_block", "polyphony_block", "scheme_cmd", "note_cmd", "bar_cmd", 
			"clef_cmd", "fermata_cmd", "key_cmd", "mark_cmd", "tempo_cmd", "time_cmd", 
			"version_cmd", "assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<<'", "'>>'", "'\\\\'", "'='", "'\\new Staff'", "'\\new StaffGroup'", 
			"'\\new Voice'", "'\\book'", "'\\header'", "'\\layout'", "'\\score'", 
			"'\\with'", "'\\version'", null, null, "'\\bar'", "'\\clef'", "'\\default'", 
			"'\\fermata'", "'\\key'", "'\\mark'", null, "'\\major'", "'\\minor'", 
			"'\\relative'", "'\\tempo'", "'\\time'", null, null, null, null, null, 
			null, null, null, null, "'#'", "'{'", "'}'", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "STAFF_CTX", "STAFFGROUP_CTX", "VOICE_CTX", 
			"BOOK_KW", "HEADER_KW", "LAYOUT_KW", "SCORE_KW", "WITH_KW", "VERSION_KW", 
			"SCHEME_GP", "SCHEME_ATOM", "BAR_KW", "CLEF_KW", "DEFAULT_KW", "FERMATA_KW", 
			"KEY_KW", "MARK_KW", "MODE_KW", "MODE_MAJ", "MODE_MIN", "RELATIVE_KW", 
			"TEMPO_KW", "TIME_KW", "KW", "NOTE", "TIME_SIG", "TEMPO_EQN", "OCTAVE", 
			"BARLINE", "ID", "STRING", "VERSION_STR", "HASH", "LBRACE", "RBRACE", 
			"SLASH", "INTEGER", "COMMENT_MULTILINE", "COMMENT_INLINE", "WS", "ALL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Lilypond.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LilypondParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Score_fileContext extends ParserRuleContext {
		public List<Header_blockContext> header_block() {
			return getRuleContexts(Header_blockContext.class);
		}
		public Header_blockContext header_block(int i) {
			return getRuleContext(Header_blockContext.class,i);
		}
		public List<Book_blockContext> book_block() {
			return getRuleContexts(Book_blockContext.class);
		}
		public Book_blockContext book_block(int i) {
			return getRuleContext(Book_blockContext.class,i);
		}
		public List<Score_blockContext> score_block() {
			return getRuleContexts(Score_blockContext.class);
		}
		public Score_blockContext score_block(int i) {
			return getRuleContext(Score_blockContext.class,i);
		}
		public List<Version_cmdContext> version_cmd() {
			return getRuleContexts(Version_cmdContext.class);
		}
		public Version_cmdContext version_cmd(int i) {
			return getRuleContext(Version_cmdContext.class,i);
		}
		public List<Scheme_cmdContext> scheme_cmd() {
			return getRuleContexts(Scheme_cmdContext.class);
		}
		public Scheme_cmdContext scheme_cmd(int i) {
			return getRuleContext(Scheme_cmdContext.class,i);
		}
		public Score_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterScore_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitScore_file(this);
		}
	}

	public final Score_fileContext score_file() throws RecognitionException {
		Score_fileContext _localctx = new Score_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_score_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HEADER_KW:
					{
					setState(46);
					header_block();
					}
					break;
				case BOOK_KW:
					{
					setState(47);
					book_block();
					}
					break;
				case SCORE_KW:
					{
					setState(48);
					score_block();
					}
					break;
				case VERSION_KW:
					{
					setState(49);
					version_cmd();
					}
					break;
				case SCHEME_GP:
				case SCHEME_ATOM:
					{
					setState(50);
					scheme_cmd();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOK_KW) | (1L << HEADER_KW) | (1L << SCORE_KW) | (1L << VERSION_KW) | (1L << SCHEME_GP) | (1L << SCHEME_ATOM))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Book_blockContext extends ParserRuleContext {
		public TerminalNode BOOK_KW() { return getToken(LilypondParser.BOOK_KW, 0); }
		public TerminalNode LBRACE() { return getToken(LilypondParser.LBRACE, 0); }
		public Score_blockContext score_block() {
			return getRuleContext(Score_blockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LilypondParser.RBRACE, 0); }
		public Book_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_book_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterBook_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitBook_block(this);
		}
	}

	public final Book_blockContext book_block() throws RecognitionException {
		Book_blockContext _localctx = new Book_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_book_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(BOOK_KW);
			setState(56);
			match(LBRACE);
			setState(57);
			score_block();
			setState(58);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header_blockContext extends ParserRuleContext {
		public TerminalNode HEADER_KW() { return getToken(LilypondParser.HEADER_KW, 0); }
		public TerminalNode LBRACE() { return getToken(LilypondParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LilypondParser.RBRACE, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public Header_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterHeader_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitHeader_block(this);
		}
	}

	public final Header_blockContext header_block() throws RecognitionException {
		Header_blockContext _localctx = new Header_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(HEADER_KW);
			setState(61);
			match(LBRACE);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(62);
				assignment();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Score_blockContext extends ParserRuleContext {
		public TerminalNode SCORE_KW() { return getToken(LilypondParser.SCORE_KW, 0); }
		public TerminalNode LBRACE() { return getToken(LilypondParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LilypondParser.RBRACE, 0); }
		public List<Staff_blockContext> staff_block() {
			return getRuleContexts(Staff_blockContext.class);
		}
		public Staff_blockContext staff_block(int i) {
			return getRuleContext(Staff_blockContext.class,i);
		}
		public List<Staffgroup_blockContext> staffgroup_block() {
			return getRuleContexts(Staffgroup_blockContext.class);
		}
		public Staffgroup_blockContext staffgroup_block(int i) {
			return getRuleContext(Staffgroup_blockContext.class,i);
		}
		public Score_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterScore_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitScore_block(this);
		}
	}

	public final Score_blockContext score_block() throws RecognitionException {
		Score_blockContext _localctx = new Score_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_score_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(SCORE_KW);
			setState(71);
			match(LBRACE);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAFF_CTX || _la==STAFFGROUP_CTX) {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAFF_CTX:
					{
					setState(72);
					staff_block();
					}
					break;
				case STAFFGROUP_CTX:
					{
					setState(73);
					staffgroup_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Staffgroup_blockContext extends ParserRuleContext {
		public TerminalNode STAFFGROUP_CTX() { return getToken(LilypondParser.STAFFGROUP_CTX, 0); }
		public List<Staff_blockContext> staff_block() {
			return getRuleContexts(Staff_blockContext.class);
		}
		public Staff_blockContext staff_block(int i) {
			return getRuleContext(Staff_blockContext.class,i);
		}
		public Staffgroup_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staffgroup_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterStaffgroup_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitStaffgroup_block(this);
		}
	}

	public final Staffgroup_blockContext staffgroup_block() throws RecognitionException {
		Staffgroup_blockContext _localctx = new Staffgroup_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_staffgroup_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(STAFFGROUP_CTX);
			setState(82);
			match(T__0);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAFF_CTX) {
				{
				{
				setState(83);
				staff_block();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Staff_blockContext extends ParserRuleContext {
		public TerminalNode STAFF_CTX() { return getToken(LilypondParser.STAFF_CTX, 0); }
		public TerminalNode LBRACE() { return getToken(LilypondParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LilypondParser.RBRACE, 0); }
		public With_blockContext with_block() {
			return getRuleContext(With_blockContext.class,0);
		}
		public Prefix_blockContext prefix_block() {
			return getRuleContext(Prefix_blockContext.class,0);
		}
		public List<Note_blockContext> note_block() {
			return getRuleContexts(Note_blockContext.class);
		}
		public Note_blockContext note_block(int i) {
			return getRuleContext(Note_blockContext.class,i);
		}
		public List<Polyphony_blockContext> polyphony_block() {
			return getRuleContexts(Polyphony_blockContext.class);
		}
		public Polyphony_blockContext polyphony_block(int i) {
			return getRuleContext(Polyphony_blockContext.class,i);
		}
		public List<Voice_blockContext> voice_block() {
			return getRuleContexts(Voice_blockContext.class);
		}
		public Voice_blockContext voice_block(int i) {
			return getRuleContext(Voice_blockContext.class,i);
		}
		public Staff_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staff_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterStaff_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitStaff_block(this);
		}
	}

	public final Staff_blockContext staff_block() throws RecognitionException {
		Staff_blockContext _localctx = new Staff_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_staff_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(STAFF_CTX);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_KW) {
				{
				setState(92);
				with_block();
				}
			}

			setState(95);
			match(LBRACE);
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(96);
				prefix_block();
				}
				break;
			}
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BAR_KW:
				case CLEF_KW:
				case FERMATA_KW:
				case KEY_KW:
				case MARK_KW:
				case RELATIVE_KW:
				case TEMPO_KW:
				case TIME_KW:
				case NOTE:
					{
					setState(99);
					note_block();
					}
					break;
				case T__0:
					{
					setState(100);
					polyphony_block();
					}
					break;
				case VOICE_CTX:
					{
					setState(101);
					voice_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VOICE_CTX) | (1L << BAR_KW) | (1L << CLEF_KW) | (1L << FERMATA_KW) | (1L << KEY_KW) | (1L << MARK_KW) | (1L << RELATIVE_KW) | (1L << TEMPO_KW) | (1L << TIME_KW) | (1L << NOTE))) != 0) );
			setState(106);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_blockContext extends ParserRuleContext {
		public Time_cmdContext time_cmd() {
			return getRuleContext(Time_cmdContext.class,0);
		}
		public Prefix_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterPrefix_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitPrefix_block(this);
		}
	}

	public final Prefix_blockContext prefix_block() throws RecognitionException {
		Prefix_blockContext _localctx = new Prefix_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_prefix_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			time_cmd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_blockContext extends ParserRuleContext {
		public TerminalNode WITH_KW() { return getToken(LilypondParser.WITH_KW, 0); }
		public TerminalNode LBRACE() { return getToken(LilypondParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LilypondParser.RBRACE, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public With_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterWith_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitWith_block(this);
		}
	}

	public final With_blockContext with_block() throws RecognitionException {
		With_blockContext _localctx = new With_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_with_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(WITH_KW);
			setState(111);
			match(LBRACE);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(112);
				assignment();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Voice_blockContext extends ParserRuleContext {
		public TerminalNode VOICE_CTX() { return getToken(LilypondParser.VOICE_CTX, 0); }
		public TerminalNode LBRACE() { return getToken(LilypondParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LilypondParser.RBRACE, 0); }
		public List<Note_blockContext> note_block() {
			return getRuleContexts(Note_blockContext.class);
		}
		public Note_blockContext note_block(int i) {
			return getRuleContext(Note_blockContext.class,i);
		}
		public List<Polyphony_blockContext> polyphony_block() {
			return getRuleContexts(Polyphony_blockContext.class);
		}
		public Polyphony_blockContext polyphony_block(int i) {
			return getRuleContext(Polyphony_blockContext.class,i);
		}
		public Voice_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voice_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterVoice_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitVoice_block(this);
		}
	}

	public final Voice_blockContext voice_block() throws RecognitionException {
		Voice_blockContext _localctx = new Voice_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_voice_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(VOICE_CTX);
			setState(121);
			match(LBRACE);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BAR_KW) | (1L << CLEF_KW) | (1L << FERMATA_KW) | (1L << KEY_KW) | (1L << MARK_KW) | (1L << RELATIVE_KW) | (1L << TEMPO_KW) | (1L << TIME_KW) | (1L << NOTE))) != 0)) {
				{
				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BAR_KW:
				case CLEF_KW:
				case FERMATA_KW:
				case KEY_KW:
				case MARK_KW:
				case RELATIVE_KW:
				case TEMPO_KW:
				case TIME_KW:
				case NOTE:
					{
					setState(122);
					note_block();
					}
					break;
				case T__0:
					{
					setState(123);
					polyphony_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_blockContext extends ParserRuleContext {
		public List<Relative_blockContext> relative_block() {
			return getRuleContexts(Relative_blockContext.class);
		}
		public Relative_blockContext relative_block(int i) {
			return getRuleContext(Relative_blockContext.class,i);
		}
		public List<Note_cmdContext> note_cmd() {
			return getRuleContexts(Note_cmdContext.class);
		}
		public Note_cmdContext note_cmd(int i) {
			return getRuleContext(Note_cmdContext.class,i);
		}
		public List<TerminalNode> NOTE() { return getTokens(LilypondParser.NOTE); }
		public TerminalNode NOTE(int i) {
			return getToken(LilypondParser.NOTE, i);
		}
		public Note_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterNote_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitNote_block(this);
		}
	}

	public final Note_blockContext note_block() throws RecognitionException {
		Note_blockContext _localctx = new Note_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_note_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(134);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case RELATIVE_KW:
						{
						setState(131);
						relative_block();
						}
						break;
					case BAR_KW:
					case CLEF_KW:
					case FERMATA_KW:
					case KEY_KW:
					case MARK_KW:
					case TEMPO_KW:
					case TIME_KW:
						{
						setState(132);
						note_cmd();
						}
						break;
					case NOTE:
						{
						setState(133);
						match(NOTE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(136); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relative_blockContext extends ParserRuleContext {
		public TerminalNode RELATIVE_KW() { return getToken(LilypondParser.RELATIVE_KW, 0); }
		public TerminalNode NOTE() { return getToken(LilypondParser.NOTE, 0); }
		public TerminalNode LBRACE() { return getToken(LilypondParser.LBRACE, 0); }
		public Note_blockContext note_block() {
			return getRuleContext(Note_blockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LilypondParser.RBRACE, 0); }
		public Relative_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relative_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterRelative_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitRelative_block(this);
		}
	}

	public final Relative_blockContext relative_block() throws RecognitionException {
		Relative_blockContext _localctx = new Relative_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relative_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(RELATIVE_KW);
			setState(139);
			match(NOTE);
			setState(140);
			match(LBRACE);
			setState(141);
			note_block();
			setState(142);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Polyphony_blockContext extends ParserRuleContext {
		public List<TerminalNode> LBRACE() { return getTokens(LilypondParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(LilypondParser.LBRACE, i);
		}
		public List<Note_blockContext> note_block() {
			return getRuleContexts(Note_blockContext.class);
		}
		public Note_blockContext note_block(int i) {
			return getRuleContext(Note_blockContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(LilypondParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(LilypondParser.RBRACE, i);
		}
		public Polyphony_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polyphony_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterPolyphony_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitPolyphony_block(this);
		}
	}

	public final Polyphony_blockContext polyphony_block() throws RecognitionException {
		Polyphony_blockContext _localctx = new Polyphony_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_polyphony_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__0);
			setState(145);
			match(LBRACE);
			setState(146);
			note_block();
			setState(147);
			match(RBRACE);
			setState(148);
			match(T__2);
			setState(149);
			match(LBRACE);
			setState(150);
			note_block();
			setState(151);
			match(RBRACE);
			setState(152);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scheme_cmdContext extends ParserRuleContext {
		public TerminalNode SCHEME_GP() { return getToken(LilypondParser.SCHEME_GP, 0); }
		public TerminalNode SCHEME_ATOM() { return getToken(LilypondParser.SCHEME_ATOM, 0); }
		public Scheme_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterScheme_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitScheme_cmd(this);
		}
	}

	public final Scheme_cmdContext scheme_cmd() throws RecognitionException {
		Scheme_cmdContext _localctx = new Scheme_cmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scheme_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==SCHEME_GP || _la==SCHEME_ATOM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_cmdContext extends ParserRuleContext {
		public Bar_cmdContext bar_cmd() {
			return getRuleContext(Bar_cmdContext.class,0);
		}
		public Clef_cmdContext clef_cmd() {
			return getRuleContext(Clef_cmdContext.class,0);
		}
		public Fermata_cmdContext fermata_cmd() {
			return getRuleContext(Fermata_cmdContext.class,0);
		}
		public Key_cmdContext key_cmd() {
			return getRuleContext(Key_cmdContext.class,0);
		}
		public Mark_cmdContext mark_cmd() {
			return getRuleContext(Mark_cmdContext.class,0);
		}
		public Tempo_cmdContext tempo_cmd() {
			return getRuleContext(Tempo_cmdContext.class,0);
		}
		public Time_cmdContext time_cmd() {
			return getRuleContext(Time_cmdContext.class,0);
		}
		public Note_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterNote_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitNote_cmd(this);
		}
	}

	public final Note_cmdContext note_cmd() throws RecognitionException {
		Note_cmdContext _localctx = new Note_cmdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_note_cmd);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BAR_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				bar_cmd();
				}
				break;
			case CLEF_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				clef_cmd();
				}
				break;
			case FERMATA_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				fermata_cmd();
				}
				break;
			case KEY_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				key_cmd();
				}
				break;
			case MARK_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				mark_cmd();
				}
				break;
			case TEMPO_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				tempo_cmd();
				}
				break;
			case TIME_KW:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				time_cmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bar_cmdContext extends ParserRuleContext {
		public TerminalNode BAR_KW() { return getToken(LilypondParser.BAR_KW, 0); }
		public TerminalNode BARLINE() { return getToken(LilypondParser.BARLINE, 0); }
		public Bar_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bar_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterBar_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitBar_cmd(this);
		}
	}

	public final Bar_cmdContext bar_cmd() throws RecognitionException {
		Bar_cmdContext _localctx = new Bar_cmdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bar_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(BAR_KW);
			setState(166);
			match(BARLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Clef_cmdContext extends ParserRuleContext {
		public TerminalNode CLEF_KW() { return getToken(LilypondParser.CLEF_KW, 0); }
		public TerminalNode ID() { return getToken(LilypondParser.ID, 0); }
		public Clef_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clef_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterClef_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitClef_cmd(this);
		}
	}

	public final Clef_cmdContext clef_cmd() throws RecognitionException {
		Clef_cmdContext _localctx = new Clef_cmdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_clef_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(CLEF_KW);
			setState(169);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fermata_cmdContext extends ParserRuleContext {
		public TerminalNode FERMATA_KW() { return getToken(LilypondParser.FERMATA_KW, 0); }
		public Fermata_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fermata_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterFermata_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitFermata_cmd(this);
		}
	}

	public final Fermata_cmdContext fermata_cmd() throws RecognitionException {
		Fermata_cmdContext _localctx = new Fermata_cmdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fermata_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(FERMATA_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_cmdContext extends ParserRuleContext {
		public TerminalNode KEY_KW() { return getToken(LilypondParser.KEY_KW, 0); }
		public TerminalNode NOTE() { return getToken(LilypondParser.NOTE, 0); }
		public TerminalNode MODE_KW() { return getToken(LilypondParser.MODE_KW, 0); }
		public Key_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterKey_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitKey_cmd(this);
		}
	}

	public final Key_cmdContext key_cmd() throws RecognitionException {
		Key_cmdContext _localctx = new Key_cmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_key_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(KEY_KW);
			setState(174);
			match(NOTE);
			setState(175);
			match(MODE_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mark_cmdContext extends ParserRuleContext {
		public TerminalNode MARK_KW() { return getToken(LilypondParser.MARK_KW, 0); }
		public Scheme_cmdContext scheme_cmd() {
			return getRuleContext(Scheme_cmdContext.class,0);
		}
		public TerminalNode DEFAULT_KW() { return getToken(LilypondParser.DEFAULT_KW, 0); }
		public Mark_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mark_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterMark_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitMark_cmd(this);
		}
	}

	public final Mark_cmdContext mark_cmd() throws RecognitionException {
		Mark_cmdContext _localctx = new Mark_cmdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mark_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(MARK_KW);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCHEME_GP:
			case SCHEME_ATOM:
				{
				setState(178);
				scheme_cmd();
				}
				break;
			case DEFAULT_KW:
				{
				setState(179);
				match(DEFAULT_KW);
				}
				break;
			case T__0:
			case VOICE_CTX:
			case BAR_KW:
			case CLEF_KW:
			case FERMATA_KW:
			case KEY_KW:
			case MARK_KW:
			case RELATIVE_KW:
			case TEMPO_KW:
			case TIME_KW:
			case NOTE:
			case RBRACE:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tempo_cmdContext extends ParserRuleContext {
		public TerminalNode TEMPO_KW() { return getToken(LilypondParser.TEMPO_KW, 0); }
		public TerminalNode STRING() { return getToken(LilypondParser.STRING, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(LilypondParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(LilypondParser.INTEGER, i);
		}
		public Tempo_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterTempo_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitTempo_cmd(this);
		}
	}

	public final Tempo_cmdContext tempo_cmd() throws RecognitionException {
		Tempo_cmdContext _localctx = new Tempo_cmdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tempo_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(TEMPO_KW);
			setState(183);
			match(STRING);
			setState(184);
			match(INTEGER);
			setState(185);
			match(T__3);
			setState(186);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_cmdContext extends ParserRuleContext {
		public TerminalNode TIME_KW() { return getToken(LilypondParser.TIME_KW, 0); }
		public TerminalNode TIME_SIG() { return getToken(LilypondParser.TIME_SIG, 0); }
		public Time_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterTime_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitTime_cmd(this);
		}
	}

	public final Time_cmdContext time_cmd() throws RecognitionException {
		Time_cmdContext _localctx = new Time_cmdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_time_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(TIME_KW);
			setState(189);
			match(TIME_SIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Version_cmdContext extends ParserRuleContext {
		public TerminalNode VERSION_KW() { return getToken(LilypondParser.VERSION_KW, 0); }
		public TerminalNode VERSION_STR() { return getToken(LilypondParser.VERSION_STR, 0); }
		public Version_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterVersion_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitVersion_cmd(this);
		}
	}

	public final Version_cmdContext version_cmd() throws RecognitionException {
		Version_cmdContext _localctx = new Version_cmdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_version_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(VERSION_KW);
			setState(192);
			match(VERSION_STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LilypondParser.ID, 0); }
		public TerminalNode STRING() { return getToken(LilypondParser.STRING, 0); }
		public Scheme_cmdContext scheme_cmd() {
			return getRuleContext(Scheme_cmdContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LilypondListener ) ((LilypondListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(195);
			match(T__3);
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(196);
				match(STRING);
				}
				break;
			case SCHEME_GP:
			case SCHEME_ATOM:
				{
				setState(197);
				scheme_cmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\6\2\66\n\2\r\2\16\2\67\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4"+
		"B\n\4\f\4\16\4E\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\7\3\7\5\7`\n\7\3"+
		"\7\3\7\5\7d\n\7\3\7\3\7\3\7\6\7i\n\7\r\7\16\7j\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\7\tt\n\t\f\t\16\tw\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\177\n\n\f\n\16"+
		"\n\u0082\13\n\3\n\3\n\3\13\3\13\3\13\6\13\u0089\n\13\r\13\16\13\u008a"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a6\n\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00b7"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\5\30\u00c9\n\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\2\3\3\2\20\21\2\u00d0\2\65\3\2\2\2\49\3\2\2\2\6"+
		">\3\2\2\2\bH\3\2\2\2\nS\3\2\2\2\f]\3\2\2\2\16n\3\2\2\2\20p\3\2\2\2\22"+
		"z\3\2\2\2\24\u0088\3\2\2\2\26\u008c\3\2\2\2\30\u0092\3\2\2\2\32\u009c"+
		"\3\2\2\2\34\u00a5\3\2\2\2\36\u00a7\3\2\2\2 \u00aa\3\2\2\2\"\u00ad\3\2"+
		"\2\2$\u00af\3\2\2\2&\u00b3\3\2\2\2(\u00b8\3\2\2\2*\u00be\3\2\2\2,\u00c1"+
		"\3\2\2\2.\u00c4\3\2\2\2\60\66\5\6\4\2\61\66\5\4\3\2\62\66\5\b\5\2\63\66"+
		"\5,\27\2\64\66\5\32\16\2\65\60\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2\2\65"+
		"\63\3\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3"+
		"\2\2\29:\7\n\2\2:;\7(\2\2;<\5\b\5\2<=\7)\2\2=\5\3\2\2\2>?\7\13\2\2?C\7"+
		"(\2\2@B\5.\30\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3"+
		"\2\2\2FG\7)\2\2G\7\3\2\2\2HI\7\r\2\2IN\7(\2\2JM\5\f\7\2KM\5\n\6\2LJ\3"+
		"\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7"+
		")\2\2R\t\3\2\2\2ST\7\b\2\2TX\7\3\2\2UW\5\f\7\2VU\3\2\2\2WZ\3\2\2\2XV\3"+
		"\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\4\2\2\\\13\3\2\2\2]_\7\7\2\2"+
		"^`\5\20\t\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7(\2\2bd\5\16\b\2cb\3\2\2"+
		"\2cd\3\2\2\2dh\3\2\2\2ei\5\24\13\2fi\5\30\r\2gi\5\22\n\2he\3\2\2\2hf\3"+
		"\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7)\2\2m\r\3"+
		"\2\2\2no\5*\26\2o\17\3\2\2\2pq\7\16\2\2qu\7(\2\2rt\5.\30\2sr\3\2\2\2t"+
		"w\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7)\2\2y\21\3\2\2\2"+
		"z{\7\t\2\2{\u0080\7(\2\2|\177\5\24\13\2}\177\5\30\r\2~|\3\2\2\2~}\3\2"+
		"\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7)\2\2\u0084\23\3\2\2\2\u0085"+
		"\u0089\5\26\f\2\u0086\u0089\5\34\17\2\u0087\u0089\7\37\2\2\u0088\u0085"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\25\3\2\2\2\u008c\u008d\7\33\2"+
		"\2\u008d\u008e\7\37\2\2\u008e\u008f\7(\2\2\u008f\u0090\5\24\13\2\u0090"+
		"\u0091\7)\2\2\u0091\27\3\2\2\2\u0092\u0093\7\3\2\2\u0093\u0094\7(\2\2"+
		"\u0094\u0095\5\24\13\2\u0095\u0096\7)\2\2\u0096\u0097\7\5\2\2\u0097\u0098"+
		"\7(\2\2\u0098\u0099\5\24\13\2\u0099\u009a\7)\2\2\u009a\u009b\7\4\2\2\u009b"+
		"\31\3\2\2\2\u009c\u009d\t\2\2\2\u009d\33\3\2\2\2\u009e\u00a6\5\36\20\2"+
		"\u009f\u00a6\5 \21\2\u00a0\u00a6\5\"\22\2\u00a1\u00a6\5$\23\2\u00a2\u00a6"+
		"\5&\24\2\u00a3\u00a6\5(\25\2\u00a4\u00a6\5*\26\2\u00a5\u009e\3\2\2\2\u00a5"+
		"\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\35\3\2\2\2\u00a7\u00a8"+
		"\7\22\2\2\u00a8\u00a9\7#\2\2\u00a9\37\3\2\2\2\u00aa\u00ab\7\23\2\2\u00ab"+
		"\u00ac\7$\2\2\u00ac!\3\2\2\2\u00ad\u00ae\7\25\2\2\u00ae#\3\2\2\2\u00af"+
		"\u00b0\7\26\2\2\u00b0\u00b1\7\37\2\2\u00b1\u00b2\7\30\2\2\u00b2%\3\2\2"+
		"\2\u00b3\u00b6\7\27\2\2\u00b4\u00b7\5\32\16\2\u00b5\u00b7\7\24\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\'\3\2\2\2"+
		"\u00b8\u00b9\7\34\2\2\u00b9\u00ba\7%\2\2\u00ba\u00bb\7+\2\2\u00bb\u00bc"+
		"\7\6\2\2\u00bc\u00bd\7+\2\2\u00bd)\3\2\2\2\u00be\u00bf\7\35\2\2\u00bf"+
		"\u00c0\7 \2\2\u00c0+\3\2\2\2\u00c1\u00c2\7\17\2\2\u00c2\u00c3\7&\2\2\u00c3"+
		"-\3\2\2\2\u00c4\u00c5\7$\2\2\u00c5\u00c8\7\6\2\2\u00c6\u00c9\7%\2\2\u00c7"+
		"\u00c9\5\32\16\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9/\3\2\2"+
		"\2\24\65\67CLNX_chju~\u0080\u0088\u008a\u00a5\u00b6\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}