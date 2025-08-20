// Generated from /Users/brian/code/personal/mms/grammar/MMSLex.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMSLex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DensityFunctionStart=1, Keyword_Noise=2, Keyword_Constant=3, Keyword_XZScale=4, 
		Keyword_YScale=5, Keyword_FirstOctave=6, Keyword_Amplitudes=7, Keyword_Namespace=8, 
		Whitespace=9, Float=10, Integer=11, BlockStart=12, BlockEnd=13, NewLine=14, 
		Colon=15, SquareOpen=16, SquareClose=17, Comma=18, Comment=19, Identifier=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
			"Keyword_YScale", "Keyword_FirstOctave", "Keyword_Amplitudes", "Keyword_Namespace", 
			"Whitespace", "Float", "Integer", "BlockStart", "BlockEnd", "NewLine", 
			"OptionalWhitespace", "Colon", "SquareOpen", "SquareClose", "Comma", 
			"Comment", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'density'", "'noise'", "'constant'", "'xz_scale'", "'y_scale'", 
			"'first_octave'", "'amplitudes'", "'namespace'", null, null, null, "'{'", 
			null, null, "':'", "'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
			"Keyword_YScale", "Keyword_FirstOctave", "Keyword_Amplitudes", "Keyword_Namespace", 
			"Whitespace", "Float", "Integer", "BlockStart", "BlockEnd", "NewLine", 
			"Colon", "SquareOpen", "SquareClose", "Comma", "Comment", "Identifier"
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


	public MMSLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MMSLex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\6\n"+
		"y\n\n\r\n\16\nz\3\n\3\n\3\13\5\13\u0080\n\13\3\13\6\13\u0083\n\13\r\13"+
		"\16\13\u0084\3\13\3\13\6\13\u0089\n\13\r\13\16\13\u008a\3\f\5\f\u008e"+
		"\n\f\3\f\6\f\u0091\n\f\r\f\16\f\u0092\3\r\3\r\3\16\7\16\u0098\n\16\f\16"+
		"\16\16\u009b\13\16\3\16\3\16\3\17\3\17\3\20\7\20\u00a2\n\20\f\20\16\20"+
		"\u00a5\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\7\25\u00b3\n\25\f\25\16\25\u00b6\13\25\3\25\3\25\3\26\6\26\u00bb\n"+
		"\26\r\26\16\26\u00bc\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\2!\21#\22%\23\'\24)\25+\26\3\2\7\4\2\13\13"+
		"\"\"\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\6\2\62;C\\aac|\2\u00c6\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\65\3\2\2\2\7;\3\2\2\2"+
		"\tD\3\2\2\2\13M\3\2\2\2\rU\3\2\2\2\17b\3\2\2\2\21m\3\2\2\2\23x\3\2\2\2"+
		"\25\177\3\2\2\2\27\u008d\3\2\2\2\31\u0094\3\2\2\2\33\u0099\3\2\2\2\35"+
		"\u009e\3\2\2\2\37\u00a3\3\2\2\2!\u00a6\3\2\2\2#\u00a8\3\2\2\2%\u00aa\3"+
		"\2\2\2\'\u00ac\3\2\2\2)\u00ae\3\2\2\2+\u00ba\3\2\2\2-.\7f\2\2./\7g\2\2"+
		"/\60\7p\2\2\60\61\7u\2\2\61\62\7k\2\2\62\63\7v\2\2\63\64\7{\2\2\64\4\3"+
		"\2\2\2\65\66\7p\2\2\66\67\7q\2\2\678\7k\2\289\7u\2\29:\7g\2\2:\6\3\2\2"+
		"\2;<\7e\2\2<=\7q\2\2=>\7p\2\2>?\7u\2\2?@\7v\2\2@A\7c\2\2AB\7p\2\2BC\7"+
		"v\2\2C\b\3\2\2\2DE\7z\2\2EF\7|\2\2FG\7a\2\2GH\7u\2\2HI\7e\2\2IJ\7c\2\2"+
		"JK\7n\2\2KL\7g\2\2L\n\3\2\2\2MN\7{\2\2NO\7a\2\2OP\7u\2\2PQ\7e\2\2QR\7"+
		"c\2\2RS\7n\2\2ST\7g\2\2T\f\3\2\2\2UV\7h\2\2VW\7k\2\2WX\7t\2\2XY\7u\2\2"+
		"YZ\7v\2\2Z[\7a\2\2[\\\7q\2\2\\]\7e\2\2]^\7v\2\2^_\7c\2\2_`\7x\2\2`a\7"+
		"g\2\2a\16\3\2\2\2bc\7c\2\2cd\7o\2\2de\7r\2\2ef\7n\2\2fg\7k\2\2gh\7v\2"+
		"\2hi\7w\2\2ij\7f\2\2jk\7g\2\2kl\7u\2\2l\20\3\2\2\2mn\7p\2\2no\7c\2\2o"+
		"p\7o\2\2pq\7g\2\2qr\7u\2\2rs\7r\2\2st\7c\2\2tu\7e\2\2uv\7g\2\2v\22\3\2"+
		"\2\2wy\t\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\n"+
		"\2\2}\24\3\2\2\2~\u0080\7/\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081\u0083\t\3\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\60"+
		"\2\2\u0087\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\26\3\2\2\2\u008c\u008e\7/\2\2"+
		"\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091"+
		"\t\3\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\30\3\2\2\2\u0094\u0095\7}\2\2\u0095\32\3\2\2\2\u0096"+
		"\u0098\t\4\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009d\7\177\2\2\u009d\34\3\2\2\2\u009e\u009f\t\5\2\2\u009f\36\3\2\2\2"+
		"\u00a0\u00a2\t\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4 \3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7<\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\7]\2\2\u00a9$\3\2\2\2\u00aa"+
		"\u00ab\7_\2\2\u00ab&\3\2\2\2\u00ac\u00ad\7.\2\2\u00ad(\3\2\2\2\u00ae\u00af"+
		"\7\61\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\n\5\2\2"+
		"\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\b\25\2\2"+
		"\u00b8*\3\2\2\2\u00b9\u00bb\t\6\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd,\3\2\2\2\r\2z\177"+
		"\u0084\u008a\u008d\u0092\u0099\u00a3\u00b4\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}