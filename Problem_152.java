// 152. Maximum Product Subarray

// https://leetcode.com/problems/maximum-product-subarray/description/

public class Problem_152 {
    
    public int maxProduct(int[] nums) {
         int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(curr, curr * maxProd);
            minProd = Math.min(curr, curr * minProd);

            ans = Math.max(ans, maxProd);
        }

        return ans;
    }
}
