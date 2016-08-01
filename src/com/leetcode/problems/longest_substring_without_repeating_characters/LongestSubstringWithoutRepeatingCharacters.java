package com.leetcode.problems.longest_substring_without_repeating_characters;

/*
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Ref: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters
{
    private int repeatCharacterPosition = 0;

    int lengthOfLongestSubstring(String input)
    {
        String workingString = input;

        String longest = "";

        String currentLongest;

        while (isNotEmpty(workingString))
        {
            currentLongest = LongestSubstringFromTheBeginning(workingString);

            workingString = workingString.substring(repeatCharacterPosition);


            longest = getLongestString(longest, currentLongest);
        }

        return longest.length();
    }

    private String getLongestString(String s1, String s2)
    {
        if (s1.length() >= s2.length())
        {
            return s1;
        }
        else
        {
            return s2;
        }
    }

    private boolean isNotEmpty(String s)
    {
        return ! s.equals("");
    }

    private String LongestSubstringFromTheBeginning(String input)
    {
        StringBuilder result = new StringBuilder();

//        Set<String> set = new HashSet<>();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++)
        {
            String oneCharacter = input.substring(i, i + 1);


            if (map.containsKey(oneCharacter))
            {
                repeatCharacterPosition = map.get(oneCharacter) + 1;
                return result.toString();
            }

//            if (set.contains(oneCharacter))
//            {
//                return result.toString();
//            }

            map.put(oneCharacter, i);

//            set.add(oneCharacter);

            result.append(oneCharacter);
        }
        repeatCharacterPosition = input.length();

        return result.toString();
    }

}
