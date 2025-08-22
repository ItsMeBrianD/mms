package surface_rules

import (
	"encoding/json"
	"errors"
	"fmt"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/surface_rules/condition_factory"
)

func (l *SurfaceRuleSerializer) ExitSurfaceRule_Conditional(ctx *grammars.SurfaceRule_ConditionalContext) {
	conditionCtx := ctx.SurfaceCondition()
	condition := l.store.GetCondition(
		l.conditionFactory.GetConditionRefFromNode(conditionCtx),
	)
	if condition == nil {
		l.Errors = append(l.Errors, errors.New("condition not found: "+conditionCtx.GetText()))
		return
	}

	action := l.ruleStack[len(l.ruleStack)-1]
	l.ruleStack = l.ruleStack[:len(l.ruleStack)-1]
	l.ruleStack = append(l.ruleStack, ConditionalRule{Condition: condition, Action: action, Negate: ctx.Bang() != nil})
}

type ConditionalRule struct {
	Condition condition_factory.Condition
	Action    Rule
	Negate    bool
}

func (r ConditionalRule) Type() RuleType { return ConditionalRuleType }

func (r ConditionalRule) MarshalJSON() ([]byte, error) {
	if compound, ok := r.Condition.(condition_factory.CompoundCondition); ok {
		// We need to split out the conditions into a deep nest
		fmt.Println(compound.Conditions)
		rules := make([]Rule, len(compound.Conditions))
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
		out, err := json.Marshal(struct {
			Type   string          `json:"type"`
			Invert ConditionalRule `json:"invert"`
		}{
			Type:   "minecraft:not",
			Invert: r,
		})
		return out, err
	} else {
		out, err := json.Marshal(struct {
			Type    RuleType                    `json:"type"`
			IfTrue  condition_factory.Condition `json:"if_true"`
			ThenRun Rule                        `json:"then_run"`
		}{
			Type:    ConditionalRuleType,
			IfTrue:  r.Condition,
			ThenRun: r.Action,
		})
		return out, err
	}

}
