parser grammar MMSParse;

import DensityFunctions, Noise, SurfaceRules;
options {
	tokenVocab = MMSLex;
}

statement:
	densityStatement
	| noiseStatement
	| surfaceStatement;

namespaceStatement: Keyword_Namespace Identifier;

file:
	namespaceStatement (
		NewLine+ (statement | NewLine | Whitespace)
	)* EOF;