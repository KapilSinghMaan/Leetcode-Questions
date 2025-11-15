// 1047. Remove All Adjacent Duplicates In String

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

import java.util.Stack;

public class Problem_1047 {

    public String removeDuplicates(String s) {
     
        Stack <Character> st =new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if (!st.empty()) {
                if (st.peek() == s.charAt(i)) {
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }else{
                st.push(s.charAt(i));
            }
        }

        StringBuilder ns=new StringBuilder();
        while (!st.empty()) {
            ns.append(st.pop());
        }

        return ns.reverse().toString();
    }
}