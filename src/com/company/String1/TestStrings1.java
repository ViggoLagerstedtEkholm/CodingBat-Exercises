package com.company.String1;

public class TestStrings1 {
    public TestStrings1(){
        makeOutWord();
    }

    private void makeOutWord(){
        MakeOutWord makeOutWord = new MakeOutWord();

        System.out.println( makeOutWord.makeOutWord("<<>>", "Yay"));
        System.out.println( makeOutWord.makeOutWord("<<>>", "WooHoo"));
    }
}
