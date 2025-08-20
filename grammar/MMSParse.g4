parser grammar MMSParse;

import DensityFunctions, Noise;
options {
	tokenVocab = MMSLex;
}

statement: densityStatement | noiseStatement;

namespaceStatement: Keyword_Namespace Identifier;

file: namespaceStatement NewLine+ (statement | NewLine | Whitespace)* EOF;