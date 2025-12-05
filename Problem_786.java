// 786. K-th Smallest Prime Fraction

// https://leetcode.com/problems/k-th-smallest-prime-fraction/description/

import java.util.PriorityQueue;

public class Problem_786 {

    static class Fraction {

        int i, j;

        Fraction(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        PriorityQueue<Fraction> heap = new PriorityQueue<>((f1, f2) -> {
            int left = arr[f1.i] * arr[f2.j];
            int right = arr[f2.i] * arr[f1.j];
            return left - right;
        });
        int n = arr.length;

        for (int j = 1; j < n; j++) {
            heap.add(new Fraction(0, j));
        }

        for (int count = 0; count < k - 1; count++) {
            Fraction f = heap.poll();
            int i = f.i;
            int j = f.j;

            if (i + 1 < j) {
                heap.add(new Fraction(i + 1, j));
            }
        }

        Fraction kth = heap.poll();

        return new int[] { arr[kth.i], arr[kth.j] };
    }
}
