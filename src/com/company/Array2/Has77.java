package com.company.Array2;

public class Has77 {
    public boolean has77(int[] nums) {
        if(nums.length >= 2){
            for(int i = 0; i < nums.length - 1; i++){
                int valueX = nums[i];
                int valueY = nums[i + 1];

                if(valueX == 7 && valueY == 7){
                    return true;
                }
            }
        }

        if(nums.length >= 3){
            for(int i = 0; i < nums.length - 2; i++){
                int valueX = nums[i];
                int valueZ = nums[i + 2];

                if(valueX == 7 && valueZ == 7){
                    return true;
                }
            }
        }
        return false;
    }
}
