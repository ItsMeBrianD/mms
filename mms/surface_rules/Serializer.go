package surface_rules

import (
	"encoding/json"
	"fmt"
	"os"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/surface_rules/condition_factory"
	"github.com/itsmebriand/mms/mms/surface_rules/rule_factory"
	surface_rules_store "github.com/itsmebriand/mms/mms/surface_rules/store"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

type SurfaceRuleSerializer struct {
	grammars.BaseMMSParserListener
	currentNamespace string
	store            *surface_rules_store.SurfaceStore

	conditionFactory *condition_factory.ConditionFactory
	ruleFactory      *rule_factory.RuleFactory

	rulesByName      map[string]surface_rule_types.Rule
	conditionsByName map[string]surface_rule_types.Condition

	NamespaceRules      map[string]map[string]surface_rule_types.Rule
	NamespaceConditions map[string]map[string]surface_rule_types.Condition

	Errors []error
}

func NewSurfaceRuleSerializer() *SurfaceRuleSerializer {
	store := surface_rules_store.NewSurfaceStore()
	return &SurfaceRuleSerializer{
		store:               store,
		conditionFactory:    condition_factory.NewConditionFactory(store),
		ruleFactory:         rule_factory.NewRuleFactory(store),
		rulesByName:         make(map[string]surface_rule_types.Rule),
		NamespaceRules:      make(map[string]map[string]surface_rule_types.Rule),
		conditionsByName:    make(map[string]surface_rule_types.Condition),
		NamespaceConditions: make(map[string]map[string]surface_rule_types.Condition),
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
		l.NamespaceRules[namespace] = make(map[string]surface_rule_types.Rule)
	}

	if _, ok := l.NamespaceConditions[namespace]; !ok {
		l.NamespaceConditions[namespace] = make(map[string]surface_rule_types.Condition)
	}

	for k, v := range l.rulesByName {
		l.NamespaceRules[namespace][k] = v
		l.rulesByName = make(map[string]surface_rule_types.Rule)
	}

	for k, v := range l.conditionsByName {
		l.NamespaceConditions[namespace][k] = v
		l.conditionsByName = make(map[string]surface_rule_types.Condition)
	}
}

func (l *SurfaceRuleSerializer) ExitSurfaceCondition(ctx *grammars.SurfaceConditionContext) {
	l.conditionFactory.NewCondition(ctx)
}

func (l *SurfaceRuleSerializer) ExitSurfaceRule(ctx *grammars.SurfaceRuleContext) {
	l.ruleFactory.NewRule(ctx)
}

func (l *SurfaceRuleSerializer) Finalize() {
	for _, rules := range l.NamespaceRules {
		for name, rule := range rules {
			rules[name] = l.ReplaceRefs(rule)
		}
	}
}
