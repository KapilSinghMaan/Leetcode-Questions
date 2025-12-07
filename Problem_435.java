// 435. Non-overlapping Intervals

// https://leetcode.com/problems/non-overlapping-intervals/description/

import java.util.Arrays;

public class Problem_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int end = intervals[0][1];
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= end) {
                end = intervals[i][1];
            } else {
                ans++;
                if (intervals[i][1] <= end) {
                    end = intervals[i][1];
                }
            }
        }
        return ans;
    }
}
