package minecraft_metascript

import (
	"os"

	"github.com/itsmebriand/mms/minecraft_metascript/mms_errors"
	"github.com/itsmebriand/mms/minecraft_metascript/surface"
	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

type MMSProject struct {
	files []MMSFile
}

func NewMMSProject() *MMSProject {
	return &MMSProject{
		files: make([]MMSFile, 0),
	}
}

func (p *MMSProject) AddFile(filepath, content string) error {
	f := p.ParseFile(filepath, content, []func(
		reportError func(msg string, level mms_errors.ErrorLevel, line int, column int),
	) grammars.MMSParserListener{
		surface.NewSurfaceVisitor,
	})
	p.files = append(p.files, *f)
	return nil
}

func (p *MMSProject) ParseFiles(root string) error {
	stat, err := os.Stat(root)
	if err != nil {
		return err
	}
	files := make([]string, 0)
	if stat.IsDir() {
		files, err = lib.RecursiveFilesInDir(root)
		if err != nil {
			return err
		}
	} else {
		files = append(files, root)
	}

	for _, file := range files {
		data, err := os.ReadFile(file)
		if err != nil {
			return err
		}
		err = p.AddFile(file, string(data))
		if err != nil {
			return err
		}
	}
	return nil
}

func (p MMSProject) Export() lib.FileTreeLike {
	return lib.FileTreeLike{
		Name:     "surface_rules",
		Children: map[string]*lib.FileTreeLike{},
	}
}
