package surface

import (
	"github.com/itsmebriand/mms/minecraft_metascript/mms_file"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_rules"
	"github.com/itsmebriand/mms/mms/grammars"
)

func NewSurfaceVisitor(file *mms_file.MMSFile) grammars.MMSParserListener {
	return &SurfaceVisitor{
		file: file,
	}
}

type SurfaceVisitor struct {
	grammars.BaseMMSParserListener
	file *mms_file.MMSFile
}

func (s *SurfaceVisitor) ExitSurfaceRuleDeclaration(ctx *grammars.SurfaceRuleDeclarationContext) {
	rule, err := s.ConstructSurfaceRule(ctx.SurfaceRule().(*grammars.SurfaceRuleContext))
	if err != nil {
		s.file.AddError(err.Error(), mms_file.ErrorLevelError, ctx.GetStart().GetLine(), ctx.GetStart().GetColumn())
		return
	}

	s.file.GetDeclarations().AddSurfaceRule(
		rule,
		ctx.Identifier().GetText(),
	)
}

func ReplaceRuleReferences(rule surface_rules.SurfaceRule, declarations mms_file.MMSDeclarations) surface_rules.SurfaceRule {
	switch rule := rule.(type) {
	case *surface_rules.BlockRule:
		return rule
	case *surface_rules.BandlandsRule:
		return rule
	case *surface_rules.SequenceRule:
		return rule
	case *surface_rules.ConditionalRule:
		return rule
	case *surface_rules.ReferenceRule:
		return rule
	}
	return nil
}
