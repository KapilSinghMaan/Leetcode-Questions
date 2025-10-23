// A rat is in a maze(matrix n*n) at top left and want to reach bottom right of the maze.

// The maze is filled with binary. The 1 can be valid path but 0 is dead end.

public class RatInAMaze {

    public static boolean foundPath(int[][] maze) {
        int[][] sol = new int[maze.length][maze.length];

        if (findPath(maze, 0, 0, sol)) {
            printPath(sol);
            return true;
        } else {
            return false;
        }
    }

    public static boolean findPath(int[][] maze, int x, int y, int[][] sol) {
        if (x == maze.length - 1 && y == maze.length - 1) {
            sol[x][y] = 1;
            return true;
        }

        if (x < maze.length && x >= 0 && y >= 0 && y < maze.length && maze[x][y] == 1) {

            sol[x][y] = 1;

            if (findPath(maze, x, y + 1, sol)) {
                return true;
            }

            if (findPath(maze, x + 1, y, sol)) {
                return true;
            }

            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void printPath(int[][] sol) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] maze = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        System.out.println("Is path availabe: " + foundPath(maze));
    }
}