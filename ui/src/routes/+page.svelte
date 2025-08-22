<script lang="ts">
	import { debounce } from 'es-toolkit';
	import Editor from '../lib/Editor.svelte';
	import FileTree from '../lib/FileTree.svelte';

	let fileContent = $state('namespace my_first_datapack;');
	let goInstance = $state<Go | null>(null);
	let projectFiles = $state<any | null>(null);

	const refresh = debounce((str: string) => {
		parseLiteral(str);
		console.debug('Updated project files');
	}, 500);
	$effect(() => {
		if (goInstance) {
			refresh(fileContent);
		}
	});

	async function onMmsLoad() {
		window.parseLiteralCallback = (project: string) => {
			projectFiles = JSON.parse(project);
		};
		const res = await fetch('/mms.wasm');
		if (!res.body) throw new Error();
		goInstance = new Go();
		goInstance.argv = ['_', 'wasm-mode'];
		const module = await WebAssembly.instantiateStreaming(res, goInstance.importObject);

		goInstance.run(module.instance).catch(() => {
			console.error('mms failed');
		});
	}
</script>

<svelte:head>
	<script src="/mms.js" defer onload={onMmsLoad}></script>
</svelte:head>

<section class="grid min-h-svh grid-rows-[auto_1fr_1fr]">
	<header class="px-2 py-1">
		<h1 class="text-xl font-bold">Minecraft Metascript Demo Editor</h1>
		<p class="max-w-[100ch] text-xs">
			Minecraft Metascript (MMS) is a language for authoring Minecraft datapacks. It intends to
			provide a more concise and readable syntax compared to the default JSON format.
			<br />
			This page runs an instance of the MMS parser and serializer in your browser using WebAssembly.
			<br />
			This tool is <strong>NOT</strong> production ready.
		</p>
	</header>

	<div class="flex flex-col">
		<h2 class="px-2 py-1 text-sm font-bold">MMS Source Code</h2>
		<Editor bind:value={fileContent} />
	</div>
	{#if projectFiles}
		<FileTree tree={projectFiles} />
	{/if}
</section>
