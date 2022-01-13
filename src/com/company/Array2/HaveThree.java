package com.company.Array2;

public class HaveThree {
    public boolean haveThree(int[] nums) {
        int totalRecurrence = 0;

        if(nums.length >= 1 && nums[0] == 3)
            totalRecurrence++;

        for(int i = 1; i < nums.length; i++){
            int valueX = nums[i - 1];
            int valueY = nums[i];

            if(valueX == 3 && valueY == 3){
                return false;
            }

            if(nums[i] == 3){
                totalRecurrence++;
            }
        }

        return totalRecurrence == 3;
    }
}
