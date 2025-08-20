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

// Surface Conditions:
Keyword_Bandlands: 'bandlands';
Keyword_Surface: 'surface';
Keyword_Rule: 'rule';
Keyword_Condition: 'condition';
Keyword_Block: 'block';
Keyword_Type: 'type';
Keyword_AbovePreliminarySurface: 'above_preliminary_surface';
Keyword_Biome: 'biome';
Keyword_BiomeIs: 'biome_is';
Keyword_Hole: 'hole';

Keyword_NoiseThreshold: 'noise_threshold';
Keyword_MinThreshold: 'min_threshold';
Keyword_MaxThreshold: 'max_threshold';

Keyword_StoneDepth: 'stone_depth';
Keyword_SurfaceType: 'surface_type';
Keyword_Offset: 'offset';
Keyword_AddSurfaceDepth: 'add_surface_depth';
Keyword_SecondaryDepthRange: 'secondary_depth_range';

// This is a weird one, it actually just checks if the block is in a snowy / cold biome
Keyword_Temperature: 'temperature';

Keyword_VerticalGradient: 'vertical_gradient';
Keyword_RandomName: 'random_name';
Keyword_TrueAtAndBelow: 'true_at_and_below';
Keyword_FalseAtAndAbove: 'false_at_and_above';

Keyword_Absolute: 'absolute';
Keyword_AboveBottom: 'above_bottom';
Keyword_BelowTop: 'below_top';


Keyword_Water: 'water';
Keyword_SurfaceDepthMulitplier: 'surface_depth_mulitplier';
Keyword_AddStoneDepth: 'add_stone_depth';

Keyword_Sequence: 'sequence';

Keyword_YAbove: 'y_above';
Keyword_Anchor: 'anchor';


Keyword_If: 'if';
Keyword_Else: 'else';


// Basic tokens

Whitespace: [ \t]+ -> skip; // skip spaces, tabs, newlines
Float: '-'?[0-9]+ '.' [0-9]+;
Integer: '-'?[0-9]+;

BlockStart: '{';
BlockEnd: [\n\r \t]* '}';
NewLine: [\n\r];
fragment OptionalWhitespace: [ \t]*;
Colon: ':';
RoundOpen: '(';
RoundClose: ')';
SquareOpen: '[';
SquareClose: ']';
Comma: ',';
Comment: '//' ~[\r\n]* -> skip;
Not: '!';
Quote: '"';

Identifier: [a-zA-Z0-9_]+; // match lower-case identifiers