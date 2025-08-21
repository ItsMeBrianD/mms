lexer grammar MMSLexer;

/// surface rule keywords
Keyword_Surface: 'surface';
Keyword_Rule: 'rule';
Keyword_Condition: 'condition';
// Rules
Keyword_Sequence: 'sequence';
Keyword_Block: 'block';
// Conditions
Keyword_Bandlands: 'bandlands';
Keyword_AbovePreliminarySurface: 'above_preliminary_surface';
Keyword_Biome: 'biome';
Keyword_Hole: 'hole';
Keyword_Steep: 'steep';
Keyword_StoneDepth: 'stone_depth';
Keyword_Freezing: 'freezing';
Keyword_Temperature: 'temperature';
Keyword_VerticalGradient: 'vertical_gradient';
Keyword_AboveWater: 'above_water';
Keyword_YAbove: 'y_above';
///


Keyword_Namespace: 'namespace';
Keyword_If: 'if';
Keyword_Else: 'else';
Keyword_In: 'in';

WS: [\t ]+ -> skip;
NL: [\n\r];

SquareOpen: '[';
SquareClose: ']';
CurlyOpen: '{';
CurlyClose: '}';
RoundOpen: '(';
RoundClose: ')';
Bang: '!';

Colon: ':';
SemiColon: ';';
// Must come last
Identifier: [a-zA-Z_][a-zA-Z0-9_]*;