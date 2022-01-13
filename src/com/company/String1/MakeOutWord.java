package com.company.String1;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String open = out.substring(0, 2);
        String close = out.substring(2, 4);
        return open + word + close;
    }
}

