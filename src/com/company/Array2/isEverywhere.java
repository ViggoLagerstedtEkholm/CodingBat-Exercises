package com.company.Array2;

public class isEverywhere {
    public boolean isEverywhere(int[] nums, int val) {
        for(int i = 0; i < nums.length - 1; i++){
            int valueX = nums[i];
            int valueY = nums[i + 1];

            if(!(valueX == val || valueY == val)){
                return false;
            }
        }
        return true;
    }
}
