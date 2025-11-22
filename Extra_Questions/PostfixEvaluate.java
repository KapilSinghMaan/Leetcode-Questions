// Evaluation of Postfix expression

// postfix: 2536+**5/2-
// result: 16

import java.util.Stack;

public class PostfixEvaluate {

    public static int postfixEvaluation(String postfix) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int op2 = stack.pop();
                int op1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op1 / op2);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(postfixEvaluation("2536+**5/2-"));
    }
}
