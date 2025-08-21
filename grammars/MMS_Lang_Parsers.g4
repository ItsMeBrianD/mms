parser grammar MMS_Lang_Parsers;

options {
	tokenVocab = MMSLexer;
}

reference: Identifier Colon Identifier;