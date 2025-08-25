package surface

import (
	"errors"

	"github.com/itsmebriand/mms/minecraft_metascript/mms_errors"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_rules"
	"github.com/itsmebriand/mms/mms/grammars"
)

func (s *SurfaceVisitor) ConstructSurfaceRule(ctx *grammars.SurfaceRuleContext) (surface_rules.SurfaceRule, error) {
	ruleCtx := ctx.GetChild(0)

	switch ruleCtx.(type) {
	case *grammars.SurfaceRule_BlockContext:
		blockCtx := ruleCtx.(*grammars.SurfaceRule_BlockContext)
		rule, err := surface_rules.NewBlockRule(blockCtx)
		if err != nil {
			s.AddError(err.Error(), mms_errors.ErrorLevelError, blockCtx.GetStart().GetLine(), blockCtx.GetStart().GetColumn())
			return nil, err
		}
		return rule, nil
	case *grammars.SurfaceRule_BandlandsContext:
		bandlandsCtx := ruleCtx.(*grammars.SurfaceRule_BandlandsContext)
		rule, err := surface_rules.NewBandlandsRule(bandlandsCtx)
		if err != nil {
			s.AddError(err.Error(), mms_errors.ErrorLevelError, bandlandsCtx.GetStart().GetLine(), bandlandsCtx.GetStart().GetColumn())
			return nil, err
		}
		return rule, nil
	case *grammars.SurfaceRule_SequenceContext:
		sequenceCtx := ruleCtx.(*grammars.SurfaceRule_SequenceContext)
		rule, err := surface_rules.NewSequenceRule(sequenceCtx)
		if err != nil {
			s.AddError(err.Error(), mms_errors.ErrorLevelError, sequenceCtx.GetStart().GetLine(), sequenceCtx.GetStart().GetColumn())
			return nil, err
		}
		return rule, nil
	case *grammars.SurfaceRule_ConditionalContext:
		conditionalCtx := ruleCtx.(*grammars.SurfaceRule_ConditionalContext)
		rule, err := surface_rules.NewConditionalRule(conditionalCtx, s, s)
		if err != nil {
			s.AddError(err.Error(), mms_errors.ErrorLevelError, conditionalCtx.GetStart().GetLine(), conditionalCtx.GetStart().GetColumn())
			return nil, err
		}
		return rule, nil
	case *grammars.SurfaceRuleReferenceContext:
		referenceCtx := ruleCtx.(*grammars.SurfaceRuleReferenceContext)
		rule, err := surface_rules.NewReferenceRule(referenceCtx)
		if err != nil {
			s.AddError(err.Error(), mms_errors.ErrorLevelError, referenceCtx.GetStart().GetLine(), referenceCtx.GetStart().GetColumn())
			return nil, err
		}
		return rule, nil
	}

	return nil, errors.New("unknown surface rule type")
}
