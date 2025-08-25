#!/bin/bash

# Determine the VSCode extensions folder based on platform
if [[ "$OSTYPE" == "darwin"* ]]; then
    # macOS
    EXTENSIONS_DIR="$HOME/.windsurf/extensions/mms-language"
elif [[ "$OSTYPE" == "linux-gnu"* ]]; then
    # Linux
    EXTENSIONS_DIR="$HOME/.windsurf/extensions/mms-language"
else
    # Windows with Git Bash or similar
    EXTENSIONS_DIR="$HOME/.windsurf/extensions/mms-language"
fi

# Create the extension directory
mkdir -p "$EXTENSIONS_DIR"

# Copy extension files
cp -r * "$EXTENSIONS_DIR"

# Install dependencies
cd "$EXTENSIONS_DIR"
npm install

echo "Extension installed to $EXTENSIONS_DIR"
echo "Please restart VSCode to activate the extension"
