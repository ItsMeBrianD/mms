parser grammar MMS_SurfaceRules;
options {
	tokenVocab = MMSLexer;
}

import MMS_Lang_Parsers;

surfaceDeclaration: Keyword_Surface surfaceDefinition;
surfaceDefinition: CurlyOpen NL+ (surfaceRuleDeclaration NL+)* CurlyClose;


//// Surface Rules
surfaceRuleReference: Keyword_Rule RoundOpen reference RoundClose;
surfaceRuleDeclaration: Keyword_Rule Identifier surfaceRule;
surfaceRule: surfaceRule_Conditional | surfaceRule_Block | surfaceRule_Sequence;
surfaceRule_Conditional: Keyword_If SquareOpen SquareClose;
surfaceRule_Block: Keyword_Block reference;
surfaceRule_Sequence: Keyword_Sequence SquareOpen NL* ((surfaceRule | surfaceRuleReference) NL*)* SquareClose;

////