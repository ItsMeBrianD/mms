package surface_rules

import (
	"errors"
	"fmt"

	"github.com/itsmebriand/mms/mms/grammars"
)

func (l *SurfaceRuleSerializer) ExitMmsFile(ctx *grammars.MmsFileContext) {
	namespace := ctx.NamespaceDeclaration().Identifier().GetText()

	if _, ok := l.NamespaceRules[namespace]; !ok {
		l.NamespaceRules[namespace] = make(map[string]Rule)
	}

	for k, v := range l.rulesByName {
		l.NamespaceRules[namespace][k] = v
		l.rulesByName = make(map[string]Rule)
	}
}

func (l *SurfaceRuleSerializer) ExitSurfaceRuleReference(ctx *grammars.SurfaceRuleReferenceContext) {
	if _, ok := ctx.GetParent().(*grammars.SurfaceRule_SequenceContext); ok {
		identifiers := ctx.Reference().AllIdentifier()
		namespace := identifiers[0].GetText()
		ruleName := identifiers[1].GetText()
		rule := SurfaceReferenceRule{
			Namespace: namespace,
			Name:      ruleName,
		}
		l.ruleStack = append(l.ruleStack, rule)
	}
}

func (l *SurfaceRuleSerializer) ExitSurfaceRule_Block(ctx *grammars.SurfaceRule_BlockContext) {
	block := BlockRule{Block: ctx.Reference().GetText()}
	l.ruleStack = append(l.ruleStack, block)
}

func (l *SurfaceRuleSerializer) ExitSurfaceRule_Sequence(ctx *grammars.SurfaceRule_SequenceContext) {
	childCount := len(ctx.AllSurfaceRule()) + len(ctx.AllSurfaceRuleReference())
	children := make([]Rule, childCount)
	for i := childCount - 1; i >= 0; i-- {
		children[i] = l.ruleStack[len(l.ruleStack)-1]
		l.ruleStack = l.ruleStack[:len(l.ruleStack)-1]
	}
	sequence := SequenceRule{Sequence: children}
	l.ruleStack = append(l.ruleStack, sequence)
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

func ReplaceRefs(rulesByNamespace map[string]map[string]Rule, sequence SequenceRule) SequenceRule {
	for i, rule := range sequence.Sequence {
		if rule.Type() == ReferenceRuleType {
			namespace := rule.(SurfaceReferenceRule).Namespace
			name := rule.(SurfaceReferenceRule).Name
			sequence.Sequence[i] = rulesByNamespace[namespace][name]
		} else if rule.Type() == SequenceRuleType {
			sequence.Sequence[i] = ReplaceRefs(rulesByNamespace, rule.(SequenceRule))
		}
	}
	return sequence
}

func (l *SurfaceRuleSerializer) Finalize() {
	for _, rules := range l.NamespaceRules {
		for name, rule := range rules {
			if rule.Type() == SequenceRuleType {
				replaced := ReplaceRefs(l.NamespaceRules, rule.(SequenceRule))
				rules[name] = replaced
			}
		}
	}
}
