package com.leetcode.problems.two_sum;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * Ref: https://leetcode.com/problems/two-sum/
 *
 */

class TwoSum
{
    int[] twoSum(int[] numbers, int target)
    {
        for (int i=0; i<numbers.length-1; i++)
        {
            for (int j=i+1; j<numbers.length; j++)
            {
                if (numbers[i] + numbers[j] == target)
                {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
