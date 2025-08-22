namespace conditions;

surface {
    rule Entrypoint sequence [
        If_Ref
        If_AboveSurface
        If_BelowSurface
        If_Biome
        If_Biomes
        If_Hole
        If_Noise
        If_Steep
        If_StoneDepth
        If_Freezing
        If_VerticalGradient
        If_AboveWater
        If_YAbove
    ]

    rule If_Ref if (MyBiomeCondition) block minecraft:stone
    
    condition MyBiomeCondition biome [minecraft:plains]

    rule If_AboveSurface if (above_preliminary_surface) block minecraft:grass

    rule If_BelowSurface if !(above_preliminary_surface) block minecraft:stone

    rule If_Biome if (biome [minecraft:plains]) block minecraft:grass

    rule If_Biomes if (biome [minecraft:plains minecraft:forest]) block minecraft:grass

    rule If_Hole if (hole) block minecraft:stone
    
    rule If_Noise if (noise minecraft:noodle [0.1, 0.9]) block minecraft:stone

    rule If_Steep if (steep) block minecraft:stone
    
    rule If_StoneDepth if (stone_depth floor 0 add 1) block minecraft:stone
    
    rule If_Freezing if (freezing) block minecraft:stone

    rule If_VerticalGradient if (vertical_gradient "MyGradient" absolute 10, absolute 20) block minecraft:stone

    rule If_AboveWater if (above_water 10 0.1 add) block minecraft:stone

    rule If_YAbove if (y_above absolute 10 0 add) block minecraft:stone

}