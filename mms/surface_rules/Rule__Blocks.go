package surface_rules

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

func (l *SurfaceRuleSerializer) ExitSurfaceRule_Block(ctx *grammars.SurfaceRule_BlockContext) {
	block := BlockRule{Block: lib.ParseReferential("minecraft", ctx.ResourceReference())}
	l.ruleStack = append(l.ruleStack, block)
}

type BlockRule struct {
	Block lib.Reference `json:"block"`
}

func (r BlockRule) Type() RuleType { return BlockRuleType }

func (r BlockRule) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type  RuleType      `json:"type"`
		Block lib.Reference `json:"block"`
	}{
		Type:  BlockRuleType,
		Block: r.Block,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
