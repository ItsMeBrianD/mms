package minecraft_metascript

import (
	"log"
	"os"
	"strings"

	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/minecraft_metascript/mms_errors"
	"github.com/itsmebriand/mms/mms/grammars"
)

type MMSFile struct {
	path       string
	namespace  string
	project    *MMSProject
	tree       grammars.IMmsFileContext
	rawContent string

	errors []mms_errors.TokenError
}

func (f *MMSFile) GetNamespace() string {
	return f.namespace
}

func (f *MMSFile) AddError(message string, level mms_errors.ErrorLevel, line, column int) {
	f.errors = append(f.errors, mms_errors.NewTokenError(f.path, column, line, message, level))
}

func (f *MMSFile) GetErrors() []mms_errors.TokenError {
	return f.errors
}

func (p *MMSProject) ParseFile(
	path string,
	content string,
	visitors []func(
		reportError func(msg string, level mms_errors.ErrorLevel, line int, column int),
	) grammars.MMSParserListener,
) *MMSFile {
	f := &MMSFile{
		rawContent: content,
		path:       path,
		project:    p,
	}

	tokenStream := antlr.NewInputStream(content)

	listener := mms_errors.NewErrorListener(path, func(err mms_errors.TokenError) {
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
		parser.AddParseListener(visitor(
			f.AddError,
		))
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
	}

	return f
}
