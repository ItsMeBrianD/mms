namespace my_datapack;

surface {
    condition CompoundCondition and (
        hole
        biome [minecraft:plains minecraft:mountains]
        !freezing
        noise minecraft:weird [0.1, 0.9]
    )

    rule VerySpecificRule if (CompoundCondition) block minecraft:stone
}