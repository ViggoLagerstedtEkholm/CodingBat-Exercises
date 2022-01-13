package com.company.String2;

public class DoubleChar {
    public String doubleChar(String str) {
        StringBuilder modified = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char charAtIndex = str.charAt(i);
            String stringAtChar = String.valueOf(charAtIndex);
            modified.append(stringAtChar).append(stringAtChar);
        }
        return modified.toString();
    }
}
