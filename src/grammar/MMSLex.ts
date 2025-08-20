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
	public static readonly Keyword_FirstOctave = 6;
	public static readonly Keyword_Amplitudes = 7;
	public static readonly Keyword_Namespace = 8;
	public static readonly Whitespace = 9;
	public static readonly Float = 10;
	public static readonly Integer = 11;
	public static readonly BlockStart = 12;
	public static readonly BlockEnd = 13;
	public static readonly NewLine = 14;
	public static readonly Colon = 15;
	public static readonly SquareOpen = 16;
	public static readonly SquareClose = 17;
	public static readonly Comma = 18;
	public static readonly Comment = 19;
	public static readonly Identifier = 20;
	public static readonly EOF = Token.EOF;

	public static readonly channelNames: string[] = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	public static readonly literalNames: (string | null)[] = [ null, "'density'", 
                                                            "'noise'", "'constant'", 
                                                            "'xz_scale'", 
                                                            "'y_scale'", 
                                                            "'first_octave'", 
                                                            "'amplitudes'", 
                                                            "'namespace'", 
                                                            null, null, 
                                                            null, "'{'", 
                                                            null, null, 
                                                            "':'", "'['", 
                                                            "']'", "','" ];
	public static readonly symbolicNames: (string | null)[] = [ null, "DensityFunctionStart", 
                                                             "Keyword_Noise", 
                                                             "Keyword_Constant", 
                                                             "Keyword_XZScale", 
                                                             "Keyword_YScale", 
                                                             "Keyword_FirstOctave", 
                                                             "Keyword_Amplitudes", 
                                                             "Keyword_Namespace", 
                                                             "Whitespace", 
                                                             "Float", "Integer", 
                                                             "BlockStart", 
                                                             "BlockEnd", 
                                                             "NewLine", 
                                                             "Colon", "SquareOpen", 
                                                             "SquareClose", 
                                                             "Comma", "Comment", 
                                                             "Identifier" ];
	public static readonly modeNames: string[] = [ "DEFAULT_MODE", ];

	public static readonly ruleNames: string[] = [
		"DensityFunctionStart", "Keyword_Noise", "Keyword_Constant", "Keyword_XZScale", 
		"Keyword_YScale", "Keyword_FirstOctave", "Keyword_Amplitudes", "Keyword_Namespace", 
		"Whitespace", "Float", "Integer", "BlockStart", "BlockEnd", "NewLine", 
		"OptionalWhitespace", "Colon", "SquareOpen", "SquareClose", "Comma", "Comment", 
		"Identifier",
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

	public static readonly _serializedATN: number[] = [4,0,20,188,6,-1,2,0,
	7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,
	7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,
	16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,7,20,1,0,1,0,1,0,1,0,1,0,1,0,1,0,
	1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,
	1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,
	1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,
	1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,8,4,8,119,8,8,11,
	8,12,8,120,1,8,1,8,1,9,3,9,126,8,9,1,9,4,9,129,8,9,11,9,12,9,130,1,9,1,
	9,4,9,135,8,9,11,9,12,9,136,1,10,3,10,140,8,10,1,10,4,10,143,8,10,11,10,
	12,10,144,1,11,1,11,1,12,5,12,150,8,12,10,12,12,12,153,9,12,1,12,1,12,1,
	13,1,13,1,14,5,14,160,8,14,10,14,12,14,163,9,14,1,15,1,15,1,16,1,16,1,17,
	1,17,1,18,1,18,1,19,1,19,1,19,1,19,5,19,177,8,19,10,19,12,19,180,9,19,1,
	19,1,19,1,20,4,20,185,8,20,11,20,12,20,186,0,0,21,1,1,3,2,5,3,7,4,9,5,11,
	6,13,7,15,8,17,9,19,10,21,11,23,12,25,13,27,14,29,0,31,15,33,16,35,17,37,
	18,39,19,41,20,1,0,5,2,0,9,9,32,32,1,0,48,57,3,0,9,10,13,13,32,32,2,0,10,
	10,13,13,4,0,48,57,65,90,95,95,97,122,196,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,
	0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,
	17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,1,0,0,0,0,27,1,0,
	0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,0,0,
	41,1,0,0,0,1,43,1,0,0,0,3,51,1,0,0,0,5,57,1,0,0,0,7,66,1,0,0,0,9,75,1,0,
	0,0,11,83,1,0,0,0,13,96,1,0,0,0,15,107,1,0,0,0,17,118,1,0,0,0,19,125,1,
	0,0,0,21,139,1,0,0,0,23,146,1,0,0,0,25,151,1,0,0,0,27,156,1,0,0,0,29,161,
	1,0,0,0,31,164,1,0,0,0,33,166,1,0,0,0,35,168,1,0,0,0,37,170,1,0,0,0,39,
	172,1,0,0,0,41,184,1,0,0,0,43,44,5,100,0,0,44,45,5,101,0,0,45,46,5,110,
	0,0,46,47,5,115,0,0,47,48,5,105,0,0,48,49,5,116,0,0,49,50,5,121,0,0,50,
	2,1,0,0,0,51,52,5,110,0,0,52,53,5,111,0,0,53,54,5,105,0,0,54,55,5,115,0,
	0,55,56,5,101,0,0,56,4,1,0,0,0,57,58,5,99,0,0,58,59,5,111,0,0,59,60,5,110,
	0,0,60,61,5,115,0,0,61,62,5,116,0,0,62,63,5,97,0,0,63,64,5,110,0,0,64,65,
	5,116,0,0,65,6,1,0,0,0,66,67,5,120,0,0,67,68,5,122,0,0,68,69,5,95,0,0,69,
	70,5,115,0,0,70,71,5,99,0,0,71,72,5,97,0,0,72,73,5,108,0,0,73,74,5,101,
	0,0,74,8,1,0,0,0,75,76,5,121,0,0,76,77,5,95,0,0,77,78,5,115,0,0,78,79,5,
	99,0,0,79,80,5,97,0,0,80,81,5,108,0,0,81,82,5,101,0,0,82,10,1,0,0,0,83,
	84,5,102,0,0,84,85,5,105,0,0,85,86,5,114,0,0,86,87,5,115,0,0,87,88,5,116,
	0,0,88,89,5,95,0,0,89,90,5,111,0,0,90,91,5,99,0,0,91,92,5,116,0,0,92,93,
	5,97,0,0,93,94,5,118,0,0,94,95,5,101,0,0,95,12,1,0,0,0,96,97,5,97,0,0,97,
	98,5,109,0,0,98,99,5,112,0,0,99,100,5,108,0,0,100,101,5,105,0,0,101,102,
	5,116,0,0,102,103,5,117,0,0,103,104,5,100,0,0,104,105,5,101,0,0,105,106,
	5,115,0,0,106,14,1,0,0,0,107,108,5,110,0,0,108,109,5,97,0,0,109,110,5,109,
	0,0,110,111,5,101,0,0,111,112,5,115,0,0,112,113,5,112,0,0,113,114,5,97,
	0,0,114,115,5,99,0,0,115,116,5,101,0,0,116,16,1,0,0,0,117,119,7,0,0,0,118,
	117,1,0,0,0,119,120,1,0,0,0,120,118,1,0,0,0,120,121,1,0,0,0,121,122,1,0,
	0,0,122,123,6,8,0,0,123,18,1,0,0,0,124,126,5,45,0,0,125,124,1,0,0,0,125,
	126,1,0,0,0,126,128,1,0,0,0,127,129,7,1,0,0,128,127,1,0,0,0,129,130,1,0,
	0,0,130,128,1,0,0,0,130,131,1,0,0,0,131,132,1,0,0,0,132,134,5,46,0,0,133,
	135,7,1,0,0,134,133,1,0,0,0,135,136,1,0,0,0,136,134,1,0,0,0,136,137,1,0,
	0,0,137,20,1,0,0,0,138,140,5,45,0,0,139,138,1,0,0,0,139,140,1,0,0,0,140,
	142,1,0,0,0,141,143,7,1,0,0,142,141,1,0,0,0,143,144,1,0,0,0,144,142,1,0,
	0,0,144,145,1,0,0,0,145,22,1,0,0,0,146,147,5,123,0,0,147,24,1,0,0,0,148,
	150,7,2,0,0,149,148,1,0,0,0,150,153,1,0,0,0,151,149,1,0,0,0,151,152,1,0,
	0,0,152,154,1,0,0,0,153,151,1,0,0,0,154,155,5,125,0,0,155,26,1,0,0,0,156,
	157,7,3,0,0,157,28,1,0,0,0,158,160,7,0,0,0,159,158,1,0,0,0,160,163,1,0,
	0,0,161,159,1,0,0,0,161,162,1,0,0,0,162,30,1,0,0,0,163,161,1,0,0,0,164,
	165,5,58,0,0,165,32,1,0,0,0,166,167,5,91,0,0,167,34,1,0,0,0,168,169,5,93,
	0,0,169,36,1,0,0,0,170,171,5,44,0,0,171,38,1,0,0,0,172,173,5,47,0,0,173,
	174,5,47,0,0,174,178,1,0,0,0,175,177,8,3,0,0,176,175,1,0,0,0,177,180,1,
	0,0,0,178,176,1,0,0,0,178,179,1,0,0,0,179,181,1,0,0,0,180,178,1,0,0,0,181,
	182,6,19,0,0,182,40,1,0,0,0,183,185,7,4,0,0,184,183,1,0,0,0,185,186,1,0,
	0,0,186,184,1,0,0,0,186,187,1,0,0,0,187,42,1,0,0,0,11,0,120,125,130,136,
	139,144,151,161,178,186,1,6,0,0];

	private static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!MMSLex.__ATN) {
			MMSLex.__ATN = new ATNDeserializer().deserialize(MMSLex._serializedATN);
		}

		return MMSLex.__ATN;
	}


	static DecisionsToDFA = MMSLex._ATN.decisionToState.map( (ds: DecisionState, index: number) => new DFA(ds, index) );
}