// https://leetcode.com/problems/two-sum/description/

// 1. Two   Sum
// Nice Program

public class Problem_1 {
    public int[] twoSum(int[] nums, int target) {
     
        int sum[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    sum[0]=i;
                    sum[1]=j;
                    break;
                }
            }
        }
        return sum;
    }
}
