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
		T__0=1, T__1=2, T__2=3, STAFF_CTX=4, STAFFGROUP_CTX=5, VOICE_CTX=6, HEADER_KW=7, 
		LAYOUT_KW=8, SCORE_KW=9, WITH_KW=10, VERSION_KW=11, SCHEME_GP=12, SCHEME_ATOM=13, 
		BAR_KW=14, CLEF_KW=15, DEFAULT_KW=16, FERMATA_KW=17, KEY_KW=18, MARK_KW=19, 
		MODE_KW=20, MODE_MAJ=21, MODE_MIN=22, RELATIVE_KW=23, TEMPO_KW=24, TIME_KW=25, 
		KW=26, NOTE=27, TIME_SIG=28, OCTAVE=29, BARLINE=30, ID=31, STRING=32, 
		VERSION_STR=33, HASH=34, LBRACE=35, RBRACE=36, LANGLE=37, RANGLE=38, SLASH=39, 
		INTEGER=40, COMMENT_MULTILINE=41, COMMENT_INLINE=42, WS=43, ALL=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "STAFF_CTX", "STAFFGROUP_CTX", "VOICE_CTX", "HEADER_KW", 
			"LAYOUT_KW", "SCORE_KW", "WITH_KW", "VERSION_KW", "SCHEME_GP", "SCHEME_ATOM", 
			"BAR_KW", "CLEF_KW", "DEFAULT_KW", "FERMATA_KW", "KEY_KW", "MARK_KW", 
			"MODE_KW", "MODE_MAJ", "MODE_MIN", "RELATIVE_KW", "TEMPO_KW", "TIME_KW", 
			"KW", "NOTE", "TIME_SIG", "OCTAVE", "BARLINE", "ID", "STRING", "VERSION_STR", 
			"HASH", "LBRACE", "RBRACE", "LANGLE", "RANGLE", "SLASH", "INTEGER", "STRING_CHAR", 
			"ID_CHAR", "DIGIT", "BAR_CHAR", "COMMENT_MULTILINE", "COMMENT_INLINE", 
			"WS", "ALL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\\\'", "'.'", "'='", "'\\new Staff'", "'\\new StaffGroup'", 
			"'\\new Voice'", "'\\header'", "'\\layout'", "'\\score'", "'\\with'", 
			"'\\version'", null, null, "'\\bar'", "'\\clef'", "'\\default'", "'\\fermata'", 
			"'\\key'", "'\\mark'", null, "'\\major'", "'\\minor'", "'\\relative'", 
			"'\\tempo'", "'\\time'", null, null, null, null, null, null, null, null, 
			"'#'", "'{'", "'}'", "'<'", "'>'", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "STAFF_CTX", "STAFFGROUP_CTX", "VOICE_CTX", "HEADER_KW", 
			"LAYOUT_KW", "SCORE_KW", "WITH_KW", "VERSION_KW", "SCHEME_GP", "SCHEME_ATOM", 
			"BAR_KW", "CLEF_KW", "DEFAULT_KW", "FERMATA_KW", "KEY_KW", "MARK_KW", 
			"MODE_KW", "MODE_MAJ", "MODE_MIN", "RELATIVE_KW", "TEMPO_KW", "TIME_KW", 
			"KW", "NOTE", "TIME_SIG", "OCTAVE", "BARLINE", "ID", "STRING", "VERSION_STR", 
			"HASH", "LBRACE", "RBRACE", "LANGLE", "RANGLE", "SLASH", "INTEGER", "COMMENT_MULTILINE", 
			"COMMENT_INLINE", "WS", "ALL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u019a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\7\16\u00c4\n\16\f\16\16\16\u00c7\13\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\5\25\u00f5\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\6\33\u011e\n\33\r\33\16\33\u011f\3\34\3\34\5\34\u0124\n\34"+
		"\3\34\3\34\3\34\3\34\5\34\u012a\n\34\3\35\3\35\3\35\3\35\3\36\6\36\u0131"+
		"\n\36\r\36\16\36\u0132\3\36\6\36\u0136\n\36\r\36\16\36\u0137\5\36\u013a"+
		"\n\36\3\37\3\37\6\37\u013e\n\37\r\37\16\37\u013f\3\37\3\37\3 \3 \6 \u0146"+
		"\n \r \16 \u0147\3!\3!\6!\u014c\n!\r!\16!\u014d\3!\3!\3\"\3\"\3\"\6\""+
		"\u0155\n\"\r\"\16\"\u0156\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\6)\u0168\n)\r)\16)\u0169\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\7.\u0178"+
		"\n.\f.\16.\u017b\13.\3.\3.\3.\3.\3.\3/\3/\7/\u0184\n/\f/\16/\u0187\13"+
		"/\3/\3/\3/\3/\3\60\6\60\u018e\n\60\r\60\16\60\u018f\3\60\3\60\3\61\6\61"+
		"\u0195\n\61\r\61\16\61\u0196\3\61\3\61\7\u00bb\u00c5\u0179\u0185\u0196"+
		"\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2[+],_-a.\3\2\b\3\2**\7\2\"\"."+
		".\60\60C\\c|\4\2C\\c|\3\2\62;\b\2##\60\60==]]__~~\5\2\13\f\17\17\"\"\2"+
		"\u01aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5f\3\2\2\2\7h\3\2\2"+
		"\2\tj\3\2\2\2\13u\3\2\2\2\r\u0085\3\2\2\2\17\u0090\3\2\2\2\21\u0098\3"+
		"\2\2\2\23\u00a0\3\2\2\2\25\u00a7\3\2\2\2\27\u00ad\3\2\2\2\31\u00b6\3\2"+
		"\2\2\33\u00c0\3\2\2\2\35\u00ca\3\2\2\2\37\u00cf\3\2\2\2!\u00d5\3\2\2\2"+
		"#\u00de\3\2\2\2%\u00e7\3\2\2\2\'\u00ec\3\2\2\2)\u00f4\3\2\2\2+\u00f6\3"+
		"\2\2\2-\u00fd\3\2\2\2/\u0104\3\2\2\2\61\u010e\3\2\2\2\63\u0115\3\2\2\2"+
		"\65\u011b\3\2\2\2\67\u0121\3\2\2\29\u012b\3\2\2\2;\u0139\3\2\2\2=\u013b"+
		"\3\2\2\2?\u0145\3\2\2\2A\u0149\3\2\2\2C\u0151\3\2\2\2E\u015a\3\2\2\2G"+
		"\u015c\3\2\2\2I\u015e\3\2\2\2K\u0160\3\2\2\2M\u0162\3\2\2\2O\u0164\3\2"+
		"\2\2Q\u0167\3\2\2\2S\u016b\3\2\2\2U\u016d\3\2\2\2W\u016f\3\2\2\2Y\u0171"+
		"\3\2\2\2[\u0173\3\2\2\2]\u0181\3\2\2\2_\u018d\3\2\2\2a\u0194\3\2\2\2c"+
		"d\7^\2\2de\7^\2\2e\4\3\2\2\2fg\7\60\2\2g\6\3\2\2\2hi\7?\2\2i\b\3\2\2\2"+
		"jk\7^\2\2kl\7p\2\2lm\7g\2\2mn\7y\2\2no\7\"\2\2op\7U\2\2pq\7v\2\2qr\7c"+
		"\2\2rs\7h\2\2st\7h\2\2t\n\3\2\2\2uv\7^\2\2vw\7p\2\2wx\7g\2\2xy\7y\2\2"+
		"yz\7\"\2\2z{\7U\2\2{|\7v\2\2|}\7c\2\2}~\7h\2\2~\177\7h\2\2\177\u0080\7"+
		"I\2\2\u0080\u0081\7t\2\2\u0081\u0082\7q\2\2\u0082\u0083\7w\2\2\u0083\u0084"+
		"\7r\2\2\u0084\f\3\2\2\2\u0085\u0086\7^\2\2\u0086\u0087\7p\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7y\2\2\u0089\u008a\7\"\2\2\u008a\u008b\7X\2\2\u008b"+
		"\u008c\7q\2\2\u008c\u008d\7k\2\2\u008d\u008e\7e\2\2\u008e\u008f\7g\2\2"+
		"\u008f\16\3\2\2\2\u0090\u0091\7^\2\2\u0091\u0092\7j\2\2\u0092\u0093\7"+
		"g\2\2\u0093\u0094\7c\2\2\u0094\u0095\7f\2\2\u0095\u0096\7g\2\2\u0096\u0097"+
		"\7t\2\2\u0097\20\3\2\2\2\u0098\u0099\7^\2\2\u0099\u009a\7n\2\2\u009a\u009b"+
		"\7c\2\2\u009b\u009c\7{\2\2\u009c\u009d\7q\2\2\u009d\u009e\7w\2\2\u009e"+
		"\u009f\7v\2\2\u009f\22\3\2\2\2\u00a0\u00a1\7^\2\2\u00a1\u00a2\7u\2\2\u00a2"+
		"\u00a3\7e\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6\24\3\2\2\2\u00a7\u00a8\7^\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7"+
		"k\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7j\2\2\u00ac\26\3\2\2\2\u00ad\u00ae"+
		"\7^\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7t\2\2\u00b1"+
		"\u00b2\7u\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7p\2\2"+
		"\u00b5\30\3\2\2\2\u00b6\u00b7\5E#\2\u00b7\u00bb\7*\2\2\u00b8\u00ba\13"+
		"\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7+"+
		"\2\2\u00bf\32\3\2\2\2\u00c0\u00c1\5E#\2\u00c1\u00c5\n\2\2\2\u00c2\u00c4"+
		"\13\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9"+
		"\5_\60\2\u00c9\34\3\2\2\2\u00ca\u00cb\7^\2\2\u00cb\u00cc\7d\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7t\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\7^\2\2\u00d0"+
		"\u00d1\7e\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7h\2\2"+
		"\u00d4 \3\2\2\2\u00d5\u00d6\7^\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8\7g\2"+
		"\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7w\2\2\u00db\u00dc"+
		"\7n\2\2\u00dc\u00dd\7v\2\2\u00dd\"\3\2\2\2\u00de\u00df\7^\2\2\u00df\u00e0"+
		"\7h\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7o\2\2\u00e3"+
		"\u00e4\7c\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7c\2\2\u00e6$\3\2\2\2\u00e7"+
		"\u00e8\7^\2\2\u00e8\u00e9\7m\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7{\2\2"+
		"\u00eb&\3\2\2\2\u00ec\u00ed\7^\2\2\u00ed\u00ee\7o\2\2\u00ee\u00ef\7c\2"+
		"\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7m\2\2\u00f1(\3\2\2\2\u00f2\u00f5\5"+
		"+\26\2\u00f3\u00f5\5-\27\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"*\3\2\2\2\u00f6\u00f7\7^\2\2\u00f7\u00f8\7o\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7l\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7t\2\2\u00fc,\3\2\2\2\u00fd"+
		"\u00fe\7^\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7p\2\2"+
		"\u0101\u0102\7q\2\2\u0102\u0103\7t\2\2\u0103.\3\2\2\2\u0104\u0105\7^\2"+
		"\2\u0105\u0106\7t\2\2\u0106\u0107\7g\2\2\u0107\u0108\7n\2\2\u0108\u0109"+
		"\7c\2\2\u0109\u010a\7v\2\2\u010a\u010b\7k\2\2\u010b\u010c\7x\2\2\u010c"+
		"\u010d\7g\2\2\u010d\60\3\2\2\2\u010e\u010f\7^\2\2\u010f\u0110\7v\2\2\u0110"+
		"\u0111\7g\2\2\u0111\u0112\7o\2\2\u0112\u0113\7r\2\2\u0113\u0114\7q\2\2"+
		"\u0114\62\3\2\2\2\u0115\u0116\7^\2\2\u0116\u0117\7v\2\2\u0117\u0118\7"+
		"k\2\2\u0118\u0119\7o\2\2\u0119\u011a\7g\2\2\u011a\64\3\2\2\2\u011b\u011d"+
		"\5O(\2\u011c\u011e\5U+\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\66\3\2\2\2\u0121\u0123\5U+\2"+
		"\u0122\u0124\5;\36\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0129"+
		"\3\2\2\2\u0125\u012a\5Q)\2\u0126\u0127\5Q)\2\u0127\u0128\7\60\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a8\3\2\2\2\u012b\u012c\5Q)\2\u012c\u012d\7\61\2\2\u012d\u012e"+
		"\5Q)\2\u012e:\3\2\2\2\u012f\u0131\7)\2\2\u0130\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u013a\3\2\2\2\u0134"+
		"\u0136\7.\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0130\3\2\2\2\u0139"+
		"\u0135\3\2\2\2\u013a<\3\2\2\2\u013b\u013d\7$\2\2\u013c\u013e\5Y-\2\u013d"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7$\2\2\u0142>\3\2\2\2\u0143\u0146"+
		"\5U+\2\u0144\u0146\4\60\61\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148@\3\2\2\2"+
		"\u0149\u014b\7$\2\2\u014a\u014c\5S*\2\u014b\u014a\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\7$\2\2\u0150B\3\2\2\2\u0151\u0154\7$\2\2\u0152\u0155\5Q)\2\u0153"+
		"\u0155\7\60\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3"+
		"\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\7$\2\2\u0159D\3\2\2\2\u015a\u015b\7%\2\2\u015bF\3\2\2\2\u015c\u015d"+
		"\7}\2\2\u015dH\3\2\2\2\u015e\u015f\7\177\2\2\u015fJ\3\2\2\2\u0160\u0161"+
		"\7>\2\2\u0161L\3\2\2\2\u0162\u0163\7@\2\2\u0163N\3\2\2\2\u0164\u0165\7"+
		"^\2\2\u0165P\3\2\2\2\u0166\u0168\5W,\2\u0167\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016aR\3\2\2\2\u016b"+
		"\u016c\t\3\2\2\u016cT\3\2\2\2\u016d\u016e\t\4\2\2\u016eV\3\2\2\2\u016f"+
		"\u0170\t\5\2\2\u0170X\3\2\2\2\u0171\u0172\t\6\2\2\u0172Z\3\2\2\2\u0173"+
		"\u0174\7\'\2\2\u0174\u0175\7}\2\2\u0175\u0179\3\2\2\2\u0176\u0178\13\2"+
		"\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u017a\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7\'"+
		"\2\2\u017d\u017e\7\177\2\2\u017e\u017f\3\2\2\2\u017f\u0180\b.\2\2\u0180"+
		"\\\3\2\2\2\u0181\u0185\7\'\2\2\u0182\u0184\13\2\2\2\u0183\u0182\3\2\2"+
		"\2\u0184\u0187\3\2\2\2\u0185\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\5_\60\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\b/\2\2\u018b^\3\2\2\2\u018c\u018e\t\7\2\2\u018d\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0192\b\60\2\2\u0192`\3\2\2\2\u0193\u0195\13\2\2\2\u0194\u0193"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0199\b\61\2\2\u0199b\3\2\2\2\27\2\u00bb\u00c5\u00f4"+
		"\u011f\u0123\u0129\u0132\u0137\u0139\u013f\u0145\u0147\u014d\u0154\u0156"+
		"\u0169\u0179\u0185\u018f\u0196\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}