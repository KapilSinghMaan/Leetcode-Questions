// Infix Evaluation

// Example : 2*(5*(3+6))/5-2
// result : 16

import java.util.Stack;

class InfixEvaluation {

    public static int precedence(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public static int performOperation(int x, int y, char oper) {
        switch (oper) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
        }
        return 0;
    }

    public static boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        } else
            return false;
    }

    public static int infixEvaluation(String infix) {

        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isDigit(ch)) {
                operand.push(ch - '0');
            } else if (ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (!operator.isEmpty() && operator.peek() != '(') {
                    int op1 = operand.pop();
                    int op2 = operand.pop();
                    char oper = operator.pop();

                    int result = performOperation(op2, op1, oper);
                    operand.push(result);
                }
                operator.pop();
            } else if (isOperator(ch)) {
                while (!operator.isEmpty() && precedence(ch) <= precedence(operator.peek())) {
                    int op1 = operand.pop();
                    int op2 = operand.pop();
                    char oper = operator.pop();

                    int result = performOperation(op2, op1, oper);
                    operand.push(result);
                }
                operator.push(ch);
            }
        }
        while (!operator.isEmpty()) {
            int op1 = operand.pop();
            int op2 = operand.pop();
            char oper = operator.pop();

            int result = performOperation(op2, op1, oper);
            operand.push(result);
        }
        return operand.pop();
    }

    public static void main(String[] args) {
        System.out.println(infixEvaluation("2*(5*(3+6))/5-2"));
    }
}