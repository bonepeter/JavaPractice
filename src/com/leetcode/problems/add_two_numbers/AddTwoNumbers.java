package com.leetcode.problems.add_two_numbers;

class AddTwoNumbers
{
    ListNode addTwoNumbers(ListNode list1, ListNode list2)
    {
        ListNode node1 = list1;
        ListNode node2 = list2;
        ListNode result = new ListNode(0);
        ListNode resultNode = result;
        int carrier = 0;

        while (node1 != null || node2 != null)
        {
            int val1 = (node1 != null) ? node1.val : 0;

            int val2 = (node2 != null) ? node2.val : 0;

            int sum = val1 + val2 + carrier;
            resultNode.next = new ListNode(sum % 10);
            carrier = sum / 10;

            if (node1 != null)
            {
                node1 = node1.next;
            }

            if (node2 != null)
            {
                node2 = node2.next;
            }

            resultNode = resultNode.next;
        }

        if (carrier != 0)
        {
            resultNode.next = new ListNode(carrier);
        }

        return result.next;
    }
}
