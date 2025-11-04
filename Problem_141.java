// 141. Linked List Cycle

// https://leetcode.com/problems/linked-list-cycle/description/

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Problem_141 {

    public boolean hasCycle(ListNode head) {

        if (head==null) {
            return false;
        }

        ListNode slow=head;
        ListNode fast=head.next;

        while (fast!=slow) {
            if (fast== null || fast.next==null) {
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }

        return true;
    }
}