package surface_rules

import (
	"encoding/json"
	"fmt"
	"os"

	"github.com/itsmebriand/mms/mms/grammars"
)

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

	NamespaceRules map[string]map[string]Rule

	Errors []error
}

func (l *SurfaceRuleSerializer) Flush() error {
	for namespace, rules := range l.NamespaceRules {
		os.Mkdir("mms_build/"+namespace+"/_debug/surface_rules", 0755)
		for name, rule := range rules {
			file, err := os.OpenFile("mms_build/"+namespace+"/_debug/surface_rules/"+name+".json", os.O_CREATE|os.O_WRONLY, 0644)
			if err != nil {
				return err
			}
			fmt.Printf("Writing %s\n", name)
			defer file.Close()
			encoder := json.NewEncoder(file)
			encoder.SetIndent("", "  ")
			encoder.Encode(rule)
		}
	}
	return nil
}

func NewSurfaceRuleSerializer() *SurfaceRuleSerializer {
	return &SurfaceRuleSerializer{
		rulesByName:    make(map[string]Rule),
		NamespaceRules: make(map[string]map[string]Rule),
	}
}

func (l *SurfaceRuleSerializer) GetRules() map[string]Rule {
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
