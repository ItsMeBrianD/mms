parser grammar MMSParse;

import DensityFunctions;
options {
	tokenVocab = MMSLex;
}

statement: densityStatement;

file: (statement | NewLine | Whitespace)* EOF;