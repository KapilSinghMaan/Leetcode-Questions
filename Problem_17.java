// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

// 17. Letter Combinations of a Phone Number

import java.util.ArrayList;
import java.util.List;

public class Problem_17 {

    public static String[] map={"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> result=new ArrayList<String>();

    public static void fn(String str, int idx,String output)
    {
        if (idx==str.length()) {
            result.add(output);
            return ;
        }

        int digit=str.charAt(idx)-'0';
        for(int k=0;k<map[digit].length();k++)
        {
            fn(str, idx+1, output+map[digit].charAt(k));
        }

    }

    public List<String> letterCombinations(String digits) {
        result.clear();
        if (digits.length()==0) {
            return result;
        }
        fn(digits, 0, "");
        return result;
    }
}
