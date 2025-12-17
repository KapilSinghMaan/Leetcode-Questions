// 136. Single Number

// https://leetcode.com/problems/single-number/description/

public class Problem_136 {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
