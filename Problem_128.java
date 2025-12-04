// 128. Longest Consecutive Sequence

// https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.HashMap;

public class Problem_128 {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], true);
        }

        for (int num : nums) {
            if (map.containsKey(num - 1)) {
                map.put(num, false);
            }
        }
        int maxLength = 0;

        for (int key : map.keySet()) {
            if (map.get(key) == true) {
                int currentLength = 1;
                int currentValue = key + 1;
                while (map.containsKey(currentValue)) {
                    currentLength++;
                    currentValue++;
                }
                maxLength = maxLength > currentLength ? maxLength : currentLength;
            }
        }

        return maxLength;
    }
}
