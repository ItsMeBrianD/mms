// Generated from ./grammar/MMSParse.g4 by ANTLR 4.13.2
// noinspection ES6UnusedImports,JSUnusedGlobalSymbols,JSUnusedLocalSymbols

import {
	ATN,
	ATNDeserializer, DecisionState, DFA, FailedPredicateException,
	RecognitionException, NoViableAltException, BailErrorStrategy,
	Parser, ParserATNSimulator,
	RuleContext, ParserRuleContext, PredictionMode, PredictionContextCache,
	TerminalNode, RuleNode,
	Token, TokenStream,
	Interval, IntervalSet
} from 'antlr4';
import MMSParseListener from "./MMSParseListener.js";
// for running tests with parameters, TODO: discuss strategy for typed parameters in CI
// eslint-disable-next-line no-unused-vars
type int = number;

export default class MMSParse extends Parser {
	public static readonly DensityFunctionStart = 1;
	public static readonly Keyword_Noise = 2;
	public static readonly Keyword_Constant = 3;
	public static readonly Keyword_XZScale = 4;
	public static readonly Keyword_YScale = 5;
	public static readonly Whitespace = 6;
	public static readonly Float = 7;
	public static readonly Integer = 8;
	public static readonly BlockStart = 9;
	public static readonly BlockEnd = 10;
	public static readonly NewLine = 11;
	public static readonly Colon = 12;
	public static readonly Identifier = 13;
	public static override readonly EOF = Token.EOF;
	public static readonly RULE_statement = 0;
	public static readonly RULE_file = 1;
	public static readonly RULE_densityStatement = 2;
	public static readonly RULE_densityNoiseDeclaration = 3;
	public static readonly RULE_densityNoiseLine = 4;
	public static readonly RULE_densityXZScaleLine = 5;
	public static readonly RULE_densityYScaleLine = 6;
	public static readonly RULE_densityNoiseStatement = 7;
	public static readonly RULE_reference = 8;
	public static readonly literalNames: (string | null)[] = [ null, "'density'", 
                                                            "'noise'", "'constant'", 
                                                            "'xz_scale'", 
                                                            "'y_scale'", 
                                                            null, null, 
                                                            null, "'{'", 
                                                            null, null, 
                                                            "':'" ];
	public static readonly symbolicNames: (string | null)[] = [ null, "DensityFunctionStart", 
                                                             "Keyword_Noise", 
                                                             "Keyword_Constant", 
                                                             "Keyword_XZScale", 
                                                             "Keyword_YScale", 
                                                             "Whitespace", 
                                                             "Float", "Integer", 
                                                             "BlockStart", 
                                                             "BlockEnd", 
                                                             "NewLine", 
                                                             "Colon", "Identifier" ];
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"statement", "file", "densityStatement", "densityNoiseDeclaration", "densityNoiseLine", 
		"densityXZScaleLine", "densityYScaleLine", "densityNoiseStatement", "reference",
	];
	public get grammarFileName(): string { return "MMSParse.g4"; }
	public get literalNames(): (string | null)[] { return MMSParse.literalNames; }
	public get symbolicNames(): (string | null)[] { return MMSParse.symbolicNames; }
	public get ruleNames(): string[] { return MMSParse.ruleNames; }
	public get serializedATN(): number[] { return MMSParse._serializedATN; }

	protected createFailedPredicateException(predicate?: string, message?: string): FailedPredicateException {
		return new FailedPredicateException(this, predicate, message);
	}

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(this, MMSParse._ATN, MMSParse.DecisionsToDFA, new PredictionContextCache());
	}
	// @RuleVersion(0)
	public statement(): StatementContext {
		let localctx: StatementContext = new StatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 0, MMSParse.RULE_statement);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 18;
			this.densityStatement();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public file(): FileContext {
		let localctx: FileContext = new FileContext(this, this._ctx, this.state);
		this.enterRule(localctx, 2, MMSParse.RULE_file);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 25;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 2114) !== 0)) {
				{
				this.state = 23;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 1:
					{
					this.state = 20;
					this.statement();
					}
					break;
				case 11:
					{
					this.state = 21;
					this.match(MMSParse.NewLine);
					}
					break;
				case 6:
					{
					this.state = 22;
					this.match(MMSParse.Whitespace);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 27;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 28;
			this.match(MMSParse.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityStatement(): DensityStatementContext {
		let localctx: DensityStatementContext = new DensityStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 4, MMSParse.RULE_densityStatement);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 30;
			this.densityNoiseStatement();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityNoiseDeclaration(): DensityNoiseDeclarationContext {
		let localctx: DensityNoiseDeclarationContext = new DensityNoiseDeclarationContext(this, this._ctx, this.state);
		this.enterRule(localctx, 6, MMSParse.RULE_densityNoiseDeclaration);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 32;
			this.match(MMSParse.DensityFunctionStart);
			this.state = 33;
			this.match(MMSParse.Colon);
			this.state = 34;
			this.match(MMSParse.Keyword_Noise);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityNoiseLine(): DensityNoiseLineContext {
		let localctx: DensityNoiseLineContext = new DensityNoiseLineContext(this, this._ctx, this.state);
		this.enterRule(localctx, 8, MMSParse.RULE_densityNoiseLine);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 36;
			this.match(MMSParse.Keyword_Noise);
			this.state = 37;
			this.reference();
			this.state = 41;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===11) {
				{
				{
				this.state = 38;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 43;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityXZScaleLine(): DensityXZScaleLineContext {
		let localctx: DensityXZScaleLineContext = new DensityXZScaleLineContext(this, this._ctx, this.state);
		this.enterRule(localctx, 10, MMSParse.RULE_densityXZScaleLine);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 44;
			this.match(MMSParse.Keyword_XZScale);
			this.state = 45;
			_la = this._input.LA(1);
			if(!(_la===7 || _la===8)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 49;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===11) {
				{
				{
				this.state = 46;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 51;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityYScaleLine(): DensityYScaleLineContext {
		let localctx: DensityYScaleLineContext = new DensityYScaleLineContext(this, this._ctx, this.state);
		this.enterRule(localctx, 12, MMSParse.RULE_densityYScaleLine);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 52;
			this.match(MMSParse.Keyword_YScale);
			this.state = 53;
			_la = this._input.LA(1);
			if(!(_la===7 || _la===8)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 57;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 4, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 54;
					this.match(MMSParse.NewLine);
					}
					}
				}
				this.state = 59;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 4, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public densityNoiseStatement(): DensityNoiseStatementContext {
		let localctx: DensityNoiseStatementContext = new DensityNoiseStatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 14, MMSParse.RULE_densityNoiseStatement);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 60;
			this.densityNoiseDeclaration();
			this.state = 61;
			this.match(MMSParse.Identifier);
			this.state = 62;
			this.match(MMSParse.BlockStart);
			this.state = 66;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===11) {
				{
				{
				this.state = 63;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 68;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			{
			this.state = 69;
			this.densityNoiseLine();
			this.state = 70;
			this.densityXZScaleLine();
			this.state = 71;
			this.densityYScaleLine();
			}
			this.state = 76;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la===11) {
				{
				{
				this.state = 73;
				this.match(MMSParse.NewLine);
				}
				}
				this.state = 78;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 79;
			this.match(MMSParse.BlockEnd);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public reference(): ReferenceContext {
		let localctx: ReferenceContext = new ReferenceContext(this, this._ctx, this.state);
		this.enterRule(localctx, 16, MMSParse.RULE_reference);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 81;
			this.match(MMSParse.Identifier);
			this.state = 82;
			this.match(MMSParse.Colon);
			this.state = 83;
			this.match(MMSParse.Identifier);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}

	public static readonly _serializedATN: number[] = [4,1,13,86,2,0,7,0,2,
	1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,1,0,1,0,1,
	1,1,1,1,1,5,1,24,8,1,10,1,12,1,27,9,1,1,1,1,1,1,2,1,2,1,3,1,3,1,3,1,3,1,
	4,1,4,1,4,5,4,40,8,4,10,4,12,4,43,9,4,1,5,1,5,1,5,5,5,48,8,5,10,5,12,5,
	51,9,5,1,6,1,6,1,6,5,6,56,8,6,10,6,12,6,59,9,6,1,7,1,7,1,7,1,7,5,7,65,8,
	7,10,7,12,7,68,9,7,1,7,1,7,1,7,1,7,1,7,5,7,75,8,7,10,7,12,7,78,9,7,1,7,
	1,7,1,8,1,8,1,8,1,8,1,8,0,0,9,0,2,4,6,8,10,12,14,16,0,1,1,0,7,8,84,0,18,
	1,0,0,0,2,25,1,0,0,0,4,30,1,0,0,0,6,32,1,0,0,0,8,36,1,0,0,0,10,44,1,0,0,
	0,12,52,1,0,0,0,14,60,1,0,0,0,16,81,1,0,0,0,18,19,3,4,2,0,19,1,1,0,0,0,
	20,24,3,0,0,0,21,24,5,11,0,0,22,24,5,6,0,0,23,20,1,0,0,0,23,21,1,0,0,0,
	23,22,1,0,0,0,24,27,1,0,0,0,25,23,1,0,0,0,25,26,1,0,0,0,26,28,1,0,0,0,27,
	25,1,0,0,0,28,29,5,0,0,1,29,3,1,0,0,0,30,31,3,14,7,0,31,5,1,0,0,0,32,33,
	5,1,0,0,33,34,5,12,0,0,34,35,5,2,0,0,35,7,1,0,0,0,36,37,5,2,0,0,37,41,3,
	16,8,0,38,40,5,11,0,0,39,38,1,0,0,0,40,43,1,0,0,0,41,39,1,0,0,0,41,42,1,
	0,0,0,42,9,1,0,0,0,43,41,1,0,0,0,44,45,5,4,0,0,45,49,7,0,0,0,46,48,5,11,
	0,0,47,46,1,0,0,0,48,51,1,0,0,0,49,47,1,0,0,0,49,50,1,0,0,0,50,11,1,0,0,
	0,51,49,1,0,0,0,52,53,5,5,0,0,53,57,7,0,0,0,54,56,5,11,0,0,55,54,1,0,0,
	0,56,59,1,0,0,0,57,55,1,0,0,0,57,58,1,0,0,0,58,13,1,0,0,0,59,57,1,0,0,0,
	60,61,3,6,3,0,61,62,5,13,0,0,62,66,5,9,0,0,63,65,5,11,0,0,64,63,1,0,0,0,
	65,68,1,0,0,0,66,64,1,0,0,0,66,67,1,0,0,0,67,69,1,0,0,0,68,66,1,0,0,0,69,
	70,3,8,4,0,70,71,3,10,5,0,71,72,3,12,6,0,72,76,1,0,0,0,73,75,5,11,0,0,74,
	73,1,0,0,0,75,78,1,0,0,0,76,74,1,0,0,0,76,77,1,0,0,0,77,79,1,0,0,0,78,76,
	1,0,0,0,79,80,5,10,0,0,80,15,1,0,0,0,81,82,5,13,0,0,82,83,5,12,0,0,83,84,
	5,13,0,0,84,17,1,0,0,0,7,23,25,41,49,57,66,76];

	private static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!MMSParse.__ATN) {
			MMSParse.__ATN = new ATNDeserializer().deserialize(MMSParse._serializedATN);
		}

		return MMSParse.__ATN;
	}


	static DecisionsToDFA = MMSParse._ATN.decisionToState.map( (ds: DecisionState, index: number) => new DFA(ds, index) );

}

export class StatementContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public densityStatement(): DensityStatementContext {
		return this.getTypedRuleContext(DensityStatementContext, 0) as DensityStatementContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_statement;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterStatement) {
	 		listener.enterStatement(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitStatement) {
	 		listener.exitStatement(this);
		}
	}
}


export class FileContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public EOF(): TerminalNode {
		return this.getToken(MMSParse.EOF, 0);
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
	public Whitespace_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.Whitespace);
	}
	public Whitespace(i: number): TerminalNode {
		return this.getToken(MMSParse.Whitespace, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_file;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterFile) {
	 		listener.enterFile(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitFile) {
	 		listener.exitFile(this);
		}
	}
}


export class DensityStatementContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public densityNoiseStatement(): DensityNoiseStatementContext {
		return this.getTypedRuleContext(DensityNoiseStatementContext, 0) as DensityNoiseStatementContext;
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityStatement;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityStatement) {
	 		listener.enterDensityStatement(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityStatement) {
	 		listener.exitDensityStatement(this);
		}
	}
}


export class DensityNoiseDeclarationContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public DensityFunctionStart(): TerminalNode {
		return this.getToken(MMSParse.DensityFunctionStart, 0);
	}
	public Colon(): TerminalNode {
		return this.getToken(MMSParse.Colon, 0);
	}
	public Keyword_Noise(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Noise, 0);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityNoiseDeclaration;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityNoiseDeclaration) {
	 		listener.enterDensityNoiseDeclaration(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityNoiseDeclaration) {
	 		listener.exitDensityNoiseDeclaration(this);
		}
	}
}


export class DensityNoiseLineContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_Noise(): TerminalNode {
		return this.getToken(MMSParse.Keyword_Noise, 0);
	}
	public reference(): ReferenceContext {
		return this.getTypedRuleContext(ReferenceContext, 0) as ReferenceContext;
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityNoiseLine;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityNoiseLine) {
	 		listener.enterDensityNoiseLine(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityNoiseLine) {
	 		listener.exitDensityNoiseLine(this);
		}
	}
}


export class DensityXZScaleLineContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_XZScale(): TerminalNode {
		return this.getToken(MMSParse.Keyword_XZScale, 0);
	}
	public Float(): TerminalNode {
		return this.getToken(MMSParse.Float, 0);
	}
	public Integer(): TerminalNode {
		return this.getToken(MMSParse.Integer, 0);
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityXZScaleLine;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityXZScaleLine) {
	 		listener.enterDensityXZScaleLine(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityXZScaleLine) {
	 		listener.exitDensityXZScaleLine(this);
		}
	}
}


export class DensityYScaleLineContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Keyword_YScale(): TerminalNode {
		return this.getToken(MMSParse.Keyword_YScale, 0);
	}
	public Float(): TerminalNode {
		return this.getToken(MMSParse.Float, 0);
	}
	public Integer(): TerminalNode {
		return this.getToken(MMSParse.Integer, 0);
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityYScaleLine;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityYScaleLine) {
	 		listener.enterDensityYScaleLine(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityYScaleLine) {
	 		listener.exitDensityYScaleLine(this);
		}
	}
}


export class DensityNoiseStatementContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public densityNoiseDeclaration(): DensityNoiseDeclarationContext {
		return this.getTypedRuleContext(DensityNoiseDeclarationContext, 0) as DensityNoiseDeclarationContext;
	}
	public Identifier(): TerminalNode {
		return this.getToken(MMSParse.Identifier, 0);
	}
	public BlockStart(): TerminalNode {
		return this.getToken(MMSParse.BlockStart, 0);
	}
	public BlockEnd(): TerminalNode {
		return this.getToken(MMSParse.BlockEnd, 0);
	}
	public densityNoiseLine(): DensityNoiseLineContext {
		return this.getTypedRuleContext(DensityNoiseLineContext, 0) as DensityNoiseLineContext;
	}
	public densityXZScaleLine(): DensityXZScaleLineContext {
		return this.getTypedRuleContext(DensityXZScaleLineContext, 0) as DensityXZScaleLineContext;
	}
	public densityYScaleLine(): DensityYScaleLineContext {
		return this.getTypedRuleContext(DensityYScaleLineContext, 0) as DensityYScaleLineContext;
	}
	public NewLine_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.NewLine);
	}
	public NewLine(i: number): TerminalNode {
		return this.getToken(MMSParse.NewLine, i);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_densityNoiseStatement;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterDensityNoiseStatement) {
	 		listener.enterDensityNoiseStatement(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitDensityNoiseStatement) {
	 		listener.exitDensityNoiseStatement(this);
		}
	}
}


export class ReferenceContext extends ParserRuleContext {
	constructor(parser?: MMSParse, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public Identifier_list(): TerminalNode[] {
	    	return this.getTokens(MMSParse.Identifier);
	}
	public Identifier(i: number): TerminalNode {
		return this.getToken(MMSParse.Identifier, i);
	}
	public Colon(): TerminalNode {
		return this.getToken(MMSParse.Colon, 0);
	}
    public get ruleIndex(): number {
    	return MMSParse.RULE_reference;
	}
	public enterRule(listener: MMSParseListener): void {
	    if(listener.enterReference) {
	 		listener.enterReference(this);
		}
	}
	public exitRule(listener: MMSParseListener): void {
	    if(listener.exitReference) {
	 		listener.exitReference(this);
		}
	}
}
