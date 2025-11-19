// 316. Remove Duplicate Letters

// https://leetcode.com/problems/remove-duplicate-letters/description/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Problem_316 {

    public String removeDuplicateLetters(String s) {

        Stack<Character> stack = new Stack<>();

        HashSet<Character> seen = new HashSet<>();

        HashMap<Character, Integer> last_occ = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            last_occ.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!seen.contains(ch)) {
                while (!stack.isEmpty() && ch < stack.peek() && last_occ.get(stack.peek()) > i) {
                    seen.remove(stack.pop());
                }
                seen.add(ch);
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder(stack.size());
        for (Character character : stack) {
            sb.append(character.charValue());
        }

        return sb.toString();
    }
}