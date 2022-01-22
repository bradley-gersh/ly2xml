// Generated from /Users/Brad/Code/Scores/ly2musicxml/LilypondParser.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STAFF_CTX=1, STAFFGROUP_CTX=2, VOICE_CTX=3, HEADER_KW=4, LAYOUT_KW=5, 
		SCORE_KW=6, WITH_KW=7, VERSION_KW=8, SCHEME_GP=9, SCHEME_ATOM=10, BAR_KW=11, 
		CLEF_KW=12, DEFAULT_KW=13, FERMATA_KW=14, KEY_KW=15, MARK_KW=16, MODE_KW=17, 
		MODE_MAJ=18, MODE_MIN=19, RELATIVE_KW=20, TEMPO_KW=21, TIME_KW=22, KW=23, 
		NOTE=24, TIME_SIG=25, OCTAVE=26, BARLINE=27, ID=28, STRING=29, VERSION_STR=30, 
		HASH=31, LBRACE=32, RBRACE=33, LANGLE=34, RANGLE=35, EQUALS=36, DOT=37, 
		SLASH=38, INTEGER=39, COMMENT_MULTILINE=40, COMMENT_INLINE=41, WS=42, 
		ALL=43;
	public static final int
		RULE_score_file = 0, RULE_header_block = 1, RULE_score_block = 2, RULE_staffgroup_block = 3, 
		RULE_staff_block = 4, RULE_prefix_block = 5, RULE_with_block = 6, RULE_voice_block = 7, 
		RULE_note_block = 8, RULE_relative_block = 9, RULE_polyphony_block = 10, 
		RULE_chord = 11, RULE_note_cmd = 12, RULE_bar_cmd = 13, RULE_clef_cmd = 14, 
		RULE_fermata_cmd = 15, RULE_key_cmd = 16, RULE_mark_cmd = 17, RULE_scheme_cmd = 18, 
		RULE_tempo_cmd = 19, RULE_time_cmd = 20, RULE_version_cmd = 21, RULE_assignment = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"score_file", "header_block", "score_block", "staffgroup_block", "staff_block", 
			"prefix_block", "with_block", "voice_block", "note_block", "relative_block", 
			"polyphony_block", "chord", "note_cmd", "bar_cmd", "clef_cmd", "fermata_cmd", 
			"key_cmd", "mark_cmd", "scheme_cmd", "tempo_cmd", "time_cmd", "version_cmd", 
			"assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\new Staff'", "'\\new StaffGroup'", "'\\new Voice'", "'\\header'", 
			"'\\layout'", "'\\score'", "'\\with'", "'\\version'", null, null, "'\\bar'", 
			"'\\clef'", "'\\default'", "'\\fermata'", "'\\key'", "'\\mark'", null, 
			"'\\major'", "'\\minor'", "'\\relative'", "'\\tempo'", "'\\time'", null, 
			null, null, null, null, null, null, null, "'#'", "'{'", "'}'", "'<'", 
			"'>'", "'='", "'.'", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STAFF_CTX", "STAFFGROUP_CTX", "VOICE_CTX", "HEADER_KW", "LAYOUT_KW", 
			"SCORE_KW", "WITH_KW", "VERSION_KW", "SCHEME_GP", "SCHEME_ATOM", "BAR_KW", 
			"CLEF_KW", "DEFAULT_KW", "FERMATA_KW", "KEY_KW", "MARK_KW", "MODE_KW", 
			"MODE_MAJ", "MODE_MIN", "RELATIVE_KW", "TEMPO_KW", "TIME_KW", "KW", "NOTE", 
			"TIME_SIG", "OCTAVE", "BARLINE", "ID", "STRING", "VERSION_STR", "HASH", 
			"LBRACE", "RBRACE", "LANGLE", "RANGLE", "EQUALS", "DOT", "SLASH", "INTEGER", 
			"COMMENT_MULTILINE", "COMMENT_INLINE", "WS", "ALL"
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
	public String getGrammarFileName() { return "LilypondParser.g4"; }

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
	}

	public final Score_fileContext score_file() throws RecognitionException {
		Score_fileContext _localctx = new Score_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_score_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HEADER_KW:
					{
					setState(46);
					header_block();
					}
					break;
				case SCORE_KW:
					{
					setState(47);
					score_block();
					}
					break;
				case VERSION_KW:
					{
					setState(48);
					version_cmd();
					}
					break;
				case SCHEME_GP:
				case SCHEME_ATOM:
					{
					setState(49);
					scheme_cmd();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEADER_KW) | (1L << SCORE_KW) | (1L << VERSION_KW) | (1L << SCHEME_GP) | (1L << SCHEME_ATOM))) != 0) );
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
	}

	public final Header_blockContext header_block() throws RecognitionException {
		Header_blockContext _localctx = new Header_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(HEADER_KW);
			setState(55);
			match(LBRACE);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(56);
				assignment();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
	}

	public final Score_blockContext score_block() throws RecognitionException {
		Score_blockContext _localctx = new Score_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_score_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(SCORE_KW);
			setState(65);
			match(LBRACE);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAFF_CTX || _la==STAFFGROUP_CTX) {
				{
				setState(68);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAFF_CTX:
					{
					setState(66);
					staff_block();
					}
					break;
				case STAFFGROUP_CTX:
					{
					setState(67);
					staffgroup_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
		public List<TerminalNode> LANGLE() { return getTokens(LilypondParser.LANGLE); }
		public TerminalNode LANGLE(int i) {
			return getToken(LilypondParser.LANGLE, i);
		}
		public List<TerminalNode> RANGLE() { return getTokens(LilypondParser.RANGLE); }
		public TerminalNode RANGLE(int i) {
			return getToken(LilypondParser.RANGLE, i);
		}
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
	}

	public final Staffgroup_blockContext staffgroup_block() throws RecognitionException {
		Staffgroup_blockContext _localctx = new Staffgroup_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_staffgroup_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(STAFFGROUP_CTX);
			setState(76);
			match(LANGLE);
			setState(77);
			match(LANGLE);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAFF_CTX) {
				{
				{
				setState(78);
				staff_block();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(RANGLE);
			setState(85);
			match(RANGLE);
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
	}

	public final Staff_blockContext staff_block() throws RecognitionException {
		Staff_blockContext _localctx = new Staff_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_staff_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(STAFF_CTX);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_KW) {
				{
				setState(88);
				with_block();
				}
			}

			setState(91);
			match(LBRACE);
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(92);
				prefix_block();
				}
				break;
			}
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(95);
					note_block();
					}
					break;
				case 2:
					{
					setState(96);
					polyphony_block();
					}
					break;
				case 3:
					{
					setState(97);
					voice_block();
					}
					break;
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOICE_CTX) | (1L << BAR_KW) | (1L << CLEF_KW) | (1L << FERMATA_KW) | (1L << KEY_KW) | (1L << MARK_KW) | (1L << RELATIVE_KW) | (1L << TEMPO_KW) | (1L << TIME_KW) | (1L << NOTE) | (1L << LANGLE))) != 0) );
			setState(102);
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
		public Key_cmdContext key_cmd() {
			return getRuleContext(Key_cmdContext.class,0);
		}
		public Time_cmdContext time_cmd() {
			return getRuleContext(Time_cmdContext.class,0);
		}
		public Prefix_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_block; }
	}

	public final Prefix_blockContext prefix_block() throws RecognitionException {
		Prefix_blockContext _localctx = new Prefix_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_prefix_block);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIME_KW) {
					{
					setState(104);
					time_cmd();
					}
				}

				setState(107);
				key_cmd();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				time_cmd();
				}
				break;
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
	}

	public final With_blockContext with_block() throws RecognitionException {
		With_blockContext _localctx = new With_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_with_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(WITH_KW);
			setState(112);
			match(LBRACE);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(113);
				assignment();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
	}

	public final Voice_blockContext voice_block() throws RecognitionException {
		Voice_blockContext _localctx = new Voice_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_voice_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(VOICE_CTX);
			setState(122);
			match(LBRACE);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAR_KW) | (1L << CLEF_KW) | (1L << FERMATA_KW) | (1L << KEY_KW) | (1L << MARK_KW) | (1L << RELATIVE_KW) | (1L << TEMPO_KW) | (1L << TIME_KW) | (1L << NOTE) | (1L << LANGLE))) != 0)) {
				{
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(123);
					note_block();
					}
					break;
				case 2:
					{
					setState(124);
					polyphony_block();
					}
					break;
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
		public List<Polyphony_blockContext> polyphony_block() {
			return getRuleContexts(Polyphony_blockContext.class);
		}
		public Polyphony_blockContext polyphony_block(int i) {
			return getRuleContext(Polyphony_blockContext.class,i);
		}
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public List<TerminalNode> NOTE() { return getTokens(LilypondParser.NOTE); }
		public TerminalNode NOTE(int i) {
			return getToken(LilypondParser.NOTE, i);
		}
		public Note_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_block; }
	}

	public final Note_blockContext note_block() throws RecognitionException {
		Note_blockContext _localctx = new Note_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_note_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(132);
						relative_block();
						}
						break;
					case 2:
						{
						setState(133);
						note_cmd();
						}
						break;
					case 3:
						{
						setState(134);
						polyphony_block();
						}
						break;
					case 4:
						{
						setState(135);
						chord();
						}
						break;
					case 5:
						{
						setState(136);
						match(NOTE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	}

	public final Relative_blockContext relative_block() throws RecognitionException {
		Relative_blockContext _localctx = new Relative_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relative_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(RELATIVE_KW);
			setState(142);
			match(NOTE);
			setState(143);
			match(LBRACE);
			setState(144);
			note_block();
			setState(145);
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
		public List<TerminalNode> LANGLE() { return getTokens(LilypondParser.LANGLE); }
		public TerminalNode LANGLE(int i) {
			return getToken(LilypondParser.LANGLE, i);
		}
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
		public List<TerminalNode> SLASH() { return getTokens(LilypondParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(LilypondParser.SLASH, i);
		}
		public List<TerminalNode> RANGLE() { return getTokens(LilypondParser.RANGLE); }
		public TerminalNode RANGLE(int i) {
			return getToken(LilypondParser.RANGLE, i);
		}
		public Polyphony_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polyphony_block; }
	}

	public final Polyphony_blockContext polyphony_block() throws RecognitionException {
		Polyphony_blockContext _localctx = new Polyphony_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_polyphony_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(LANGLE);
			setState(148);
			match(LANGLE);
			setState(149);
			match(LBRACE);
			setState(150);
			note_block();
			setState(151);
			match(RBRACE);
			setState(152);
			match(SLASH);
			setState(153);
			match(SLASH);
			setState(154);
			match(LBRACE);
			setState(155);
			note_block();
			setState(156);
			match(RBRACE);
			setState(157);
			match(RANGLE);
			setState(158);
			match(RANGLE);
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

	public static class ChordContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(LilypondParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(LilypondParser.RANGLE, 0); }
		public List<TerminalNode> NOTE() { return getTokens(LilypondParser.NOTE); }
		public TerminalNode NOTE(int i) {
			return getToken(LilypondParser.NOTE, i);
		}
		public TerminalNode INTEGER() { return getToken(LilypondParser.INTEGER, 0); }
		public TerminalNode DOT() { return getToken(LilypondParser.DOT, 0); }
		public ChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord; }
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_chord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LANGLE);
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				match(NOTE);
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOTE );
			setState(166);
			match(RANGLE);
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(167);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(168);
				match(INTEGER);
				setState(169);
				match(DOT);
				}
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
	}

	public final Note_cmdContext note_cmd() throws RecognitionException {
		Note_cmdContext _localctx = new Note_cmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_note_cmd);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BAR_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				bar_cmd();
				}
				break;
			case CLEF_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				clef_cmd();
				}
				break;
			case FERMATA_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				fermata_cmd();
				}
				break;
			case KEY_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				key_cmd();
				}
				break;
			case MARK_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				mark_cmd();
				}
				break;
			case TEMPO_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				tempo_cmd();
				}
				break;
			case TIME_KW:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
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
	}

	public final Bar_cmdContext bar_cmd() throws RecognitionException {
		Bar_cmdContext _localctx = new Bar_cmdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bar_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(BAR_KW);
			setState(182);
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
	}

	public final Clef_cmdContext clef_cmd() throws RecognitionException {
		Clef_cmdContext _localctx = new Clef_cmdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_clef_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(CLEF_KW);
			setState(185);
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
	}

	public final Fermata_cmdContext fermata_cmd() throws RecognitionException {
		Fermata_cmdContext _localctx = new Fermata_cmdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fermata_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
	}

	public final Key_cmdContext key_cmd() throws RecognitionException {
		Key_cmdContext _localctx = new Key_cmdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_key_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(KEY_KW);
			setState(190);
			match(NOTE);
			setState(191);
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
	}

	public final Mark_cmdContext mark_cmd() throws RecognitionException {
		Mark_cmdContext _localctx = new Mark_cmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mark_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(MARK_KW);
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCHEME_GP:
			case SCHEME_ATOM:
				{
				setState(194);
				scheme_cmd();
				}
				break;
			case DEFAULT_KW:
				{
				setState(195);
				match(DEFAULT_KW);
				}
				break;
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
			case LANGLE:
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

	public static class Scheme_cmdContext extends ParserRuleContext {
		public TerminalNode SCHEME_GP() { return getToken(LilypondParser.SCHEME_GP, 0); }
		public TerminalNode SCHEME_ATOM() { return getToken(LilypondParser.SCHEME_ATOM, 0); }
		public Scheme_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme_cmd; }
	}

	public final Scheme_cmdContext scheme_cmd() throws RecognitionException {
		Scheme_cmdContext _localctx = new Scheme_cmdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scheme_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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

	public static class Tempo_cmdContext extends ParserRuleContext {
		public TerminalNode TEMPO_KW() { return getToken(LilypondParser.TEMPO_KW, 0); }
		public TerminalNode STRING() { return getToken(LilypondParser.STRING, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(LilypondParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(LilypondParser.INTEGER, i);
		}
		public TerminalNode EQUALS() { return getToken(LilypondParser.EQUALS, 0); }
		public Tempo_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo_cmd; }
	}

	public final Tempo_cmdContext tempo_cmd() throws RecognitionException {
		Tempo_cmdContext _localctx = new Tempo_cmdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tempo_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(TEMPO_KW);
			setState(201);
			match(STRING);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(202);
				match(INTEGER);
				setState(203);
				match(EQUALS);
				setState(204);
				match(INTEGER);
				}
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

	public static class Time_cmdContext extends ParserRuleContext {
		public TerminalNode TIME_KW() { return getToken(LilypondParser.TIME_KW, 0); }
		public TerminalNode TIME_SIG() { return getToken(LilypondParser.TIME_SIG, 0); }
		public Time_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_cmd; }
	}

	public final Time_cmdContext time_cmd() throws RecognitionException {
		Time_cmdContext _localctx = new Time_cmdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_time_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(TIME_KW);
			setState(208);
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
	}

	public final Version_cmdContext version_cmd() throws RecognitionException {
		Version_cmdContext _localctx = new Version_cmdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_version_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(VERSION_KW);
			setState(211);
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
		public TerminalNode EQUALS() { return getToken(LilypondParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(LilypondParser.STRING, 0); }
		public Scheme_cmdContext scheme_cmd() {
			return getRuleContext(Scheme_cmdContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ID);
			setState(214);
			match(EQUALS);
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(215);
				match(STRING);
				}
				break;
			case SCHEME_GP:
			case SCHEME_ATOM:
				{
				setState(216);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\6\2\65\n\2\r\2\16\2\66\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7"+
		"\5R\n\5\f\5\16\5U\13\5\3\5\3\5\3\5\3\6\3\6\5\6\\\n\6\3\6\3\6\5\6`\n\6"+
		"\3\6\3\6\3\6\6\6e\n\6\r\6\16\6f\3\6\3\6\3\7\5\7l\n\7\3\7\3\7\5\7p\n\7"+
		"\3\b\3\b\3\b\7\bu\n\b\f\b\16\bx\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u0080"+
		"\n\t\f\t\16\t\u0083\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\6\n\u008c\n\n\r\n"+
		"\16\n\u008d\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\6\r\u00a5\n\r\r\r\16\r\u00a6\3\r\3\r"+
		"\3\r\3\r\5\r\u00ad\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b6\n"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\5\23\u00c7\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00d0"+
		"\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u00dc\n\30"+
		"\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\13"+
		"\f\2\u00ea\2\64\3\2\2\2\48\3\2\2\2\6B\3\2\2\2\bM\3\2\2\2\nY\3\2\2\2\f"+
		"o\3\2\2\2\16q\3\2\2\2\20{\3\2\2\2\22\u008b\3\2\2\2\24\u008f\3\2\2\2\26"+
		"\u0095\3\2\2\2\30\u00a2\3\2\2\2\32\u00b5\3\2\2\2\34\u00b7\3\2\2\2\36\u00ba"+
		"\3\2\2\2 \u00bd\3\2\2\2\"\u00bf\3\2\2\2$\u00c3\3\2\2\2&\u00c8\3\2\2\2"+
		"(\u00ca\3\2\2\2*\u00d1\3\2\2\2,\u00d4\3\2\2\2.\u00d7\3\2\2\2\60\65\5\4"+
		"\3\2\61\65\5\6\4\2\62\65\5,\27\2\63\65\5&\24\2\64\60\3\2\2\2\64\61\3\2"+
		"\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2"+
		"\2\2\67\3\3\2\2\289\7\6\2\29=\7\"\2\2:<\5.\30\2;:\3\2\2\2<?\3\2\2\2=;"+
		"\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7#\2\2A\5\3\2\2\2BC\7\b\2\2C"+
		"H\7\"\2\2DG\5\n\6\2EG\5\b\5\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2"+
		"HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7#\2\2L\7\3\2\2\2MN\7\4\2\2NO\7$\2\2"+
		"OS\7$\2\2PR\5\n\6\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2"+
		"US\3\2\2\2VW\7%\2\2WX\7%\2\2X\t\3\2\2\2Y[\7\3\2\2Z\\\5\16\b\2[Z\3\2\2"+
		"\2[\\\3\2\2\2\\]\3\2\2\2]_\7\"\2\2^`\5\f\7\2_^\3\2\2\2_`\3\2\2\2`d\3\2"+
		"\2\2ae\5\22\n\2be\5\26\f\2ce\5\20\t\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2ef"+
		"\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7#\2\2i\13\3\2\2\2jl\5*\26\2"+
		"kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mp\5\"\22\2np\5*\26\2ok\3\2\2\2on\3\2\2"+
		"\2p\r\3\2\2\2qr\7\t\2\2rv\7\"\2\2su\5.\30\2ts\3\2\2\2ux\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7#\2\2z\17\3\2\2\2{|\7\5\2\2|\u0081"+
		"\7\"\2\2}\u0080\5\22\n\2~\u0080\5\26\f\2\177}\3\2\2\2\177~\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\u0085\7#\2\2\u0085\21\3\2\2\2\u0086\u008c"+
		"\5\24\13\2\u0087\u008c\5\32\16\2\u0088\u008c\5\26\f\2\u0089\u008c\5\30"+
		"\r\2\u008a\u008c\7\32\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b"+
		"\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\23\3\2\2\2\u008f\u0090"+
		"\7\26\2\2\u0090\u0091\7\32\2\2\u0091\u0092\7\"\2\2\u0092\u0093\5\22\n"+
		"\2\u0093\u0094\7#\2\2\u0094\25\3\2\2\2\u0095\u0096\7$\2\2\u0096\u0097"+
		"\7$\2\2\u0097\u0098\7\"\2\2\u0098\u0099\5\22\n\2\u0099\u009a\7#\2\2\u009a"+
		"\u009b\7(\2\2\u009b\u009c\7(\2\2\u009c\u009d\7\"\2\2\u009d\u009e\5\22"+
		"\n\2\u009e\u009f\7#\2\2\u009f\u00a0\7%\2\2\u00a0\u00a1\7%\2\2\u00a1\27"+
		"\3\2\2\2\u00a2\u00a4\7$\2\2\u00a3\u00a5\7\32\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00ac\7%\2\2\u00a9\u00ad\7)\2\2\u00aa\u00ab\7)\2\2\u00ab\u00ad"+
		"\7\'\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\31\3\2\2\2\u00ae\u00b6\5\34\17\2\u00af\u00b6\5\36\20\2\u00b0\u00b6\5"+
		" \21\2\u00b1\u00b6\5\"\22\2\u00b2\u00b6\5$\23\2\u00b3\u00b6\5(\25\2\u00b4"+
		"\u00b6\5*\26\2\u00b5\u00ae\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2"+
		"\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\7\r\2\2\u00b8\u00b9\7\35\2"+
		"\2\u00b9\35\3\2\2\2\u00ba\u00bb\7\16\2\2\u00bb\u00bc\7\36\2\2\u00bc\37"+
		"\3\2\2\2\u00bd\u00be\7\20\2\2\u00be!\3\2\2\2\u00bf\u00c0\7\21\2\2\u00c0"+
		"\u00c1\7\32\2\2\u00c1\u00c2\7\23\2\2\u00c2#\3\2\2\2\u00c3\u00c6\7\22\2"+
		"\2\u00c4\u00c7\5&\24\2\u00c5\u00c7\7\17\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7%\3\2\2\2\u00c8\u00c9\t\2\2\2"+
		"\u00c9\'\3\2\2\2\u00ca\u00cb\7\27\2\2\u00cb\u00cf\7\37\2\2\u00cc\u00cd"+
		"\7)\2\2\u00cd\u00ce\7&\2\2\u00ce\u00d0\7)\2\2\u00cf\u00cc\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0)\3\2\2\2\u00d1\u00d2\7\30\2\2\u00d2\u00d3\7\33\2"+
		"\2\u00d3+\3\2\2\2\u00d4\u00d5\7\n\2\2\u00d5\u00d6\7 \2\2\u00d6-\3\2\2"+
		"\2\u00d7\u00d8\7\36\2\2\u00d8\u00db\7&\2\2\u00d9\u00dc\7\37\2\2\u00da"+
		"\u00dc\5&\24\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc/\3\2\2\2"+
		"\31\64\66=FHS[_dfkov\177\u0081\u008b\u008d\u00a6\u00ac\u00b5\u00c6\u00cf"+
		"\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}