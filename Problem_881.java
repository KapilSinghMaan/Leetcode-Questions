// https://leetcode.com/problems/boats-to-save-people/description/

// 881. Boats to Save People

import java.util.Arrays;

public class Problem_881 {
     public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int res=0;

        while (i<=j) {
            res++;
            if (people[i]+people[j]<=limit) {
                i++;
            }
            j--;
        }
        return res;
    }
}
