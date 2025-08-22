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

	Root string
}

func NewProject(root string) *Project {
	parser := grammars.NewMMSParser(nil)
	surfaceRules := surface_rules.NewSurfaceRuleSerializer()
	parser.AddParseListener(surfaceRules)

	return &Project{
		parser:       parser,
		SurfaceRules: surfaceRules,
		Root:         root,
	}
}

func (p Project) SerializeToFileTreeLike() (*lib.FileTreeLike, error) {
	root := lib.NewDirLike("mms_build")
	return p.SurfaceRules.SerializeToFileTreeLike(root)
}

func (p *Project) Parse() (*lib.FileTreeLike, error) {
	stat, err := os.Stat(p.Root)
	if err != nil {
		return nil, err
	}
	files := make([]string, 0)
	if stat.IsDir() {
		files, err = getAllFilesInDir(p.Root)
		if err != nil {
			return nil, err
		}
	} else {
		files = append(files, p.Root)
	}

	namespaces := make(map[string][]grammars.IMmsFileContext, 0)

	for _, file := range files {
		data, err := os.ReadFile(file)
		if err != nil {
			return nil, err
		}
		ctx, err := p.ParseFile(string(data))
		if err != nil {
			return nil, err
		}
		namespace := ctx.NamespaceDeclaration().Identifier().GetText()
		namespaces[namespace] = append(namespaces[namespace], ctx)

	}

	p.SurfaceRules.Finalize()
	return p.SerializeToFileTreeLike()
}

func (p *Project) ParseFile(content string) (*grammars.MmsFileContext, error) {
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
