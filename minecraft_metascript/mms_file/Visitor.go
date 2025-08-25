package mms_file

import (
	"github.com/itsmebriand/mms/mms/grammars"
)

type MMSFileVisitor struct {
	grammars.BaseMMSParserListener

	file *MMSFile
}

func NewMMSFileVisitor(file *MMSFile) *MMSFileVisitor {
	return &MMSFileVisitor{
		file: file,
	}
}

func (v *MMSFileVisitor) ExitNamespaceDeclaration(ctx *grammars.NamespaceDeclarationContext) {
	if id := ctx.Identifier(); id != nil {
		v.file.namespace = id.GetText()
	} else {
		v.file.errors = append(v.file.errors, NewTokenError(
			v.file.path,
			ctx.GetSourceInterval().Start,
			ctx.GetSourceInterval().Stop,
			"Namespace declaration must have an identifier",
			ErrorLevelError,
		))
	}
}

func (v *MMSFileVisitor) ExitMmsFile(ctx *grammars.MmsFileContext) {
	v.file.tree = ctx
}
