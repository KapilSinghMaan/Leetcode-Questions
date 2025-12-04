// 11. Container With Most Water

// https://leetcode.com/problems/container-with-most-water/description/

public class Problem_11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int maxHeight = Math.min(height[left], height[right]);
            int currWater = width * maxHeight;

            maxWater = maxWater > currWater ? maxWater : currWater;

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
