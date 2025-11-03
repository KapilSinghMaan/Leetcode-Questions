// 160. Intersection of Two Linked Lists

// https://leetcode.com/problems/intersection-of-two-linked-lists/description/

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

public class Problem_160 {

    public static int getListLength(ListNode head){
        ListNode temp=head;
        int count=0;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }

     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA=getListLength(headA);
        int lB=getListLength(headB);

        while (lA>lB) {
            lA--;
            headA=headA.next;
        }
        while (lB>lA) {
            lB--;
            headB=headB.next;
        }

        while (headA!=null&& headB!=null) {
            
            if (headA==headB) {
                return headA;
            }

            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}
