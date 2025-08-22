package surface_rules_store

import (
	"github.com/antlr4-go/antlr/v4"
	surface_rule_types "github.com/itsmebriand/mms/mms/surface_rules/types"
)

type SurfaceStore struct {
	rules      map[*antlr.BaseParserRuleContext]surface_rule_types.Rule
	conditions map[*antlr.BaseParserRuleContext]surface_rule_types.Condition
}

func NewSurfaceStore() *SurfaceStore {
	return &SurfaceStore{
		rules:      make(map[*antlr.BaseParserRuleContext]surface_rule_types.Rule),
		conditions: make(map[*antlr.BaseParserRuleContext]surface_rule_types.Condition),
	}
}

func (s *SurfaceStore) AddRule(ctx *antlr.BaseParserRuleContext, rule surface_rule_types.Rule) {
	s.rules[ctx] = rule
}

func (s *SurfaceStore) AddCondition(ctx *antlr.BaseParserRuleContext, condition surface_rule_types.Condition) {
	s.conditions[ctx] = condition
}

func (s *SurfaceStore) GetRule(ctx *antlr.BaseParserRuleContext) surface_rule_types.Rule {
	return s.rules[ctx]
}

func (s *SurfaceStore) GetCondition(ctx *antlr.BaseParserRuleContext) surface_rule_types.Condition {
	return s.conditions[ctx]
}
