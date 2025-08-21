namespace demo;

surface {
    rule Nesting sequence [
        block minecraft:stone
        block minecraft:grass
        sequence [
            block minecraft:air
            block minecraft:water
        ]
    ]
}
