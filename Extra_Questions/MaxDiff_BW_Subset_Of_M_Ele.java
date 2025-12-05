// Maximum Difference Between Two Subsets of m Elements

// Given an array of n integers and a number m, find the maximum possible difference between two sets of m elements chosen from given array.

// Input : arr[] = { 1, 2, 3, 4, 5 } , m = 4
// Output : 4

// Explanation : The maximum four elements are 2 3 4 5 and the minimum four elements are 1 2 3 4. The difference between two subsets sum is (2 + 3 + 4 + 5) - (1 + 2 + 3 + 4) = 4

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxDiff_BW_Subset_Of_M_Ele {

    public static int minDiff(int[] arr, int m) {

        PriorityQueue<Integer> minSubset = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> maxSubset = new PriorityQueue<>();

        for (int num : arr) {
            minSubset.add(num);
            if (minSubset.size() > m) {
                minSubset.poll();
            }

            maxSubset.add(num);
            if (maxSubset.size() > m) {
                maxSubset.poll();
            }
        }
        int minSum = 0;
        while (!minSubset.isEmpty()) {
            minSum += minSubset.poll();
        }
        int maxSum = 0;
        while (!maxSubset.isEmpty()) {
            maxSum += maxSubset.poll();
        }

        return maxSum - minSum;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(minDiff(arr, 4));
    }
}
