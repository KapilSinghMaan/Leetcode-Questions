// 2101. Detonate the Maximum Bombs

// https://leetcode.com/problems/detonate-the-maximum-bombs/description/

import java.util.ArrayList;
import java.util.List;

public class Problem_2101 {

    public int dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;

        int count = 1;
        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                count += dfs(graph, neighbour, visited);
            }
        }
        return count;
    }

    public int maximumDetonation(int[][] bombs) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < bombs.length; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < bombs.length; i++) {
            long x = bombs[i][0];
            long y = bombs[i][1];
            long r = bombs[i][2];

            for (int j = 0; j < bombs.length; j++) {
                if (i == j) {
                    continue;
                }

                long dx = x - bombs[j][0];
                long dy = y - bombs[j][1];

                long distance = dx * dx + dy * dy;

                if (distance <= r * r) {
                    graph.get(i).add(j);
                }
            }
        }

        int max = 1;

        for (int i = 0; i < bombs.length; i++) {
            boolean[] visited = new boolean[bombs.length];
            int count = dfs(graph, i, visited);
            max = Math.max(count, max);
        }

        return max;
    }
}
