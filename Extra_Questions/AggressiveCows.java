// Aggressive Cows (Binary Search Problem)

// Farmer Jhon has built a new long barn, with N stalls. The stalls are located along a straight line at positions x1,x2,x3.....xN.

// His C cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, Jhon wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?

// Example : no. of cows = 3
// position of stall = (1,2,8,4,9)

// Output : Minimum distance : 3

import java.util.Arrays;

public class AggressiveCows {

    public static int distributedCows(int[] arr,int n,int c){

        Arrays.sort(arr);
        int low=1;
        int max=0;

        for (int i : arr) {
            max=Math.max(max, i);
        }

        int high=max;
        int ans=0;

        while (low<=high) {
            int mid=(low+high)/2;

            if (good(arr,mid,n,c)) {
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static boolean good(int[] arr,int mid,int n,int c){

        int count=1;
        int last_pos=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]-last_pos>=mid) {
                last_pos=arr[i];
                count++;
            }
            if (count==c) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=5;
        int c=3;
        int[] arr={1,2,8,4,9};

        System.out.println("Minimum distance : "+ distributedCows(arr,n,c));
    }
}
