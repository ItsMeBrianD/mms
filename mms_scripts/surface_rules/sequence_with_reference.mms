namespace reference_demo;

surface {
    rule Referencer sequence [
        block minecraft:stone
        block minecraft:grass
        rule(demo:Reference)
    ]

    rule Referenced block minecraft:air
}
