// 86. Partition List

// https://leetcode.com/problems/partition-list/description/

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Problem_86 {
    public ListNode partition(ListNode head, int x) {

      ListNode dummyleft=new ListNode(0);
        ListNode dummyright = new ListNode(0);
        ListNode left=dummyleft;
        ListNode right=dummyright;

        while (head!=null) {
            if (head.val<x) {
                left.next=head;
                left=head;
            }else{
                right.next=head;
                right=head;
            }
            head=head.next;
        }

        right.next=null;

        left.next=dummyright.next;

        return dummyleft.next;
    }   
}
