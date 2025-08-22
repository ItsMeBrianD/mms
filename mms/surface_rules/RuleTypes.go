package surface_rules

import (
	"encoding/json"
)

type RuleType string

const (
	BlockRuleType       RuleType = "minecraft:block"
	ConditionalRuleType RuleType = "minecraft:conditional"
	SequenceRuleType    RuleType = "minecraft:sequence"
	ReferenceRuleType   RuleType = "mms:__reference"
)

type Rule interface {
	json.Marshaler
	Type() RuleType
}
