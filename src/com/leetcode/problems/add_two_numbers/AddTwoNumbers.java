package com.leetcode.problems.add_two_numbers;

class AddTwoNumbers
{
    ListNode addTwoNumbers(ListNode list1, ListNode list2)
    {
        ListNode node1 = list1;
        ListNode node2 = list2;

        ListNode resultDummyHeadNode = new ListNode(0);
        ListNode resultNode = resultDummyHeadNode;

        int carrier = 0;

        while (node1 != null || node2 != null)
        {
            int sum = nodeValue(node1) + nodeValue(node2) + carrier;

            resultNode.next = new ListNode(sum % 10);

            carrier = sum / 10;

            node1 = nextNode(node1);

            node2 = nextNode(node2);

            resultNode = resultNode.next;
        }

        if (carrier != 0)
        {
            resultNode.next = new ListNode(carrier);
        }

        return resultDummyHeadNode.next;
    }

    private ListNode nextNode(ListNode node1)
    {
        if (node1 != null)
        {
            node1 = node1.next;
        }
        return node1;
    }

    private int nodeValue(ListNode node1)
    {
        return (node1 != null) ? node1.val : 0;
    }
}
