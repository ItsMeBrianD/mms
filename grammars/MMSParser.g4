parser grammar MMSParser;
options {
	tokenVocab = MMSLexer;
}

import MMS_SurfaceRules, MMS_Lang_Parsers;

namespaceDeclaration: Keyword_Namespace Identifier SemiColon;
statement: surfaceDeclaration;


mmsFile: namespaceDeclaration NL* (statement NL+)* statement? EOF;