package mms

import (
	"errors"
	"os"

	antlr "github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/walkers/surface_rules"
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

func (p *Project) Parse() error {
	stat, err := os.Stat(p.Root)
	if err != nil {
		return err
	}
	files := make([]string, 0)
	if stat.IsDir() {
		files, err = getAllFilesInDir(p.Root)
		if err != nil {
			return err
		}
	} else {
		files = append(files, p.Root)
	}

	trees := make(map[string][]grammars.IMmsFileContext, 0)

	for _, file := range files {
		data, err := os.ReadFile(file)
		if err != nil {
			return err
		}
		p.ParseFile(string(data))
	}

	os.Mkdir("mms_build", 0755)
	for namespace := range trees {
		os.RemoveAll("mms_build/" + namespace)
		os.Mkdir("mms_build/"+namespace, 0755)
		os.Mkdir("mms_build/"+namespace+"/_debug", 0755)
	}
	p.SurfaceRules.Finalize()
	p.SurfaceRules.Flush()
	return nil
}

func (p *Project) ParseFile(content string) error {
	stream := antlr.NewInputStream(content)
	if stream == nil {
		return errors.New("failed to create input stream")
	}
	lexer := grammars.NewMMSLexer(stream)
	if lexer == nil {
		return errors.New("failed to create lexer")
	}
	p.parser.SetTokenStream(antlr.NewCommonTokenStream(lexer, 0))

	tree := p.parser.MmsFile()
	if tree == nil {
		return errors.New("failed to parse file")
	}

	return nil

}
