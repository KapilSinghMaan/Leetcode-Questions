// 994. Rotting Oranges

// https://leetcode.com/problems/rotting-oranges/description/

import java.util.LinkedList;
import java.util.Queue;

public class Problem_994 {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }

        int min = 0;
        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!q.isEmpty()) {
            int size = q.size();
            boolean rottenThisMinute = false;

            for (int i = 0; i < size; i++) {
                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];

                for (int[] dir : dirs) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr >= 0 && nr < row && nc >= 0 && nc < col && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        fresh--;
                        rottenThisMinute = true;
                        q.offer(new int[] { nr, nc });
                    }
                }
            }
            if (rottenThisMinute) {
                min++;
            }
        }
        return fresh == 0 ? min : -1;
    }
}
