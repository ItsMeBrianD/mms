parser grammar DensityFunctions;
import CoreParsers;
options {
	tokenVocab = MMSLex;
}

densityStatement: densityNoiseStatement;

densityNoiseDeclaration:
	DensityFunctionStart Colon Keyword_Noise;
densityNoiseLine: Keyword_Noise reference NewLine*;
densityXZScaleLine: Keyword_XZScale (Float | Integer) NewLine*;
densityYScaleLine: Keyword_YScale (Float | Integer) NewLine*;
densityNoiseStatement:
	densityNoiseDeclaration Identifier BlockStart NewLine* (
		densityNoiseLine densityXZScaleLine densityYScaleLine
	) NewLine* BlockEnd;
