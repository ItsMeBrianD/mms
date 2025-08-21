{
  description = "DevShell with Antlr4 and Go";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs";
    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs =
    { nixpkgs, flake-utils, ... }:
    flake-utils.lib.eachDefaultSystem (
      system:
      let
        pkgs = import nixpkgs { inherit system; };
      in
      {
        devShells.default = pkgs.mkShell {
          buildInputs = [
            pkgs.antlr4
            pkgs.go
            pkgs.fish
          ];

          shellHook = ''
            exec fish
          '';
        };

        packages.default = pkgs.buildGoModule {
          pname = "mms";
          version = "0.1.0";
          src = ./.;
          vendorHash = null;
          # If you use vendoring, run `go mod vendor` and replace null with the hash
          subPackages = [ "." ];

          preBuild = ''
            ${pkgs.antlr4}/bin/antlr4 -Dlanguage=Go $src/grammars/MMSLexer.g4 -o ./mms;
            ${pkgs.antlr4}/bin/antlr4 -Dlanguage=Go $src/grammars/MMSParser.g4 -lib ./mms -o ./mms
          '';
        };

        packages.wasm = pkgs.stdenvNoCC.mkDerivation {
          pname = "mms-wasm";
          version = "0.1.0";
          src = ./.;
          buildInputs = [ pkgs.go ];
          buildPhase = ''
            export GOOS=js
            export GOARCH=wasm
            export GOCACHE="$TMPDIR/go-cache"
            go build -o main.wasm
          '';
          installPhase = ''
            mkdir -p $out
            mv main.wasm $out/
            cp "$(go env GOROOT)/lib/wasm/wasm_exec.js" $out/
          '';
        };
      }
    );
}
