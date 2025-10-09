// https://leetcode.com/problems/spiral-matrix/description/

// 54. Spiral Matrix

import java.util.ArrayList;
import java.util.List;

public class Problem_54 {

    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int sr = 0;
        int er = m - 1;
        int sc = 0;
        int ec = n - 1;

        List<Integer> ans = new ArrayList<>();

        int count = m * n;

        while (count > 0) {
            for (int i = sc; i <= ec; i++) {
                ans.add(matrix[sr][i]);
                count--;
            }
            sr++;
            if (count == 0)
                break;

            for (int i = sr; i <= er; i++) {
                ans.add(matrix[i][ec]);
                count--;
            }
            ec--;
            if (count == 0)
                break;

            for (int i = ec; i >= sc; i--) {
                ans.add(matrix[er][i]);
                count--;
            }
            er--;
            if (count == 0)
                break;

            for (int i = er; i >= sr; i--) {
                ans.add(matrix[i][sc]);
                count--;
            }
            sc++;
            if (count == 0)
                break;
        }

        return ans;
    }
}