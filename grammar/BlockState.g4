parser grammar BlockState;
import CoreParsers;

options {
	tokenVocab = MMSLex;
}

blockProperties: BlockStart NewLine* NewLine* BlockEnd;

blockState: reference blockProperties?;