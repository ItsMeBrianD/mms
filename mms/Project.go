package mms

import (
	"errors"
	"os"

	antlr "github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
	"github.com/itsmebriand/mms/mms/surface_rules"
)

type Project struct {
	parser       *grammars.MMSParser
	SurfaceRules *surface_rules.SurfaceRuleSerializer
}

func NewProject() *Project {
	parser := grammars.NewMMSParser(nil)
	surfaceRules := surface_rules.NewSurfaceRuleSerializer()
	parser.AddParseListener(surfaceRules)

	return &Project{
		parser:       parser,
		SurfaceRules: surfaceRules,
	}
}

func (p Project) SerializeToFileTreeLike() (*lib.FileTreeLike, error) {
	root := lib.NewDirLike("mms_build")
	return p.SurfaceRules.SerializeToFileTreeLike(root)
}

func (p *Project) ParseFiles(root string) (*lib.FileTreeLike, error) {
	stat, err := os.Stat(root)
	if err != nil {
		return nil, err
	}
	files := make([]string, 0)
	if stat.IsDir() {
		files, err = getAllFilesInDir(root)
		if err != nil {
			return nil, err
		}
	} else {
		files = append(files, root)
	}

	namespaces := make(map[string][]grammars.IMmsFileContext, 0)

	for _, file := range files {
		data, err := os.ReadFile(file)
		if err != nil {
			return nil, err
		}
		ctx, err := p.ParseLiteral(string(data))
		if err != nil {
			return nil, err
		}
		namespace := ctx.NamespaceDeclaration().Identifier().GetText()
		namespaces[namespace] = append(namespaces[namespace], ctx)

	}

	return p.Finalize()
}

func (p *Project) Finalize() (*lib.FileTreeLike, error) {
	p.SurfaceRules.Finalize()
	return p.SerializeToFileTreeLike()
}

func (p *Project) ParseLiteral(content string) (*grammars.MmsFileContext, error) {
	stream := antlr.NewInputStream(content)
	if stream == nil {
		return nil, errors.New("failed to create input stream")
	}
	lexer := grammars.NewMMSLexer(stream)
	if lexer == nil {
		return nil, errors.New("failed to create lexer")
	}
	p.parser.SetTokenStream(antlr.NewCommonTokenStream(lexer, 0))

	tree := p.parser.MmsFile()
	if tree == nil {
		return nil, errors.New("failed to parse file")
	}

	return tree.(*grammars.MmsFileContext), nil

}
