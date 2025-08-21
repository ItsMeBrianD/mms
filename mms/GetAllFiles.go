package mms

import "os"

func getAllFilesInDir(dir string) ([]string, error) {
	files := make([]string, 0)
	entries, err := os.ReadDir(dir)
	if err != nil {
		return nil, err
	}
	for _, entry := range entries {
		if entry.IsDir() {
			subFiles, err := getAllFilesInDir(dir + entry.Name())
			if err != nil {
				return nil, err
			}
			files = append(files, subFiles...)
		} else {
			files = append(files, dir+"/"+entry.Name())
		}
	}
	return files, nil
}
