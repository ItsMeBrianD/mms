// Generated from ./grammar/MMSLex.g4 by ANTLR 4.13.2
// noinspection ES6UnusedImports,JSUnusedGlobalSymbols,JSUnusedLocalSymbols
import {
	ATN,
	ATNDeserializer,
	CharStream,
	DecisionState, DFA,
	Lexer,
	LexerATNSimulator,
	RuleContext,
	PredictionContextCache,
	Token
} from "antlr4";
export default class MMSLex extends Lexer {
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
	public static readonly EOF = Token.EOF;

	public static readonly channelNames: string[] = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
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
	public static readonly modeNames: string[] = [ "DEFAULT_MODE", ];

	public static readonly ruleNames: string[] = [
		"DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
		"Keyword_YScale", "Whitespace", "Float", "Integer", "BlockStart", "BlockEnd", 
		"NewLine", "OptionalWhitespace", "Colon", "Identifier",
	];


	constructor(input: CharStream) {
		super(input);
		this._interp = new LexerATNSimulator(this, MMSLex._ATN, MMSLex.DecisionsToDFA, new PredictionContextCache());
	}

	public get grammarFileName(): string { return "MMSLex.g4"; }

	public get literalNames(): (string | null)[] { return MMSLex.literalNames; }
	public get symbolicNames(): (string | null)[] { return MMSLex.symbolicNames; }
	public get ruleNames(): string[] { return MMSLex.ruleNames; }

	public get serializedATN(): number[] { return MMSLex._serializedATN; }

	public get channelNames(): string[] { return MMSLex.channelNames; }

	public get modeNames(): string[] { return MMSLex.modeNames; }

	public static readonly _serializedATN: number[] = [4,0,13,117,6,-1,2,0,
	7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,
	7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,1,0,1,0,1,0,1,0,1,0,1,0,1,0,
	1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,
	1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,5,4,5,71,
	8,5,11,5,12,5,72,1,5,1,5,1,6,4,6,78,8,6,11,6,12,6,79,1,6,1,6,4,6,84,8,6,
	11,6,12,6,85,1,7,4,7,89,8,7,11,7,12,7,90,1,8,1,8,1,9,5,9,96,8,9,10,9,12,
	9,99,9,9,1,9,1,9,1,10,1,10,1,11,5,11,106,8,11,10,11,12,11,109,9,11,1,12,
	1,12,1,13,4,13,114,8,13,11,13,12,13,115,0,0,14,1,1,3,2,5,3,7,4,9,5,11,6,
	13,7,15,8,17,9,19,10,21,11,23,0,25,12,27,13,1,0,5,2,0,9,9,32,32,1,0,48,
	57,3,0,9,10,13,13,32,32,2,0,10,10,13,13,4,0,48,57,65,90,95,95,97,122,122,
	0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,
	0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,25,
	1,0,0,0,0,27,1,0,0,0,1,29,1,0,0,0,3,37,1,0,0,0,5,43,1,0,0,0,7,52,1,0,0,
	0,9,61,1,0,0,0,11,70,1,0,0,0,13,77,1,0,0,0,15,88,1,0,0,0,17,92,1,0,0,0,
	19,97,1,0,0,0,21,102,1,0,0,0,23,107,1,0,0,0,25,110,1,0,0,0,27,113,1,0,0,
	0,29,30,5,100,0,0,30,31,5,101,0,0,31,32,5,110,0,0,32,33,5,115,0,0,33,34,
	5,105,0,0,34,35,5,116,0,0,35,36,5,121,0,0,36,2,1,0,0,0,37,38,5,110,0,0,
	38,39,5,111,0,0,39,40,5,105,0,0,40,41,5,115,0,0,41,42,5,101,0,0,42,4,1,
	0,0,0,43,44,5,99,0,0,44,45,5,111,0,0,45,46,5,110,0,0,46,47,5,115,0,0,47,
	48,5,116,0,0,48,49,5,97,0,0,49,50,5,110,0,0,50,51,5,116,0,0,51,6,1,0,0,
	0,52,53,5,120,0,0,53,54,5,122,0,0,54,55,5,95,0,0,55,56,5,115,0,0,56,57,
	5,99,0,0,57,58,5,97,0,0,58,59,5,108,0,0,59,60,5,101,0,0,60,8,1,0,0,0,61,
	62,5,121,0,0,62,63,5,95,0,0,63,64,5,115,0,0,64,65,5,99,0,0,65,66,5,97,0,
	0,66,67,5,108,0,0,67,68,5,101,0,0,68,10,1,0,0,0,69,71,7,0,0,0,70,69,1,0,
	0,0,71,72,1,0,0,0,72,70,1,0,0,0,72,73,1,0,0,0,73,74,1,0,0,0,74,75,6,5,0,
	0,75,12,1,0,0,0,76,78,7,1,0,0,77,76,1,0,0,0,78,79,1,0,0,0,79,77,1,0,0,0,
	79,80,1,0,0,0,80,81,1,0,0,0,81,83,5,46,0,0,82,84,7,1,0,0,83,82,1,0,0,0,
	84,85,1,0,0,0,85,83,1,0,0,0,85,86,1,0,0,0,86,14,1,0,0,0,87,89,7,1,0,0,88,
	87,1,0,0,0,89,90,1,0,0,0,90,88,1,0,0,0,90,91,1,0,0,0,91,16,1,0,0,0,92,93,
	5,123,0,0,93,18,1,0,0,0,94,96,7,2,0,0,95,94,1,0,0,0,96,99,1,0,0,0,97,95,
	1,0,0,0,97,98,1,0,0,0,98,100,1,0,0,0,99,97,1,0,0,0,100,101,5,125,0,0,101,
	20,1,0,0,0,102,103,7,3,0,0,103,22,1,0,0,0,104,106,7,0,0,0,105,104,1,0,0,
	0,106,109,1,0,0,0,107,105,1,0,0,0,107,108,1,0,0,0,108,24,1,0,0,0,109,107,
	1,0,0,0,110,111,5,58,0,0,111,26,1,0,0,0,112,114,7,4,0,0,113,112,1,0,0,0,
	114,115,1,0,0,0,115,113,1,0,0,0,115,116,1,0,0,0,116,28,1,0,0,0,8,0,72,79,
	85,90,97,107,115,1,6,0,0];

	private static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!MMSLex.__ATN) {
			MMSLex.__ATN = new ATNDeserializer().deserialize(MMSLex._serializedATN);
		}

		return MMSLex.__ATN;
	}


	static DecisionsToDFA = MMSLex._ATN.decisionToState.map( (ds: DecisionState, index: number) => new DFA(ds, index) );
}