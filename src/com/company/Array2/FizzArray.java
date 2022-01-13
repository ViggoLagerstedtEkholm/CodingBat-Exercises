package com.company.Array2;

public class FizzArray {
    public int[] fizzArray(int n) {
        int[] newArr = new int[n];
        for(int i = 0; i < n; i++){
            newArr[i] = i;
        }
        return newArr;
    }
}
