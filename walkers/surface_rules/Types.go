package surface_rule_walkers

import "github.com/itsmebriand/mms/mms/grammars"

type RuleType string

const (
	BlockRuleType       RuleType = "minecraft:block"
	ConditionalRuleType RuleType = "minecraft:conditional"
	SequenceRuleType    RuleType = "minecraft:sequence"
	ReferenceRuleType   RuleType = "mms:__reference"
)

type Rule interface {
	Type() RuleType
}

type BlockRule struct {
	Block string `json:"block"`
}

func (r BlockRule) Type() RuleType { return BlockRuleType }

type SequenceRule struct {
	Sequence []Rule `json:"sequence"`
}

func (r SequenceRule) Type() RuleType { return SequenceRuleType }

type SurfaceReferenceRule struct {
	Ref string
}

func (r SurfaceReferenceRule) Type() RuleType { return ReferenceRuleType }

type SurfaceRuleSerializer struct {
	grammars.BaseMMSParserListener
	ruleStack   []Rule
	rulesByName map[string]Rule
}

func NewSurfaceRuleSerializer() *SurfaceRuleSerializer {
	return &SurfaceRuleSerializer{
		rulesByName: make(map[string]Rule),
	}
}

func (l SurfaceRuleSerializer) GetRules() map[string]Rule {
	return l.rulesByName
}

type SurfaceRuleSubstituer struct {
	grammars.BaseMMSParserListener
	rulesByName map[string]Rule
}

func NewSurfaceRuleSubstituer(serializer *SurfaceRuleSerializer) *SurfaceRuleSubstituer {
	return &SurfaceRuleSubstituer{
		rulesByName: serializer.rulesByName,
	}
}
