package com.company.Array2;

public class WithoutTen {
    public int[] withoutTen(int[] nums) {
        int[] arrayWithoutTen = new int[nums.length];
        int newArrayIndex = 0;

        for(int i = 0; i < nums.length; i++){
            int valueAtIndex = nums[i];

            if(valueAtIndex != 10){
                arrayWithoutTen[newArrayIndex] = valueAtIndex;
                newArrayIndex++;
            }
        }

        return arrayWithoutTen;
    }
}
