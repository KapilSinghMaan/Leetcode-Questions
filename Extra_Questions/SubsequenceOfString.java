package Extra_Questions;

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
