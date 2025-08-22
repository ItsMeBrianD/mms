package rule_factory

import (
	"encoding/json"

	"github.com/itsmebriand/mms/mms/grammars"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

func (f RuleFactory) NewBandlandsRule(ctx *grammars.SurfaceRule_BandlandsContext) surface_rule_types.Rule {
	return BandlandsRule{}
}

type BandlandsRule struct {
}

func (r BandlandsRule) Type() surface_rule_types.RuleType {
	return surface_rule_types.BandlandsRuleType
}

func (r BandlandsRule) MarshalJSON() ([]byte, error) {
	json, err := json.Marshal(struct {
		Type surface_rule_types.RuleType `json:"type"`
	}{
		Type: surface_rule_types.BandlandsRuleType,
	})
	if err != nil {
		return nil, err
	}
	return json, nil
}
