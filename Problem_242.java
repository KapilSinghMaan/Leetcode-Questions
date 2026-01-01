// 242. Valid Anagram

// https://leetcode.com/problems/valid-anagram/description/

public class Problem_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
        }

        for (int c : count) {
            if (c != 0)
                return false;
        }
        return true;
    }
}
