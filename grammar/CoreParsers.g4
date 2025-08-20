parser grammar CoreParsers;

options { tokenVocab = MMSLex; }

reference: Identifier Colon Identifier;