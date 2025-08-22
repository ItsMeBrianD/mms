package condition_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

func (f ConditionFactory) NewVerticalGradientCondition(ctx *grammars.SurfaceCondition_VerticalGradientContext) Condition {
	trueAnchor, err := lib.ParseVerticalAnchor(ctx.VerticalAnchor(0))
	if err != nil {
		return VerticalGradientCondition{}
	}
	falseAnchor, err := lib.ParseVerticalAnchor(ctx.VerticalAnchor(1))
	if err != nil {
		return VerticalGradientCondition{}
	}
	return VerticalGradientCondition{
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

func (c VerticalGradientCondition) Type() ConditionType { return VerticalGradientConditionType }

func (c VerticalGradientCondition) Comment() *string { return c.comment }

func (c VerticalGradientCondition) SetComment(comment *string) { c.comment = comment }

func (c VerticalGradientCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type            ConditionType      `json:"type"`
		SeedText        string             `json:"random_name"`
		TrueAtAndBelow  lib.VerticalAnchor `json:"true_at_and_below"`
		FalseAtAndAbove lib.VerticalAnchor `json:"false_at_and_above"`
		Comment         *string            `json:"__comment,omitempty"`
	}{
		Type:            VerticalGradientConditionType,
		SeedText:        c.SeedText,
		TrueAtAndBelow:  c.TrueAtAndBelow,
		FalseAtAndAbove: c.FalseAtAndAbove,
		Comment:         c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
