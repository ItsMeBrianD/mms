package surface_rules

import (
	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/surface_rules/condition_factory"
	"github.com/itsmebriand/mms/mms/surface_rules/rule_factory"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (l *SurfaceRuleSerializer) ExitNamespaceDeclaration(ctx *grammars.NamespaceDeclarationContext) {
	if id := ctx.Identifier(); id != nil {
		l.currentNamespace = id.GetText()
		l.conditionFactory.CurrentNamespace = l.currentNamespace
		l.ruleFactory.CurrentNamespace = l.currentNamespace
	}
}

func (l *SurfaceRuleSerializer) ReplaceRefs(rule surface_rule_types.Rule) surface_rule_types.Rule {
	if rule.Type() == surface_rule_types.ReferenceRuleType {
		namespace := rule.(*rule_factory.SurfaceReferenceRule).Reference.Namespace
		name := rule.(*rule_factory.SurfaceReferenceRule).Reference.Name
		return l.NamespaceRules[namespace][name]
	} else if rule.Type() == surface_rule_types.SequenceRuleType {
		sequence := rule.(rule_factory.SequenceRule)
		for i, rule := range sequence.Sequence {
			sequence.Sequence[i] = l.ReplaceRefs(rule)
		}
		return sequence
	} else if rule.Type() == surface_rule_types.ConditionalRuleType {
		conditional := rule.(rule_factory.ConditionalRule)

		if conditional.Condition.Type() == surface_rule_types.ReferenceConditionType {
			c := conditional.Condition.(*condition_factory.ConditionReference)
			conditional.Condition = l.NamespaceConditions[c.Reference.Namespace][c.Reference.Name]
		}
		conditional.Action = l.ReplaceRefs(conditional.Action)
		return conditional
	}
	return rule
}
