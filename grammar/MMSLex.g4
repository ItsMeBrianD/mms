lexer grammar MMSLex;

// DensityFunctions
DensityFunctionStart: 'density';
Keyword_Noise: 'noise';
Keyword_Constant: 'constant';
Keyword_XZScale: 'xz_scale';
Keyword_YScale: 'y_scale';
Keyword_FirstOctave: 'first_octave';
Keyword_Amplitudes: 'amplitudes';

Keyword_Namespace: 'namespace';

// Basic tokens

Whitespace: [ \t]+ -> skip; // skip spaces, tabs, newlines
Float: '-'?[0-9]+ '.' [0-9]+;
Integer: '-'?[0-9]+;

BlockStart: '{';
BlockEnd: [\n\r \t]* '}';
NewLine: [\n\r];
fragment OptionalWhitespace: [ \t]*;
Colon: ':';
SquareOpen: '[';
SquareClose: ']';
Comma: ',';
Comment: '//' ~[\r\n]* -> skip;

Identifier: [a-zA-Z0-9_]+; // match lower-case identifiers