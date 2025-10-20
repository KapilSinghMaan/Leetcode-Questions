// Find the number of ways that a given integer, 'X', can be expressed as the sum of Nth powers of unique natural numbers.

// Example: If X = 13 and N = 2, we have to find all combinations of unique squares adding up to 13. The only solution is 2^2 + 3^2 (4+9=13).

public class PowerSum {
    public static int count=0;
    public static void fn(int X,int N,int i)
    {
        if (X==0) {
            count++;
            return;
        }
        if (i*i>X) {
            return;
        }
        fn(X-(int)Math.pow(i, N), N, i+1);
        fn(X, N, i+1);
    }
    public static void main(String[] args) {
        fn(100,2,1);
        System.out.println(count);
    }
}
