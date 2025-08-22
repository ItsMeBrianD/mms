package surface_rules

import (
	"github.com/itsmebriand/mms/mms/grammars"
)

func (l *SurfaceRuleSerializer) ExitSurfaceCondition(ctx *grammars.SurfaceConditionContext) {
	l.store.AddCondition(&ctx.BaseParserRuleContext, l.conditionFactory.NewCondition(ctx))
}
