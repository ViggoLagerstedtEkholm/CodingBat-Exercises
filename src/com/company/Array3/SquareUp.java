package com.company.Array3;

public class SquareUp {
    public int[] squareUp(int n) {
        int[] array = new int[n * n];

        if(n == 0){
            return array;
        }

        for(int i = n - 1; i < array.length; i += n){
            for(int j = i; j >= i - i / n; j--){
                array[j] = i - j + 1;
            }
        }

        return array;
    }
}
