package surface_rules

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

func (l *SurfaceRuleSerializer) ExitSurfaceCondition_VerticalGradient(ctx *grammars.SurfaceCondition_VerticalGradientContext) {
	trueAnchor, err := lib.ParseVerticalAnchor(ctx.VerticalAnchor(0))
	if err != nil {
		l.Errors = append(l.Errors, err)
		return
	}
	falseAnchor, err := lib.ParseVerticalAnchor(ctx.VerticalAnchor(1))
	if err != nil {
		l.Errors = append(l.Errors, err)
		return
	}
	l.conditionStack = append(l.conditionStack, VerticalGradientCondition{
		SeedText:        ctx.String_().GetText(),
		TrueAtAndBelow:  *trueAnchor,
		FalseAtAndAbove: *falseAnchor,
	})
}

type VerticalGradientCondition struct {
	SeedText        string
	TrueAtAndBelow  lib.VerticalAnchor
	FalseAtAndAbove lib.VerticalAnchor
}

func (c VerticalGradientCondition) Type() ConditionType { return VerticalGradientConditionType }

func (c VerticalGradientCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type            ConditionType      `json:"type"`
		SeedText        string             `json:"random_name"`
		TrueAtAndBelow  lib.VerticalAnchor `json:"true_at_and_below"`
		FalseAtAndAbove lib.VerticalAnchor `json:"false_at_and_above"`
	}{
		Type:            VerticalGradientConditionType,
		SeedText:        c.SeedText,
		TrueAtAndBelow:  c.TrueAtAndBelow,
		FalseAtAndAbove: c.FalseAtAndAbove,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
