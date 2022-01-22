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
		STAFF_CTX=1, STAFFGROUP_CTX=2, VOICE_CTX=3, HEADER_KW=4, LAYOUT_KW=5, 
		SCORE_KW=6, WITH_KW=7, VERSION_KW=8, SCHEME_GP=9, SCHEME_ATOM=10, BAR_KW=11, 
		CLEF_KW=12, DEFAULT_KW=13, FERMATA_KW=14, KEY_KW=15, MARK_KW=16, MODE_KW=17, 
		MODE_MAJ=18, MODE_MIN=19, RELATIVE_KW=20, TEMPO_KW=21, TIME_KW=22, KW=23, 
		NOTE=24, TIME_SIG=25, OCTAVE=26, BARLINE=27, ID=28, STRING=29, VERSION_STR=30, 
		HASH=31, LBRACE=32, RBRACE=33, LANGLE=34, RANGLE=35, EQUALS=36, DOT=37, 
		SLASH=38, INTEGER=39, COMMENT_MULTILINE=40, COMMENT_INLINE=41, WS=42, 
		ALL=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STAFF_CTX", "STAFFGROUP_CTX", "VOICE_CTX", "HEADER_KW", "LAYOUT_KW", 
			"SCORE_KW", "WITH_KW", "VERSION_KW", "SCHEME_GP", "SCHEME_ATOM", "BAR_KW", 
			"CLEF_KW", "DEFAULT_KW", "FERMATA_KW", "KEY_KW", "MARK_KW", "MODE_KW", 
			"MODE_MAJ", "MODE_MIN", "RELATIVE_KW", "TEMPO_KW", "TIME_KW", "KW", "NOTE", 
			"TIME_SIG", "OCTAVE", "BARLINE", "ID", "STRING", "VERSION_STR", "HASH", 
			"LBRACE", "RBRACE", "LANGLE", "RANGLE", "EQUALS", "DOT", "SLASH", "INTEGER", 
			"STRING_CHAR", "ID_CHAR", "DIGIT", "BAR_CHAR", "COMMENT_MULTILINE", "COMMENT_INLINE", 
			"WS", "ALL"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0195\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7"+
		"\n\u00b1\n\n\f\n\16\n\u00b4\13\n\3\n\3\n\3\13\3\13\3\13\7\13\u00bb\n\13"+
		"\f\13\16\13\u00be\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\5\22\u00ec\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\6\30\u0115\n\30\r\30\16\30\u0116\3\31\3\31\5"+
		"\31\u011b\n\31\3\31\3\31\3\31\3\31\5\31\u0121\n\31\3\32\3\32\3\32\3\32"+
		"\3\33\6\33\u0128\n\33\r\33\16\33\u0129\3\33\6\33\u012d\n\33\r\33\16\33"+
		"\u012e\5\33\u0131\n\33\3\34\3\34\6\34\u0135\n\34\r\34\16\34\u0136\3\34"+
		"\3\34\3\35\3\35\6\35\u013d\n\35\r\35\16\35\u013e\3\36\3\36\6\36\u0143"+
		"\n\36\r\36\16\36\u0144\3\36\3\36\3\37\3\37\3\37\6\37\u014c\n\37\r\37\16"+
		"\37\u014d\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\6(\u0163\n(\r(\16(\u0164\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\7-"+
		"\u0173\n-\f-\16-\u0176\13-\3-\3-\3-\3-\3-\3.\3.\7.\u017f\n.\f.\16.\u0182"+
		"\13.\3.\3.\3.\3.\3/\6/\u0189\n/\r/\16/\u018a\3/\3/\3\60\6\60\u0190\n\60"+
		"\r\60\16\60\u0191\3\60\3\60\7\u00b2\u00bc\u0174\u0180\u0191\2\61\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q\2S\2U\2W\2Y*[+],_-\3\2\b\3\2**\7\2\"\"..\60\60C\\"+
		"c|\4\2C\\c|\3\2\62;\b\2##\60\60==]]__~~\5\2\13\f\17\17\"\"\2\u01a5\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5l\3\2\2\2\7|\3\2\2\2\t\u0087\3\2\2\2\13"+
		"\u008f\3\2\2\2\r\u0097\3\2\2\2\17\u009e\3\2\2\2\21\u00a4\3\2\2\2\23\u00ad"+
		"\3\2\2\2\25\u00b7\3\2\2\2\27\u00c1\3\2\2\2\31\u00c6\3\2\2\2\33\u00cc\3"+
		"\2\2\2\35\u00d5\3\2\2\2\37\u00de\3\2\2\2!\u00e3\3\2\2\2#\u00eb\3\2\2\2"+
		"%\u00ed\3\2\2\2\'\u00f4\3\2\2\2)\u00fb\3\2\2\2+\u0105\3\2\2\2-\u010c\3"+
		"\2\2\2/\u0112\3\2\2\2\61\u0118\3\2\2\2\63\u0122\3\2\2\2\65\u0130\3\2\2"+
		"\2\67\u0132\3\2\2\29\u013c\3\2\2\2;\u0140\3\2\2\2=\u0148\3\2\2\2?\u0151"+
		"\3\2\2\2A\u0153\3\2\2\2C\u0155\3\2\2\2E\u0157\3\2\2\2G\u0159\3\2\2\2I"+
		"\u015b\3\2\2\2K\u015d\3\2\2\2M\u015f\3\2\2\2O\u0162\3\2\2\2Q\u0166\3\2"+
		"\2\2S\u0168\3\2\2\2U\u016a\3\2\2\2W\u016c\3\2\2\2Y\u016e\3\2\2\2[\u017c"+
		"\3\2\2\2]\u0188\3\2\2\2_\u018f\3\2\2\2ab\7^\2\2bc\7p\2\2cd\7g\2\2de\7"+
		"y\2\2ef\7\"\2\2fg\7U\2\2gh\7v\2\2hi\7c\2\2ij\7h\2\2jk\7h\2\2k\4\3\2\2"+
		"\2lm\7^\2\2mn\7p\2\2no\7g\2\2op\7y\2\2pq\7\"\2\2qr\7U\2\2rs\7v\2\2st\7"+
		"c\2\2tu\7h\2\2uv\7h\2\2vw\7I\2\2wx\7t\2\2xy\7q\2\2yz\7w\2\2z{\7r\2\2{"+
		"\6\3\2\2\2|}\7^\2\2}~\7p\2\2~\177\7g\2\2\177\u0080\7y\2\2\u0080\u0081"+
		"\7\"\2\2\u0081\u0082\7X\2\2\u0082\u0083\7q\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7e\2\2\u0085\u0086\7g\2\2\u0086\b\3\2\2\2\u0087\u0088\7^\2\2\u0088"+
		"\u0089\7j\2\2\u0089\u008a\7g\2\2\u008a\u008b\7c\2\2\u008b\u008c\7f\2\2"+
		"\u008c\u008d\7g\2\2\u008d\u008e\7t\2\2\u008e\n\3\2\2\2\u008f\u0090\7^"+
		"\2\2\u0090\u0091\7n\2\2\u0091\u0092\7c\2\2\u0092\u0093\7{\2\2\u0093\u0094"+
		"\7q\2\2\u0094\u0095\7w\2\2\u0095\u0096\7v\2\2\u0096\f\3\2\2\2\u0097\u0098"+
		"\7^\2\2\u0098\u0099\7u\2\2\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b"+
		"\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d\16\3\2\2\2\u009e\u009f\7^\2\2\u009f"+
		"\u00a0\7y\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7j\2\2"+
		"\u00a3\20\3\2\2\2\u00a4\u00a5\7^\2\2\u00a5\u00a6\7x\2\2\u00a6\u00a7\7"+
		"g\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7p\2\2\u00ac\22\3\2\2\2\u00ad\u00ae\5? \2\u00ae\u00b2"+
		"\7*\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b6\7+\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\5? \2\u00b8\u00bc"+
		"\n\2\2\2\u00b9\u00bb\13\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00bf\u00c0\5]/\2\u00c0\26\3\2\2\2\u00c1\u00c2\7^\2\2\u00c2\u00c3"+
		"\7d\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7t\2\2\u00c5\30\3\2\2\2\u00c6\u00c7"+
		"\7^\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7h\2\2\u00cb\32\3\2\2\2\u00cc\u00cd\7^\2\2\u00cd\u00ce\7f\2\2\u00ce"+
		"\u00cf\7g\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7w\2\2"+
		"\u00d2\u00d3\7n\2\2\u00d3\u00d4\7v\2\2\u00d4\34\3\2\2\2\u00d5\u00d6\7"+
		"^\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da"+
		"\7o\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7c\2\2\u00dd"+
		"\36\3\2\2\2\u00de\u00df\7^\2\2\u00df\u00e0\7m\2\2\u00e0\u00e1\7g\2\2\u00e1"+
		"\u00e2\7{\2\2\u00e2 \3\2\2\2\u00e3\u00e4\7^\2\2\u00e4\u00e5\7o\2\2\u00e5"+
		"\u00e6\7c\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7m\2\2\u00e8\"\3\2\2\2\u00e9"+
		"\u00ec\5%\23\2\u00ea\u00ec\5\'\24\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3"+
		"\2\2\2\u00ec$\3\2\2\2\u00ed\u00ee\7^\2\2\u00ee\u00ef\7o\2\2\u00ef\u00f0"+
		"\7c\2\2\u00f0\u00f1\7l\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7t\2\2\u00f3"+
		"&\3\2\2\2\u00f4\u00f5\7^\2\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7k\2\2\u00f7"+
		"\u00f8\7p\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7t\2\2\u00fa(\3\2\2\2\u00fb"+
		"\u00fc\7^\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7n\2\2"+
		"\u00ff\u0100\7c\2\2\u0100\u0101\7v\2\2\u0101\u0102\7k\2\2\u0102\u0103"+
		"\7x\2\2\u0103\u0104\7g\2\2\u0104*\3\2\2\2\u0105\u0106\7^\2\2\u0106\u0107"+
		"\7v\2\2\u0107\u0108\7g\2\2\u0108\u0109\7o\2\2\u0109\u010a\7r\2\2\u010a"+
		"\u010b\7q\2\2\u010b,\3\2\2\2\u010c\u010d\7^\2\2\u010d\u010e\7v\2\2\u010e"+
		"\u010f\7k\2\2\u010f\u0110\7o\2\2\u0110\u0111\7g\2\2\u0111.\3\2\2\2\u0112"+
		"\u0114\5M\'\2\u0113\u0115\5S*\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2"+
		"\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\60\3\2\2\2\u0118\u011a"+
		"\5S*\2\u0119\u011b\5\65\33\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u0120\3\2\2\2\u011c\u0121\5O(\2\u011d\u011e\5O(\2\u011e\u011f\7\60\2"+
		"\2\u011f\u0121\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\62\3\2\2\2\u0122\u0123\5O(\2\u0123\u0124\7\61\2\2\u0124"+
		"\u0125\5O(\2\u0125\64\3\2\2\2\u0126\u0128\7)\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0131\3\2"+
		"\2\2\u012b\u012d\7.\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0127\3\2"+
		"\2\2\u0130\u012c\3\2\2\2\u0131\66\3\2\2\2\u0132\u0134\7$\2\2\u0133\u0135"+
		"\5W,\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7$\2\2\u01398\3\2\2\2\u013a"+
		"\u013d\5S*\2\u013b\u013d\4\60\61\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		":\3\2\2\2\u0140\u0142\7$\2\2\u0141\u0143\5Q)\2\u0142\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0147\7$\2\2\u0147<\3\2\2\2\u0148\u014b\7$\2\2\u0149\u014c"+
		"\5O(\2\u014a\u014c\7\60\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0150\7$\2\2\u0150>\3\2\2\2\u0151\u0152\7%\2\2\u0152@\3\2\2"+
		"\2\u0153\u0154\7}\2\2\u0154B\3\2\2\2\u0155\u0156\7\177\2\2\u0156D\3\2"+
		"\2\2\u0157\u0158\7>\2\2\u0158F\3\2\2\2\u0159\u015a\7@\2\2\u015aH\3\2\2"+
		"\2\u015b\u015c\7?\2\2\u015cJ\3\2\2\2\u015d\u015e\7\60\2\2\u015eL\3\2\2"+
		"\2\u015f\u0160\7^\2\2\u0160N\3\2\2\2\u0161\u0163\5U+\2\u0162\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"P\3\2\2\2\u0166\u0167\t\3\2\2\u0167R\3\2\2\2\u0168\u0169\t\4\2\2\u0169"+
		"T\3\2\2\2\u016a\u016b\t\5\2\2\u016bV\3\2\2\2\u016c\u016d\t\6\2\2\u016d"+
		"X\3\2\2\2\u016e\u016f\7\'\2\2\u016f\u0170\7}\2\2\u0170\u0174\3\2\2\2\u0171"+
		"\u0173\13\2\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0175\3"+
		"\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\7\'\2\2\u0178\u0179\7\177\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b"+
		"-\2\2\u017bZ\3\2\2\2\u017c\u0180\7\'\2\2\u017d\u017f\13\2\2\2\u017e\u017d"+
		"\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\5]/\2\u0184\u0185\3\2\2"+
		"\2\u0185\u0186\b.\2\2\u0186\\\3\2\2\2\u0187\u0189\t\7\2\2\u0188\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\b/\2\2\u018d^\3\2\2\2\u018e\u0190\13\2\2\2"+
		"\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\b\60\2\2\u0194`\3\2\2\2\27\2"+
		"\u00b2\u00bc\u00eb\u0116\u011a\u0120\u0129\u012e\u0130\u0136\u013c\u013e"+
		"\u0144\u014b\u014d\u0164\u0174\u0180\u018a\u0191\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}