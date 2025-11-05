// 2130. Maximum Twin Sum of a Linked List

// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Problem_2130 {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public int pairSum(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode first=head;
        ListNode second=reverseList(mid);
        int result=0;
        while (second!=null) {
            result=Math.max(result, first.val+second.val);
            first=first.next;
            second=second.next;
        }

        return result;
    }
}
