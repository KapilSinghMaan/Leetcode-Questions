// 402. Remove K Digits

// https://leetcode.com/problems/remove-k-digits/description/

import java.util.Stack;

public class Problem_402 {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();

        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k>0 && stack.peek()>digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        for (int i = 0; i < k; i++) {
            stack.pop();
        }

        StringBuilder ret=new StringBuilder();
        boolean leadingZero=true;

        for (char digit : stack) {
            if (leadingZero && digit=='0') {
                continue;
            }
            leadingZero=false;
            ret.append(digit);
        }

        if (ret.length()==0) {
            return "0";
        }

        return ret.toString();
    }
}
