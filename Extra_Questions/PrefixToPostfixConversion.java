// Prefix to Postfix Conversion

// Prefix to Postfix conversion means transforming an expression written in prefix notation (operator before operands) into postfix notation (operator after operands).

// prefix: *+AB-CD
// postfix: AB+CD-*

import java.util.Stack;

public class PrefixToPostfixConversion {

    public static boolean isOperator(char ch) {
        if (ch == '+' || ch == '*' || ch == '-' || ch == '/' || ch == '^') {
            return true;
        }
        return false;
    }

    public static String prefixToPostfix(String prefix) {

        StringBuilder revstr = new StringBuilder(prefix);
        revstr.reverse();

        Stack<String> st = new Stack<>();

        for (int i = 0; i < revstr.length(); i++) {
            char ch = revstr.charAt(i);

            if (isOperator(ch)) {
                String op1 = st.pop();
                String op2 = st.pop();
                String temp = op1 + op2 + ch;
                st.push(temp);
            } else {
                st.push(Character.toString(ch));
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        System.out.println(prefixToPostfix("*+AB-CD"));
    }
}
