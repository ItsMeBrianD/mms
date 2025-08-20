// Generated from /Users/brian/code/personal/mms/grammar/Tokens_Base.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tokens_Base extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Reference=1, Identifier=2, Whitespace=3, Float=4, BlockStart=5, BlockEnd=6, 
		NewLine=7, Colon=8, DensityFunctionStart=9, Keyword_Noise=10, Keyword_Constant=11, 
		Keyword_XZScale=12, Keyword_YScale=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Reference", "Identifier", "Whitespace", "Float", "BlockStart", "BlockEnd", 
			"NewLine", "OptionalWhitespace", "Colon", "DensityFunctionStart", "Keyword_Noise", 
			"Keyword_Constant", "Keyword_XZScale", "Keyword_YScale"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'{'", null, null, "':'", "'density:'", 
			"'noise'", "'constant'", "'xz_scale'", "'y_scale'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Reference", "Identifier", "Whitespace", "Float", "BlockStart", 
			"BlockEnd", "NewLine", "Colon", "DensityFunctionStart", "Keyword_Noise", 
			"Keyword_Constant", "Keyword_XZScale", "Keyword_YScale"
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


	public Tokens_Base(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tokens_Base.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\6\3%\n\3\r"+
		"\3\16\3&\3\4\6\4*\n\4\r\4\16\4+\3\4\3\4\3\5\6\5\61\n\5\r\5\16\5\62\3\5"+
		"\3\5\6\5\67\n\5\r\5\16\58\3\6\3\6\3\7\7\7>\n\7\f\7\16\7A\13\7\3\7\3\7"+
		"\3\b\3\b\3\t\7\tH\n\t\f\t\16\tK\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23"+
		"\n\25\13\27\f\31\r\33\16\35\17\3\2\7\4\2C\\c|\4\2\13\13\"\"\3\2\62;\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\2{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2"+
		"\2\5$\3\2\2\2\7)\3\2\2\2\t\60\3\2\2\2\13:\3\2\2\2\r?\3\2\2\2\17D\3\2\2"+
		"\2\21I\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27W\3\2\2\2\31]\3\2\2\2\33f\3\2"+
		"\2\2\35o\3\2\2\2\37 \5\5\3\2 !\7<\2\2!\"\5\5\3\2\"\4\3\2\2\2#%\t\2\2\2"+
		"$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\6\3\2\2\2(*\t\3\2\2)(\3\2"+
		"\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\b\4\2\2.\b\3\2\2\2/\61"+
		"\t\4\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3"+
		"\2\2\2\64\66\7\60\2\2\65\67\t\4\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2"+
		"\2\289\3\2\2\29\n\3\2\2\2:;\7}\2\2;\f\3\2\2\2<>\t\5\2\2=<\3\2\2\2>A\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\177\2\2C\16\3\2\2\2"+
		"DE\t\6\2\2E\20\3\2\2\2FH\t\3\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2"+
		"\2J\22\3\2\2\2KI\3\2\2\2LM\7<\2\2M\24\3\2\2\2NO\7f\2\2OP\7g\2\2PQ\7p\2"+
		"\2QR\7u\2\2RS\7k\2\2ST\7v\2\2TU\7{\2\2UV\7<\2\2V\26\3\2\2\2WX\7p\2\2X"+
		"Y\7q\2\2YZ\7k\2\2Z[\7u\2\2[\\\7g\2\2\\\30\3\2\2\2]^\7e\2\2^_\7q\2\2_`"+
		"\7p\2\2`a\7u\2\2ab\7v\2\2bc\7c\2\2cd\7p\2\2de\7v\2\2e\32\3\2\2\2fg\7z"+
		"\2\2gh\7|\2\2hi\7a\2\2ij\7u\2\2jk\7e\2\2kl\7c\2\2lm\7n\2\2mn\7g\2\2n\34"+
		"\3\2\2\2op\7{\2\2pq\7a\2\2qr\7u\2\2rs\7e\2\2st\7c\2\2tu\7n\2\2uv\7g\2"+
		"\2v\36\3\2\2\2\t\2&+\628?I\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}