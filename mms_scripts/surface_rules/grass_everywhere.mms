namespace demo;

surface {
    rule SimpleGrass block minecraft:grass



    rule GrassThenDirt sequence [
        if (above_preliminary_surface) block minecraft:grass
        block minecraft:dirt
    ]
}