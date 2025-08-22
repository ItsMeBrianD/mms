package surface_rules

import (
	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/surface_rules/condition_factory"
)

type SurfaceStore struct {
	rules      map[*antlr.BaseParserRuleContext]Rule
	conditions map[*antlr.BaseParserRuleContext]condition_factory.Condition
}

func NewSurfaceStore() *SurfaceStore {
	return &SurfaceStore{
		rules:      make(map[*antlr.BaseParserRuleContext]Rule),
		conditions: make(map[*antlr.BaseParserRuleContext]condition_factory.Condition),
	}
}

func (s *SurfaceStore) AddRule(ctx *antlr.BaseParserRuleContext, rule Rule) {
	s.rules[ctx] = rule
}

func (s *SurfaceStore) AddCondition(ctx *antlr.BaseParserRuleContext, condition condition_factory.Condition) {
	s.conditions[ctx] = condition
}

func (s *SurfaceStore) GetRule(ctx *antlr.BaseParserRuleContext) Rule {
	return s.rules[ctx]
}

func (s *SurfaceStore) GetCondition(ctx *antlr.BaseParserRuleContext) condition_factory.Condition {
	return s.conditions[ctx]
}
