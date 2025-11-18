// 71. Simplify Path

// https://leetcode.com/problems/simplify-path/description/

import java.util.Stack;

class Problem_71 {
    public String simplifyPath(String path) {
        
        Stack<String> st = new Stack<>();

        String[] components = path.split("/");

        for (String comp : components) {
            if (comp.equals(".") || comp.isEmpty()) {
                continue;
            } else if (comp.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.add(comp);
            }
        }

        StringBuilder result = new StringBuilder();

        for (String dir : st) {
            result.append("/");
            result.append(dir);
        }

        return result.length() > 0 ? result.toString() : "/";
    }
}