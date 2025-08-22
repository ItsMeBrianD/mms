package condition_factory

import (
	"encoding/json"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

type YAboveCondition struct {
	Anchor     lib.VerticalAnchor
	Multiplier int
	Add        bool
	comment    *string
}

func (f ConditionFactory) NewYAboveCondition(ctx *grammars.SurfaceCondition_YAboveContext) surface_rule_types.Condition {
	anchor, err := lib.ParseVerticalAnchor(ctx.VerticalAnchor())
	if err != nil {
		return &YAboveCondition{}
	}
	multiplier, _ := strconv.Atoi(ctx.Int().GetText())
	return &YAboveCondition{
		Anchor:     *anchor,
		Multiplier: multiplier,
		Add:        ctx.Keyword_Add() != nil,
	}
}

func (c YAboveCondition) Type() surface_rule_types.ConditionType {
	return surface_rule_types.YAboveConditionType
}

func (c YAboveCondition) Comment() *string { return c.comment }

func (c *YAboveCondition) SetComment(comment *string) { c.comment = comment }

func (c YAboveCondition) MarshalJSON() ([]byte, error) {
	return json.Marshal(struct {
		Type       surface_rule_types.ConditionType `json:"type"`
		Anchor     lib.VerticalAnchor               `json:"anchor"`
		Multiplier int                              `json:"surface_depth_multiplier"`
		Add        bool                             `json:"add_stone_depth"`
		Comment    *string                          `json:"__comment,omitempty"`
	}{
		Type:       surface_rule_types.YAboveConditionType,
		Anchor:     c.Anchor,
		Multiplier: c.Multiplier,
		Add:        c.Add,
		Comment:    c.comment,
	})
}
