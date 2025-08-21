// Generated from /Users/brian/code/personal/mms/grammars/MMSParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Keyword_Namespace=1, Keyword_If=2, Keyword_Else=3, Keyword_In=4, Whitespace=5, 
		NewLine=6, SquareOpen=7, SquareClose=8, CurlyOpen=9, CurlyClose=10, RoundOpen=11, 
		RoundClose=12, Colon=13, SemiColon=14, Identifier=15;
	public static final int
		RULE_namespaceDeclaration = 0, RULE_mmsFile = 1, RULE_surfaceCondition = 2, 
		RULE_reference = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"namespaceDeclaration", "mmsFile", "surfaceCondition", "reference"
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
	public String getGrammarFileName() { return "MMSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MMSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Namespace() { return getToken(MMSParser.Keyword_Namespace, 0); }
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public TerminalNode SemiColon() { return getToken(MMSParser.SemiColon, 0); }
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_namespaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(Keyword_Namespace);
			setState(9);
			match(Identifier);
			setState(10);
			match(SemiColon);
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

	public static class MmsFileContext extends ParserRuleContext {
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MMSParser.EOF, 0); }
		public List<TerminalNode> NewLine() { return getTokens(MMSParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(MMSParser.NewLine, i);
		}
		public MmsFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmsFile; }
	}

	public final MmsFileContext mmsFile() throws RecognitionException {
		MmsFileContext _localctx = new MmsFileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mmsFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			namespaceDeclaration();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(13);
				match(NewLine);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(EOF);
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

	public static class SurfaceConditionContext extends ParserRuleContext {
		public TerminalNode Keyword_If() { return getToken(MMSParser.Keyword_If, 0); }
		public TerminalNode SquareOpen() { return getToken(MMSParser.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMSParser.SquareClose, 0); }
		public SurfaceConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceCondition; }
	}

	public final SurfaceConditionContext surfaceCondition() throws RecognitionException {
		SurfaceConditionContext _localctx = new SurfaceConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_surfaceCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(Keyword_If);
			setState(22);
			match(SquareOpen);
			setState(23);
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

	public static class ReferenceContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MMSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MMSParser.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(MMSParser.Colon, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(Identifier);
			setState(26);
			match(Colon);
			setState(27);
			match(Identifier);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21 \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\7\3\21\n\3\f\3\16\3\24\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\34\2"+
		"\n\3\2\2\2\4\16\3\2\2\2\6\27\3\2\2\2\b\33\3\2\2\2\n\13\7\3\2\2\13\f\7"+
		"\21\2\2\f\r\7\20\2\2\r\3\3\2\2\2\16\22\5\2\2\2\17\21\7\b\2\2\20\17\3\2"+
		"\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2\24\22\3\2"+
		"\2\2\25\26\7\2\2\3\26\5\3\2\2\2\27\30\7\4\2\2\30\31\7\t\2\2\31\32\7\n"+
		"\2\2\32\7\3\2\2\2\33\34\7\21\2\2\34\35\7\17\2\2\35\36\7\21\2\2\36\t\3"+
		"\2\2\2\3\22";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}