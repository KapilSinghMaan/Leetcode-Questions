// 33. Search in Rotated Sorted Array

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class Problem_33 {
    public int search(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;

        while (low<=high) {
            int mid=(low+high)/2;

            if (nums[mid]==target) {
                return mid;
            }
            if (nums[0]<=nums[mid]) {
                
                if (nums[0]<= target && nums[mid]>target) {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if (nums[mid]<target && nums[high]>=target) {
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }

        return -1;
    }
}
