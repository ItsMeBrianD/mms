package surface_rules

import (
	"encoding/json"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
)

type AboveWaterCondition struct {
	Offset          int
	DepthMultiplier float64
	Add             bool
}

func (l *SurfaceRuleSerializer) ExitSurfaceCondition_AboveWater(ctx *grammars.SurfaceCondition_AboveWaterContext) {
	offset, _ := strconv.Atoi(ctx.Int().GetText())
	depthMultiplier, _ := strconv.ParseFloat(ctx.Float().GetText(), 64)
	l.conditionStack = append(l.conditionStack, AboveWaterCondition{
		Offset:          offset,
		DepthMultiplier: depthMultiplier,
		Add:             ctx.Keyword_Add() != nil,
	})
}

func (c AboveWaterCondition) Type() ConditionType { return AboveWaterConditionType }

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
