// 797. All Paths From Source to Target

// https://leetcode.com/problems/all-paths-from-source-to-target/description/

import java.util.ArrayList;
import java.util.List;

public class Problem_797 {

    public void dfs(int[][] graph, int node, List<List<Integer>> result, List<Integer> path) {

        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int nextNode : graph[node]) {
            path.add(nextNode);
            dfs(graph, nextNode, result, path);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, result, path);
        return result;
    }
}
