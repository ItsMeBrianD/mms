package lib

import (
	"encoding/json"
	"fmt"

	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
)

type Reference struct {
	json.Marshaler
	Namespace string
	Name      string
}

func (r Reference) MarshalJSON() ([]byte, error) {
	return []byte(fmt.Sprintf("\"%s:%s\"", r.Namespace, r.Name)), nil
}

type Referential interface {
	Reference() grammars.IReferenceContext
	Identifier() antlr.TerminalNode
}

func ParseReferential(defaultNamespace string, ctx Referential) Reference {
	result := Reference{
		Namespace: "",
		Name:      "",
	}
	if ref := ctx.Reference(); ref != nil {
		result.Namespace = ref.Identifier(0).GetText()
		result.Name = ref.Identifier(1).GetText()
	} else if id := ctx.Identifier(); id != nil {
		result.Namespace = defaultNamespace
		result.Name = id.GetText()
	}
	return result
}
