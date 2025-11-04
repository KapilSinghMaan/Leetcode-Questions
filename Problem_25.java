// 25. Reverse Nodes in k-Group

// https://leetcode.com/problems/reverse-nodes-in-k-group/description/

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Problem_25 {

    public ListNode reverseList(ListNode head, int k) {

        ListNode prev = null;
        ListNode curr = head;

        while (k-- > 0 && curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode newHead = null;
        int count = 0;
        while (temp != null && count < k) {
            count++;
            temp = temp.next;
        }
        if (count < k) {
            return head;
        }
        newHead = reverseList(head, k);
        head.next = reverseKGroup(temp, k);
        return newHead;
    }
}
