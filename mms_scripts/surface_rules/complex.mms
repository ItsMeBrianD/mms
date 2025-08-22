namespace complex;

surface {
    // Entrypoint rule: deeply nested, references, else, advanced conditions, and math
    rule Entrypoint sequence [
        if (MegaCondition) MainSequence
        if !(MegaCondition) FallbackSequence
        FinalLayer
    ]

    // Main sequence with nested rules, references, and conditions
    rule MainSequence sequence [
        if (biome [minecraft:plains minecraft:mountains]) PlainsMountainLayer
        if (noise minecraft:weird [0.2, 0.8]) NoiseLayer
        NestedSequence
        reference_demo:Referenced // Reference to another namespace
        if (vertical_gradient "DeepGradient" absolute 5, absolute 50) DeepGradientLayer
    ]

    // Fallback if MegaCondition is false
    rule FallbackSequence sequence [
        if (freezing) block minecraft:ice
        if (steep) block minecraft:gravel
        block minecraft:dirt
    ]

    // Custom deeply nested sequence
    rule NestedSequence sequence [
        block minecraft:stone
        sequence [
            if (hole) block minecraft:air
            if (above_preliminary_surface) block minecraft:grass
            sequence [
                if (above_water 10 0.1 add) block minecraft:sand
                if (y_above absolute 64 0 add) block minecraft:gold_ore
            ]
        ]
    ]

    // Layer for specific biomes
    rule PlainsMountainLayer sequence [
        block minecraft:grass_block
        if !(noise minecraft:spaghetti [0.3, 0.7]) block minecraft:podzol
    ]

    // Noise-based layer
    rule NoiseLayer sequence [
        block minecraft:deepslate
        if (stone_depth floor 2 add 3) block minecraft:emerald_ore
    ]

    // Deep vertical gradient
    rule DeepGradientLayer sequence [
        block minecraft:obsidian
        if (y_above absolute 10 0 add) block minecraft:bedrock
    ]

    // Final unconditional layer
    rule FinalLayer block minecraft:barrier

    // MegaCondition combines multiple types, references, and negation
    condition MegaCondition and (
        biome [minecraft:plains minecraft:mountains minecraft:forest]
        !hole
        noise minecraft:weird [0.1, 0.9]
        freezing
        above_water 10 0.2 add
        y_above absolute 60 0 add
        vertical_gradient "MegaGradient" absolute 0, absolute 100
    )
}