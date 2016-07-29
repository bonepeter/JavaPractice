package com.leetcode.problems.two_sum;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TwoSumTest
{
    @Test
    public void testTwoSum__1_2__3() throws Exception
    {
        // Arrange
        TwoSum twoSum = new TwoSum();
        int[] input = {1, 2};

        // Act
        int[] actual = twoSum.twoSum(input, 3);

        // Assert
        assertEquals(actual[0], 0);
        assertEquals(actual[1], 1);
    }

    @Test
    public void testTwoSum__1_2_3__4() throws Exception
    {
        // Arrange
        TwoSum twoSum = new TwoSum();
        int[] input = {1, 2, 3};

        // Act
        int[] actual = twoSum.twoSum(input, 4);

        // Assert
        assertEquals(actual[0], 0);
        assertEquals(actual[1], 2);
    }
}