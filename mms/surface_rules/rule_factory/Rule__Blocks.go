package rule_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/block_states"
	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f RuleFactory) NewBlockRule(ctx *grammars.SurfaceRule_BlockContext) surface_rule_types.Rule {
	return BlockRule{Block: lib.ParseReferential("minecraft", ctx.ResourceReference())}
}

type BlockRule struct {
	Block lib.Reference `json:"block"`
}

func (r BlockRule) Type() surface_rule_types.RuleType { return surface_rule_types.BlockRuleType }

func (r BlockRule) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type  surface_rule_types.RuleType `json:"type"`
		Block block_states.BlockState     `json:"result_state"`
	}{
		Type:  surface_rule_types.BlockRuleType,
		Block: block_states.BlockState{Name: r.Block.String()},
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
