parser grammar MMSParser;
options {
	tokenVocab = MMSLexer;
}

import MMS_SurfaceRules, MMS_Lang_Parsers;

namespaceDeclaration: Keyword_Namespace Identifier SemiColon;

mmsFile: namespaceDeclaration NewLine* EOF;