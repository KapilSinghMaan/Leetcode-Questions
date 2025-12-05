// Sort a nearly sorted (or K sorted) array

// Given an array of N elements, where each element is at most K away from its target position, devise an algorithm that sorts in O(N log K) time.

// Input : arr[]= {6, 5, 3, 2, 8, 10, 9} K = 3
// Output : arr[] = {2, 3, 5, 6, 8, 9, 10}

// Input : arr[] = {10, 9, 8, 7, 4, 70, 60, 50} K = 4
// Output : arr[] = { 4, 7, 8, 9, 10, 50, 60, 70}

import java.util.PriorityQueue;

public class NearlySortedArray {

    public static int[] nearlySorted(int[] arr, int k) {

        int[] res = new int[arr.length];
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int i = 0;
        for (int num : arr) {
            heap.add(num);
            if (heap.size() > k) {
                res[i++] = heap.poll();
            }
        }
        while (!heap.isEmpty()) {
            res[i++] = heap.poll();
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 9, 8, 7, 4, 70, 60, 50 };

        int[] res = nearlySorted(arr, 4);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}