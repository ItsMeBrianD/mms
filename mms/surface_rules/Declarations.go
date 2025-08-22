package surface_rules

import (
	"errors"
	"fmt"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (l *SurfaceRuleSerializer) ExitSurfaceConditionDeclaration(ctx *grammars.SurfaceConditionDeclarationContext) {
	condition := l.store.GetCondition(l.conditionFactory.GetConditionRefFromNode(ctx.SurfaceCondition()))
	if condition == nil {
		l.Errors = append(l.Errors, errors.New("condition not found: "+ctx.SurfaceCondition().GetText()))
		return
	}

	// Extract condition name from context
	name := ctx.Identifier().GetText()
	origName := name
	suffix := 1
	for {
		if _, ok := l.conditionsByName[name]; !ok {
			break
		}
		suffix++
		name = origName + fmt.Sprintf("_duplicate_%d", suffix)
	}
	if name != origName {
		l.Errors = append(l.Errors, errors.New("duplicate condition name: "+origName))
	}
	l.conditionsByName[name] = condition
}

func (l *SurfaceRuleSerializer) ExitSurfaceRuleDeclaration(ctx *grammars.SurfaceRuleDeclarationContext) {
	if len(l.ruleStack) > 0 {
		// Extract rule name from context
		name := ctx.Identifier().GetText()
		origName := name
		suffix := 1
		for {
			if _, ok := l.rulesByName[name]; !ok {
				break
			}
			suffix++
			name = origName + fmt.Sprintf("_duplicate_%d", suffix)
		}
		if name != origName {
			l.Errors = append(l.Errors, errors.New("duplicate rule name: "+origName))
		}
		l.rulesByName[name] = l.ruleStack[len(l.ruleStack)-1]

	}
}
