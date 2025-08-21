lexer grammar MMS_Lang_Keywords;

channels {
    KEYWORD
}

Keyword_If: 'if' -> channel(KEYWORD);
Keyword_Else: 'else' -> channel(KEYWORD);
Keyword_In: 'in' -> channel(KEYWORD);