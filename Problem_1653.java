// 1653. Minimum Deletions to Make String Balanced

// https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/description/

import java.util.Stack;

public class Problem_1653 {
     public int minimumDeletions(String s) {
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        int del=0;

        for (int i = 0; i < n; i++) {
            if (!stack.isEmpty() && stack.peek()=='b'&& s.charAt(i)=='a') {
                stack.pop();
                del++;
            } else {
                stack.push(s.charAt(i));
            }
        }

        return del;
    }
}
