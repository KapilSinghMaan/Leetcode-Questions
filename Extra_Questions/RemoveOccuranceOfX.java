// Given a String 'S' of alphabets, write a function(recursively) that prints a new String which has all characters of 'S' except any occurance of 'x'.

// Example: input--> "abcxxbcxacxdx" output --> "abcbcacd"

package Extra_Questions;

public class RemoveOccuranceOfX {
    public static void fn(String str, int idx, String output) {
        if (idx == str.length() - 1) {
            System.out.println(output);
            return;
        }

        if (str.charAt(idx) != 'x') {
            fn(str, idx + 1, output + str.charAt(idx));
        } else {
            fn(str, idx + 1, output);
        }
    }

    public static void main(String[] args) {
        fn("abcxxbcxacxdx", 0, "");
    }
}
