package surface

import (
	"errors"
	"fmt"

	"github.com/itsmebriand/mms/minecraft_metascript/mms_errors"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_conditions"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_rules"
	"github.com/itsmebriand/mms/mms/grammars"
)

func NewSurfaceVisitor(
	reportError func(msg string, level mms_errors.ErrorLevel, line, column int),
) grammars.MMSParserListener {
	return &SurfaceVisitor{
		AddError: reportError,
	}
}

type SurfaceVisitor struct {
	grammars.BaseMMSParserListener
	AddError func(msg string, level mms_errors.ErrorLevel, line, column int)
}

func (s *SurfaceVisitor) ExitSurfaceConditionDeclaration(ctx *grammars.SurfaceConditionDeclarationContext) {
	condition, err := s.ConstructSurfaceCondition(ctx.SurfaceCondition().(*grammars.SurfaceConditionContext))
	if err != nil {
		s.AddError(err.Error(), mms_errors.ErrorLevelError, ctx.GetStart().GetLine(), ctx.GetStart().GetColumn())
		return
	}

	// TODO: Declare the condition
	fmt.Println(condition)
	// err = s.Namespaces[ctx.Namespace().GetText()].SurfaceConditions.Declare(ctx.Identifier().GetText(), condition)
	if err != nil {
		s.AddError(err.Error(), mms_errors.ErrorLevelError, ctx.GetStart().GetLine(), ctx.GetStart().GetColumn())
	}
}

func (s *SurfaceVisitor) ExitSurfaceRuleDeclaration(ctx *grammars.SurfaceRuleDeclarationContext) {
	rule, err := s.ConstructSurfaceRule(ctx.SurfaceRule().(*grammars.SurfaceRuleContext))
	if err != nil {
		s.AddError(err.Error(), mms_errors.ErrorLevelError, ctx.GetStart().GetLine(), ctx.GetStart().GetColumn())
		return
	}

	// TODO: Declare the rule
	fmt.Println(rule)
	// err = s.Namespaces[ctx.Namespace().GetText()].SurfaceRules.Declare(ctx.Identifier().GetText(), rule)
	if err != nil {
		s.AddError(err.Error(), mms_errors.ErrorLevelError, ctx.GetStart().GetLine(), ctx.GetStart().GetColumn())
	}
}

func ReplaceConditionRefernces(
	condition surface_conditions.SurfaceCondition,
) (surface_conditions.SurfaceCondition, error) {

	return nil, errors.New("unknown surface condition type")
}

func ReplaceRuleReferences(
	rule surface_rules.SurfaceRule,
) (surface_rules.SurfaceRule, error) {
	switch rule := rule.(type) {
	case *surface_rules.BlockRule:
		return rule, nil
	case *surface_rules.BandlandsRule:
		return rule, nil
	case *surface_rules.SequenceRule:
		return rule, nil
	case *surface_rules.ConditionalRule:
		return rule, nil
	case *surface_rules.ReferenceRule:
		fmt.Println("Rule References are broken")
		return nil, errors.ErrUnsupported
	}
	return nil, errors.New("unknown surface rule type")
}
