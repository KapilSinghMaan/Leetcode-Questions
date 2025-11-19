// 84. Largest Rectangle in Histogram

// https://leetcode.com/problems/largest-rectangle-in-histogram/description/

import java.util.Stack;

public class Problem_84 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        int[] extended = new int[n + 1];
        System.arraycopy(heights, 0, extended, 0, n);
        extended[n] = 0;

        for (int i = 0; i < extended.length; i++) {
            while (!stack.isEmpty() && extended[stack.peek()] > extended[i]) {

                int height = extended[stack.pop()];

                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
