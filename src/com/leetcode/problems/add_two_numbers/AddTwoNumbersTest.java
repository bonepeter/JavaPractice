package com.leetcode.problems.add_two_numbers;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddTwoNumbersTest
{
    @Test
    public void testAddTwoNumbers_carrier() throws Exception
    {
        // Arrange
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode list1 = new ListNode(4);
        list1.next = new ListNode(1);

        ListNode list2 = new ListNode(6);
        list2.next = new ListNode(2);

        // Act
        ListNode actual = addTwoNumbers.addTwoNumbers(list1, list2);

        // Assert
        assertEquals(actual.val, 0);
        assertEquals(actual.next.val, 4);
    }

    @Test
    public void testAddTwoNumbers_carrier_overflow() throws Exception
    {
        // Arrange
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode list1 = new ListNode(5);

        ListNode list2 = new ListNode(7);

        // Act
        ListNode actual = addTwoNumbers.addTwoNumbers(list1, list2);

        // Assert
        assertEquals(actual.val, 2);
        assertEquals(actual.next.val, 1);
    }

    @Test
    public void testAddTwoNumbers_two_list_difference_length() throws Exception
    {
        // Arrange
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode list1 = new ListNode(3);

        ListNode list2 = new ListNode(8);
        list2.next = new ListNode(9);
        list2.next.next = new ListNode(1);

        // Act
        ListNode actual = addTwoNumbers.addTwoNumbers(list1, list2);

        // Assert
        assertEquals(actual.val, 1);
        assertEquals(actual.next.val, 0);
        assertEquals(actual.next.next.val, 2);
    }
}