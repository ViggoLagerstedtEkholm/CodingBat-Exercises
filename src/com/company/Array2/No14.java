package com.company.Array2;

public class No14 {
    public boolean no14(int[] nums) {
        boolean containsOne = false;
        boolean containsFour = false;

        for(int i = 0 ; i < nums.length; i++){
            int valueAtIndex = nums[i];


            if(valueAtIndex == 1){
                containsOne = true;
            }

            if(valueAtIndex == 4){
                containsFour = true;
            }

            if(containsOne && containsFour) return false;

        }
        return true;
    }
}
