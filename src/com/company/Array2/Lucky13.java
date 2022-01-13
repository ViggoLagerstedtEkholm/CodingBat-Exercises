package com.company.Array2;

public class Lucky13 {
    public boolean lucky13(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int valueAtIndex = nums[i];

            if(valueAtIndex == 1 || valueAtIndex == 3) return false;
        }

        return true;
    }
}
