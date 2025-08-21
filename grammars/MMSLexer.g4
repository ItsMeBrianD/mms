lexer grammar MMSLexer;

channels {
    SYMBOL
}


SquareOpen: '[';
SquareClose: ']';
CurlyOpen: '{';
CurlyClose: '}';
RoundOpen: '(';
RoundClose: ')';

Colon: ':';
SemiColon: ';';
Identifier: [a-zA-Z_][a-zA-Z0-9_]* -> channel(SYMBOL);