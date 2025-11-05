// 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points

// https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/description/

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Problem_2058 {

    public boolean isCritialPoint(ListNode prev, ListNode curr) {
        return (curr.val > prev.val && curr.val > curr.next.val) || (curr.val < prev.val && curr.val < curr.next.val);
    }

    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return new int[] { -1, -1 };
        }

        ListNode prev = head;
        ListNode curr = head.next;

        int count = 0;
        int first = -1;
        int last = -1;
        int idx = 1;

        int minDis = Integer.MAX_VALUE;
        int maxDis = Integer.MIN_VALUE;

        while (curr.next != null) {

            if (isCritialPoint(prev, curr)) {
                count++;
                if (count == 1) {
                    first = idx;
                    last = idx;
                } else {
                    minDis = Math.min(minDis, idx - last);
                    last = idx;
                }
            }
            idx++;
            prev = prev.next;
            curr = curr.next;
        }

        if (count == 1 || count == 0) {
            return new int[] { -1, -1 };
        }

        maxDis = Math.max(maxDis, last - first);

        return new int[] { minDis, maxDis };
    }
}
