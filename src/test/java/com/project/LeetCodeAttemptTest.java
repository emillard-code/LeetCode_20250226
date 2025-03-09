package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void maximumAbsoluteSumOfAnySubarrayTest() {

        int[] nums1 = {1,-3,2,3,-4};
        assertEquals(5, LeetCodeAttempt.maximumAbsoluteSumOfAnySubarray(nums1));

        int[] nums2 = {2,-5,1,-4,3,-2};
        assertEquals(8, LeetCodeAttempt.maximumAbsoluteSumOfAnySubarray(nums2));

    }

}
