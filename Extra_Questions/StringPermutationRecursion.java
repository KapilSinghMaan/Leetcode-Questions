// Print all permutation of a string (using Recursion)

// Example input --> "abc"
// output --> "abc","acb","bac","bca","cab","cba"

public class StringPermutationRecursion {

    public static void fn(String input,String output)
    {
        if (input.length()==0) {
            System.out.println(output);
            return;
        }
        for(int i=0;i<input.length();i++)
        {
            String newstr= input.substring(0, i)+input.substring(i+1);
            fn(newstr, output+input.charAt(i));
        }
    }
    public static void main(String[] args) {
        fn("abc","");
    }
}
