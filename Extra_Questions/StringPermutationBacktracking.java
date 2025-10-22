// Print all permutation of a string (using Backtracking)

// Example input --> "abc"
// output --> "abc","acb","bac","bca","cab","cba"

public class StringPermutationBacktracking {

    public static void fn(String input, int l, int r) {
        if (l == r) {
            System.out.println(input);
        } else {
            for (int i = l; i <= r; i++) {
                input = swap(input, l, i);

                fn(input, l + 1, r);

                input = swap(input, l, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char temp;
        char arr[] = str.toCharArray();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        fn("abc", 0, 2);
    }
}
