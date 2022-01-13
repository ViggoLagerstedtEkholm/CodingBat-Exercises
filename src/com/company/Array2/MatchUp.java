package com.company.Array2;

public class MatchUp {
    public int matchUp(int[] nums1, int[] nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.length; i++) {
            int valueAtIndexArr1 = nums1[i];
            int valueAtIndexArr2 = nums2[i];

            int difference = Math.abs(valueAtIndexArr2 - valueAtIndexArr1);
            System.out.println(difference);

            if (difference <= 2 && valueAtIndexArr1 != valueAtIndexArr2) {
                sum++;
            }

        }
        return sum;
    }
}
