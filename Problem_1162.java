// 1162. As Far from Land as Possible

// https://leetcode.com/problems/as-far-from-land-as-possible/description/

import java.util.LinkedList;
import java.util.Queue;

public class Problem_1162 {
    public int maxDistance(int[][] grid) {

        int n = grid.length;
        Queue<int[]> q = new LinkedList<>();
        int landCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    q.offer(new int[] { i, j });
                    landCount++;
                }
            }
        }

        if (landCount == 0 || landCount == n * n) {
            return -1;
        }

        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        int distance = -1;

        while (!q.isEmpty()) {
            int size = q.size();

            distance++;

            while (size-- > 0) {

                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];
                for (int[] dir : dirs) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc] == 0) {
                        grid[nr][nc] = 1;
                        q.offer(new int[] { nr, nc });
                    }
                }
            }
        }
        return distance;
    }
}
