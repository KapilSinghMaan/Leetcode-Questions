// 153. Find Minimum in Rotated Sorted Array

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

public class Problem_153 {
    public int findMin(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        if (nums.length == 1) {
            return nums[0];
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[low] < nums[high]) {
                return nums[low];
            }
            if (mid - 1 >= 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (mid + 1 < nums.length && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[low] < nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
