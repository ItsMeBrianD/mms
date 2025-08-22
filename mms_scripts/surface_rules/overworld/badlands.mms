namespace minecraft;


surface {

    rule SkyTerracotta if (y_above absolute 256 0 sub) block minecraft:orange_terracotta
    rule Bands if (
        stone_depth floor 0 sub 0
    ) sequence [
        if (y_above absolute 74 1 add) sequence [
            if (noise minecraft:surface [-0.909, -0.5454]) block minecraft:terracotta
            if (noise minecraft:surface [-0.1818, 0.1818]) block minecraft:terracotta
            if (noise minecraft:surface [0.5454, 0.909]) block minecraft:terracotta
            bandlands
        ]
    ]

    rule Sands if (
        above_water -1 0 sub
    ) sequence [
        if (stone_depth ceiling 0 sub 0) block minecraft:red_sandstone
        block minecraft:red_sand
    ]

    rule Hole if !(hole) 
        block minecraft:orange_terracotta

    condition InBadlands 
        biome [
            minecraft:badlands 
            minecraft:eroded_badlands 
            minecraft:wooded_badlands
        ]

    rule WhiteTerracotta 
        if (above_water -6 -1 add)
            block minecraft:white_terracotta

    rule OrangeTerracotta
        if (and (
            y_above absolute 63 0 sub
            !y_above absolute 74 1 add
        ))
            block minecraft:orange_terracotta

    rule Stones
        sequence [
            if (stone_depth ceiling 0 sub 0) block minecraft:stone
            block minecraft:gravel
        ]

    rule Bandlands
        if (InBadlands) sequence [
            if (stone_depth floor 0 sub 0) sequence [
                SkyTerracotta
                Bands
                Sands
                Hole
                WhiteTerracotta
                Stones
            ]
            if (y_above absolute 63 -1 add) sequence [
                OrangeTerracotta
                bandlands
            ]
            if (stone_depth floor 0 add 0) WhiteTerracotta
        ]
}