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
	json.Marshaler
	Type() RuleType
}

type SurfaceRuleSerializer struct {
	grammars.BaseMMSParserListener
	currentNamespace string

	ruleStack        []Rule
	rulesByName      map[string]Rule
	conditionsByName map[string]Condition

	conditionStack []Condition

	NamespaceRules      map[string]map[string]Rule
	NamespaceConditions map[string]map[string]Condition

	Errors []error
}

func NewSurfaceRuleSerializer() *SurfaceRuleSerializer {
	return &SurfaceRuleSerializer{
		rulesByName:         make(map[string]Rule),
		NamespaceRules:      make(map[string]map[string]Rule),
		conditionsByName:    make(map[string]Condition),
		NamespaceConditions: make(map[string]map[string]Condition),
	}
}

func (l *SurfaceRuleSerializer) Flush() error {
	for namespace, rules := range l.NamespaceRules {
		dirPath := "mms_build/" + namespace + "/_debug"
		os.MkdirAll(dirPath, 0755)
		out := make(map[string]json.RawMessage)
		for name, rule := range rules {
			data, err := json.Marshal(rule)
			if err != nil {
				fmt.Println("Failed to marshal rule", name, err)
				return err
			}
			out[name] = data
		}
		file, err := os.OpenFile(dirPath+"/surface_rules.json", os.O_CREATE|os.O_WRONLY|os.O_TRUNC, 0644)
		if err != nil {
			fmt.Println("Failed to open surface_rules.json for namespace", namespace)
			return err
		}
		enc := json.NewEncoder(file)
		enc.SetIndent("", "  ")
		if err := enc.Encode(out); err != nil {
			fmt.Println("Failed to encode surface_rules.json for namespace", namespace)
			return err
		}
		file.Close()
	}

	for namespace, conditions := range l.NamespaceConditions {
		dirPath := "mms_build/" + namespace + "/_debug"
		os.MkdirAll(dirPath, 0755)
		out := make(map[string]json.RawMessage)
		for name, condition := range conditions {
			data, err := json.Marshal(condition)
			if err != nil {
				fmt.Println("Failed to marshal condition", name, err)
				return err
			}
			out[name] = data
		}
		file, err := os.OpenFile(dirPath+"/conditions.json", os.O_CREATE|os.O_WRONLY|os.O_TRUNC, 0644)
		if err != nil {
			fmt.Println("Failed to open conditions.json for namespace", namespace)
			return err
		}
		enc := json.NewEncoder(file)
		enc.SetIndent("", "  ")
		if err := enc.Encode(out); err != nil {
			fmt.Println("Failed to encode conditions.json for namespace", namespace)
			return err
		}
		file.Close()
	}
	return nil
}
