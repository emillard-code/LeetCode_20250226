package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = {1,-3,2,3,-4};
        System.out.println(maximumAbsoluteSumOfAnySubarray(nums1));

        int[] nums2 = {2,-5,1,-4,3,-2};
        System.out.println(maximumAbsoluteSumOfAnySubarray(nums2));

    }

    public static int maximumAbsoluteSumOfAnySubarray(int[] nums) {

        int maximumSum = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            int currentSum = 0;

            if (nums[i] > maximumSum) {
                maximumSum = nums[i];
            }

            for (int j = i; j < nums.length; j++) {

                currentSum = currentSum + nums[j];

                if (Math.abs(currentSum) > maximumSum) {
                    maximumSum = Math.abs(currentSum);
                }

            }

        }

        return maximumSum;

    }

}
