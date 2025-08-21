namespace demo;

surface mySurface {
    rule myRule sequence [
        block minecraft:stone
        block minecraft:grass
        rule(myRule2)
    ]

    rule myRule2 block minecraft:air
}
