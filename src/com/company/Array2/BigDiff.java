package com.company.Array2;

public class BigDiff {
    public int bigDiff(int[] nums) {
        int biggestValue = nums[0];
        int smallestValue = nums[0];

        for (int num : nums) {
            if (num > biggestValue) {
                biggestValue = num;
            }
            if (num < smallestValue) {
                smallestValue = num;
            }
        }

        System.out.println("BIGGEST: " + biggestValue);
        System.out.println("SMALLEST: " +  smallestValue);

        return Math.abs(biggestValue - smallestValue);
    }
}
