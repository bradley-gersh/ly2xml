// Generated from /Users/Brad/Code/Scores/ly2musicxml/LilypondLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LilypondLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STAFFGROUP_CTX=1, STAFF_CTX=2, VOICE_CTX=3, HEADER_KW=4, LAYOUT_KW=5, 
		SCORE_KW=6, WITH_KW=7, VERSION_KW=8, SCHEME_GP=9, SCHEME_ATOM=10, ID=11, 
		STRING=12, VERSION_STR=13, HASH=14, LBRACE=15, RBRACE=16, LANGLE=17, RANGLE=18, 
		EQUALS=19, DOT=20, BSLASH=21, FSLASH=22, INTEGER=23, COMMENT_MULTILINE=24, 
		COMMENT_INLINE=25, WS=26, END_NOTE=27, VOICE_CTX_N=28, NOTE=29, OCTAVE=30, 
		TIME_SIG=31, BARLINE=32, BAR_KW=33, CLEF_KW=34, DEFAULT_KW=35, FERMATA_KW=36, 
		KEY_KW=37, MARK_KW=38, MODE_KW=39, MODE_MAJ=40, MODE_MIN=41, RELATIVE_KW=42, 
		TEMPO_KW=43, TIME_KW=44, COMMENT_MULTILINE_N=45, COMMENT_INLINE_N=46, 
		WS_N=47, NEXT_NOTEBLOCK_P=48, NEW_NOTEBLOCK_P=49, END_POLYPHONY_P=50, 
		COMMENT_MULTILINE_P=51, COMMENT_INLINE_P=52, WS_P=53;
	public static final int
		NOTE_ENTRY=1, POLYPHONY=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "NOTE_ENTRY", "POLYPHONY"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STAFFGROUP_CTX", "STAFF_CTX", "VOICE_CTX", "HEADER_KW", "LAYOUT_KW", 
			"SCORE_KW", "WITH_KW", "VERSION_KW", "SCHEME_GP", "SCHEME_ATOM", "ID", 
			"STRING", "VERSION_STR", "HASH", "LBRACE", "RBRACE", "LANGLE", "RANGLE", 
			"EQUALS", "DOT", "BSLASH", "FSLASH", "INTEGER", "STRING_CHAR", "ID_CHAR", 
			"COMMENT_MULTILINE", "COMMENT_INLINE", "WS", "END_NOTE", "VOICE_CTX_N", 
			"NOTE", "OCTAVE", "TIME_SIG", "BARLINE", "BAR_KW", "CLEF_KW", "DEFAULT_KW", 
			"FERMATA_KW", "KEY_KW", "MARK_KW", "MODE_KW", "MODE_MAJ", "MODE_MIN", 
			"RELATIVE_KW", "TEMPO_KW", "TIME_KW", "PITCH", "ACCIDENTAL", "BAR_CHAR", 
			"HASH_N", "LBRACE_N", "RBRACE_N", "LANGLE_N", "RANGLE_N", "EQUALS_N", 
			"DOT_N", "BSLASH_N", "FSLASH_N", "INTEGER_N", "STRING_N", "COMMENT_MULTILINE_N", 
			"COMMENT_INLINE_N", "WS_N", "NEXT_NOTEBLOCK_P", "NEW_NOTEBLOCK_P", "END_POLYPHONY_P", 
			"HASH_P", "LBRACE_P", "RBRACE_P", "LANGLE_P", "RANGLE_P", "EQUALS_P", 
			"DOT_P", "BSLASH_P", "FSLASH_P", "INTEGER_P", "STRING_P", "COMMENT_MULTILINE_P", 
			"COMMENT_INLINE_P", "WS_P"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\new StaffGroup'", null, null, "'\\header'", "'\\layout'", "'\\score'", 
			"'\\with'", "'\\version'", null, null, null, null, null, null, "'{'", 
			null, "'<'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'\\bar'", "'\\clef'", "'\\default'", "'\\fermata'", 
			"'\\key'", "'\\mark'", null, "'\\major'", "'\\minor'", "'\\relative'", 
			"'\\tempo'", "'\\time'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STAFFGROUP_CTX", "STAFF_CTX", "VOICE_CTX", "HEADER_KW", "LAYOUT_KW", 
			"SCORE_KW", "WITH_KW", "VERSION_KW", "SCHEME_GP", "SCHEME_ATOM", "ID", 
			"STRING", "VERSION_STR", "HASH", "LBRACE", "RBRACE", "LANGLE", "RANGLE", 
			"EQUALS", "DOT", "BSLASH", "FSLASH", "INTEGER", "COMMENT_MULTILINE", 
			"COMMENT_INLINE", "WS", "END_NOTE", "VOICE_CTX_N", "NOTE", "OCTAVE", 
			"TIME_SIG", "BARLINE", "BAR_KW", "CLEF_KW", "DEFAULT_KW", "FERMATA_KW", 
			"KEY_KW", "MARK_KW", "MODE_KW", "MODE_MAJ", "MODE_MIN", "RELATIVE_KW", 
			"TEMPO_KW", "TIME_KW", "COMMENT_MULTILINE_N", "COMMENT_INLINE_N", "WS_N", 
			"NEXT_NOTEBLOCK_P", "NEW_NOTEBLOCK_P", "END_POLYPHONY_P", "COMMENT_MULTILINE_P", 
			"COMMENT_INLINE_P", "WS_P"
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


	public LilypondLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LilypondLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 50:
			LBRACE_N_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			LANGLE_N_action((RuleContext)_localctx, actionIndex);
			break;
		case 67:
			LBRACE_P_action((RuleContext)_localctx, actionIndex);
			break;
		case 69:
			LANGLE_P_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LBRACE_N_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("lbracen");
			break;
		}
	}
	private void LANGLE_N_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("langlen");
			break;
		}
	}
	private void LBRACE_P_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("lbracen");
			break;
		}
	}
	private void LANGLE_P_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("langlen");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u02b9\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00c2\n\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d4\n\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0103\n\n\f\n\16\n\u0106\13\n\3\n\3\n"+
		"\3\13\3\13\3\13\7\13\u010d\n\13\f\13\16\13\u0110\13\13\3\13\3\13\3\f\3"+
		"\f\6\f\u0116\n\f\r\f\16\f\u0117\3\r\3\r\6\r\u011c\n\r\r\r\16\r\u011d\3"+
		"\r\3\r\3\16\3\16\3\16\6\16\u0125\n\16\r\16\16\16\u0126\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\6\30\u013e\n\30\r\30\16\30\u013f\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\7\33\u014a\n\33\f\33\16\33\u014d\13\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\7\34\u0156\n\34\f\34\16\34\u0159\13\34\3"+
		"\34\3\34\3\34\3\34\3\35\6\35\u0160\n\35\r\35\16\35\u0161\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0176\n\37\3\37\3\37\3\37\3\37\3 \3 \7 \u017e\n \f \16 \u0181"+
		"\13 \3 \5 \u0184\n \3 \3 \3 \3 \5 \u018a\n \3!\6!\u018d\n!\r!\16!\u018e"+
		"\3!\6!\u0192\n!\r!\16!\u0193\5!\u0196\n!\3\"\3\"\3\"\3\"\3#\3#\6#\u019e"+
		"\n#\r#\16#\u019f\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3*\3*\5*\u01ce\n*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u01fc\n\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\3:\3:\3:\3"+
		":\3;\3;\3;\3;\3<\6<\u0227\n<\r<\16<\u0228\3<\3<\3=\3=\6=\u022f\n=\r=\16"+
		"=\u0230\3=\3=\3=\3=\3>\3>\3>\3>\7>\u023b\n>\f>\16>\u023e\13>\3>\3>\3>"+
		"\3>\3>\3?\3?\7?\u0247\n?\f?\16?\u024a\13?\3?\3?\3?\3?\3@\6@\u0251\n@\r"+
		"@\16@\u0252\3@\3@\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3E\3"+
		"E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3"+
		"J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3M\6M\u028a\nM\rM\16M\u028b\3M\3M\3N\3N\6"+
		"N\u0292\nN\rN\16N\u0293\3N\3N\3N\3N\3O\3O\3O\3O\7O\u029e\nO\fO\16O\u02a1"+
		"\13O\3O\3O\3O\3O\3O\3P\3P\7P\u02aa\nP\fP\16P\u02ad\13P\3P\3P\3P\3P\3Q"+
		"\6Q\u02b4\nQ\rQ\16Q\u02b5\3Q\3Q\n\u0104\u010e\u014b\u0157\u023c\u0248"+
		"\u029f\u02ab\2R\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33"+
		"\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\2\65\2\67\32"+
		"9\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a\2c\2e\2g\2i\2k\2"+
		"m\2o\2q\2s\2u\2w\2y\2{\2}/\177\60\u0081\61\u0083\62\u0085\63\u0087\64"+
		"\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099"+
		"\2\u009b\2\u009d\2\u009f\65\u00a1\66\u00a3\67\5\2\3\4\t\3\2**\3\2\62;"+
		"\7\2\"\"..\60\60C\\c|\4\2C\\c|\5\2\13\f\17\17\"\"\4\2citt\b\2##\60\60"+
		"==]]__~~\2\u02d4\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\3?\3"+
		"\2\2\2\3A\3\2\2\2\3C\3\2\2\2\3E\3\2\2\2\3G\3\2\2\2\3I\3\2\2\2\3K\3\2\2"+
		"\2\3M\3\2\2\2\3O\3\2\2\2\3Q\3\2\2\2\3S\3\2\2\2\3U\3\2\2\2\3W\3\2\2\2\3"+
		"Y\3\2\2\2\3[\3\2\2\2\3]\3\2\2\2\3_\3\2\2\2\3g\3\2\2\2\3i\3\2\2\2\3k\3"+
		"\2\2\2\3m\3\2\2\2\3o\3\2\2\2\3q\3\2\2\2\3s\3\2\2\2\3u\3\2\2\2\3w\3\2\2"+
		"\2\3y\3\2\2\2\3{\3\2\2\2\3}\3\2\2\2\3\177\3\2\2\2\3\u0081\3\2\2\2\4\u0083"+
		"\3\2\2\2\4\u0085\3\2\2\2\4\u0087\3\2\2\2\4\u0089\3\2\2\2\4\u008b\3\2\2"+
		"\2\4\u008d\3\2\2\2\4\u008f\3\2\2\2\4\u0091\3\2\2\2\4\u0093\3\2\2\2\4\u0095"+
		"\3\2\2\2\4\u0097\3\2\2\2\4\u0099\3\2\2\2\4\u009b\3\2\2\2\4\u009d\3\2\2"+
		"\2\4\u009f\3\2\2\2\4\u00a1\3\2\2\2\4\u00a3\3\2\2\2\5\u00a5\3\2\2\2\7\u00b5"+
		"\3\2\2\2\t\u00c7\3\2\2\2\13\u00d9\3\2\2\2\r\u00e1\3\2\2\2\17\u00e9\3\2"+
		"\2\2\21\u00f0\3\2\2\2\23\u00f6\3\2\2\2\25\u00ff\3\2\2\2\27\u0109\3\2\2"+
		"\2\31\u0115\3\2\2\2\33\u0119\3\2\2\2\35\u0121\3\2\2\2\37\u012a\3\2\2\2"+
		"!\u012c\3\2\2\2#\u012e\3\2\2\2%\u0130\3\2\2\2\'\u0132\3\2\2\2)\u0134\3"+
		"\2\2\2+\u0136\3\2\2\2-\u0138\3\2\2\2/\u013a\3\2\2\2\61\u013d\3\2\2\2\63"+
		"\u0141\3\2\2\2\65\u0143\3\2\2\2\67\u0145\3\2\2\29\u0153\3\2\2\2;\u015f"+
		"\3\2\2\2=\u0165\3\2\2\2?\u0169\3\2\2\2A\u017b\3\2\2\2C\u0195\3\2\2\2E"+
		"\u0197\3\2\2\2G\u019b\3\2\2\2I\u01a3\3\2\2\2K\u01a8\3\2\2\2M\u01ae\3\2"+
		"\2\2O\u01b7\3\2\2\2Q\u01c0\3\2\2\2S\u01c5\3\2\2\2U\u01cd\3\2\2\2W\u01cf"+
		"\3\2\2\2Y\u01d6\3\2\2\2[\u01dd\3\2\2\2]\u01e7\3\2\2\2_\u01ee\3\2\2\2a"+
		"\u01f4\3\2\2\2c\u01fb\3\2\2\2e\u01fd\3\2\2\2g\u01ff\3\2\2\2i\u0203\3\2"+
		"\2\2k\u0208\3\2\2\2m\u020c\3\2\2\2o\u0211\3\2\2\2q\u0215\3\2\2\2s\u0219"+
		"\3\2\2\2u\u021d\3\2\2\2w\u0221\3\2\2\2y\u0226\3\2\2\2{\u022c\3\2\2\2}"+
		"\u0236\3\2\2\2\177\u0244\3\2\2\2\u0081\u0250\3\2\2\2\u0083\u0256\3\2\2"+
		"\2\u0085\u0259\3\2\2\2\u0087\u025d\3\2\2\2\u0089\u0262\3\2\2\2\u008b\u0266"+
		"\3\2\2\2\u008d\u026b\3\2\2\2\u008f\u026f\3\2\2\2\u0091\u0274\3\2\2\2\u0093"+
		"\u0278\3\2\2\2\u0095\u027c\3\2\2\2\u0097\u0280\3\2\2\2\u0099\u0284\3\2"+
		"\2\2\u009b\u0289\3\2\2\2\u009d\u028f\3\2\2\2\u009f\u0299\3\2\2\2\u00a1"+
		"\u02a7\3\2\2\2\u00a3\u02b3\3\2\2\2\u00a5\u00a6\7^\2\2\u00a6\u00a7\7p\2"+
		"\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab"+
		"\7U\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7h\2\2\u00ae"+
		"\u00af\7h\2\2\u00af\u00b0\7I\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7q\2\2"+
		"\u00b2\u00b3\7w\2\2\u00b3\u00b4\7r\2\2\u00b4\6\3\2\2\2\u00b5\u00b6\7^"+
		"\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba"+
		"\7\"\2\2\u00ba\u00bb\7U\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7c\2\2\u00bd"+
		"\u00be\7h\2\2\u00be\u00bf\7h\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\5;\35"+
		"\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\5!\20\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\3\2\2\u00c6\b\3\2\2\2\u00c7"+
		"\u00c8\7^\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7y\2\2"+
		"\u00cb\u00cc\7\"\2\2\u00cc\u00cd\7X\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf"+
		"\7k\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d4\5;\35\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\5!\20\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\4\2\2\u00d8"+
		"\n\3\2\2\2\u00d9\u00da\7^\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7c\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7t\2\2"+
		"\u00e0\f\3\2\2\2\u00e1\u00e2\7^\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7c"+
		"\2\2\u00e4\u00e5\7{\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8"+
		"\7v\2\2\u00e8\16\3\2\2\2\u00e9\u00ea\7^\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec"+
		"\7e\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g\2\2\u00ef"+
		"\20\3\2\2\2\u00f0\u00f1\7^\2\2\u00f1\u00f2\7y\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4\u00f5\7j\2\2\u00f5\22\3\2\2\2\u00f6\u00f7\7^\2\2\u00f7"+
		"\u00f8\7x\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7u\2\2"+
		"\u00fb\u00fc\7k\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7p\2\2\u00fe\24\3\2"+
		"\2\2\u00ff\u0100\5\37\17\2\u0100\u0104\7*\2\2\u0101\u0103\13\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0105\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7+\2\2\u0108"+
		"\26\3\2\2\2\u0109\u010a\5\37\17\2\u010a\u010e\n\2\2\2\u010b\u010d\13\2"+
		"\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\5;"+
		"\35\2\u0112\30\3\2\2\2\u0113\u0116\5\65\32\2\u0114\u0116\7\60\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\32\3\2\2\2\u0119\u011b\7$\2\2\u011a\u011c"+
		"\5\63\31\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7$\2\2\u0120\34\3"+
		"\2\2\2\u0121\u0124\7$\2\2\u0122\u0125\5\61\30\2\u0123\u0125\7\60\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7$\2\2\u0129"+
		"\36\3\2\2\2\u012a\u012b\7%\2\2\u012b \3\2\2\2\u012c\u012d\7}\2\2\u012d"+
		"\"\3\2\2\2\u012e\u012f\7\177\2\2\u012f$\3\2\2\2\u0130\u0131\7>\2\2\u0131"+
		"&\3\2\2\2\u0132\u0133\7@\2\2\u0133(\3\2\2\2\u0134\u0135\7?\2\2\u0135*"+
		"\3\2\2\2\u0136\u0137\7\60\2\2\u0137,\3\2\2\2\u0138\u0139\7^\2\2\u0139"+
		".\3\2\2\2\u013a\u013b\7\61\2\2\u013b\60\3\2\2\2\u013c\u013e\t\3\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\62\3\2\2\2\u0141\u0142\t\4\2\2\u0142\64\3\2\2\2\u0143\u0144"+
		"\t\5\2\2\u0144\66\3\2\2\2\u0145\u0146\7\'\2\2\u0146\u0147\7}\2\2\u0147"+
		"\u014b\3\2\2\2\u0148\u014a\13\2\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7\'\2\2\u014f\u0150\7\177\2\2\u0150\u0151\3"+
		"\2\2\2\u0151\u0152\b\33\3\2\u01528\3\2\2\2\u0153\u0157\7\'\2\2\u0154\u0156"+
		"\13\2\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0158\3\2\2\2"+
		"\u0157\u0155\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b"+
		"\5;\35\2\u015b\u015c\3\2\2\2\u015c\u015d\b\34\3\2\u015d:\3\2\2\2\u015e"+
		"\u0160\t\6\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b\35\3\2\u0164"+
		"<\3\2\2\2\u0165\u0166\5k\65\2\u0166\u0167\3\2\2\2\u0167\u0168\b\36\4\2"+
		"\u0168>\3\2\2\2\u0169\u016a\7^\2\2\u016a\u016b\7p\2\2\u016b\u016c\7g\2"+
		"\2\u016c\u016d\7y\2\2\u016d\u016e\7\"\2\2\u016e\u016f\7X\2\2\u016f\u0170"+
		"\7q\2\2\u0170\u0171\7k\2\2\u0171\u0172\7e\2\2\u0172\u0173\7g\2\2\u0173"+
		"\u0175\3\2\2\2\u0174\u0176\5;\35\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u0178\5i\64\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017a\b\37\2\2\u017a@\3\2\2\2\u017b\u017f\5a\60\2\u017c\u017e\5c\61\2"+
		"\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0184\5C!\2\u0183"+
		"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0189\3\2\2\2\u0185\u018a\5y"+
		"<\2\u0186\u0187\5y<\2\u0187\u0188\7\60\2\2\u0188\u018a\3\2\2\2\u0189\u0185"+
		"\3\2\2\2\u0189\u0186\3\2\2\2\u0189\u018a\3\2\2\2\u018aB\3\2\2\2\u018b"+
		"\u018d\7)\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u0196\3\2\2\2\u0190\u0192\7.\2\2\u0191"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0196\3\2\2\2\u0195\u018c\3\2\2\2\u0195\u0191\3\2\2\2\u0196"+
		"D\3\2\2\2\u0197\u0198\5y<\2\u0198\u0199\7\61\2\2\u0199\u019a\5y<\2\u019a"+
		"F\3\2\2\2\u019b\u019d\7$\2\2\u019c\u019e\5e\62\2\u019d\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a2\7$\2\2\u01a2H\3\2\2\2\u01a3\u01a4\7^\2\2\u01a4\u01a5"+
		"\7d\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7t\2\2\u01a7J\3\2\2\2\u01a8\u01a9"+
		"\7^\2\2\u01a9\u01aa\7e\2\2\u01aa\u01ab\7n\2\2\u01ab\u01ac\7g\2\2\u01ac"+
		"\u01ad\7h\2\2\u01adL\3\2\2\2\u01ae\u01af\7^\2\2\u01af\u01b0\7f\2\2\u01b0"+
		"\u01b1\7g\2\2\u01b1\u01b2\7h\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4\7w\2\2"+
		"\u01b4\u01b5\7n\2\2\u01b5\u01b6\7v\2\2\u01b6N\3\2\2\2\u01b7\u01b8\7^\2"+
		"\2\u01b8\u01b9\7h\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc"+
		"\7o\2\2\u01bc\u01bd\7c\2\2\u01bd\u01be\7v\2\2\u01be\u01bf\7c\2\2\u01bf"+
		"P\3\2\2\2\u01c0\u01c1\7^\2\2\u01c1\u01c2\7m\2\2\u01c2\u01c3\7g\2\2\u01c3"+
		"\u01c4\7{\2\2\u01c4R\3\2\2\2\u01c5\u01c6\7^\2\2\u01c6\u01c7\7o\2\2\u01c7"+
		"\u01c8\7c\2\2\u01c8\u01c9\7t\2\2\u01c9\u01ca\7m\2\2\u01caT\3\2\2\2\u01cb"+
		"\u01ce\5W+\2\u01cc\u01ce\5Y,\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2"+
		"\u01ceV\3\2\2\2\u01cf\u01d0\7^\2\2\u01d0\u01d1\7o\2\2\u01d1\u01d2\7c\2"+
		"\2\u01d2\u01d3\7l\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7t\2\2\u01d5X\3\2"+
		"\2\2\u01d6\u01d7\7^\2\2\u01d7\u01d8\7o\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da"+
		"\7p\2\2\u01da\u01db\7q\2\2\u01db\u01dc\7t\2\2\u01dcZ\3\2\2\2\u01dd\u01de"+
		"\7^\2\2\u01de\u01df\7t\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1\7n\2\2\u01e1"+
		"\u01e2\7c\2\2\u01e2\u01e3\7v\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7x\2\2"+
		"\u01e5\u01e6\7g\2\2\u01e6\\\3\2\2\2\u01e7\u01e8\7^\2\2\u01e8\u01e9\7v"+
		"\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb\7o\2\2\u01eb\u01ec\7r\2\2\u01ec\u01ed"+
		"\7q\2\2\u01ed^\3\2\2\2\u01ee\u01ef\7^\2\2\u01ef\u01f0\7v\2\2\u01f0\u01f1"+
		"\7k\2\2\u01f1\u01f2\7o\2\2\u01f2\u01f3\7g\2\2\u01f3`\3\2\2\2\u01f4\u01f5"+
		"\t\7\2\2\u01f5b\3\2\2\2\u01f6\u01fc\7u\2\2\u01f7\u01f8\7k\2\2\u01f8\u01fc"+
		"\7u\2\2\u01f9\u01fa\7g\2\2\u01fa\u01fc\7u\2\2\u01fb\u01f6\3\2\2\2\u01fb"+
		"\u01f7\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fcd\3\2\2\2\u01fd\u01fe\t\b\2\2"+
		"\u01fef\3\2\2\2\u01ff\u0200\7%\2\2\u0200\u0201\3\2\2\2\u0201\u0202\b\63"+
		"\5\2\u0202h\3\2\2\2\u0203\u0204\b\64\6\2\u0204\u0205\7}\2\2\u0205\u0206"+
		"\3\2\2\2\u0206\u0207\b\64\7\2\u0207j\3\2\2\2\u0208\u0209\7\177\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\b\65\b\2\u020bl\3\2\2\2\u020c\u020d\b\66\t"+
		"\2\u020d\u020e\7>\2\2\u020e\u020f\3\2\2\2\u020f\u0210\b\66\n\2\u0210n"+
		"\3\2\2\2\u0211\u0212\7@\2\2\u0212\u0213\3\2\2\2\u0213\u0214\b\67\13\2"+
		"\u0214p\3\2\2\2\u0215\u0216\7?\2\2\u0216\u0217\3\2\2\2\u0217\u0218\b8"+
		"\f\2\u0218r\3\2\2\2\u0219\u021a\7\60\2\2\u021a\u021b\3\2\2\2\u021b\u021c"+
		"\b9\r\2\u021ct\3\2\2\2\u021d\u021e\7^\2\2\u021e\u021f\3\2\2\2\u021f\u0220"+
		"\b:\16\2\u0220v\3\2\2\2\u0221\u0222\7\61\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\b;\17\2\u0224x\3\2\2\2\u0225\u0227\t\3\2\2\u0226\u0225\3\2\2\2"+
		"\u0227\u0228\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022b\b<\20\2\u022bz\3\2\2\2\u022c\u022e\7$\2\2\u022d\u022f"+
		"\5\63\31\2\u022e\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u022e\3\2\2\2"+
		"\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\7$\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0235\b=\21\2\u0235|\3\2\2\2\u0236\u0237\7\'\2\2\u0237"+
		"\u0238\7}\2\2\u0238\u023c\3\2\2\2\u0239\u023b\13\2\2\2\u023a\u0239\3\2"+
		"\2\2\u023b\u023e\3\2\2\2\u023c\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d"+
		"\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\7\'\2\2\u0240\u0241\7\177"+
		"\2\2\u0241\u0242\3\2\2\2\u0242\u0243\b>\3\2\u0243~\3\2\2\2\u0244\u0248"+
		"\7\'\2\2\u0245\u0247\13\2\2\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2\2\2"+
		"\u0248\u0249\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0248"+
		"\3\2\2\2\u024b\u024c\5;\35\2\u024c\u024d\3\2\2\2\u024d\u024e\b?\3\2\u024e"+
		"\u0080\3\2\2\2\u024f\u0251\t\6\2\2\u0250\u024f\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0255\b@\3\2\u0255\u0082\3\2\2\2\u0256\u0257\5\u0099L\2\u0257\u0258\5"+
		"\u0099L\2\u0258\u0084\3\2\2\2\u0259\u025a\5\u008bE\2\u025a\u025b\3\2\2"+
		"\2\u025b\u025c\bB\2\2\u025c\u0086\3\2\2\2\u025d\u025e\5\u0091H\2\u025e"+
		"\u025f\5\u0091H\2\u025f\u0260\3\2\2\2\u0260\u0261\bC\4\2\u0261\u0088\3"+
		"\2\2\2\u0262\u0263\7%\2\2\u0263\u0264\3\2\2\2\u0264\u0265\bD\5\2\u0265"+
		"\u008a\3\2\2\2\u0266\u0267\bE\22\2\u0267\u0268\7}\2\2\u0268\u0269\3\2"+
		"\2\2\u0269\u026a\bE\7\2\u026a\u008c\3\2\2\2\u026b\u026c\7\177\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u026e\bF\b\2\u026e\u008e\3\2\2\2\u026f\u0270\bG\23"+
		"\2\u0270\u0271\7>\2\2\u0271\u0272\3\2\2\2\u0272\u0273\bG\n\2\u0273\u0090"+
		"\3\2\2\2\u0274\u0275\7@\2\2\u0275\u0276\3\2\2\2\u0276\u0277\bH\13\2\u0277"+
		"\u0092\3\2\2\2\u0278\u0279\7?\2\2\u0279\u027a\3\2\2\2\u027a\u027b\bI\f"+
		"\2\u027b\u0094\3\2\2\2\u027c\u027d\7\60\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u027f\bJ\r\2\u027f\u0096\3\2\2\2\u0280\u0281\7^\2\2\u0281\u0282\3\2\2"+
		"\2\u0282\u0283\bK\16\2\u0283\u0098\3\2\2\2\u0284\u0285\7\61\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0287\bL\17\2\u0287\u009a\3\2\2\2\u0288\u028a\t\3"+
		"\2\2\u0289\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0289\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\bM\20\2\u028e\u009c\3\2"+
		"\2\2\u028f\u0291\7$\2\2\u0290\u0292\5\63\31\2\u0291\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0296\7$\2\2\u0296\u0297\3\2\2\2\u0297\u0298\bN\21\2\u0298"+
		"\u009e\3\2\2\2\u0299\u029a\7\'\2\2\u029a\u029b\7}\2\2\u029b\u029f\3\2"+
		"\2\2\u029c\u029e\13\2\2\2\u029d\u029c\3\2\2\2\u029e\u02a1\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u029f\3\2"+
		"\2\2\u02a2\u02a3\7\'\2\2\u02a3\u02a4\7\177\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a6\bO\3\2\u02a6\u00a0\3\2\2\2\u02a7\u02ab\7\'\2\2\u02a8\u02aa\13\2"+
		"\2\2\u02a9\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ab"+
		"\u02a9\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\5;"+
		"\35\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\bP\3\2\u02b1\u00a2\3\2\2\2\u02b2"+
		"\u02b4\t\6\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\bQ\3\2\u02b8"+
		"\u00a4\3\2\2\2&\2\3\4\u00c1\u00d3\u0104\u010e\u0115\u0117\u011d\u0124"+
		"\u0126\u013f\u014b\u0157\u0161\u0175\u017f\u0183\u0189\u018e\u0193\u0195"+
		"\u019f\u01cd\u01fb\u0228\u0230\u023c\u0248\u0252\u028b\u0293\u029f\u02ab"+
		"\u02b5\24\7\3\2\b\2\2\6\2\2\t\20\2\3\64\2\t\21\2\t\22\2\3\66\3\t\23\2"+
		"\t\24\2\t\25\2\t\26\2\t\27\2\t\30\2\t\31\2\t\16\2\3E\4\3G\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}