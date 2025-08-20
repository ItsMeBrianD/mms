parser grammar SurfaceRules;

options {
	tokenVocab = MMSLex;
}

import CoreParsers, BlockState;

surfaceStatement:
	Keyword_Surface BlockStart NewLine* (
		(surfaceRuleDeclaration | surfaceConditionDeclaration) NewLine*
	)* NewLine* BlockEnd;

surfaceRuleDeclaration: Keyword_Rule Identifier surfaceRule;
surfaceRuleInline:
	BlockStart NewLine* surfaceRule NewLine* BlockEnd;
surfaceRule:
	blockSurfaceRule
	| sequenceSurfaceRule
	| conditionSurfaceRule;
surfaceRuleReference: reference | surfaceRuleInline;

blockSurfaceRule: Keyword_Block blockState;
sequenceSurfaceRule:
	Keyword_Sequence NewLine* SquareOpen NewLine* (
		surfaceRuleReference NewLine* Comma NewLine*
	)* surfaceRuleReference NewLine* SquareClose NewLine*;
bandlandsSurfaceRule: Keyword_Bandlands;

conditionSurfaceRule:
	NewLine? Keyword_If RoundOpen NewLine* surfaceCondition NewLine* RoundClose NewLine* (
		surfaceRuleReference
	) NewLine* (Keyword_Else NewLine* (surfaceRuleReference))?;

surfaceConditionDeclaration: Keyword_Condition;
surfaceConditionInline: RoundOpen surfaceCondition RoundClose;
surfaceCondition:
	biomeSurfaceCondition
	| abovePreliminarySurfaceCondition;
biomeSurfaceCondition: Keyword_Biome referenceArray;
abovePreliminarySurfaceCondition:
	Keyword_AbovePreliminarySurface verticalAnchor;

////// Conditions
/*
 surfaceConditionStart: Keyword_Surface Keyword_Condition; surfaceConditionStatement:
 surfaceConditionStart NewLine* Identifier NewLine* surfaceCondition;
 anonymousSurfaceConditionStatement: surfaceConditionStart NewLine* surfaceCondition;
 

 

 

 

 

 

 

 

 surfaceCondition: biomeSurfaceCondition | abovePreliminarySurfaceCondition;
 
 biomeSurfaceCondition: Keyword_Biome referenceArray; abovePreliminarySurfaceCondition:
 Keyword_AbovePreliminarySurface NewLine* verticalAnchor;
 
 holeSurfaceCondition: Keyword_Hole;
 
 ////// Rules surface rule surfaceRuleStart: Keyword_Surface Keyword_Rule;
 
 // surface rule [name] { surfaceRuleStatement: surfaceRuleStart NewLine* Identifier NewLine*
 surfaceRule;
 
 // surface rule { anonymousSurfaceRuleStatement: surfaceRuleStart NewLine* surfaceRule;
 

 

 

 

 

 

 

 

 surfaceRule: sequenceSurfaceRule | conditionSurfaceRule | blockSurfaceRule; blockedSurfaceRule:
 BlockStart NewLine* surfaceRule NewLine* BlockEnd;
 
 sequenceSurfaceRule: Keyword_Sequence NewLine* SquareOpen NewLine* ( reference | (RoundOpen
 NewLine* surfaceRule NewLine* RoundClose) ) NewLine* SquareClose NewLine*;
 
 conditionSurfaceRule: Keyword_Condition NewLine* BlockStart NewLine* Keyword_If RoundOpen (
 reference | surfaceCondition ) RoundClose NewLine* blockedSurfaceRule NewLine* Keyword_Else
 NewLine* blockedSurfaceRule NewLine* BlockEnd NewLine*;
 
 blockSurfaceRule: Keyword_Block NewLine* blockState NewLine*;
 */