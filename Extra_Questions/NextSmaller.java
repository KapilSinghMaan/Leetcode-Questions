// Next Smaller Element

// Find the just smaller element on the right side of every element

// input --> 4,5,2,25
// output -> 2,2,-1,-1  (-1 if not next smaller)

import java.util.Stack;

public class NextSmaller {
    private static int[] nextSamller(int[] arr) {

        int n = arr.length;

        int[] output = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(0);

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
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

        int[] res = nextSamller(arr);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
