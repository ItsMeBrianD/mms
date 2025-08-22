<script lang="ts" module>
	type FileLike = {
		name: string;
		isDir: false;
		content: string;
	};
	type DirLike = {
		name: string;
		isDir: true;
		children: Record<string, FileTreeLike>;
		collapsed?: boolean;
	};
	export type FileTreeLike = FileLike | DirLike;

	const reactify = <T extends FileTreeLike>(fileLike: T): T => {
		if (fileLike.isDir) {
			let collapsed = $state(false);
			return {
				...fileLike,
				get collapsed() {
					return collapsed;
				},
				set collapsed(value) {
					collapsed = value;
				},
				children: Object.fromEntries(
					Object.entries(fileLike.children ?? {}).map(([name, child]) => [name, reactify(child)])
				)
			};
		} else {
			let content = $state(fileLike.content);
			return {
				...fileLike,
				get content() {
					return content;
				},
				set content(value) {
					content = value;
				}
			};
		}
	};
</script>

<script lang="ts">
	import { slide } from 'svelte/transition';

	let { tree }: { tree: FileTreeLike } = $props();

	let highlightPath = $state<string[] | null>(null);
	let highlight = $derived.by((): FileLike | null => {
		if (!highlightPath) return null;
		let current = tree;
		for (let name of highlightPath) {
			if (current.isDir) {
				current = current.children[name];
			} else {
				return current;
			}
		}
		if (!current.isDir) {
			return current;
		}
		return null;
	});
</script>

<section class="flex justify-between gap-2">
	<aside class="w-96">
		<h2 class="px-2 py-0.5 text-sm font-bold uppercase">Project Files</h2>
		{#if tree.isDir}
			{@render Dir(tree, [])}
		{:else}
			{@render File(tree, [])}
		{/if}
	</aside>
	<div class="flex h-full w-full flex-col items-center justify-center">
		{#if highlight}
			<h2 class="px-2 py-0.5 text-sm font-bold uppercase">{highlight.name}</h2>
			<pre class="h-full w-full">{highlight.content}</pre>
		{:else}
			<p>No file selected</p>
		{/if}
	</div>
</section>

{#snippet File(f: FileLike, path: string[])}
	<button
		class="flex w-full justify-start px-2 py-0.5 text-sm hover:bg-slate-300 hover:text-slate-900"
		onclick={() => (highlightPath = path)}
		class:bg-slate-600={highlight?.name === f.name}
		class:text-slate-50={highlight?.name === f.name}
	>
		<span>{f.name}</span>
	</button>
{/snippet}

{#snippet Dir(d: DirLike, path: string[])}
	<div class="group flex w-full flex-col justify-start px-2 py-0.5 text-sm">
		<button
			class="flex w-full items-center justify-start hover:bg-slate-300 group-hover:bg-slate-200"
			onclick={() => {
				d.collapsed = !d.collapsed;
			}}
		>
			<span>{d.name}/</span>
		</button>
		{#if !d.collapsed}
			<ul class="w-full pl-4 group-hover:bg-slate-200" transition:slide>
				{#each Object.values(d.children) as child}
					{#if child.isDir}
						{@render Dir(child, [...path, child.name])}
					{:else}
						{@render File(child, [...path, child.name])}
					{/if}
				{/each}
			</ul>
		{/if}
	</div>
{/snippet}
