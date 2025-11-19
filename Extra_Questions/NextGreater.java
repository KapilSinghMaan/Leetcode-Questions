// Next Greater Element

// Find the just greater element on the right side of every element

// input --> 4,5,2,25
// output -> 5,25,25,-1  (-1 if not next greater)

import java.util.Stack;

public class NextGreater {

    private static int[] nextGreater(int[] arr) {

        int n = arr.length;

        int[] output = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(0);

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                output[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int top = st.peek();
            output[top] = -1;
            st.pop();
        }

        return output;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 5, 2, 25 };

        int[] res = nextGreater(arr);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
