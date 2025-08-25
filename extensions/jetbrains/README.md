MMS JetBrains Plugin (Minimal)

This is a minimal IntelliJ Platform plugin that registers the MMS language and associates it with `.mms` files.

Features:
- Recognizes `.mms` files as MMS Language.
- Provides a scaffold to extend with syntax highlighting (e.g., TextMate) or an LSP client in the future.

Build
-----
Options:

1) With Nix (reproducible)
- From repo root:
  nix build .#jetbrainsPlugin
- The resulting zip(s) will be in result/ (symlink to Nix store). Install in IntelliJ via Settings -> Plugins -> Gear icon -> Install Plugin from Disk.

2) With Gradle
Requirements: JDK 17 and Gradle (or use Gradle wrapper if added later).
From this directory (extensions/jetbrains):
- Build the plugin zip:
  ./gradlew buildPlugin
- The resulting zip will be in build/distributions. Install it in IntelliJ via Settings -> Plugins -> Gear icon -> Install Plugin from Disk.

Notes
-----
- To add syntax highlighting quickly, you can bundle the existing TextMate grammar from `../vscode-extension/syntaxes/mms.tmLanguage.json` using the TextMate support in IntelliJ.
- For advanced features (code completion, diagnostics), consider integrating with the MMS LSP server found in `../../lsp`.
