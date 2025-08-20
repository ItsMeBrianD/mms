namespace surface_rule_tests

surface {


 rule MyConditionalRule
     if (biome ["minecraft:forest", "minecraft:desert"]) {
         block "minecraft:stone"
     } else {
         block "minecraft:dirt"
     }




    rule MyRule block "minecraft:stone"

    rule MySequence sequence [
        "minecraft:some_rule",
        { block "minecraft:air" }
    ]

    
    rule Conditional 
        if (biome ["minecraft:forest", "minecraft:desert"]) 
            "surface_rule_tests:MyRule"
        else
            "surface_rule_tests:MySequence"   


    rule HappyPathOnly
        if (biome ["minecraft:forest"]) {
            block "minecraft:stone"
        }
}