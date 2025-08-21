package serializers

import (
	"fmt"

	antlr "github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
)

type surfaceRuleListener struct {
	grammars.BaseMMSParserListener

	rules map[*grammars.SurfaceRuleContext]surfaceRule
}

type surfaceRule interface {
	GetType() surfaceRuleType
}

type baseSurfaceRule struct {
	Type surfaceRuleType `json:"type"`
}

func (v baseSurfaceRule) GetType() surfaceRuleType {
	return v.Type
}

type surfaceRuleType string

const (
	blockSurfaceRule       surfaceRuleType = "minecraft:block"
	conditionalSurfaceRule surfaceRuleType = "minecraft:conditional"
	sequenceSurfaceRule    surfaceRuleType = "minecraft:sequence"
)

func (v *surfaceRuleListener) EnterSurfaceRule_Conditional(ctx *grammars.SurfaceRule_ConditionalContext) {
	fmt.Println(ctx.GetText())
}

type surfaceRuleBlockSerialized struct {
	baseSurfaceRule
	Block string `json:"block"`
}

func (v surfaceRuleBlockSerialized) GetType() surfaceRuleType {
	return v.Type
}

func (v *surfaceRuleListener) EnterSurfaceRule_Block(ctx *grammars.SurfaceRule_BlockContext) {
	block := surfaceRuleBlockSerialized{
		baseSurfaceRule: baseSurfaceRule{Type: blockSurfaceRule},
		Block:           ctx.Reference().GetText(),
	}

	parent := ctx.GetParent()
	if parentRuleCtx, ok := parent.(*grammars.SurfaceRuleContext); ok {
		v.rules[parentRuleCtx] = block
	}
}

type surfaceRuleSequenceSerialized struct {
	baseSurfaceRule
	Sequence []surfaceRule `json:"sequence"`
}

func (v *surfaceRuleListener) ExitSurfaceRule_Sequence(ctx *grammars.SurfaceRule_SequenceContext) {
	sequence := &surfaceRuleSequenceSerialized{
		baseSurfaceRule: baseSurfaceRule{Type: sequenceSurfaceRule},
		Sequence:        []surfaceRule{},
	}
	for _, child := range ctx.AllSurfaceRule() {
		sequence.Sequence = append(sequence.Sequence, v.rules[child.(*grammars.SurfaceRuleContext)])
		delete(v.rules, child.(*grammars.SurfaceRuleContext))

	}
	if parentRuleCtx, ok := ctx.GetParent().(*grammars.SurfaceRuleContext); ok {
		v.rules[parentRuleCtx] = sequence
	}
}

func SerializeSurfaceRules(
	file grammars.IMmsFileContext,
) map[string]interface{} {

	visitor := &surfaceRuleListener{
		rules: make(map[*grammars.SurfaceRuleContext]surfaceRule),
	}
	walker := antlr.NewParseTreeWalker()
	walker.Walk(visitor, file)

	for _, v := range visitor.rules {
		fmt.Println(v)
	}

	return map[string]interface{}{}
}
