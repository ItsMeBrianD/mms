package surface_rules

import (
	"encoding/json"
	"fmt"
	"os"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/surface_rules/condition_factory"
)

type SurfaceRuleSerializer struct {
	grammars.BaseMMSParserListener
	currentNamespace string
	store            *SurfaceStore

	conditionFactory *condition_factory.ConditionFactory

	ruleStack        []Rule
	rulesByName      map[string]Rule
	conditionsByName map[string]condition_factory.Condition

	NamespaceRules      map[string]map[string]Rule
	NamespaceConditions map[string]map[string]condition_factory.Condition

	Errors []error
}

func NewSurfaceRuleSerializer() *SurfaceRuleSerializer {
	return &SurfaceRuleSerializer{
		store:               NewSurfaceStore(),
		conditionFactory:    condition_factory.NewConditionFactory(),
		rulesByName:         make(map[string]Rule),
		NamespaceRules:      make(map[string]map[string]Rule),
		conditionsByName:    make(map[string]condition_factory.Condition),
		NamespaceConditions: make(map[string]map[string]condition_factory.Condition),
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

func (l *SurfaceRuleSerializer) ExitMmsFile(ctx *grammars.MmsFileContext) {
	namespace := ctx.NamespaceDeclaration().Identifier().GetText()

	if _, ok := l.NamespaceRules[namespace]; !ok {
		l.NamespaceRules[namespace] = make(map[string]Rule)
	}

	if _, ok := l.NamespaceConditions[namespace]; !ok {
		l.NamespaceConditions[namespace] = make(map[string]condition_factory.Condition)
	}

	for k, v := range l.rulesByName {
		l.NamespaceRules[namespace][k] = v
		l.rulesByName = make(map[string]Rule)
	}

	for k, v := range l.conditionsByName {
		l.NamespaceConditions[namespace][k] = v
		l.conditionsByName = make(map[string]condition_factory.Condition)
	}
}

func (l *SurfaceRuleSerializer) Finalize() {
	for _, rules := range l.NamespaceRules {
		for name, rule := range rules {
			rules[name] = l.ReplaceRefs(rule)
		}
	}
}
