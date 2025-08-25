package minecraft_metascript

import (
	"log"
	"os"
	"strings"

	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/minecraft_metascript/mms_errors"
	"github.com/itsmebriand/mms/minecraft_metascript/surface"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_conditions"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_rules"
	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

type MMSFile struct {
	path       string
	namespace  string
	project    *MMSProject
	tree       grammars.IMmsFileContext
	rawContent string

	errors []mms_errors.MMSError

	Symbols *lib.Namespace
}

func (f *MMSFile) GetNamespace() string {
	return f.namespace
}

func (f *MMSFile) AddError(error mms_errors.MMSError) {
	f.errors = append(f.errors, error)
}

func (f *MMSFile) GetErrors() []mms_errors.MMSError {
	return f.errors
}
func (f *MMSFile) GetRawContent() string {
	return f.rawContent
}

func (f *MMSFile) GetTokenAt(position lib.Location) {

}

func (p *MMSProject) ParseFile(
	path string,
	content string,
) *MMSFile {
	f := &MMSFile{
		rawContent: content,
		path:       path,
		project:    p,
		Symbols:    lib.NewNamespace(),
		namespace:  "",
	}

	tokenStream := antlr.NewInputStream(content)

	listener := mms_errors.NewErrorListener(path, func(err mms_errors.MMSError) {
		f.errors = append(f.errors, err)
	})

	lexer := grammars.NewMMSLexer(tokenStream)
	// Register error listener with the lexer
	lexer.RemoveErrorListeners()
	lexer.AddErrorListener(listener)

	parser := grammars.NewMMSParser(antlr.NewCommonTokenStream(lexer, 0))

	surfaceVisitor := surface.NewSurfaceVisitor(f.AddError, path)

	fileVisitor := NewMMSFileVisitor(f, []NamespaceAware{surfaceVisitor})
	parser.AddParseListener(fileVisitor)
	parser.AddParseListener(surfaceVisitor)

	// Register error listener with the parser
	parser.RemoveErrorListeners()
	parser.AddErrorListener(listener)

	f.tree = parser.MmsFile()

	surfaceVisitor.DumpDeclarations(f.Symbols)
	// POST PARSE LOGIC

	var namespace string
	if f.GetNamespace() == "" {
		namespace = "unknown"
	} else {
		namespace = f.GetNamespace()
	}
	if _, ok := p.symbols[namespace]; !ok {
		p.symbols[namespace] = f.Symbols
	} else {
		p.symbols[namespace].Merge(f.Symbols)
	}

	if len(surfaceVisitor.RuleDeclarations) > 0 {
		log.Println("Found Surface Rules: ")
		for name, rule := range surfaceVisitor.RuleDeclarations {
			replacement, errs := surface.ReplaceRuleReferences(
				rule.Value,
				ProjectSymbols[surface_conditions.SurfaceCondition](p),
				ProjectSymbols[surface_rules.SurfaceRule](p),
				f.namespace,
			)
			if len(errs) > 0 {
				for _, err := range errs {
					f.AddError(
						mms_errors.SyntaxError(
							f.path, rule.Value.GetLocation(), err.Error(),
						),
					)

				}
			} else {
				rule.Value = replacement
				surfaceVisitor.RuleDeclarations[name] = rule
			}
		}
	}
	if len(surfaceVisitor.ConditionDeclarations) > 0 {
		log.Println("Found Surface Conditions: ")
		for _, condition := range surfaceVisitor.ConditionDeclarations {
			log.Println(condition)
		}
	}
	debugEnv := os.Getenv("debug")
	if strings.Contains(debugEnv, "mms") {
		if f.errors != nil {
			for _, err := range f.errors {
				log.Println(err)
			}
		}
		if len(surfaceVisitor.RuleDeclarations) > 0 {
			log.Println("Found Surface Rules: ")
			for _, rule := range surfaceVisitor.RuleDeclarations {
				log.Println(rule)
			}
		}
		if len(surfaceVisitor.ConditionDeclarations) > 0 {
			log.Println("Found Surface Conditions: ")
			for _, condition := range surfaceVisitor.ConditionDeclarations {
				log.Println(condition)
			}
		}
	}

	return f
}
