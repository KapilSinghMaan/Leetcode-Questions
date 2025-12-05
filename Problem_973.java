// 973. K Closest Points to Origin

// https://leetcode.com/problems/k-closest-points-to-origin/description/

import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem_973 {
    public int[][] kClosest(int[][] points, int k) {
        if (k == points.length) {
            return points;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(k, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]);
            }
        });

        for (int[] point : points) {
            pq.add(point);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.toArray(new int[0][0]);
    }
}
