// 658. Find K Closest Elements

// https://leetcode.com/problems/find-k-closest-elements/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Problem_658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> {
            int distA = Math.abs(a - x);
            int distB = Math.abs(b - x);

            if (distA != distB) {
                return distB - distA;
            } else {
                return b - a;
            }
        });

        for (int num : arr) {
            heap.add(num);

            if (heap.size()>k) {
                heap.poll();
            }
        }

        List<Integer> result=new ArrayList<>();

        while (!heap.isEmpty()) {
            result.add(heap.poll());
        }

        Collections.sort(result);

        return result;
    }
}
