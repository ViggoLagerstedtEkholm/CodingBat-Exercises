package com.company.Array2;

public class CountEvents {
    public int countEvens(int[] nums) {
        int evens = 0;
        for(int i = 0; i < nums.length; i++){
            int value = nums[i];

            if(value % 2 == 0){
                evens++;
            }
        }
        return evens;
    }
}
