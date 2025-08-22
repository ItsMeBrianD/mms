package condition_factory

import (
	"encoding/json"
	"slices"

	"github.com/itsmebriand/mms/mms/grammars"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f ConditionFactory) NewCompoundCondition(ctx *grammars.SurfaceCondition_CompoundContext) surface_rule_types.Condition {
	out := &CompoundCondition{}
	items := ctx.AllSurfaceCondition_Compound__Item()
	slices.Reverse(items)

	for _, item := range items {
		negated := item.Bang() != nil
		condition := f.NewCondition(item.SurfaceCondition().(*grammars.SurfaceConditionContext))
		out.Conditions = append(out.Conditions, CompoundConditionItem{Condition: condition, Negate: negated})
	}

	return out
}

type CompoundCondition struct {
	Conditions []CompoundConditionItem
}

func (c CompoundCondition) Type() surface_rule_types.ConditionType {
	return surface_rule_types.CompoundConditionType
}

func (c CompoundCondition) Comment() *string {
	return nil
}

func (c *CompoundCondition) SetComment(comment *string) {}

func (c CompoundCondition) MarshalJSON() ([]byte, error) {
	if len(c.Conditions) == 1 {
		return json.Marshal(c.Conditions[0])
	}
	msg := "Created by compound condition"
	for _, condition := range c.Conditions {
		condition.Condition.SetComment(&msg)
	}
	return json.Marshal(struct {
		Type       surface_rule_types.ConditionType `json:"type"`
		Conditions []CompoundConditionItem          `json:"conditions"`
		Comment    *string                          `json:"__comment,omitempty"`
	}{
		Type:       surface_rule_types.CompoundConditionType,
		Conditions: c.Conditions,
		Comment:    c.Comment(),
	})
}

type CompoundConditionItem struct {
	json.Marshaler
	Condition surface_rule_types.Condition
	Negate    bool
}

func (c CompoundConditionItem) MarshalJSON() ([]byte, error) {
	return json.Marshal(struct {
		Type      surface_rule_types.ConditionType `json:"type"`
		Condition surface_rule_types.Condition     `json:"condition"`
		Negate    bool                             `json:"negate"`
	}{
		Type:      surface_rule_types.CompoundConditionType,
		Condition: c.Condition,
		Negate:    c.Negate,
	})
}
