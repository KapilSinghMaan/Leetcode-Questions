// Given a integer array and a number 'k', return true/false if the given array can be divided into pairs such that the sum of every pair is divisible by 'k'.

// Example : array = [20, 25, 10, 3, 15, 27] , k = 10
// Output : true

public class Check_PairSum_Mod_K {

    public static boolean canMakePairs(int[] arr, int k) {
        int[] freq = new int[k];

        for (int num : arr) {
            num = num % k;

            if (num < 0)
                num += k;

            freq[num]++;
        }

        if (freq[0] % 2 != 0) {
            return false;
        }

        for (int i = 1; i < k / 2; i++) {
            if (freq[i] != freq[k - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = { 20, 15, 10, 3, 15, 27 };
        System.out.println(canMakePairs(arr, 10));
    }
}
