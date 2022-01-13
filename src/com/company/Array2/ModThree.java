package com.company.Array2;

public class ModThree {
    public boolean modThree(int[] nums) {
        if(nums.length < 3) return false;

        for(int i = 0; i <= nums.length - 3; i++){
            int value1 = nums[i];
            int value2 = nums[i + 1];
            int value3 = nums[i + 2];

            if (value1 % 2 == 0 && value2 % 2 == 0 && value3 % 2 == 0){
                return true;
            }

            if(value1 % 2 != 0 && value2 % 2 != 0 && value3 % 2 != 0){
                return true;
            }
        }
        return false;
    }
}
