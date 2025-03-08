package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = {1,-3,2,3,-4};
        System.out.println(maximumAbsoluteSumOfAnySubarray(nums1));

        int[] nums2 = {2,-5,1,-4,3,-2};
        System.out.println(maximumAbsoluteSumOfAnySubarray(nums2));

    }

    // This method returns the highest absolute sum of any subarray within int[] nums.
    public static int maximumAbsoluteSumOfAnySubarray(int[] nums) {

        // We will keep track of the highest sum recorded so far in this int value.
        int maximumSum = 0;

        // We perform a loop through the array to help calculate the subarray sums.
        for (int i = 0; i < nums.length - 1; i++) {

            // For each iteration of the for-loop, we will perform another loop involving
            // the current and all the following indexes to gradually calculate the sums
            // of every subarray that has nums[i] as its starting point. This int will
            // hold the total sum of the values in the current subarray being looked at.
            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {

                // We increment int currentSum with the value of the current index.
                currentSum = currentSum + nums[j];

                // If the absolute value of int currentSum exceeds int maximumSum,
                // that means the absolute sum of the subarray starting at nums[i]
                // and ending at nums[j] is greater than the current int maximumSum.
                // Hence, we overwrite int maximumSum with this value if it holds true.
                if (Math.abs(currentSum) > maximumSum) {
                    maximumSum = Math.abs(currentSum);
                }

            }

        }

        // At the end, we return the value maximumSum. If the array was empty,
        // a value of 0 will automatically be returned.
        return maximumSum;

    }

}
