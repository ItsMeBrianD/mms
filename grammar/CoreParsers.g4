parser grammar CoreParsers;

options {
	tokenVocab = MMSLex;
}

reference: Quote Identifier Colon Identifier Quote;

verticalAnchor:
	(Keyword_Absolute | Keyword_AboveBottom | Keyword_BelowTop) Integer;

referenceArray:
	SquareOpen NewLine* reference NewLine* (
		Comma NewLine* reference
	)* NewLine* Comma? NewLine* SquareClose;
