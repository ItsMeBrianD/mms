package surface_rules

import (
	"encoding/json"
	"fmt"

	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_conditions"
	"github.com/itsmebriand/mms/mms/grammars"
)

func NewConditionalRule(ctx *grammars.SurfaceRule_ConditionalContext, ruleFactory RuleFactory, conditionFactory surface_conditions.ConditionFactory) (*ConditionalRule, []error) {
	condition, err := conditionFactory.ConstructSurfaceCondition(ctx.SurfaceCondition().(*grammars.SurfaceConditionContext))
	if err != nil {
		return nil, []error{err}
	}
	if condition == nil {
		return nil, []error{fmt.Errorf("condition is nil")}
	}

	action, errs := ruleFactory.ConstructSurfaceRule(ctx.SurfaceRule().(*grammars.SurfaceRuleContext))
	if errs != nil {
		return nil, errs
	}
	if action == nil {
		return nil, []error{fmt.Errorf("action is nil")}
	}

	return &ConditionalRule{
		Negate:    ctx.Bang() != nil,
		Condition: condition,
		Action:    action,
	}, nil
}

type ConditionalRule struct {
	BaseRule
	Negate    bool
	Condition surface_conditions.SurfaceCondition
	Action    SurfaceRule
}

func (r ConditionalRule) Type() SurfaceRuleKind {
	return ConditionalRuleKind
}

func (r ConditionalRule) String() string {
	return fmt.Sprintf("surfaceRule(%s)", r.Type())
}

func (r ConditionalRule) MarshalJSON() ([]byte, error) {
	if r.Negate {
		r.Negate = false
		condition := r.Condition
		r.Condition = surface_conditions.InvertCondition(condition)
	}

	return json.Marshal(struct {
		Type      SurfaceRuleKind                     `json:"type"`
		Condition surface_conditions.SurfaceCondition `json:"if_true"`
		Action    SurfaceRule                         `json:"then_run"`
	}{
		Type:      r.Type(),
		Condition: r.Condition,
		Action:    r.Action,
	})
}
