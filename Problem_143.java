// 143. Reorder List

// https://leetcode.com/problems/reorder-list/description/

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Problem_143 {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

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

     public void reorderList(ListNode head) {

        if (head==null || head.next==null) {
            return;
        }

        ListNode mid=middleNode(head);
        ListNode second=reverseList(mid.next);
        mid.next=null;
        ListNode first=head;
        while (second!=null) {
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            
            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }
    }
}
