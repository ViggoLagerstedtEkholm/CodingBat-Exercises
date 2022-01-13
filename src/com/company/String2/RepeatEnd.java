package com.company.String2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String cut = str.substring(str.length() - n, str.length());
        StringBuilder finalString = new StringBuilder();

        for(int i = 0; i < n; i++){
            finalString.append(cut);
        }

        return finalString.toString();
    }
}
