// There are N stones, numbered 1,2,3......,N. For each i(1<=i<=N), the height of Stone 'i' is 'hi'(height of ith stone).

// There is a frog who is initially on Stone 1. He will repeat the following action some number of times to reach Stone N :
//      --> If the frog is currently on Stone i, jump to one of the following: Stone (i+1), (i+2),.......,(i+k). Here, a cost of | hi - hj | is incurred, where j is the stone to land on.

// Find the minimum possible total cost incurred before the frog reaches Stone N.

public class FrogJumpingManyStones {

    static int h[] = { 10, 20, 30, 40 };

    public static int fn(int N, int idx) {

        int result = Integer.MAX_VALUE;
        if (idx == N) {
            return 0;
        }

        if (idx > N) {
            return Integer.MAX_VALUE;
        }
        for (int j = 1; idx + j <= N; j++) {
            result = Math.min(result, fn(N, idx + j) + Math.abs(h[idx] - h[idx + j]));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Minimum cost : " + fn(h.length - 1, 0));
    }
}
