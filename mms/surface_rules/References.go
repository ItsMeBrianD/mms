package surface_rules

import (
	"encoding/json"
	"fmt"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
	"github.com/itsmebriand/mms/mms/surface_rules/condition_factory"
)

func (l *SurfaceRuleSerializer) ExitNamespaceDeclaration(ctx *grammars.NamespaceDeclarationContext) {
	l.currentNamespace = ctx.Identifier().GetText()
	l.conditionFactory.CurrentNamespace = l.currentNamespace
}

func (l *SurfaceRuleSerializer) ExitSurfaceRuleReference(ctx *grammars.SurfaceRuleReferenceContext) {
	l.ruleStack = append(l.ruleStack, SurfaceReferenceRule{
		Reference: lib.ParseReferential(l.currentNamespace, ctx),
	})
}

func (l *SurfaceRuleSerializer) ReplaceRefs(rule Rule) Rule {
	if rule.Type() == ReferenceRuleType {
		namespace := rule.(SurfaceReferenceRule).Reference.Namespace
		name := rule.(SurfaceReferenceRule).Reference.Name
		return l.NamespaceRules[namespace][name]
	} else if rule.Type() == SequenceRuleType {
		sequence := rule.(SequenceRule)
		for i, rule := range sequence.Sequence {
			sequence.Sequence[i] = l.ReplaceRefs(rule)
		}
		return sequence
	} else if rule.Type() == ConditionalRuleType {
		conditional := rule.(ConditionalRule)

		if conditional.Condition.Type() == condition_factory.ReferenceConditionType {
			c := conditional.Condition.(condition_factory.ConditionReference)
			fmt.Printf("Replaced condition reference %s:%s\n", c.Reference.Namespace, c.Reference.Name)
			conditional.Condition = l.NamespaceConditions[c.Reference.Namespace][c.Reference.Name]
		}
		conditional.Action = l.ReplaceRefs(conditional.Action)
		return conditional
	}
	return rule
}

type SurfaceReferenceRule struct {
	lib.Reference
	Rule
	Namespace string
	Name      string
}

func (r SurfaceReferenceRule) Type() RuleType { return ReferenceRuleType }

func (r SurfaceReferenceRule) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type      RuleType `json:"type"`
		Namespace string   `json:"namespace"`
		Name      string   `json:"name"`
	}{
		Type:      ReferenceRuleType,
		Namespace: r.Namespace,
		Name:      r.Name,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
