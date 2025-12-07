// 1005. Maximize Sum Of Array After K Negations

// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/description/

import java.util.PriorityQueue;

class Problem_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int num : nums) {
            heap.add(num);
        }

        while (k-- > 0) {
            int x = heap.poll();
            x *= -1;
            heap.add(x);
        }
        int sum = 0;
        while (!heap.isEmpty()) {
            sum += heap.poll();
        }

        return sum;
    }
}