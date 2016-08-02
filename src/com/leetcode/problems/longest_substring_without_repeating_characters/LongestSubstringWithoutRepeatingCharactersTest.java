package com.leetcode.problems.longest_substring_without_repeating_characters;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest
{
    @Test
    public void testLengthOfLongestSubstring_empty() throws Exception
    {
        // Arrange
        LongestSubstringWithoutRepeatingCharacters longestSubString = new LongestSubstringWithoutRepeatingCharacters();

        // Act
        int actual = longestSubString.lengthOfLongestSubstring("");

        // Assert
        assertEquals(actual, 0);
    }

    @Test
    public void testLengthOfLongestSubstring_one_character() throws Exception
    {
        // Arrange
        LongestSubstringWithoutRepeatingCharacters longestSubString = new LongestSubstringWithoutRepeatingCharacters();

        // Act
        int actual = longestSubString.lengthOfLongestSubstring("a");

        // Assert
        assertEquals(actual, 1);
    }

    @Test
    public void testLengthOfLongestSubstring_two_same_characters() throws Exception
    {
        // Arrange
        LongestSubstringWithoutRepeatingCharacters longestSubString = new LongestSubstringWithoutRepeatingCharacters();

        // Act
        int actual = longestSubString.lengthOfLongestSubstring("aa");

        // Assert
        assertEquals(actual, 1);
    }

    @Test
    public void testLengthOfLongestSubstring_answer_at_the_end() throws Exception
    {
        // Arrange
        LongestSubstringWithoutRepeatingCharacters longestSubString = new LongestSubstringWithoutRepeatingCharacters();

        // Act
        @SuppressWarnings("SpellCheckingInspection")
        int actual = longestSubString.lengthOfLongestSubstring("aabcd");

        // Assert
        assertEquals(actual, 4);
    }

    @SuppressWarnings("SpellCheckingInspection")
    @Test
    public void testLengthOfLongestSubstring_abcabcbb() throws Exception
    {
        // Arrange
        LongestSubstringWithoutRepeatingCharacters longestSubString = new LongestSubstringWithoutRepeatingCharacters();

        // Act
        int actual = longestSubString.lengthOfLongestSubstring("abcabcbb");

        // Assert
        assertEquals(actual, 3);
    }

    @SuppressWarnings("SpellCheckingInspection")
    @Test
    public void testLengthOfLongestSubstring_pwwkew() throws Exception
    {
        // Arrange
        LongestSubstringWithoutRepeatingCharacters longestSubString = new LongestSubstringWithoutRepeatingCharacters();

        // Act
        int actual = longestSubString.lengthOfLongestSubstring("pwwkew");

        // Assert
        assertEquals(actual, 3);
    }

    @SuppressWarnings("SpellCheckingInspection")
    @Test
    public void testLengthOfLongestSubstring_dvdf() throws Exception
    {
        // Arrange
        LongestSubstringWithoutRepeatingCharacters longestSubString = new LongestSubstringWithoutRepeatingCharacters();

        // Act
        int actual = longestSubString.lengthOfLongestSubstring("dvdf");

        // Assert
        assertEquals(actual, 3);
    }

    @Test
    public void testLengthOfLongestSubstring_abba() throws Exception
    {
        // Arrange
        LongestSubstringWithoutRepeatingCharacters longestSubString = new LongestSubstringWithoutRepeatingCharacters();

        // Act
        int actual = longestSubString.lengthOfLongestSubstring("abba");

        // Assert
        assertEquals(actual, 2);
    }

}