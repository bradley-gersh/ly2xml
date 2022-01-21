// Generated from Lilypond.g4 by ANTLR 4.9.3
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "STAFF_CTX", "STAFFGROUP_CTX", "VOICE_CTX", 
			"BOOK_KW", "HEADER_KW", "LAYOUT_KW", "SCORE_KW", "WITH_KW", "VERSION_KW", 
			"SCHEME_GP", "SCHEME_ATOM", "BAR_KW", "CLEF_KW", "DEFAULT_KW", "FERMATA_KW", 
			"KEY_KW", "MARK_KW", "MODE_KW", "MODE_MAJ", "MODE_MIN", "RELATIVE_KW", 
			"TEMPO_KW", "TIME_KW", "KW", "NOTE", "TIME_SIG", "TEMPO_EQN", "OCTAVE", 
			"BARLINE", "ID", "STRING", "VERSION_STR", "HASH", "LBRACE", "RBRACE", 
			"SLASH", "INTEGER", "STRING_CHAR", "ID_CHAR", "DIGIT", "BAR_CHAR", "COMMENT_MULTILINE", 
			"COMMENT_INLINE", "WS", "ALL"
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


	public LilypondLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lilypond.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01a6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00c6\n\17\f\17\16\17\u00c9\13"+
		"\17\3\17\3\17\3\20\3\20\3\20\7\20\u00d0\n\20\f\20\16\20\u00d3\13\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\5\27\u0101\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\6\35\u012a\n\35\r\35\16\35\u012b\3\36\3\36\5\36\u0130\n\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0136\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		"!\6!\u0141\n!\r!\16!\u0142\3!\6!\u0146\n!\r!\16!\u0147\5!\u014a\n!\3\""+
		"\3\"\6\"\u014e\n\"\r\"\16\"\u014f\3\"\3\"\3#\3#\6#\u0156\n#\r#\16#\u0157"+
		"\3$\3$\6$\u015c\n$\r$\16$\u015d\3$\3$\3%\3%\3%\6%\u0165\n%\r%\16%\u0166"+
		"\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\6*\u0174\n*\r*\16*\u0175\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3/\3/\7/\u0184\n/\f/\16/\u0187\13/\3/\3/\3/\3/\3"+
		"/\3\60\3\60\7\60\u0190\n\60\f\60\16\60\u0193\13\60\3\60\3\60\3\60\3\60"+
		"\3\61\6\61\u019a\n\61\r\61\16\61\u019b\3\61\3\61\3\62\6\62\u01a1\n\62"+
		"\r\62\16\62\u01a2\3\62\3\62\7\u00c7\u00d1\u0185\u0191\u01a2\2\63\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U\2W\2Y\2[\2],_-a.c/\3\2\b\3\2**\7\2\"\"..\60\60"+
		"C\\c|\4\2C\\c|\3\2\62;\b\2##\60\60==]]__~~\5\2\13\f\17\17\"\"\2\u01b6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5h\3\2\2\2\7k\3"+
		"\2\2\2\tn\3\2\2\2\13p\3\2\2\2\r{\3\2\2\2\17\u008b\3\2\2\2\21\u0096\3\2"+
		"\2\2\23\u009c\3\2\2\2\25\u00a4\3\2\2\2\27\u00ac\3\2\2\2\31\u00b3\3\2\2"+
		"\2\33\u00b9\3\2\2\2\35\u00c2\3\2\2\2\37\u00cc\3\2\2\2!\u00d6\3\2\2\2#"+
		"\u00db\3\2\2\2%\u00e1\3\2\2\2\'\u00ea\3\2\2\2)\u00f3\3\2\2\2+\u00f8\3"+
		"\2\2\2-\u0100\3\2\2\2/\u0102\3\2\2\2\61\u0109\3\2\2\2\63\u0110\3\2\2\2"+
		"\65\u011a\3\2\2\2\67\u0121\3\2\2\29\u0127\3\2\2\2;\u012d\3\2\2\2=\u0137"+
		"\3\2\2\2?\u013b\3\2\2\2A\u0149\3\2\2\2C\u014b\3\2\2\2E\u0155\3\2\2\2G"+
		"\u0159\3\2\2\2I\u0161\3\2\2\2K\u016a\3\2\2\2M\u016c\3\2\2\2O\u016e\3\2"+
		"\2\2Q\u0170\3\2\2\2S\u0173\3\2\2\2U\u0177\3\2\2\2W\u0179\3\2\2\2Y\u017b"+
		"\3\2\2\2[\u017d\3\2\2\2]\u017f\3\2\2\2_\u018d\3\2\2\2a\u0199\3\2\2\2c"+
		"\u01a0\3\2\2\2ef\7>\2\2fg\7>\2\2g\4\3\2\2\2hi\7@\2\2ij\7@\2\2j\6\3\2\2"+
		"\2kl\7^\2\2lm\7^\2\2m\b\3\2\2\2no\7?\2\2o\n\3\2\2\2pq\7^\2\2qr\7p\2\2"+
		"rs\7g\2\2st\7y\2\2tu\7\"\2\2uv\7U\2\2vw\7v\2\2wx\7c\2\2xy\7h\2\2yz\7h"+
		"\2\2z\f\3\2\2\2{|\7^\2\2|}\7p\2\2}~\7g\2\2~\177\7y\2\2\177\u0080\7\"\2"+
		"\2\u0080\u0081\7U\2\2\u0081\u0082\7v\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7h\2\2\u0084\u0085\7h\2\2\u0085\u0086\7I\2\2\u0086\u0087\7t\2\2\u0087"+
		"\u0088\7q\2\2\u0088\u0089\7w\2\2\u0089\u008a\7r\2\2\u008a\16\3\2\2\2\u008b"+
		"\u008c\7^\2\2\u008c\u008d\7p\2\2\u008d\u008e\7g\2\2\u008e\u008f\7y\2\2"+
		"\u008f\u0090\7\"\2\2\u0090\u0091\7X\2\2\u0091\u0092\7q\2\2\u0092\u0093"+
		"\7k\2\2\u0093\u0094\7e\2\2\u0094\u0095\7g\2\2\u0095\20\3\2\2\2\u0096\u0097"+
		"\7^\2\2\u0097\u0098\7d\2\2\u0098\u0099\7q\2\2\u0099\u009a\7q\2\2\u009a"+
		"\u009b\7m\2\2\u009b\22\3\2\2\2\u009c\u009d\7^\2\2\u009d\u009e\7j\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7g\2\2"+
		"\u00a2\u00a3\7t\2\2\u00a3\24\3\2\2\2\u00a4\u00a5\7^\2\2\u00a5\u00a6\7"+
		"n\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7{\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa"+
		"\7w\2\2\u00aa\u00ab\7v\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7^\2\2\u00ad\u00ae"+
		"\7u\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7t\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b5\7y\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7j\2\2\u00b8\32\3\2\2\2\u00b9"+
		"\u00ba\7^\2\2\u00ba\u00bb\7x\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7t\2\2"+
		"\u00bd\u00be\7u\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1"+
		"\7p\2\2\u00c1\34\3\2\2\2\u00c2\u00c3\5K&\2\u00c3\u00c7\7*\2\2\u00c4\u00c6"+
		"\13\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb"+
		"\7+\2\2\u00cb\36\3\2\2\2\u00cc\u00cd\5K&\2\u00cd\u00d1\n\2\2\2\u00ce\u00d0"+
		"\13\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5"+
		"\5a\61\2\u00d5 \3\2\2\2\u00d6\u00d7\7^\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9"+
		"\7c\2\2\u00d9\u00da\7t\2\2\u00da\"\3\2\2\2\u00db\u00dc\7^\2\2\u00dc\u00dd"+
		"\7e\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7h\2\2\u00e0"+
		"$\3\2\2\2\u00e1\u00e2\7^\2\2\u00e2\u00e3\7f\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\u00e5\7h\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7n\2\2"+
		"\u00e8\u00e9\7v\2\2\u00e9&\3\2\2\2\u00ea\u00eb\7^\2\2\u00eb\u00ec\7h\2"+
		"\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7o\2\2\u00ef\u00f0"+
		"\7c\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7c\2\2\u00f2(\3\2\2\2\u00f3\u00f4"+
		"\7^\2\2\u00f4\u00f5\7m\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7{\2\2\u00f7"+
		"*\3\2\2\2\u00f8\u00f9\7^\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7c\2\2\u00fb"+
		"\u00fc\7t\2\2\u00fc\u00fd\7m\2\2\u00fd,\3\2\2\2\u00fe\u0101\5/\30\2\u00ff"+
		"\u0101\5\61\31\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101.\3\2\2"+
		"\2\u0102\u0103\7^\2\2\u0103\u0104\7o\2\2\u0104\u0105\7c\2\2\u0105\u0106"+
		"\7l\2\2\u0106\u0107\7q\2\2\u0107\u0108\7t\2\2\u0108\60\3\2\2\2\u0109\u010a"+
		"\7^\2\2\u010a\u010b\7o\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2\2\u010d"+
		"\u010e\7q\2\2\u010e\u010f\7t\2\2\u010f\62\3\2\2\2\u0110\u0111\7^\2\2\u0111"+
		"\u0112\7t\2\2\u0112\u0113\7g\2\2\u0113\u0114\7n\2\2\u0114\u0115\7c\2\2"+
		"\u0115\u0116\7v\2\2\u0116\u0117\7k\2\2\u0117\u0118\7x\2\2\u0118\u0119"+
		"\7g\2\2\u0119\64\3\2\2\2\u011a\u011b\7^\2\2\u011b\u011c\7v\2\2\u011c\u011d"+
		"\7g\2\2\u011d\u011e\7o\2\2\u011e\u011f\7r\2\2\u011f\u0120\7q\2\2\u0120"+
		"\66\3\2\2\2\u0121\u0122\7^\2\2\u0122\u0123\7v\2\2\u0123\u0124\7k\2\2\u0124"+
		"\u0125\7o\2\2\u0125\u0126\7g\2\2\u01268\3\2\2\2\u0127\u0129\5Q)\2\u0128"+
		"\u012a\5W,\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2"+
		"\2\u012b\u012c\3\2\2\2\u012c:\3\2\2\2\u012d\u012f\5W,\2\u012e\u0130\5"+
		"A!\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0135\3\2\2\2\u0131"+
		"\u0136\5S*\2\u0132\u0133\5S*\2\u0133\u0134\7\60\2\2\u0134\u0136\3\2\2"+
		"\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0135\u0136\3\2\2\2\u0136<"+
		"\3\2\2\2\u0137\u0138\5S*\2\u0138\u0139\7\61\2\2\u0139\u013a\5S*\2\u013a"+
		">\3\2\2\2\u013b\u013c\5S*\2\u013c\u013d\7?\2\2\u013d\u013e\5S*\2\u013e"+
		"@\3\2\2\2\u013f\u0141\7)\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u014a\3\2\2\2\u0144\u0146\7."+
		"\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0140\3\2\2\2\u0149\u0145\3\2"+
		"\2\2\u014aB\3\2\2\2\u014b\u014d\7$\2\2\u014c\u014e\5[.\2\u014d\u014c\3"+
		"\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\7$\2\2\u0152D\3\2\2\2\u0153\u0156\5W,\2\u0154"+
		"\u0156\4\60\61\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3"+
		"\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158F\3\2\2\2\u0159\u015b"+
		"\7$\2\2\u015a\u015c\5U+\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7$"+
		"\2\2\u0160H\3\2\2\2\u0161\u0164\7$\2\2\u0162\u0165\5S*\2\u0163\u0165\7"+
		"\60\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\7$"+
		"\2\2\u0169J\3\2\2\2\u016a\u016b\7%\2\2\u016bL\3\2\2\2\u016c\u016d\7}\2"+
		"\2\u016dN\3\2\2\2\u016e\u016f\7\177\2\2\u016fP\3\2\2\2\u0170\u0171\7^"+
		"\2\2\u0171R\3\2\2\2\u0172\u0174\5Y-\2\u0173\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176T\3\2\2\2\u0177"+
		"\u0178\t\3\2\2\u0178V\3\2\2\2\u0179\u017a\t\4\2\2\u017aX\3\2\2\2\u017b"+
		"\u017c\t\5\2\2\u017cZ\3\2\2\2\u017d\u017e\t\6\2\2\u017e\\\3\2\2\2\u017f"+
		"\u0180\7\'\2\2\u0180\u0181\7}\2\2\u0181\u0185\3\2\2\2\u0182\u0184\13\2"+
		"\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0186\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7\'"+
		"\2\2\u0189\u018a\7\177\2\2\u018a\u018b\3\2\2\2\u018b\u018c\b/\2\2\u018c"+
		"^\3\2\2\2\u018d\u0191\7\'\2\2\u018e\u0190\13\2\2\2\u018f\u018e\3\2\2\2"+
		"\u0190\u0193\3\2\2\2\u0191\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0194"+
		"\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\5a\61\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\b\60\2\2\u0197`\3\2\2\2\u0198\u019a\t\7\2\2\u0199\u0198\3\2\2\2"+
		"\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\u019e\b\61\2\2\u019eb\3\2\2\2\u019f\u01a1\13\2\2\2\u01a0"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\b\62\2\2\u01a5d\3\2\2\2\27\2\u00c7"+
		"\u00d1\u0100\u012b\u012f\u0135\u0142\u0147\u0149\u014f\u0155\u0157\u015d"+
		"\u0164\u0166\u0175\u0185\u0191\u019b\u01a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}