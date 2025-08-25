package surface

import (
	"errors"

	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/minecraft_metascript/mms_errors"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_rules"
	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

func mkRuleSymbol(ctx *grammars.SurfaceRuleDeclarationContext, rule surface_rules.SurfaceRule, ref lib.Reference, file string) lib.Symbol[surface_rules.SurfaceRule] {
	return lib.Symbol[surface_rules.SurfaceRule]{
		Line:  ctx.GetStart().GetLine(),
		Col:   ctx.GetStart().GetColumn(),
		Ref:   ref,
		File:  file,
		Value: rule,
	}
}

func (v *Visitor) ConstructSurfaceRule(ctx *grammars.SurfaceRuleContext) (surface_rules.SurfaceRule, []error) {
	var rule surface_rules.SurfaceRule
	var errs []error

	switch ctx := ctx.GetChild(0).(type) {
	case *grammars.SurfaceRule_BlockContext:
		r, err := surface_rules.NewBlockRule(ctx)
		rule = r
		if err != nil {
			errs = []error{err}
		}
	case *grammars.SurfaceRule_BandlandsContext:
		r, err := surface_rules.NewBandlandsRule(ctx)
		rule = r
		if err != nil {
			errs = []error{err}
		}
	case *grammars.SurfaceRule_SequenceContext:
		rule, errs = surface_rules.NewSequenceRule(ctx, v)
	case *grammars.SurfaceRule_ConditionalContext:
		rule, errs = surface_rules.NewConditionalRule(ctx, v, v)
	case *grammars.SurfaceRuleReferenceContext:
		r, err := surface_rules.NewReferenceRule(ctx)
		rule = r
		if err != nil {
			errs = []error{err}
		}

	}

	if rule == nil {
		return nil, []error{errors.New("failed to parse rule")}
	}

	rule.SetLocation(
		lib.GetRuleLocation(ctx.GetRuleContext().(antlr.ParserRuleContext)),
	)

	if len(errs) > 0 {
		for _, err := range errs {
			v.AddError(
				mms_errors.SyntaxError(v.filename, lib.GetRuleLocation(ctx), err.Error()),
			)
		}
		return rule, errs
	}
	return rule, nil

}
