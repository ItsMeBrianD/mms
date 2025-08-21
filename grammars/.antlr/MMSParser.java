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
		Keyword_Surface=1, Keyword_Rule=2, Keyword_Condition=3, Keyword_Sequence=4, 
		Keyword_Block=5, Keyword_Bandlands=6, Keyword_AbovePreliminarySurface=7, 
		Keyword_Biome=8, Keyword_Hole=9, Keyword_Steep=10, Keyword_StoneDepth=11, 
		Keyword_Freezing=12, Keyword_Temperature=13, Keyword_VerticalGradient=14, 
		Keyword_Water=15, Keyword_YAbove=16, Keyword_Namespace=17, Keyword_If=18, 
		Keyword_Else=19, Keyword_In=20, WS=21, NL=22, SquareOpen=23, SquareClose=24, 
		CurlyOpen=25, CurlyClose=26, RoundOpen=27, RoundClose=28, Bang=29, Colon=30, 
		SemiColon=31, Identifier=32;
	public static final int
		RULE_namespaceDeclaration = 0, RULE_statement = 1, RULE_mmsFile = 2, RULE_surfaceDeclaration = 3, 
		RULE_surfaceInline = 4, RULE_surfaceDefinition = 5, RULE_surfaceRuleDeclaration = 6, 
		RULE_surfaceRule = 7, RULE_surfaceRule_Conditional = 8, RULE_surfaceRule_Block = 9, 
		RULE_surfaceRule_Sequence = 10, RULE_reference = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"namespaceDeclaration", "statement", "mmsFile", "surfaceDeclaration", 
			"surfaceInline", "surfaceDefinition", "surfaceRuleDeclaration", "surfaceRule", 
			"surfaceRule_Conditional", "surfaceRule_Block", "surfaceRule_Sequence", 
			"reference"
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
			setState(24);
			match(Keyword_Namespace);
			setState(25);
			match(Identifier);
			setState(26);
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

	public static class StatementContext extends ParserRuleContext {
		public SurfaceDeclarationContext surfaceDeclaration() {
			return getRuleContext(SurfaceDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			surfaceDeclaration();
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
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MmsFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmsFile; }
	}

	public final MmsFileContext mmsFile() throws RecognitionException {
		MmsFileContext _localctx = new MmsFileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mmsFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			namespaceDeclaration();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(31);
				match(NL);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(37);
					statement();
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(38);
						match(NL);
						}
						}
						setState(41); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NL );
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Keyword_Surface) {
				{
				setState(48);
				statement();
				}
			}

			setState(51);
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

	public static class SurfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Surface() { return getToken(MMSParser.Keyword_Surface, 0); }
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public SurfaceDefinitionContext surfaceDefinition() {
			return getRuleContext(SurfaceDefinitionContext.class,0);
		}
		public SurfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceDeclaration; }
	}

	public final SurfaceDeclarationContext surfaceDeclaration() throws RecognitionException {
		SurfaceDeclarationContext _localctx = new SurfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_surfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(Keyword_Surface);
			setState(54);
			match(Identifier);
			setState(55);
			surfaceDefinition();
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

	public static class SurfaceInlineContext extends ParserRuleContext {
		public TerminalNode Keyword_Surface() { return getToken(MMSParser.Keyword_Surface, 0); }
		public SurfaceDefinitionContext surfaceDefinition() {
			return getRuleContext(SurfaceDefinitionContext.class,0);
		}
		public SurfaceInlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceInline; }
	}

	public final SurfaceInlineContext surfaceInline() throws RecognitionException {
		SurfaceInlineContext _localctx = new SurfaceInlineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_surfaceInline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(Keyword_Surface);
			setState(58);
			surfaceDefinition();
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

	public static class SurfaceDefinitionContext extends ParserRuleContext {
		public TerminalNode CurlyOpen() { return getToken(MMSParser.CurlyOpen, 0); }
		public TerminalNode CurlyClose() { return getToken(MMSParser.CurlyClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public List<SurfaceRuleDeclarationContext> surfaceRuleDeclaration() {
			return getRuleContexts(SurfaceRuleDeclarationContext.class);
		}
		public SurfaceRuleDeclarationContext surfaceRuleDeclaration(int i) {
			return getRuleContext(SurfaceRuleDeclarationContext.class,i);
		}
		public SurfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceDefinition; }
	}

	public final SurfaceDefinitionContext surfaceDefinition() throws RecognitionException {
		SurfaceDefinitionContext _localctx = new SurfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_surfaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CurlyOpen);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				match(NL);
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Keyword_Rule) {
				{
				{
				setState(66);
				surfaceRuleDeclaration();
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					match(NL);
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(CurlyClose);
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

	public static class SurfaceRuleDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyword_Rule() { return getToken(MMSParser.Keyword_Rule, 0); }
		public TerminalNode Identifier() { return getToken(MMSParser.Identifier, 0); }
		public SurfaceRuleContext surfaceRule() {
			return getRuleContext(SurfaceRuleContext.class,0);
		}
		public SurfaceRuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRuleDeclaration; }
	}

	public final SurfaceRuleDeclarationContext surfaceRuleDeclaration() throws RecognitionException {
		SurfaceRuleDeclarationContext _localctx = new SurfaceRuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_surfaceRuleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(Keyword_Rule);
			setState(80);
			match(Identifier);
			setState(81);
			surfaceRule();
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

	public static class SurfaceRuleContext extends ParserRuleContext {
		public SurfaceRule_ConditionalContext surfaceRule_Conditional() {
			return getRuleContext(SurfaceRule_ConditionalContext.class,0);
		}
		public SurfaceRule_BlockContext surfaceRule_Block() {
			return getRuleContext(SurfaceRule_BlockContext.class,0);
		}
		public SurfaceRule_SequenceContext surfaceRule_Sequence() {
			return getRuleContext(SurfaceRule_SequenceContext.class,0);
		}
		public SurfaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule; }
	}

	public final SurfaceRuleContext surfaceRule() throws RecognitionException {
		SurfaceRuleContext _localctx = new SurfaceRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_surfaceRule);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Keyword_If:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				surfaceRule_Conditional();
				}
				break;
			case Keyword_Block:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				surfaceRule_Block();
				}
				break;
			case Keyword_Sequence:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				surfaceRule_Sequence();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SurfaceRule_ConditionalContext extends ParserRuleContext {
		public TerminalNode Keyword_If() { return getToken(MMSParser.Keyword_If, 0); }
		public TerminalNode SquareOpen() { return getToken(MMSParser.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMSParser.SquareClose, 0); }
		public SurfaceRule_ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Conditional; }
	}

	public final SurfaceRule_ConditionalContext surfaceRule_Conditional() throws RecognitionException {
		SurfaceRule_ConditionalContext _localctx = new SurfaceRule_ConditionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_surfaceRule_Conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(Keyword_If);
			setState(89);
			match(SquareOpen);
			setState(90);
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

	public static class SurfaceRule_BlockContext extends ParserRuleContext {
		public TerminalNode Keyword_Block() { return getToken(MMSParser.Keyword_Block, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public SurfaceRule_BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Block; }
	}

	public final SurfaceRule_BlockContext surfaceRule_Block() throws RecognitionException {
		SurfaceRule_BlockContext _localctx = new SurfaceRule_BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_surfaceRule_Block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(Keyword_Block);
			setState(93);
			reference();
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

	public static class SurfaceRule_SequenceContext extends ParserRuleContext {
		public TerminalNode Keyword_Sequence() { return getToken(MMSParser.Keyword_Sequence, 0); }
		public TerminalNode SquareOpen() { return getToken(MMSParser.SquareOpen, 0); }
		public TerminalNode SquareClose() { return getToken(MMSParser.SquareClose, 0); }
		public List<TerminalNode> NL() { return getTokens(MMSParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MMSParser.NL, i);
		}
		public List<SurfaceRuleContext> surfaceRule() {
			return getRuleContexts(SurfaceRuleContext.class);
		}
		public SurfaceRuleContext surfaceRule(int i) {
			return getRuleContext(SurfaceRuleContext.class,i);
		}
		public SurfaceRule_SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surfaceRule_Sequence; }
	}

	public final SurfaceRule_SequenceContext surfaceRule_Sequence() throws RecognitionException {
		SurfaceRule_SequenceContext _localctx = new SurfaceRule_SequenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_surfaceRule_Sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(Keyword_Sequence);
			setState(96);
			match(SquareOpen);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(97);
				match(NL);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keyword_Sequence) | (1L << Keyword_Block) | (1L << Keyword_If))) != 0)) {
				{
				{
				setState(103);
				surfaceRule();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(104);
					match(NL);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
		enterRule(_localctx, 22, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(Identifier);
			setState(118);
			match(Colon);
			setState(119);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\7\4#\n\4\f\4\16\4&\13\4"+
		"\3\4\3\4\6\4*\n\4\r\4\16\4+\7\4.\n\4\f\4\16\4\61\13\4\3\4\5\4\64\n\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\6\7A\n\7\r\7\16\7B\3\7\3\7"+
		"\6\7G\n\7\r\7\16\7H\7\7K\n\7\f\7\16\7N\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\5\tY\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\7\fe\n"+
		"\f\f\f\16\fh\13\f\3\f\3\f\7\fl\n\f\f\f\16\fo\13\f\7\fq\n\f\f\f\16\ft\13"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2"+
		"\2\2{\2\32\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b\67\3\2\2\2\n;\3\2\2\2\f>"+
		"\3\2\2\2\16Q\3\2\2\2\20X\3\2\2\2\22Z\3\2\2\2\24^\3\2\2\2\26a\3\2\2\2\30"+
		"w\3\2\2\2\32\33\7\23\2\2\33\34\7\"\2\2\34\35\7!\2\2\35\3\3\2\2\2\36\37"+
		"\5\b\5\2\37\5\3\2\2\2 $\5\2\2\2!#\7\30\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2"+
		"\2\2$%\3\2\2\2%/\3\2\2\2&$\3\2\2\2\')\5\4\3\2(*\7\30\2\2)(\3\2\2\2*+\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-\'\3\2\2\2.\61\3\2\2\2/-\3\2\2\2"+
		"/\60\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\63"+
		"\64\3\2\2\2\64\65\3\2\2\2\65\66\7\2\2\3\66\7\3\2\2\2\678\7\3\2\289\7\""+
		"\2\29:\5\f\7\2:\t\3\2\2\2;<\7\3\2\2<=\5\f\7\2=\13\3\2\2\2>@\7\33\2\2?"+
		"A\7\30\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CL\3\2\2\2DF\5\16\b"+
		"\2EG\7\30\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JD\3\2"+
		"\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\34\2\2P\r\3"+
		"\2\2\2QR\7\4\2\2RS\7\"\2\2ST\5\20\t\2T\17\3\2\2\2UY\5\22\n\2VY\5\24\13"+
		"\2WY\5\26\f\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\21\3\2\2\2Z[\7\24\2\2[\\"+
		"\7\31\2\2\\]\7\32\2\2]\23\3\2\2\2^_\7\7\2\2_`\5\30\r\2`\25\3\2\2\2ab\7"+
		"\6\2\2bf\7\31\2\2ce\7\30\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g"+
		"r\3\2\2\2hf\3\2\2\2im\5\20\t\2jl\7\30\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pi\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2su\3\2\2\2tr\3\2\2\2uv\7\32\2\2v\27\3\2\2\2wx\7\"\2\2xy\7 \2\2yz\7\""+
		"\2\2z\31\3\2\2\2\r$+/\63BHLXfmr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}