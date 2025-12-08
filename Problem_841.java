// 841. Keys and Rooms

// https://leetcode.com/problems/keys-and-rooms/description/

import java.util.List;
import java.util.Stack;

public class Problem_841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while (!stack.isEmpty()) {
            int curr = stack.pop();

            for (int next : rooms.get(curr)) {
                if (!visited[next]) {
                    visited[next] = true;
                    stack.push(next);
                }
            }
        }

        for (boolean room : visited) {
            if (!room) {
                return false;
            }
        }
        return true;
    }
}
