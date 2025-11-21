// Infix to Postfix Conversion

// Infix to postfix conversion is the process of transforming an arithmetic expression where operators are placed between operands (infix) into a format where operators follow their operands (postfix), enabling easier computation by machines.

// Example : A*(B+C)/D

import java.util.Stack;

public class InfixToPostfixConversion {

    private static int precedence(char ch) {

        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return 0;
    }

    private static boolean isOperand(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    private static String infixToPostfix(String infix) {
        String postfix = new String("");

        Stack<Character> oper = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (isOperand(ch)) {
                postfix += ch;
            } else if (ch == '(') {
                oper.push(ch);
            } else if (ch == ')') {
                while (!oper.isEmpty() && oper.peek() != '(') {
                    postfix += oper.pop();
                }
                oper.pop();
            } else {
                while (!oper.isEmpty() && precedence(oper.peek()) >= precedence(ch)) {
                    postfix += oper.pop();
                }
                oper.push(ch);
            }
        }
        while (!oper.isEmpty()) {
            postfix += oper.pop();
        }
        return postfix;
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("A*(B+C)/D"));
    }
}
