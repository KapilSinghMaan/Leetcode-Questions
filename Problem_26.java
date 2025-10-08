// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

// 26. Remove Duplicates from Sorted Array

public class Problem_26 {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        for(int i=1;i<nums.length;i++)
        {
            if (nums[i-1]!=nums[i]) {
                nums[idx]=nums[i];
                idx++;
            }
        }
        return idx;
    }
}
