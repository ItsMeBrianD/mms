package mms_file

import (
	"encoding/json"
	"log"
	"os"
	"strings"

	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
)

type MMSFile struct {
	path         string
	namespace    string
	declarations MMSDeclarations
	tree         grammars.IMmsFileContext
	rawContent   string

	errors []TokenError
}

func (f *MMSFile) GetNamespace() string {
	return f.namespace
}

func (f *MMSFile) AddError(message string, level ErrorLevel, line, column int) {
	f.errors = append(f.errors, NewTokenError(f.path, column, line, message, level))
}

func (f *MMSFile) GetErrors() []TokenError {
	return f.errors
}

func (f *MMSFile) GetDeclarations() *MMSDeclarations {
	return &f.declarations
}

func ParseFile(
	path string,
	content string,
	visitors []func(*MMSFile) grammars.MMSParserListener,
) *MMSFile {
	f := &MMSFile{
		rawContent:   content,
		path:         path,
		declarations: *NewMMSDeclarations(),
	}

	tokenStream := antlr.NewInputStream(content)

	listener := NewErrorListener(path, func(err TokenError) {
		f.errors = append(f.errors, err)
	})

	lexer := grammars.NewMMSLexer(tokenStream)
	// Register error listener with the lexer
	lexer.RemoveErrorListeners()
	lexer.AddErrorListener(listener)

	parser := grammars.NewMMSParser(antlr.NewCommonTokenStream(lexer, 0))

	fileVisitor := NewMMSFileVisitor(f)
	parser.AddParseListener(fileVisitor)
	for _, visitor := range visitors {
		parser.AddParseListener(visitor(f))
	}

	// Register error listener with the parser
	parser.RemoveErrorListeners()
	parser.AddErrorListener(listener)

	f.tree = parser.MmsFile()

	debugEnv := os.Getenv("debug")
	if strings.Contains(debugEnv, "mms") {
		if f.errors != nil {
			for _, err := range f.errors {
				log.Println(err)
			}
		}

		if f.declarations.surfaceRules != nil {
			log.Println("surface rules:")
			for name, rule := range f.declarations.surfaceRules {
				str, err := json.Marshal(rule)
				if err != nil {
					log.Println("[ERR]: ", err)
				} else {
					log.Println(name, string(str))
				}
			}
		}
	}

	return f
}
