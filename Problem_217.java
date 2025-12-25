// 217. Contains Duplicate

// https://leetcode.com/problems/contains-duplicate/description/

import java.util.HashSet;

public class Problem_217 {
    
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }

        return false;
    }
}
