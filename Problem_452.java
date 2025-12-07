// 452. Minimum Number of Arrows to Burst Balloons

// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/

import java.util.Arrays;

public class Problem_452 {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int ans = 1;
        int start = points[0][0], end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (start <= points[i][0] && points[i][0] <= end) {
                start = points[i][0];
                end = Math.min(end, points[i][1]);
            } else {
                ans++;
                start = points[i][0];
                end = points[i][1];
            }
        }
        return ans;
    }
}
