package com.example.mp5;

public class Phrase {
    public String RandomPhrase() {
        String[] Phrases = new String[10];
        Phrases[0] = "recursive";
        Phrases[1] = "constructor";
        Phrases[2] = "inheritance";
        Phrases[3] = "polymorphism";
        Phrases[4] = "arraylist";
        Phrases[5] = "parameter";
        Phrases[6] = "boolean";
        Phrases[7] = "protected";
        Phrases[8] = "variable";
        Phrases[9] = "abstract";
        String[] HiddenPhrases = new String[10];
        HiddenPhrases[0] = "_______";
        HiddenPhrases[1] = "_________";
        HiddenPhrases[2] = "_________";
        HiddenPhrases[3] = "__________";
        HiddenPhrases[4] = "_______";
        HiddenPhrases[5] = "_______";
        HiddenPhrases[6] = "____";
        HiddenPhrases[7] = "_______";
        HiddenPhrases[8] = "______";
        HiddenPhrases[9] = "______";
        int x = (int) (Math.random()*((9)+1));
        String gamePhrase = HiddenPhrases[x];
        return gamePhrase;
    }
}
