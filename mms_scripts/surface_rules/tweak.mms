namespace tweaks;

surface {
    condition FriendlyBiomes biome [
        minecraft:plains
        minecraft:forest
        minecraft:river
        minecraft:beach
        minecraft:flower_forest
        minecraft:sunflower_plains
    ]
    rule Entrypoint sequence [
        if (FriendlyBiomes) DiamondBlocks
        Bedrock
    ]
    rule DiamondBlocks block minecraft:diamond_block
    rule Bedrock block minecraft:bedrock
}
