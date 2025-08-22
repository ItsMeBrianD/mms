package condition_factory

import (
	"encoding/json"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

type YAboveCondition struct {
	Anchor     lib.VerticalAnchor
	Multiplier int
	Add        bool
	comment    *string
}

func (f ConditionFactory) NewYAboveCondition(ctx *grammars.SurfaceCondition_YAboveContext) Condition {
	anchor, err := lib.ParseVerticalAnchor(ctx.VerticalAnchor())
	if err != nil {
		return YAboveCondition{}
	}
	multiplier, _ := strconv.Atoi(ctx.Int().GetText())
	return YAboveCondition{
		Anchor:     *anchor,
		Multiplier: multiplier,
		Add:        ctx.Keyword_Add() != nil,
	}
}

func (c YAboveCondition) Type() ConditionType { return YAboveConditionType }

func (c YAboveCondition) Comment() *string { return c.comment }

func (c YAboveCondition) SetComment(comment *string) { c.comment = comment }

func (c YAboveCondition) MarshalJSON() ([]byte, error) {
	return json.Marshal(struct {
		Type       ConditionType      `json:"type"`
		Anchor     lib.VerticalAnchor `json:"anchor"`
		Multiplier int                `json:"surface_depth_multiplier"`
		Add        bool               `json:"add_stone_depth"`
		Comment    *string            `json:"__comment,omitempty"`
	}{
		Type:       YAboveConditionType,
		Anchor:     c.Anchor,
		Multiplier: c.Multiplier,
		Add:        c.Add,
		Comment:    c.comment,
	})
}
