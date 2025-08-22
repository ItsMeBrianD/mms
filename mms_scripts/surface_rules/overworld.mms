namespace minecraft;


surface {
    rule BedrockFloor 
        if (vertical_gradient "minecraft:bedrock_floor" above_bottom 0, above_bottom 5) 
            block minecraft:bedrock
    
    
    
    condition Badlands 
        biome [
            minecraft:badlands minecraft:eroded_badlands minecraft:wooded_badlands
        ]
}