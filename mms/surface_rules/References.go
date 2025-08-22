package surface_rules

import (
	"encoding/json"
	"fmt"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

func (l *SurfaceRuleSerializer) ExitNamespaceDeclaration(ctx *grammars.NamespaceDeclarationContext) {
	l.currentNamespace = ctx.Identifier().GetText()
}

func (l *SurfaceRuleSerializer) ExitSurfaceConditionReference(ctx *grammars.SurfaceConditionReferenceContext) {
	l.conditionStack = append(l.conditionStack, ConditionReference{
		Reference: lib.ParseReferential(l.currentNamespace, ctx),
	})
}

func (l *SurfaceRuleSerializer) ExitSurfaceRuleReference(ctx *grammars.SurfaceRuleReferenceContext) {
	l.ruleStack = append(l.ruleStack, SurfaceReferenceRule{
		Reference: lib.ParseReferential(l.currentNamespace, ctx),
	})

	// if ref := ctx.Reference(); ref != nil {
	// 	fmt.Println("Pushing qualified rule reference")
	// 	namespace := ref.Identifier(0).GetText()
	// 	ruleName := ref.Identifier(1).GetText()
	// 	rule := SurfaceReferenceRule{
	// 		Namespace: namespace,
	// 		Name:      ruleName,
	// 	}
	// 	l.ruleStack = append(l.ruleStack, rule)
	// } else if ref := ctx.Identifier(); ref != nil {
	// 	fmt.Println("Pushing non-qualified rule reference")
	// 	l.ruleStack = append(l.ruleStack, SurfaceReferenceRule{
	// 		Reference: lib.Reference{
	// 			Namespace: l.currentNamespace,
	// 			Name:      ref.GetText(),
	// 		},
	// 	})
	// }

}

func (l *SurfaceRuleSerializer) ReplaceRefs(rule Rule) Rule {
	if rule.Type() == ReferenceRuleType {
		namespace := rule.(SurfaceReferenceRule).Reference.Namespace
		name := rule.(SurfaceReferenceRule).Reference.Name

		fmt.Printf("Replaced rule reference %s:%s\n", namespace, name)
		return l.NamespaceRules[namespace][name]
	} else if rule.Type() == SequenceRuleType {
		sequence := rule.(SequenceRule)
		for i, rule := range sequence.Sequence {
			sequence.Sequence[i] = l.ReplaceRefs(rule)
		}
		return sequence
	} else if rule.Type() == ConditionalRuleType {
		conditional := rule.(ConditionalRule)

		if conditional.Condition.Type() == ReferenceConditionType {
			c := conditional.Condition.(ConditionReference)
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
