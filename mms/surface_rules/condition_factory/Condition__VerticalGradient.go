package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f ConditionFactory) NewVerticalGradientCondition(ctx *grammars.SurfaceCondition_VerticalGradientContext) surface_rule_types.Condition {
	trueAnchor, err := lib.ParseVerticalAnchor(ctx.VerticalAnchor(0))
	if err != nil {
		return &VerticalGradientCondition{}
	}
	falseAnchor, err := lib.ParseVerticalAnchor(ctx.VerticalAnchor(1))
	if err != nil {
		return &VerticalGradientCondition{}
	}
	return &VerticalGradientCondition{
		SeedText:        ctx.String_().GetText(),
		TrueAtAndBelow:  *trueAnchor,
		FalseAtAndAbove: *falseAnchor,
	}
}

type VerticalGradientCondition struct {
	comment         *string
	SeedText        string
	TrueAtAndBelow  lib.VerticalAnchor
	FalseAtAndAbove lib.VerticalAnchor
}

func (c VerticalGradientCondition) Type() surface_rule_types.ConditionType {
	return surface_rule_types.VerticalGradientConditionType
}

func (c VerticalGradientCondition) Comment() *string { return c.comment }

func (c *VerticalGradientCondition) SetComment(comment *string) { c.comment = comment }

func (c VerticalGradientCondition) MarshalJSON() ([]byte, error) {
	escapedSeed := ""
	json.Unmarshal([]byte(c.SeedText), &escapedSeed)
	json, err := json.Marshal(struct {
		Type            surface_rule_types.ConditionType `json:"type"`
		SeedText        string                           `json:"random_name"`
		TrueAtAndBelow  lib.VerticalAnchor               `json:"true_at_and_below"`
		FalseAtAndAbove lib.VerticalAnchor               `json:"false_at_and_above"`
		Comment         *string                          `json:"__comment,omitempty"`
	}{
		Type:            surface_rule_types.VerticalGradientConditionType,
		SeedText:        escapedSeed,
		TrueAtAndBelow:  c.TrueAtAndBelow,
		FalseAtAndAbove: c.FalseAtAndAbove,
		Comment:         c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
