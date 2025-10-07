// https://leetcode.com/problems/intersection-of-two-arrays/description/

// 349. Intersection of Two Arrays

class Problem_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int size=Math.min(nums1.length,nums2.length);
        int[] ans=new int[size];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            boolean alreadyExist=false;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    for(int s=0;s<k;s++){
                        if(ans[s]==nums1[i]){
                            alreadyExist=true;
                            break;
                        }
                    }
                    if (!alreadyExist) {
                        ans[k++]=nums1[i];
                    }
                    break;
                }
            }
        }

        int[] finalAns=new int[k];
        for(int i=0;i<k;i++){
            finalAns[i]=ans[i];
        }
        return finalAns;
    }
}