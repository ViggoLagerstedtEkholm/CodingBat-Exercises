package com.company.WarmUp.Medium.stringTimes;

/*
    Task:
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 */
public class StringTimes {
    public String stringTimes(String str, int n) {
        StringBuilder bigString = new StringBuilder();

        if(n > 0){
            bigString.append(str.repeat(n));
            return bigString.toString();
        }else{
            return "PROVIDE AN INDEX THAT IS POSITIVE!";
        }
    }
}
