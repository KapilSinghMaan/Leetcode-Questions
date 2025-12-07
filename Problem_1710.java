// 1710. Maximum Units on a Truck

// https://leetcode.com/problems/maximum-units-on-a-truck/description/

import java.util.Arrays;

public class Problem_1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        int n = boxTypes.length;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        for (int i = 0; i < n; i++) {
            if (truckSize == 0) {
                break;
            }
            int min = Math.min(boxTypes[i][0], truckSize);
            truckSize -= min;
            ans += min * boxTypes[i][1];
        }
        return ans;
    }
}
