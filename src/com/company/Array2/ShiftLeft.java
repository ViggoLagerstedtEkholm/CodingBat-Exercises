package com.company.Array2;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        int[] newArr = new int[nums.length];

        if(nums.length < 1) return nums;

        int firstVal = nums[0];

        for(int i = 0; i < nums.length - 1; i++){
            newArr[i] = nums[i + 1];
        }

        newArr[nums.length - 1] = firstVal;

        return newArr;
    }
}
