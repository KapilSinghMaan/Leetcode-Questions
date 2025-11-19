// The stock span problem is a financial problem where we have a series of N daily price quotes for a stock and we need to calculate the span of the stock's price for all N days. The span Si of the stock's price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than its price on the given day.

// Input: N = 7, price[] = [100 80 60 70 60 75 85]
// Output: 1 1 1 2 1 4 6
// Explanation: Traversing the given input span for 100 will be 1, 80 is smaller than 100 so the span is 1, 60 is smaller than 80 so the span is 1, 70 is greater than 60 so the span is 2 and so on. Hence the output will be 1 1 1 2 1 4 6.

// Input: N = 6, price [] = [10 4 5 90 120 80]
// Output:1 1 2 4 5 1
// Explanation: Traversing the given input span for 10 will be 1, 4 is smaller than 10 so the span will be 1, 5 is greater than 4 so the span will be 2 and so on. Hence the output will be 1 1 2 4 5 1.

import java.util.Stack;

public class StockSpanProblem {

    public static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && price[i] >= price[stack.peek()]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] price = { 100, 80, 60, 70, 60, 75, 85 };
        int[] span = calculateSpan(price);
        System.out.print("Output: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
