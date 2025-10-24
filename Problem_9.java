// https://leetcode.com/problems/palindrome-number/description/

// 9. Palindrome Number

public class Problem_9 {
    public boolean isPalindrome(int x) {
        int newNum = 0, num = x;
        if (x < 0) {
            return false;
        } else {
            while (x != 0) {
                int a = x % 10;
                newNum = newNum * 10 + a;
                x = x / 10;
            }
            if (newNum == num) {
                return true;
            } else {
                return false;
            }
        }
    }
}
