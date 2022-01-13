package com.company.WarmUp.Simple.nearHundred;

/*
    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
 */
public class NearHundred {
    public boolean nearHundred(int n) {
        int difference1 = Math.abs(100 - n);
        int difference2 = Math.abs(200 - n);
        return difference1 <= 10 || difference2 <= 10;
    }
}
