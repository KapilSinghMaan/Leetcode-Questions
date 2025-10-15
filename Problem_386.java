// https://leetcode.com/problems/lexicographical-numbers/description/

// 386. Lexicographical Numbers

import java.util.ArrayList;
import java.util.List;

public class Problem_386 {

    public static List<Integer> result = new ArrayList<>();

    public static void fn(int i, int n) {
        if (i <= n) {
            if (i != 0)
                result.add(i);
        } else {
            return;
        }

        for (int k = 0; k <= 9; k++) {
            if (i == 0 && k == 0)
                continue;
            fn(10 * i + k, n);
        }
    }

    public List<Integer> lexicalOrder(int n) {
        result.clear();
        fn(0, n);
        return result;
    }
}