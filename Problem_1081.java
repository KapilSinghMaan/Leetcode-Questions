// 1081. Smallest Subsequence of Distinct Characters

// https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/description/

import java.util.HashMap;

public class Problem_1081 {
    public String smallestSubsequence(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean[] visited = new boolean[26];
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            map.put(ch, map.get(ch) - 1);

            if (visited[ch - 'a']) {
                continue;
            }
            while (stack.length() > 0) {
                char last = stack.charAt(stack.length() - 1);

                if (last > ch && map.get(last) > 0) {
                    visited[last - 'a'] = false;
                    stack.deleteCharAt(stack.length() - 1);
                } else {
                    break;
                }
            }
            stack.append(ch);
            visited[ch - 'a'] = true;
        }
        return stack.toString();
    }
}
