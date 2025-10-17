// Given a String 'S' print all possible subsequences of the String.(order of output does not matter)

// Example: "abc" --> "abc","ab","ac","bc","a","b","c",""

public class SubsequenceOfString {
    public static void fn(String str, int idx, String output) {
        if (idx == str.length()) {
            System.out.println("[" + output + "]");
            return;
        }
        fn(str, idx+1, output+str.charAt(idx));
        fn(str, idx+1, output);
    }

    public static void main(String[] args) {
        fn("abc", 0, "");
    }
}
