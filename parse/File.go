package parse

import (
	"errors"

	"github.com/antlr4-go/antlr/v4"
	"github.com/itsmebriand/mms/mms/grammars"
)

func parse(content, filename string) (grammars.IMmsFileContext, []error) {
	stream := antlr.NewInputStream(content)
	if stream == nil {
		return nil, []error{errors.New("failed to create input stream")}
	}
	lexer := grammars.NewMMSLexer(stream)
	if lexer == nil {
		return nil, []error{errors.New("failed to create lexer")}
	}

	parser := grammars.NewMMSParser(antlr.NewCommonTokenStream(lexer, 0))

	parser.RemoveErrorListeners()
	handler := ErrorHandler{Filename: filename, Content: content}
	parser.AddErrorListener(&handler)

	file := parser.MmsFile()
	err := make([]error, len(handler.Messages))
	for i, msg := range handler.Messages {
		err[i] = errors.New(msg)
	}

	if len(err) == 0 {
		return file, nil
	} else {
		return file, err
	}
}

func ParseFileContentStrict(content, filename string) (grammars.IMmsFileContext, []error) {
	file, err := parse(content, filename)
	if len(err) > 0 {
		return nil, err
	}

	return file, nil
}

func ParseFileContent(content, filename string) (grammars.IMmsFileContext, []error) {
	return parse(content, filename)
}
