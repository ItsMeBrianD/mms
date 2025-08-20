parser grammar Noise;

import CoreParsers;

options {
	tokenVocab = MMSLex;
}

noiseFirstOctaveLine: Keyword_FirstOctave Integer;

noiseAmplitudes:
	Keyword_Amplitudes SquareOpen (Integer | Float) (
		Comma (Integer | Float)
	)* SquareClose;

noiseStatement:
	Keyword_Noise Identifier BlockStart NewLine* noiseFirstOctaveLine NewLine* noiseAmplitudes
		NewLine* BlockEnd;