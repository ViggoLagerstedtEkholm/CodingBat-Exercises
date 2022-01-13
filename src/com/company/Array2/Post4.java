package com.company.Array2;

public class Post4 {
    public int[] post4(int[] nums) {
        int[] newArr = new int[nums.length];
        int originalArrayIndex = 0;
        int NewArrIndex = 0;

        while(originalArrayIndex < nums.length){
            int valueAtIndex = nums[originalArrayIndex];

            if(valueAtIndex == 4){
                newArr = new int[nums.length - originalArrayIndex - 1];
                NewArrIndex = 0;
            }else{
                newArr[NewArrIndex] = valueAtIndex;
                NewArrIndex++;

            }

            //Increment both array indices.
            originalArrayIndex++;
        }

        return newArr;
    }
}
