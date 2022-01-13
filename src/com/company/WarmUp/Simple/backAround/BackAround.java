package com.company.WarmUp.Simple.backAround;

public class BackAround {
    public String backAround(String str) {
        if(str.length() > 0){
            String lastChar = String.valueOf(str.charAt(str.length() - 1));
            return lastChar + str + lastChar;
        }
        else{
            System.out.println("String is smaller than 1 character!");
        }
        return "";
    }
}
