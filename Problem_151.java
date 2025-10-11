// https://leetcode.com/problems/reverse-words-in-a-string/description/

// 151. Reverse Words in a String

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem_151 {

    public String reverseWords(String s) {

        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}