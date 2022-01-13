package com.company.WarmUp.Simple.diff21;

/*
    Task:
    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
 */
public class diff21 {
    public int diff21_test(int n) {
        if(n < 21){
            return 21 - n;
        }
        return (n - 21) * 2;
    }
}
