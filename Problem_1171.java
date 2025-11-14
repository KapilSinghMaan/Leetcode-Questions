// 1171. Remove Zero Sum Consecutive Nodes from Linked List

// https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/description/ 

import java.util.HashMap;
import java.util.Map;

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

public class Problem_1171 {
    public ListNode removeZeroSumSublists(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int prefixSum = 0;
        Map<Integer, ListNode> prefixSumMap = new HashMap<>();

        ListNode curr = dummy;

        while (curr != null) {

            prefixSum += curr.val;

            if (prefixSumMap.containsKey(prefixSum)) {
                curr = prefixSumMap.get(prefixSum).next;
                int p = prefixSum + curr.val;

                while (p != prefixSum) {
                    prefixSumMap.remove(p);
                    curr = curr.next;
                    p += curr.val;
                }
                prefixSumMap.get(prefixSum).next = curr.next;
            } else {
                prefixSumMap.put(prefixSum, curr);
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
