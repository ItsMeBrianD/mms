namespace demo;

surface mySurface {
    rule myRule sequence [
        block minecraft:stone
        block minecraft:grass
        sequence [
            block minecraft:air
            block minecraft:water
        ]
    ]
}
