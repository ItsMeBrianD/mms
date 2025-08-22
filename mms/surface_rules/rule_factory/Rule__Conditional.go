package rule_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/surface_rules/condition_factory"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f RuleFactory) NewConditionalRule(ctx *grammars.SurfaceRule_ConditionalContext) surface_rule_types.Rule {
	conditionCtx := ctx.SurfaceCondition()
	condition := f.store.GetCondition(
		condition_factory.GetConditionRefFromNode(conditionCtx),
	)
	if condition == nil {
		return nil
	}
	action := f.NewRule(ctx.SurfaceRule().GetRuleContext().(*grammars.SurfaceRuleContext))
	if action == nil {
		return nil
	}
	return ConditionalRule{Condition: condition, Action: action, Negate: ctx.Bang() != nil}
}

type ConditionalRule struct {
	Condition surface_rule_types.Condition
	Action    surface_rule_types.Rule
	Negate    bool
}

func (r ConditionalRule) Type() surface_rule_types.RuleType {
	return surface_rule_types.ConditionalRuleType
}

func (r ConditionalRule) MarshalJSON() ([]byte, error) {
	if compound, ok := r.Condition.(*condition_factory.CompoundCondition); ok {
		// We need to split out the conditions into a deep nest
		rules := make([]surface_rule_types.Rule, len(compound.Conditions))
		for i, condition := range compound.Conditions {
			action := r.Action
			if i > 0 {
				action = rules[i-1]
			}
			rules[i] = ConditionalRule{Condition: condition.Condition, Action: action, Negate: condition.Negate}
		}
		return json.Marshal(rules[len(rules)-1])
	}

	if r.Negate {
		r.Negate = false
		condition := r.Condition
		r.Condition = condition_factory.InvertCondition(condition)

	}

	out, err := json.Marshal(struct {
		Type    surface_rule_types.RuleType  `json:"type"`
		IfTrue  surface_rule_types.Condition `json:"if_true"`
		ThenRun surface_rule_types.Rule      `json:"then_run"`
	}{
		Type:    surface_rule_types.ConditionalRuleType,
		IfTrue:  r.Condition,
		ThenRun: r.Action,
	})
	return out, err

}
