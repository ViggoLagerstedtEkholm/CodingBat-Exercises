package com.company.Array2;

public class Sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean disabled = false;

        for(int i = 0; i < nums.length; i++){
            int valueAtIndex = nums[i];

            if(valueAtIndex == 6){
                disabled = true;
            }

            if(!disabled){
                sum += valueAtIndex;
            }

            if(valueAtIndex == 7){
                disabled = false;
            }
        }

        return sum;
    }
}
