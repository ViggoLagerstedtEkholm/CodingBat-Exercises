package com.company.Array2;

public class Only14 {
    public boolean only14(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int valueAtIndex = nums[i];

            if (!(valueAtIndex == 1 || valueAtIndex == 4)){
                return false;
            }
        }

        return true;
    }
}
