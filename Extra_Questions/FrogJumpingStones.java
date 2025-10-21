// There are N stones, numbered 1,2,3......,N. For each i(1<=i<=N), the height of Stone 'i' is 'hi'(height of ith stone).

// There is a frog who is initially on Stone 1. He will repeat the following action some number of times to reach Stone N :
//      --> If the frog is currently on Stone i, jump to Stone (i+1), or Stone (i+2). Here, a cost of | hi - hj | is incurred, where j is the stone to land on.

// Find the minimum possible total cost incurred before the frog reaches Stone N.

// Example --> h[]= { 10, 20, 30, 40 }; then minimum cost = 30

public class FrogJumpingStones {

    static int h[] = { 10, 20, 30, 40 };

    public static int fn(int N, int i) {

        if (i == N) {
            return 0;
        }
        if (i > N) {
            return Integer.MAX_VALUE;
        }
        int nextstone = Integer.MAX_VALUE;
        int nextnextstone = Integer.MAX_VALUE;
        if (i + 1 < h.length) {
            nextstone = Math.abs(h[i] - h[i + 1]) + fn(N, i + 1);
        }
        if (i + 2 < h.length) {
            nextnextstone = Math.abs(h[i] - h[i + 2]) + fn(N, i + 2);
        }
        return Math.min(nextstone, nextnextstone);
    }

    public static void main(String[] args) {
        System.out.println("Minimum cost : " + fn(h.length-1, 0));
    }
}