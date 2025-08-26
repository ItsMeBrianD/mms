package noise

import (
	"encoding/json"
	"fmt"

	"github.com/itsmebriand/mms/mms/lib"
)

func Export(ns *lib.Namespace, rootDir *lib.FileTreeLike) error {
	dir := rootDir.MkDir("worldgen").MkDir("noise")

	for name, noise := range lib.AllOf[Noise](ns) {
		contents, err := json.Marshal(noise.Value)
		if err != nil {
			continue
		}
		dir.MkFile(
			fmt.Sprintf("%s.json", name),
			string(contents),
		)
	}

	return nil
}
