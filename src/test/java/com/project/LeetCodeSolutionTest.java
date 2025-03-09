package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void maxAbsoluteSumTest() {

        int[] nums1 = {1,-3,2,3,-4};
        assertEquals(5, LeetCodeSolution.maxAbsoluteSum(nums1));

        int[] nums2 = {2,-5,1,-4,3,-2};
        assertEquals(8, LeetCodeSolution.maxAbsoluteSum(nums2));

    }

}
