// Generated from /Users/brian/code/personal/mms/grammars/MMS_SurfaceRules.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMS_SurfaceRules extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Keyword_Namespace=1, Keyword_If=2, Keyword_Else=3, Keyword_In=4, Whitespace=5, 
		NewLine=6, SquareOpen=7, SquareClose=8, CurlyOpen=9, CurlyClose=10, RoundOpen=11, 
		RoundClose=12, Colon=13, SemiColon=14, Identifier=15;
	public static final int
		RULE_surfaceConditional = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"surfaceConditional"
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

	@Override
	public String getGrammarFileName() { return "MMS_SurfaceRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MMS_SurfaceRules(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SurfaceConditionalContext extends ParserRuleContext {
		public TerminalNode Keyword_If() { return getToken(MMS_SurfaceRules.Keyword_If, 0); }
		public TerminalNode SquareOpen() { return getToken(MMS_SurfaceRules.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMS_SurfaceRules.SquareClose, 0); }
		public SurfaceConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceConditional; }
	}

	public final SurfaceConditionalContext surfaceConditional() throws RecognitionException {
		SurfaceConditionalContext _localctx = new SurfaceConditionalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_surfaceConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(Keyword_If);
			setState(3);
			match(SquareOpen);
			setState(4);
			match(SquareClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\t\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\7\2\4\3\2\2\2\4\5\7\4\2\2\5\6\7\t\2\2\6"+
		"\7\7\n\2\2\7\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}