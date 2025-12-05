// 215. Kth Largest Element in an Array

// https://leetcode.com/problems/kth-largest-element-in-an-array/description/

import java.util.PriorityQueue;

class Problem_215{
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> heap=new PriorityQueue<>();

        for (int num : nums) {
            heap.add(num);

            if (heap.size()>k) {
                heap.remove();
            }
        }

        return heap.peek();
    }
}