// 2181. Merge Nodes in Between Zeros

// https://leetcode.com/problems/merge-nodes-in-between-zeros/description/

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Problem_2181 {
    public ListNode mergeNodes(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode newNode =new ListNode(0);

        ListNode newTemp=newNode;
        ListNode newHead=newNode;

        int sum=0;
        ListNode temp=head.next;

        while (temp!=null) {
            sum+=temp.val;
            if (temp.val==0) {
                ListNode sumNode=new ListNode(sum);
                newTemp.next=sumNode;
                newTemp=newTemp.next;
                sum=0;
            }
            temp=temp.next;
        }
        return newHead.next;
    }
}
