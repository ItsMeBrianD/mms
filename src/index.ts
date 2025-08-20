import { CharStreams, CommonTokenStream, ParseTreeWalker } from "antlr4";
import MMSLex from "./grammar/MMSLex";
import MMSParse from "./grammar/MMSParse";
import { DensityFunctionListener } from "./visitors/DensityFunctionListener";
import { processFile } from "./visitors";

const filename = Bun.argv[2];
if (!filename) {
  console.error("Please provide a filename");
  process.exit(1);
}
const file = Bun.file(filename);
if (!(await file.exists())) {
  console.error("File does not exist");
  process.exit(1);
}

const content = await file.text();

const chars = CharStreams.fromString(content);
const lexer = new MMSLex(chars);
const tokens = new CommonTokenStream(lexer);
const parser = new MMSParse(tokens);
const tree = parser.file();

const results = processFile(tree);


const gap = " ".repeat(results.script.name.length)
console.log("data/");
console.log(`     ${results.script.name}/`)
console.log(`     ${gap}worldgen/`);
console.log(`              ${gap}noise/`);
results.density_functions.entries().forEach(([key, value]) => {
    console.log(`                ${gap}${key}.json`);
    const json = JSON.stringify(value, null, 2)
    const output = json.split('\n').map(line => `                ${gap}| ${line}`).join('\n')
    console.log(output)
})
console.log(`              ${gap}density_functions/`);
results.noise.entries().forEach(([key, value]) => {
    console.log(`                ${gap}${key}.json`);
    const json = JSON.stringify(value, null, 2)
    const output = json.split('\n').map(line => `                ${gap}| ${line}`).join('\n')
    console.log(output)
})


