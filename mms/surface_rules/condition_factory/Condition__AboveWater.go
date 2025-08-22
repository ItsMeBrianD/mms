package condition_factory

import (
	"encoding/json"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
)

type AboveWaterCondition struct {
	Offset          int
	DepthMultiplier float64
	Add             bool
	comment         *string
}

func (f ConditionFactory) NewAboveWaterCondition(ctx *grammars.SurfaceCondition_AboveWaterContext) Condition {
	offset, _ := strconv.Atoi(ctx.Int().GetText())
	depthMultiplier, _ := strconv.ParseFloat(ctx.Float().GetText(), 64)
	return AboveWaterCondition{
		Offset:          offset,
		DepthMultiplier: depthMultiplier,
		Add:             ctx.Keyword_Add() != nil,
	}
}

func (c AboveWaterCondition) Type() ConditionType { return AboveWaterConditionType }

func (c AboveWaterCondition) SetComment(comment *string) { c.comment = comment }

func (c AboveWaterCondition) Comment() *string { return c.comment }

func (c AboveWaterCondition) MarshalJSON() ([]byte, error) {
	return json.Marshal(struct {
		Type       ConditionType `json:"type"`
		Offset     int           `json:"offset"`
		Multiplier float64       `json:"surface_depth_multiplier"`
		Add        bool          `json:"add_stone_depth"`
	}{
		Type:       AboveWaterConditionType,
		Offset:     c.Offset,
		Multiplier: c.DepthMultiplier,
		Add:        c.Add,
	})
}
