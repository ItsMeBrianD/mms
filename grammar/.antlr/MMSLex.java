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
		Keyword_YScale=5, Whitespace=6, Float=7, Integer=8, BlockStart=9, BlockEnd=10, 
		NewLine=11, Colon=12, Identifier=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
			"Keyword_YScale", "Whitespace", "Float", "Integer", "BlockStart", "BlockEnd", 
			"NewLine", "OptionalWhitespace", "Colon", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'density'", "'noise'", "'constant'", "'xz_scale'", "'y_scale'", 
			null, null, null, "'{'", null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
			"Keyword_YScale", "Whitespace", "Float", "Integer", "BlockStart", "BlockEnd", 
			"NewLine", "Colon", "Identifier"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7I"+
		"\n\7\r\7\16\7J\3\7\3\7\3\b\6\bP\n\b\r\b\16\bQ\3\b\3\b\6\bV\n\b\r\b\16"+
		"\bW\3\t\6\t[\n\t\r\t\16\t\\\3\n\3\n\3\13\7\13b\n\13\f\13\16\13e\13\13"+
		"\3\13\3\13\3\f\3\f\3\r\7\rl\n\r\f\r\16\ro\13\r\3\16\3\16\3\17\6\17t\n"+
		"\17\r\17\16\17u\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\2\33\16\35\17\3\2\7\4\2\13\13\"\"\3\2\62;\5\2\13\f\17\17\"\"\4\2"+
		"\f\f\17\17\6\2\62;C\\aac|\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5\'"+
		"\3\2\2\2\7-\3\2\2\2\t\66\3\2\2\2\13?\3\2\2\2\rH\3\2\2\2\17O\3\2\2\2\21"+
		"Z\3\2\2\2\23^\3\2\2\2\25c\3\2\2\2\27h\3\2\2\2\31m\3\2\2\2\33p\3\2\2\2"+
		"\35s\3\2\2\2\37 \7f\2\2 !\7g\2\2!\"\7p\2\2\"#\7u\2\2#$\7k\2\2$%\7v\2\2"+
		"%&\7{\2\2&\4\3\2\2\2\'(\7p\2\2()\7q\2\2)*\7k\2\2*+\7u\2\2+,\7g\2\2,\6"+
		"\3\2\2\2-.\7e\2\2./\7q\2\2/\60\7p\2\2\60\61\7u\2\2\61\62\7v\2\2\62\63"+
		"\7c\2\2\63\64\7p\2\2\64\65\7v\2\2\65\b\3\2\2\2\66\67\7z\2\2\678\7|\2\2"+
		"89\7a\2\29:\7u\2\2:;\7e\2\2;<\7c\2\2<=\7n\2\2=>\7g\2\2>\n\3\2\2\2?@\7"+
		"{\2\2@A\7a\2\2AB\7u\2\2BC\7e\2\2CD\7c\2\2DE\7n\2\2EF\7g\2\2F\f\3\2\2\2"+
		"GI\t\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\b\7\2\2"+
		"M\16\3\2\2\2NP\t\3\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2"+
		"\2SU\7\60\2\2TV\t\3\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\20\3"+
		"\2\2\2Y[\t\3\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\22\3\2\2"+
		"\2^_\7}\2\2_\24\3\2\2\2`b\t\4\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2df\3\2\2\2ec\3\2\2\2fg\7\177\2\2g\26\3\2\2\2hi\t\5\2\2i\30\3\2\2\2"+
		"jl\t\2\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\32\3\2\2\2om\3\2\2"+
		"\2pq\7<\2\2q\34\3\2\2\2rt\t\6\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2v\36\3\2\2\2\n\2JQW\\cmu\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}