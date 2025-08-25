package surface_rules

import (
	"encoding/json"
	"errors"
	"fmt"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
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

func (l *SurfaceRuleSerializer) SerializeToFileTreeLike(root *lib.FileTreeLike) (*lib.FileTreeLike, error) {
	if root == nil {
		return nil, errors.New("root is nil")
	}

	for namespace, rules := range l.NamespaceRules {
		namespaceDir := root.MkDir(namespace)
		debugDir := namespaceDir.MkDir("_debug")
		surfaceRulesFile := debugDir.MkFile("surface_rules.json", "")

		out := make(map[string]json.RawMessage)
		for name, rule := range rules {
			data, err := json.MarshalIndent(rule, "", "  ")
			if err != nil {
				fmt.Println("Failed to marshal rule", name, err)
				return nil, err
			}
			out[name] = data
		}
		data, err := json.MarshalIndent(out, "", "  ")
		if err != nil {
			fmt.Println("Failed to marshal surface_rules.json for namespace", namespace)
			return nil, err
		}
		surfaceRulesFile.SetContent(string(data))
		debugDir.AddChild(surfaceRulesFile)
	}

	for namespace, conditions := range l.NamespaceConditions {
		namespaceDir := root.MkDir(namespace)
		debugDir := namespaceDir.MkDir("_debug")
		conditionsFile := debugDir.MkFile("conditions.json", "")
		out := make(map[string]json.RawMessage)
		for name, condition := range conditions {
			data, err := json.MarshalIndent(condition, "", "  ")
			if err != nil {
				fmt.Println("Failed to marshal condition", name, err)
				return nil, err
			}
			out[name] = data
		}
		data, err := json.MarshalIndent(out, "", "  ")
		if err != nil {
			fmt.Println("Failed to marshal conditions.json for namespace", namespace)
			return nil, err
		}
		conditionsFile.SetContent(string(data))
	}
	return root, nil
}

func (l *SurfaceRuleSerializer) ExitMmsFile(ctx *grammars.MmsFileContext) {
	if namespaceDecl := ctx.NamespaceDeclaration(); namespaceDecl != nil {
		if id := namespaceDecl.Identifier(); id != nil {
			namespace := id.GetText()
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

func (l *SurfaceRuleSerializer) GetRuleByName(namespace string, name string) *surface_rule_types.Rule {
	if rules, ok := l.NamespaceRules[namespace]; ok {
		if rule, ok := rules[name]; ok {
			return &rule
		}
	}
	return nil
}

func (l *SurfaceRuleSerializer) GetConditionByName(namespace string, name string) *surface_rule_types.Condition {
	if conditions, ok := l.NamespaceConditions[namespace]; ok {
		if condition, ok := conditions[name]; ok {
			return &condition
		}
	}
	return nil
}
