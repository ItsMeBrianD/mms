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
		Keyword_Namespace=1, Keyword_If=2, Keyword_Else=3, Keyword_In=4, Whitespace=5, 
		NewLine=6, SquareOpen=7, SquareClose=8, CurlyOpen=9, CurlyClose=10, RoundOpen=11, 
		RoundClose=12, Colon=13, SemiColon=14, Identifier=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Keyword_Namespace", "Keyword_If", "Keyword_Else", "Keyword_In", "Whitespace", 
			"NewLine", "SquareOpen", "SquareClose", "CurlyOpen", "CurlyClose", "RoundOpen", 
			"RoundClose", "Colon", "SemiColon", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'namespace'", "'if'", "'else'", "'in'", null, null, "'['", "']'", 
			"'{'", "'}'", "'('", "')'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Keyword_Namespace", "Keyword_If", "Keyword_Else", "Keyword_In", 
			"Whitespace", "NewLine", "SquareOpen", "SquareClose", "CurlyOpen", "CurlyClose", 
			"RoundOpen", "RoundClose", "Colon", "SemiColon", "Identifier"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\6"+
		"\68\n\6\r\6\16\69\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20R\n\20\f\20\16\20U\13"+
		"\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21\3\2\6\4\2\13\13\"\"\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C"+
		"\\aac|\2W\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2"+
		"\2\5+\3\2\2\2\7.\3\2\2\2\t\63\3\2\2\2\13\67\3\2\2\2\r=\3\2\2\2\17?\3\2"+
		"\2\2\21A\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31I\3\2\2\2\33K\3"+
		"\2\2\2\35M\3\2\2\2\37O\3\2\2\2!\"\7p\2\2\"#\7c\2\2#$\7o\2\2$%\7g\2\2%"+
		"&\7u\2\2&\'\7r\2\2\'(\7c\2\2()\7e\2\2)*\7g\2\2*\4\3\2\2\2+,\7k\2\2,-\7"+
		"h\2\2-\6\3\2\2\2./\7g\2\2/\60\7n\2\2\60\61\7u\2\2\61\62\7g\2\2\62\b\3"+
		"\2\2\2\63\64\7k\2\2\64\65\7p\2\2\65\n\3\2\2\2\668\t\2\2\2\67\66\3\2\2"+
		"\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\b\6\2\2<\f\3\2\2\2=>\t"+
		"\3\2\2>\16\3\2\2\2?@\7]\2\2@\20\3\2\2\2AB\7_\2\2B\22\3\2\2\2CD\7}\2\2"+
		"D\24\3\2\2\2EF\7\177\2\2F\26\3\2\2\2GH\7*\2\2H\30\3\2\2\2IJ\7+\2\2J\32"+
		"\3\2\2\2KL\7<\2\2L\34\3\2\2\2MN\7=\2\2N\36\3\2\2\2OS\t\4\2\2PR\t\5\2\2"+
		"QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T \3\2\2\2US\3\2\2\2\5\29S\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}