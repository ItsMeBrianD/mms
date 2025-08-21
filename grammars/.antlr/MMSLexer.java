// Generated from /Users/brian/code/personal/mms/grammars/MMSLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Keyword_Surface=1, Keyword_Rule=2, Keyword_Condition=3, Keyword_Sequence=4, 
		Keyword_Block=5, Keyword_Bandlands=6, Keyword_AbovePreliminarySurface=7, 
		Keyword_Biome=8, Keyword_Hole=9, Keyword_Steep=10, Keyword_StoneDepth=11, 
		Keyword_Freezing=12, Keyword_Temperature=13, Keyword_VerticalGradient=14, 
		Keyword_Water=15, Keyword_YAbove=16, Keyword_Namespace=17, Keyword_If=18, 
		Keyword_Else=19, Keyword_In=20, WS=21, NL=22, SquareOpen=23, SquareClose=24, 
		CurlyOpen=25, CurlyClose=26, RoundOpen=27, RoundClose=28, Bang=29, Colon=30, 
		SemiColon=31, Identifier=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Keyword_Surface", "Keyword_Rule", "Keyword_Condition", "Keyword_Sequence", 
			"Keyword_Block", "Keyword_Bandlands", "Keyword_AbovePreliminarySurface", 
			"Keyword_Biome", "Keyword_Hole", "Keyword_Steep", "Keyword_StoneDepth", 
			"Keyword_Freezing", "Keyword_Temperature", "Keyword_VerticalGradient", 
			"Keyword_Water", "Keyword_YAbove", "Keyword_Namespace", "Keyword_If", 
			"Keyword_Else", "Keyword_In", "WS", "NL", "SquareOpen", "SquareClose", 
			"CurlyOpen", "CurlyClose", "RoundOpen", "RoundClose", "Bang", "Colon", 
			"SemiColon", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'surface'", "'rule'", "'condition'", "'sequence'", "'block'", 
			"'bandlands'", "'above_preliminary_surface'", "'biome'", "'hole'", "'steep'", 
			"'stone_depth'", "'freezing'", "'temperature'", "'vertical_gradient'", 
			"'water'", "'y_above'", "'namespace'", "'if'", "'else'", "'in'", null, 
			null, "'['", "']'", "'{'", "'}'", "'('", "')'", "'!'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Keyword_Surface", "Keyword_Rule", "Keyword_Condition", "Keyword_Sequence", 
			"Keyword_Block", "Keyword_Bandlands", "Keyword_AbovePreliminarySurface", 
			"Keyword_Biome", "Keyword_Hole", "Keyword_Steep", "Keyword_StoneDepth", 
			"Keyword_Freezing", "Keyword_Temperature", "Keyword_VerticalGradient", 
			"Keyword_Water", "Keyword_YAbove", "Keyword_Namespace", "Keyword_If", 
			"Keyword_Else", "Keyword_In", "WS", "NL", "SquareOpen", "SquareClose", 
			"CurlyOpen", "CurlyClose", "RoundOpen", "RoundClose", "Bang", "Colon", 
			"SemiColon", "Identifier"
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


	public MMSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MMSLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0116\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\6\26\u00f6\n\26\r\26\16\26\u00f7\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\7!\u0112\n!\f!\16!\u0115\13!\2\2\"\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3"+
		"\2\6\4\2\13\13\"\"\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\2\u0117\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5K\3\2\2\2\7P\3\2\2\2\t"+
		"Z\3\2\2\2\13c\3\2\2\2\ri\3\2\2\2\17s\3\2\2\2\21\u008d\3\2\2\2\23\u0093"+
		"\3\2\2\2\25\u0098\3\2\2\2\27\u009e\3\2\2\2\31\u00aa\3\2\2\2\33\u00b3\3"+
		"\2\2\2\35\u00bf\3\2\2\2\37\u00d1\3\2\2\2!\u00d7\3\2\2\2#\u00df\3\2\2\2"+
		"%\u00e9\3\2\2\2\'\u00ec\3\2\2\2)\u00f1\3\2\2\2+\u00f5\3\2\2\2-\u00fb\3"+
		"\2\2\2/\u00fd\3\2\2\2\61\u00ff\3\2\2\2\63\u0101\3\2\2\2\65\u0103\3\2\2"+
		"\2\67\u0105\3\2\2\29\u0107\3\2\2\2;\u0109\3\2\2\2=\u010b\3\2\2\2?\u010d"+
		"\3\2\2\2A\u010f\3\2\2\2CD\7u\2\2DE\7w\2\2EF\7t\2\2FG\7h\2\2GH\7c\2\2H"+
		"I\7e\2\2IJ\7g\2\2J\4\3\2\2\2KL\7t\2\2LM\7w\2\2MN\7n\2\2NO\7g\2\2O\6\3"+
		"\2\2\2PQ\7e\2\2QR\7q\2\2RS\7p\2\2ST\7f\2\2TU\7k\2\2UV\7v\2\2VW\7k\2\2"+
		"WX\7q\2\2XY\7p\2\2Y\b\3\2\2\2Z[\7u\2\2[\\\7g\2\2\\]\7s\2\2]^\7w\2\2^_"+
		"\7g\2\2_`\7p\2\2`a\7e\2\2ab\7g\2\2b\n\3\2\2\2cd\7d\2\2de\7n\2\2ef\7q\2"+
		"\2fg\7e\2\2gh\7m\2\2h\f\3\2\2\2ij\7d\2\2jk\7c\2\2kl\7p\2\2lm\7f\2\2mn"+
		"\7n\2\2no\7c\2\2op\7p\2\2pq\7f\2\2qr\7u\2\2r\16\3\2\2\2st\7c\2\2tu\7d"+
		"\2\2uv\7q\2\2vw\7x\2\2wx\7g\2\2xy\7a\2\2yz\7r\2\2z{\7t\2\2{|\7g\2\2|}"+
		"\7n\2\2}~\7k\2\2~\177\7o\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u0083\7t\2\2\u0083\u0084\7{\2\2\u0084\u0085\7a\2\2"+
		"\u0085\u0086\7u\2\2\u0086\u0087\7w\2\2\u0087\u0088\7t\2\2\u0088\u0089"+
		"\7h\2\2\u0089\u008a\7c\2\2\u008a\u008b\7e\2\2\u008b\u008c\7g\2\2\u008c"+
		"\20\3\2\2\2\u008d\u008e\7d\2\2\u008e\u008f\7k\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7o\2\2\u0091\u0092\7g\2\2\u0092\22\3\2\2\2\u0093\u0094\7j\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0096\7n\2\2\u0096\u0097\7g\2\2\u0097\24\3\2\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7g\2\2\u009b\u009c\7g\2\2"+
		"\u009c\u009d\7r\2\2\u009d\26\3\2\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7"+
		"v\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4"+
		"\7a\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7r\2\2\u00a7"+
		"\u00a8\7v\2\2\u00a8\u00a9\7j\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab"+
		"\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7|\2\2"+
		"\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7i\2\2\u00b2\32\3\2"+
		"\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7o\2\2\u00b6\u00b7"+
		"\7r\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7c\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2"+
		"\u00be\34\3\2\2\2\u00bf\u00c0\7x\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7"+
		"t\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6"+
		"\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7a\2\2\u00c8\u00c9\7i\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7f\2\2\u00cc\u00cd\7k\2\2"+
		"\u00cd\u00ce\7g\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0\36\3\2"+
		"\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\u00d6\7t\2\2\u00d6 \3\2\2\2\u00d7\u00d8\7{\2\2\u00d8\u00d9"+
		"\7a\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7d\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7x\2\2\u00dd\u00de\7g\2\2\u00de\"\3\2\2\2\u00df\u00e0\7p\2\2\u00e0"+
		"\u00e1\7c\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7u\2\2"+
		"\u00e4\u00e5\7r\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8"+
		"\7g\2\2\u00e8$\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7h\2\2\u00eb&\3"+
		"\2\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7u\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0(\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7p\2\2\u00f3"+
		"*\3\2\2\2\u00f4\u00f6\t\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa"+
		"\b\26\2\2\u00fa,\3\2\2\2\u00fb\u00fc\t\3\2\2\u00fc.\3\2\2\2\u00fd\u00fe"+
		"\7]\2\2\u00fe\60\3\2\2\2\u00ff\u0100\7_\2\2\u0100\62\3\2\2\2\u0101\u0102"+
		"\7}\2\2\u0102\64\3\2\2\2\u0103\u0104\7\177\2\2\u0104\66\3\2\2\2\u0105"+
		"\u0106\7*\2\2\u01068\3\2\2\2\u0107\u0108\7+\2\2\u0108:\3\2\2\2\u0109\u010a"+
		"\7#\2\2\u010a<\3\2\2\2\u010b\u010c\7<\2\2\u010c>\3\2\2\2\u010d\u010e\7"+
		"=\2\2\u010e@\3\2\2\2\u010f\u0113\t\4\2\2\u0110\u0112\t\5\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"B\3\2\2\2\u0115\u0113\3\2\2\2\5\2\u00f7\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}