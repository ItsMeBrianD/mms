// Generated from /Users/brian/code/personal/mms/grammar/DensityFunctions_Tokens.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DensityFunctions_Tokens extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DensityFunctionStart=1, Keyword_Noise=2, Keyword_Constant=3, Keyword_XZScale=4, 
		Keyword_YScale=5, Reference=6, Identifier=7, Whitespace=8, Float=9, BlockStart=10, 
		BlockEnd=11, NewLine=12, Colon=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
			"Keyword_YScale", "Reference", "Identifier", "Whitespace", "Float", "BlockStart", 
			"BlockEnd", "NewLine", "OptionalWhitespace", "Colon"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'density:'", "'noise'", "'constant'", "'xz_scale'", "'y_scale'", 
			null, null, null, null, "'{'", null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
			"Keyword_YScale", "Reference", "Identifier", "Whitespace", "Float", "BlockStart", 
			"BlockEnd", "NewLine", "Colon"
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


	public DensityFunctions_Tokens(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DensityFunctions_Tokens.g4"; }

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
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\6\bN\n\b\r\b\16\bO\3\t\6\tS\n\t\r\t\16\tT\3\t\3\t\3\n\6"+
		"\nZ\n\n\r\n\16\n[\3\n\3\n\6\n`\n\n\r\n\16\na\3\13\3\13\3\f\7\fg\n\f\f"+
		"\f\16\fj\13\f\3\f\3\f\3\r\3\r\3\16\7\16q\n\16\f\16\16\16t\13\16\3\17\3"+
		"\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\2\35\17\3\2\7\4\2C\\c|\4\2\13\13\"\"\3\2\62;\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\2{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5(\3\2\2\2\7.\3\2\2\2"+
		"\t\67\3\2\2\2\13@\3\2\2\2\rH\3\2\2\2\17M\3\2\2\2\21R\3\2\2\2\23Y\3\2\2"+
		"\2\25c\3\2\2\2\27h\3\2\2\2\31m\3\2\2\2\33r\3\2\2\2\35u\3\2\2\2\37 \7f"+
		"\2\2 !\7g\2\2!\"\7p\2\2\"#\7u\2\2#$\7k\2\2$%\7v\2\2%&\7{\2\2&\'\7<\2\2"+
		"\'\4\3\2\2\2()\7p\2\2)*\7q\2\2*+\7k\2\2+,\7u\2\2,-\7g\2\2-\6\3\2\2\2."+
		"/\7e\2\2/\60\7q\2\2\60\61\7p\2\2\61\62\7u\2\2\62\63\7v\2\2\63\64\7c\2"+
		"\2\64\65\7p\2\2\65\66\7v\2\2\66\b\3\2\2\2\678\7z\2\289\7|\2\29:\7a\2\2"+
		":;\7u\2\2;<\7e\2\2<=\7c\2\2=>\7n\2\2>?\7g\2\2?\n\3\2\2\2@A\7{\2\2AB\7"+
		"a\2\2BC\7u\2\2CD\7e\2\2DE\7c\2\2EF\7n\2\2FG\7g\2\2G\f\3\2\2\2HI\5\17\b"+
		"\2IJ\7<\2\2JK\5\17\b\2K\16\3\2\2\2LN\t\2\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2"+
		"\2\2OP\3\2\2\2P\20\3\2\2\2QS\t\3\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2UV\3\2\2\2VW\b\t\2\2W\22\3\2\2\2XZ\t\4\2\2YX\3\2\2\2Z[\3\2\2\2["+
		"Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\7\60\2\2^`\t\4\2\2_^\3\2\2\2`a\3\2\2"+
		"\2a_\3\2\2\2ab\3\2\2\2b\24\3\2\2\2cd\7}\2\2d\26\3\2\2\2eg\t\5\2\2fe\3"+
		"\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\177\2\2l"+
		"\30\3\2\2\2mn\t\6\2\2n\32\3\2\2\2oq\t\3\2\2po\3\2\2\2qt\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2s\34\3\2\2\2tr\3\2\2\2uv\7<\2\2v\36\3\2\2\2\t\2OT[ahr\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}