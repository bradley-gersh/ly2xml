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
		STAFFGROUP_CTX=1, STAFF_CTX=2, VOICE_CTX=3, HEADER_KW=4, LAYOUT_KW=5, 
		SCORE_KW=6, WITH_KW=7, VERSION_KW=8, SCHEME_GP=9, SCHEME_ATOM=10, ID=11, 
		STRING=12, VERSION_STR=13, HASH=14, LBRACE=15, RBRACE=16, LANGLE=17, RANGLE=18, 
		EQUALS=19, DOT=20, BSLASH=21, FSLASH=22, INTEGER=23, COMMENT_MULTILINE=24, 
		COMMENT_INLINE=25, WS=26, END_NOTEBLOCK=27, VOICE_CTX_N=28, REL_BLOCK_N=29, 
		START_POLYPHONY_N=30, NOTE=31, OCTAVE=32, TIME_SIG=33, BARLINE=34, BAR_KW=35, 
		CLEF_KW=36, DEFAULT_KW=37, FERMATA_KW=38, KEY_KW=39, MARK_KW=40, MODE_KW=41, 
		MODE_MAJ=42, MODE_MIN=43, RELATIVE_KW=44, TEMPO_KW=45, TIME_KW=46, COMMENT_MULTILINE_N=47, 
		COMMENT_INLINE_N=48, WS_N=49, NEXT_NOTEBLOCK_P=50, NEW_NOTEBLOCK_P=51, 
		VOICE_CTX_P=52, END_POLYPHONY_P=53, COMMENT_MULTILINE_P=54, COMMENT_INLINE_P=55, 
		WS_P=56;
	public static final int
		RULE_score_file = 0, RULE_header_block = 1, RULE_score_block = 2, RULE_staffgroup_block = 3, 
		RULE_staff_block = 4, RULE_prefix_block = 5, RULE_voice_block = 6, RULE_note_block = 7, 
		RULE_relative_block = 8, RULE_polyphony_block = 9, RULE_chord = 10, RULE_note_cmd = 11, 
		RULE_bar_cmd = 12, RULE_clef_cmd = 13, RULE_fermata_cmd = 14, RULE_key_cmd = 15, 
		RULE_mark_cmd = 16, RULE_scheme_cmd = 17, RULE_tempo_cmd = 18, RULE_time_cmd = 19, 
		RULE_version_cmd = 20, RULE_assignment = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"score_file", "header_block", "score_block", "staffgroup_block", "staff_block", 
			"prefix_block", "voice_block", "note_block", "relative_block", "polyphony_block", 
			"chord", "note_cmd", "bar_cmd", "clef_cmd", "fermata_cmd", "key_cmd", 
			"mark_cmd", "scheme_cmd", "tempo_cmd", "time_cmd", "version_cmd", "assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\new StaffGroup'", null, null, "'\\header'", "'\\layout'", "'\\score'", 
			"'\\with'", "'\\version'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'\\bar'", "'\\clef'", "'\\default'", 
			"'\\fermata'", "'\\key'", "'\\mark'", null, "'\\major'", "'\\minor'", 
			"'\\relative'", "'\\tempo'", "'\\time'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STAFFGROUP_CTX", "STAFF_CTX", "VOICE_CTX", "HEADER_KW", "LAYOUT_KW", 
			"SCORE_KW", "WITH_KW", "VERSION_KW", "SCHEME_GP", "SCHEME_ATOM", "ID", 
			"STRING", "VERSION_STR", "HASH", "LBRACE", "RBRACE", "LANGLE", "RANGLE", 
			"EQUALS", "DOT", "BSLASH", "FSLASH", "INTEGER", "COMMENT_MULTILINE", 
			"COMMENT_INLINE", "WS", "END_NOTEBLOCK", "VOICE_CTX_N", "REL_BLOCK_N", 
			"START_POLYPHONY_N", "NOTE", "OCTAVE", "TIME_SIG", "BARLINE", "BAR_KW", 
			"CLEF_KW", "DEFAULT_KW", "FERMATA_KW", "KEY_KW", "MARK_KW", "MODE_KW", 
			"MODE_MAJ", "MODE_MIN", "RELATIVE_KW", "TEMPO_KW", "TIME_KW", "COMMENT_MULTILINE_N", 
			"COMMENT_INLINE_N", "WS_N", "NEXT_NOTEBLOCK_P", "NEW_NOTEBLOCK_P", "VOICE_CTX_P", 
			"END_POLYPHONY_P", "COMMENT_MULTILINE_P", "COMMENT_INLINE_P", "WS_P"
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
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HEADER_KW:
					{
					setState(44);
					header_block();
					}
					break;
				case SCORE_KW:
					{
					setState(45);
					score_block();
					}
					break;
				case VERSION_KW:
					{
					setState(46);
					version_cmd();
					}
					break;
				case SCHEME_GP:
				case SCHEME_ATOM:
					{
					setState(47);
					scheme_cmd();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50); 
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
			setState(52);
			match(HEADER_KW);
			setState(53);
			match(LBRACE);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(54);
				assignment();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
			setState(62);
			match(SCORE_KW);
			setState(63);
			match(LBRACE);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAFFGROUP_CTX || _la==STAFF_CTX) {
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAFF_CTX:
					{
					setState(64);
					staff_block();
					}
					break;
				case STAFFGROUP_CTX:
					{
					setState(65);
					staffgroup_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
			setState(73);
			match(STAFFGROUP_CTX);
			setState(74);
			match(LANGLE);
			setState(75);
			match(LANGLE);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAFF_CTX) {
				{
				{
				setState(76);
				staff_block();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(RANGLE);
			setState(83);
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
		public TerminalNode END_NOTEBLOCK() { return getToken(LilypondParser.END_NOTEBLOCK, 0); }
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
			setState(85);
			match(STAFF_CTX);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(86);
				prefix_block();
				}
				break;
			}
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(89);
					note_block();
					}
					break;
				case 2:
					{
					setState(90);
					polyphony_block();
					}
					break;
				case 3:
					{
					setState(91);
					voice_block();
					}
					break;
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOICE_CTX) | (1L << LANGLE) | (1L << VOICE_CTX_N) | (1L << REL_BLOCK_N) | (1L << START_POLYPHONY_N) | (1L << NOTE) | (1L << BAR_KW) | (1L << CLEF_KW) | (1L << FERMATA_KW) | (1L << KEY_KW) | (1L << MARK_KW) | (1L << TEMPO_KW) | (1L << TIME_KW) | (1L << VOICE_CTX_P))) != 0) );
			setState(96);
			match(END_NOTEBLOCK);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIME_KW) {
					{
					setState(98);
					time_cmd();
					}
				}

				setState(101);
				key_cmd();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
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

	public static class Voice_blockContext extends ParserRuleContext {
		public TerminalNode END_NOTEBLOCK() { return getToken(LilypondParser.END_NOTEBLOCK, 0); }
		public TerminalNode VOICE_CTX() { return getToken(LilypondParser.VOICE_CTX, 0); }
		public TerminalNode VOICE_CTX_N() { return getToken(LilypondParser.VOICE_CTX_N, 0); }
		public TerminalNode VOICE_CTX_P() { return getToken(LilypondParser.VOICE_CTX_P, 0); }
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
		enterRule(_localctx, 12, RULE_voice_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOICE_CTX) | (1L << VOICE_CTX_N) | (1L << VOICE_CTX_P))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOICE_CTX) | (1L << LANGLE) | (1L << VOICE_CTX_N) | (1L << REL_BLOCK_N) | (1L << START_POLYPHONY_N) | (1L << NOTE) | (1L << BAR_KW) | (1L << CLEF_KW) | (1L << FERMATA_KW) | (1L << KEY_KW) | (1L << MARK_KW) | (1L << TEMPO_KW) | (1L << TIME_KW) | (1L << VOICE_CTX_P))) != 0)) {
				{
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(106);
					note_block();
					}
					break;
				case 2:
					{
					setState(107);
					polyphony_block();
					}
					break;
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(END_NOTEBLOCK);
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
		public List<Voice_blockContext> voice_block() {
			return getRuleContexts(Voice_blockContext.class);
		}
		public Voice_blockContext voice_block(int i) {
			return getRuleContext(Voice_blockContext.class,i);
		}
		public Note_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_block; }
	}

	public final Note_blockContext note_block() throws RecognitionException {
		Note_blockContext _localctx = new Note_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_note_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(121);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case REL_BLOCK_N:
						{
						setState(115);
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
						setState(116);
						note_cmd();
						}
						break;
					case START_POLYPHONY_N:
						{
						setState(117);
						polyphony_block();
						}
						break;
					case LANGLE:
						{
						setState(118);
						chord();
						}
						break;
					case NOTE:
						{
						setState(119);
						match(NOTE);
						}
						break;
					case VOICE_CTX:
					case VOICE_CTX_N:
					case VOICE_CTX_P:
						{
						setState(120);
						voice_block();
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
				setState(123); 
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
		public TerminalNode REL_BLOCK_N() { return getToken(LilypondParser.REL_BLOCK_N, 0); }
		public Note_blockContext note_block() {
			return getRuleContext(Note_blockContext.class,0);
		}
		public TerminalNode END_NOTEBLOCK() { return getToken(LilypondParser.END_NOTEBLOCK, 0); }
		public Relative_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relative_block; }
	}

	public final Relative_blockContext relative_block() throws RecognitionException {
		Relative_blockContext _localctx = new Relative_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relative_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(REL_BLOCK_N);
			setState(126);
			note_block();
			setState(127);
			match(END_NOTEBLOCK);
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
		public TerminalNode START_POLYPHONY_N() { return getToken(LilypondParser.START_POLYPHONY_N, 0); }
		public TerminalNode END_POLYPHONY_P() { return getToken(LilypondParser.END_POLYPHONY_P, 0); }
		public List<Voice_blockContext> voice_block() {
			return getRuleContexts(Voice_blockContext.class);
		}
		public Voice_blockContext voice_block(int i) {
			return getRuleContext(Voice_blockContext.class,i);
		}
		public List<TerminalNode> NEW_NOTEBLOCK_P() { return getTokens(LilypondParser.NEW_NOTEBLOCK_P); }
		public TerminalNode NEW_NOTEBLOCK_P(int i) {
			return getToken(LilypondParser.NEW_NOTEBLOCK_P, i);
		}
		public List<Note_blockContext> note_block() {
			return getRuleContexts(Note_blockContext.class);
		}
		public Note_blockContext note_block(int i) {
			return getRuleContext(Note_blockContext.class,i);
		}
		public List<TerminalNode> END_NOTEBLOCK() { return getTokens(LilypondParser.END_NOTEBLOCK); }
		public TerminalNode END_NOTEBLOCK(int i) {
			return getToken(LilypondParser.END_NOTEBLOCK, i);
		}
		public List<TerminalNode> NEXT_NOTEBLOCK_P() { return getTokens(LilypondParser.NEXT_NOTEBLOCK_P); }
		public TerminalNode NEXT_NOTEBLOCK_P(int i) {
			return getToken(LilypondParser.NEXT_NOTEBLOCK_P, i);
		}
		public Polyphony_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polyphony_block; }
	}

	public final Polyphony_blockContext polyphony_block() throws RecognitionException {
		Polyphony_blockContext _localctx = new Polyphony_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_polyphony_block);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(129);
				match(START_POLYPHONY_N);
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(130);
					voice_block();
					}
					}
					setState(133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOICE_CTX) | (1L << VOICE_CTX_N) | (1L << VOICE_CTX_P))) != 0) );
				setState(135);
				match(END_POLYPHONY_P);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(137);
				match(START_POLYPHONY_N);
				setState(138);
				match(NEW_NOTEBLOCK_P);
				setState(139);
				note_block();
				setState(140);
				match(END_NOTEBLOCK);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEXT_NOTEBLOCK_P) {
					{
					{
					setState(141);
					match(NEXT_NOTEBLOCK_P);
					setState(142);
					match(NEW_NOTEBLOCK_P);
					setState(143);
					note_block();
					setState(144);
					match(END_NOTEBLOCK);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(END_POLYPHONY_P);
				}
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
		enterRule(_localctx, 20, RULE_chord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LANGLE);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				match(NOTE);
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOTE );
			setState(161);
			match(RANGLE);
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(162);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(163);
				match(INTEGER);
				setState(164);
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
		enterRule(_localctx, 22, RULE_note_cmd);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BAR_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				bar_cmd();
				}
				break;
			case CLEF_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				clef_cmd();
				}
				break;
			case FERMATA_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				fermata_cmd();
				}
				break;
			case KEY_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				key_cmd();
				}
				break;
			case MARK_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				mark_cmd();
				}
				break;
			case TEMPO_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				tempo_cmd();
				}
				break;
			case TIME_KW:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
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
		enterRule(_localctx, 24, RULE_bar_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(BAR_KW);
			setState(177);
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
		enterRule(_localctx, 26, RULE_clef_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(CLEF_KW);
			setState(180);
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
		enterRule(_localctx, 28, RULE_fermata_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
		enterRule(_localctx, 30, RULE_key_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(KEY_KW);
			setState(185);
			match(NOTE);
			setState(186);
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
		enterRule(_localctx, 32, RULE_mark_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(MARK_KW);
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCHEME_GP:
			case SCHEME_ATOM:
				{
				setState(189);
				scheme_cmd();
				}
				break;
			case DEFAULT_KW:
				{
				setState(190);
				match(DEFAULT_KW);
				}
				break;
			case VOICE_CTX:
			case LANGLE:
			case END_NOTEBLOCK:
			case VOICE_CTX_N:
			case REL_BLOCK_N:
			case START_POLYPHONY_N:
			case NOTE:
			case BAR_KW:
			case CLEF_KW:
			case FERMATA_KW:
			case KEY_KW:
			case MARK_KW:
			case TEMPO_KW:
			case TIME_KW:
			case VOICE_CTX_P:
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
		enterRule(_localctx, 34, RULE_scheme_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		enterRule(_localctx, 36, RULE_tempo_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(TEMPO_KW);
			setState(196);
			match(STRING);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(197);
				match(INTEGER);
				setState(198);
				match(EQUALS);
				setState(199);
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
		enterRule(_localctx, 38, RULE_time_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(TIME_KW);
			setState(203);
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
		enterRule(_localctx, 40, RULE_version_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(VERSION_KW);
			setState(206);
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
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ID);
			setState(209);
			match(EQUALS);
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(210);
				match(STRING);
				}
				break;
			case SCHEME_GP:
			case SCHEME_ATOM:
				{
				setState(211);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\6\2"+
		"\63\n\2\r\2\16\2\64\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5P\n\5\f"+
		"\5\16\5S\13\5\3\5\3\5\3\5\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\6\6_\n\6\r\6\16"+
		"\6`\3\6\3\6\3\7\5\7f\n\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\7\bo\n\b\f\b\16"+
		"\br\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\6\t|\n\t\r\t\16\t}\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\6\13\u0086\n\13\r\13\16\13\u0087\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0095\n\13\f\13\16\13\u0098\13"+
		"\13\3\13\3\13\5\13\u009c\n\13\3\f\3\f\6\f\u00a0\n\f\r\f\16\f\u00a1\3\f"+
		"\3\f\3\f\3\f\5\f\u00a8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b1\n\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\5\22\u00c2\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00cb\n\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00d7\n\27\3\27"+
		"\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4\5\2\5\5\36"+
		"\36\66\66\3\2\13\f\2\u00e8\2\62\3\2\2\2\4\66\3\2\2\2\6@\3\2\2\2\bK\3\2"+
		"\2\2\nW\3\2\2\2\fi\3\2\2\2\16k\3\2\2\2\20{\3\2\2\2\22\177\3\2\2\2\24\u009b"+
		"\3\2\2\2\26\u009d\3\2\2\2\30\u00b0\3\2\2\2\32\u00b2\3\2\2\2\34\u00b5\3"+
		"\2\2\2\36\u00b8\3\2\2\2 \u00ba\3\2\2\2\"\u00be\3\2\2\2$\u00c3\3\2\2\2"+
		"&\u00c5\3\2\2\2(\u00cc\3\2\2\2*\u00cf\3\2\2\2,\u00d2\3\2\2\2.\63\5\4\3"+
		"\2/\63\5\6\4\2\60\63\5*\26\2\61\63\5$\23\2\62.\3\2\2\2\62/\3\2\2\2\62"+
		"\60\3\2\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\3\3\2\2\2\66\67\7\6\2\2\67;\7\21\2\28:\5,\27\298\3\2\2\2:=\3\2\2\2;9"+
		"\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\22\2\2?\5\3\2\2\2@A\7\b\2\2"+
		"AF\7\21\2\2BE\5\n\6\2CE\5\b\5\2DB\3\2\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2"+
		"\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\22\2\2J\7\3\2\2\2KL\7\3\2\2LM\7\23"+
		"\2\2MQ\7\23\2\2NP\5\n\6\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3"+
		"\2\2\2SQ\3\2\2\2TU\7\24\2\2UV\7\24\2\2V\t\3\2\2\2WY\7\4\2\2XZ\5\f\7\2"+
		"YX\3\2\2\2YZ\3\2\2\2Z^\3\2\2\2[_\5\20\t\2\\_\5\24\13\2]_\5\16\b\2^[\3"+
		"\2\2\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc"+
		"\7\35\2\2c\13\3\2\2\2df\5(\25\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gj\5 \21"+
		"\2hj\5(\25\2ie\3\2\2\2ih\3\2\2\2j\r\3\2\2\2kp\t\2\2\2lo\5\20\t\2mo\5\24"+
		"\13\2nl\3\2\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3"+
		"\2\2\2st\7\35\2\2t\17\3\2\2\2u|\5\22\n\2v|\5\30\r\2w|\5\24\13\2x|\5\26"+
		"\f\2y|\7!\2\2z|\5\16\b\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2"+
		"\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\21\3\2\2\2\177\u0080\7\37"+
		"\2\2\u0080\u0081\5\20\t\2\u0081\u0082\7\35\2\2\u0082\23\3\2\2\2\u0083"+
		"\u0085\7 \2\2\u0084\u0086\5\16\b\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\7\67\2\2\u008a\u009c\3\2\2\2\u008b\u008c\7 \2\2\u008c\u008d\7\65"+
		"\2\2\u008d\u008e\5\20\t\2\u008e\u0096\7\35\2\2\u008f\u0090\7\64\2\2\u0090"+
		"\u0091\7\65\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\35\2\2\u0093\u0095"+
		"\3\2\2\2\u0094\u008f\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\67"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0083\3\2\2\2\u009b\u008b\3\2\2\2\u009c"+
		"\25\3\2\2\2\u009d\u009f\7\23\2\2\u009e\u00a0\7!\2\2\u009f\u009e\3\2\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a7\7\24\2\2\u00a4\u00a8\7\31\2\2\u00a5\u00a6\7\31\2"+
		"\2\u00a6\u00a8\7\26\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00b1\5\32\16\2\u00aa\u00b1\5\34"+
		"\17\2\u00ab\u00b1\5\36\20\2\u00ac\u00b1\5 \21\2\u00ad\u00b1\5\"\22\2\u00ae"+
		"\u00b1\5&\24\2\u00af\u00b1\5(\25\2\u00b0\u00a9\3\2\2\2\u00b0\u00aa\3\2"+
		"\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\31\3\2\2\2\u00b2\u00b3\7%\2\2"+
		"\u00b3\u00b4\7$\2\2\u00b4\33\3\2\2\2\u00b5\u00b6\7&\2\2\u00b6\u00b7\7"+
		"\r\2\2\u00b7\35\3\2\2\2\u00b8\u00b9\7(\2\2\u00b9\37\3\2\2\2\u00ba\u00bb"+
		"\7)\2\2\u00bb\u00bc\7!\2\2\u00bc\u00bd\7+\2\2\u00bd!\3\2\2\2\u00be\u00c1"+
		"\7*\2\2\u00bf\u00c2\5$\23\2\u00c0\u00c2\7\'\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2#\3\2\2\2\u00c3\u00c4\t\3\2\2"+
		"\u00c4%\3\2\2\2\u00c5\u00c6\7/\2\2\u00c6\u00ca\7\16\2\2\u00c7\u00c8\7"+
		"\31\2\2\u00c8\u00c9\7\25\2\2\u00c9\u00cb\7\31\2\2\u00ca\u00c7\3\2\2\2"+
		"\u00ca\u00cb\3\2\2\2\u00cb\'\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd\u00ce"+
		"\7#\2\2\u00ce)\3\2\2\2\u00cf\u00d0\7\n\2\2\u00d0\u00d1\7\17\2\2\u00d1"+
		"+\3\2\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d6\7\25\2\2\u00d4\u00d7\7\16\2"+
		"\2\u00d5\u00d7\5$\23\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7-"+
		"\3\2\2\2\32\62\64;DFQY^`einp{}\u0087\u0096\u009b\u00a1\u00a7\u00b0\u00c1"+
		"\u00ca\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}