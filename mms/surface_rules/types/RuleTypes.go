package surface_rule_types

import (
	"encoding/json"
)

type RuleType string

const (
	BlockRuleType       RuleType = "minecraft:block"
	ConditionalRuleType RuleType = "minecraft:condition"
	SequenceRuleType    RuleType = "minecraft:sequence"
	BandlandsRuleType   RuleType = "minecraft:bandlands"
	ReferenceRuleType   RuleType = "mms:__reference"
)

type Rule interface {
	json.Marshaler
	Type() RuleType
}
