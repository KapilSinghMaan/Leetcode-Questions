// https://leetcode.com/problems/generate-parentheses/description/

// 22. Generate Parentheses

import java.util.ArrayList;
import java.util.List;

public class Problem_22 {

    public static List<String> result = new ArrayList<>();

    public static void fn(int n,int open,int close,String output){
        if (close==n) {
            result.add(output);
            return;
        }
        if (open>close) {
            fn(n, open, close+1,output+")");
        }
        if (open<n) {
            fn(n, open+1, close,output+"(");
        }
    }
    public static List<String> generateParenthesis(int n) {
        result.clear();
        fn(n, 0, 0,"");
        return result;
    }
}
