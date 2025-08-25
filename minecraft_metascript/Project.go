package minecraft_metascript

import (
	"errors"
	"fmt"
	"os"

	"github.com/itsmebriand/mms/minecraft_metascript/mms_file"
	"github.com/itsmebriand/mms/minecraft_metascript/surface"
	"github.com/itsmebriand/mms/minecraft_metascript/surface/surface_rules"
	"github.com/itsmebriand/mms/mms/grammars"
	"github.com/itsmebriand/mms/mms/lib"
)

type MMSProject struct {
	files []mms_file.MMSFile
}

func NewMMSProject() *MMSProject {
	return &MMSProject{}
}

func (p MMSProject) Declarations() mms_file.MMSDeclarations {
	out := mms_file.NewMMSDeclarations()
	for _, file := range p.files {
		err := out.Merge(*file.GetDeclarations())
		if err != nil {
			fmt.Println(err)
		}
	}
	return *out
}

func (p *MMSProject) AddFile(filepath, content string) error {
	f := mms_file.ParseFile(filepath, content, []func(*mms_file.MMSFile) grammars.MMSParserListener{
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

func (p MMSProject) GetSurfaceRule(namespace string, name string) (surface_rules.SurfaceRule, error) {
	for _, file := range p.files {
		if file.GetNamespace() != namespace {
			continue
		}
		for name, rule := range file.GetDeclarations().GetSurfaceRules() {
			if name == name {
				return rule, nil
			}
		}
	}
	return nil, errors.New("surface rule not found: " + namespace + ":" + name)
}

func (p MMSProject) GetSurfaceRules() map[string]surface_rules.SurfaceRule {
	out := make(map[string]surface_rules.SurfaceRule)
	for _, file := range p.files {
		for name, rule := range file.GetDeclarations().GetSurfaceRules() {
			if rule.Type() == surface_rules.ReferenceRuleKind {
				// Resolve reference when fetched
				ref := rule.(surface_rules.ReferenceRule)
				rule, err := p.GetSurfaceRule(ref.Namespace, ref.Name)
				if err != nil {
					fmt.Println(err)
				} else {
					out[name] = rule
				}
			} else {
				out[name] = rule
			}
		}
	}
	return out
}

func (p MMSProject) Export() lib.FileTreeLike {
	return lib.FileTreeLike{
		Name:     "surface_rules",
		Children: map[string]*lib.FileTreeLike{},
	}
}
