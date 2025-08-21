lexer grammar MMSLexer;

Keyword_Namespace: 'namespace';
Keyword_If: 'if';
Keyword_Else: 'else';
Keyword_In: 'in';

Whitespace: [\t ]+ -> skip;
NewLine: [\n\r];

SquareOpen: '[';
SquareClose: ']';
CurlyOpen: '{';
CurlyClose: '}';
RoundOpen: '(';
RoundClose: ')';

Colon: ':';
SemiColon: ';';
// Must come last
Identifier: [a-zA-Z_][a-zA-Z0-9_]*;