package condition_factory

import (
	"encoding/json"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f ConditionFactory) NewStoneDepthCondition(ctx *grammars.SurfaceCondition_StoneDepthContext) surface_rule_types.Condition {
	offset, _ := strconv.Atoi(ctx.Int(0).GetText())
	secondary_depth_range, _ := strconv.Atoi(ctx.Int(1).GetText())
	surface := "floor"
	if ctx.Keyword_Ceiling() != nil {
		surface = "ceiling"
	}
	return &StoneDepthCondition{
		Depth:   offset,
		Add:     ctx.Keyword_Add() != nil, // if this is nil, then Keyword_Sub MUST exist per the grammar
		Range:   secondary_depth_range,
		Surface: surface,
	}
}

type StoneDepthCondition struct {
	Depth   int
	Add     bool
	Range   int
	Surface string
	comment *string
}

func (c StoneDepthCondition) Type() surface_rule_types.ConditionType {
	return surface_rule_types.StoneDepthConditionType
}

func (c StoneDepthCondition) Comment() *string { return c.comment }

func (c *StoneDepthCondition) SetComment(comment *string) { c.comment = comment }

func (c StoneDepthCondition) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type    surface_rule_types.ConditionType `json:"type"`
		Depth   int                              `json:"offset"`
		Surface string                           `json:"surface_type"`
		Add     bool                             `json:"add_surface_depth"`
		Range   int                              `json:"secondary_depth_range"`
		Comment *string                          `json:"__comment,omitempty"`
	}{
		Type:    surface_rule_types.StoneDepthConditionType,
		Depth:   c.Depth,
		Surface: c.Surface,
		Add:     c.Add,
		Range:   c.Range,
		Comment: c.comment,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
