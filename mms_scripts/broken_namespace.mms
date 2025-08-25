namespace;


surface {
    rule MyRule bandlands

    rule MyBlockRule block stone

    rule MySequence sequence [ MyBlockRule ]

    rule MyConditional if ( biome [ badlands ] ) MyBlockRule
    rule MyConditional2 if !( biome [ badlands ] ) MyBlockRule
}