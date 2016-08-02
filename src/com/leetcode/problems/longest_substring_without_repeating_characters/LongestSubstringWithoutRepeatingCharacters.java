package com.leetcode.problems.longest_substring_without_repeating_characters;

/*
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Ref: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 */

import java.util.HashMap;
import java.util.Map;

class LongestSubstringWithoutRepeatingCharacters
{
    int lengthOfLongestSubstring(String input)
    {
        int[] map = new int[128];

        int longest = 0;

        for (int endPos = 0, startPos = 0; endPos < input.length(); endPos++)
        {
            Character pointingCharacter = input.charAt(endPos);

            startPos = Math.max(startPos, map[pointingCharacter]);

            map[pointingCharacter] = endPos + 1;

            longest = Math.max(longest, endPos - startPos + 1);
        }

        return longest;
    }

    @SuppressWarnings("unused")
    int lengthOfLongestSubstring_input_not_limited_to_standard_ascii(String input)
    {
        Map<Character, Integer> map = new HashMap<>();

        int longest = 0;

        for (int endPos = 0, startPos = 0; endPos < input.length(); endPos++)
        {
            Character pointingCharacter = input.charAt(endPos);

            if (map.containsKey(pointingCharacter))
            {
                startPos = Math.max(startPos, map.get(pointingCharacter) + 1);
            }

            map.put(pointingCharacter, endPos);

            longest = Math.max(longest, endPos - startPos + 1);
        }

        return longest;
    }
}
