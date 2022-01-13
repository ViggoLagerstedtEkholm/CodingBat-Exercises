package com.company.String2;

public class BobThere {
    public boolean bobThere(String str) {
        for(int i = 0; i < str.length() - 2; i++){
            String first = str.substring(i, i + 1);
            String last = str.substring(i + 2, i + 3);

            if(first.equals("b") && last.equals("b")){
                return true;
            }
        }

        return false;
    }
}
