package com.company.Array2;

public class Sum13 {
    public int sum13(int[] nums) {
        int sum = 0;
        int unluckyIndex = -2;

        for(int i = 0; i < nums.length; i++){
            int valueAtIndex = nums[i];

            if(valueAtIndex == 13){
                unluckyIndex = i; // 1
            }else{

                if(i != unluckyIndex + 1){
                    sum += valueAtIndex;
                }
            }
        }

        return sum;
    }

    public int sum13Alternative(int[] nums){
        int sum = 0;
        int index = 0;
        int length = nums.length;
        int unlucky = 13;

        while(index < length){
            int valueAtIndex = nums[index];

            if(valueAtIndex == unlucky){
                index += 2;
            }else{
                sum += valueAtIndex;
                index++;
            }
        }
        return sum;
    }
}
