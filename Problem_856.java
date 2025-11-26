// 856. Score of Parentheses

// https://leetcode.com/problems/score-of-parentheses/description/

import java.util.Stack;

public class Problem_856 {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(score);
                score = 0;
            } else {
                score = stack.pop() + Math.max(2 * score, 1);
            }
        }

        return score;
    }
}
