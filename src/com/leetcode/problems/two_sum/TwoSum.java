package com.leetcode.problems.two_sum;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * Ref: https://leetcode.com/problems/two-sum/
 *
 */

import java.util.HashMap;
import java.util.Map;

class TwoSum
{
    int[] twoSum(int[] numbers, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++)
        {
            int complement = target - numbers[i];

            if (map.containsKey(complement))
            {
                return new int[]{map.get(complement), i};
            }

            map.put(numbers[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    @SuppressWarnings("unused")
    int[] twoSum_solution_2(int[] numbers, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++)
        {
            map.put(numbers[i], i);

        }

        for (int i = 0; i < numbers.length; i++)
        {
            int complement = target - numbers[i];
            if (map.containsKey(complement) && map.get(complement) != i)
            {
                return new int[]{i, map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }


    @SuppressWarnings("unused")
    int[] twoSum_solution_1(int[] numbers, int target)
    {
        for (int i = 0; i < numbers.length - 1; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
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
