// Given two numbers (m,n) representing dimensions of a 'm x n' board. You arestanding at top left of this board and want to reach the bottom right. In how many ways you can reach the bottom right from the top left if from every cell you can go either to rightward cell or downward cell.

// Example: for m=3 and n=3 there are 6 possible paths.

package Extra_Questions;

public class MazePath {
    public static int count=0;
    public static void fn(int i,int j,int m,int n,String output)
    {
        if (i==m-1 && j==n-1) {
            System.out.println(output); // Print a particular path
            count++;
            return;
        }
        if (i>=m|| j>=n) {
            return;
        }
        fn(i+1, j, m, n, output+"D");
        fn(i, j+1, m, n, output+"R");
    }
    public static void main(String[] args) {
        count=0;
        int m=3,n=3;
        fn(0, 0, m, n, "");
        System.out.println(count); // Print number of total paths
    }
}
