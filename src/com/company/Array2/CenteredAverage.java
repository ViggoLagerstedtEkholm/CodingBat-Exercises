package com.company.Array2;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int biggestValue = nums[0];
        int smallestValue = nums[0];
        int sum = 0;

        for (int i = 0 ; i < nums.length; i++) {
            int num = nums[i];

            if (num > biggestValue) {
                biggestValue = num;
            }
            if (num < smallestValue) {
                smallestValue = num;
            }

            sum += num;
        }

        return (sum - smallestValue - biggestValue) / (nums.length - 2);
    }
}
