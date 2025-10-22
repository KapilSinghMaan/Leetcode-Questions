// Given a positive non zero number 'n', calculate the minimum number of steps to reduce 'n' to 1. For this reductions we can do the following operations on 'n' :

// 1) if n is divisible by 3, then divide by 3
// 2) if n is divisible by 2, then divide by 2
// 3) subtract 1 from 'n'.

// Example --> n = 10 (input)
// 10 ---(/2)-->5 ---(-1)-->4 ---(/2)-->2 ---(/2)-->1   (4 Steps)
// 10 ---(-1)-->9 ---(/3)-->3 ---(/3)-->1   (3 Steps) (Output)

public class ReduceToOne {

    public static int fn(int N) {
        int by3 = Integer.MAX_VALUE;
        int by2 = Integer.MAX_VALUE;
        int by1 = Integer.MAX_VALUE;
        if (N == 1) {
            return 0;
        }
        if (N < 1) {
            return Integer.MAX_VALUE;
        }
        if (N % 3 == 0) {
            by3 = fn(N / 3);
        }
        if (N % 2 == 0) {
            by2 = fn(N / 2);
        }
        by1 = fn(N - 1);
        return (1 + Math.min(by3, Math.min(by2, by1)));
    }

    public static void main(String[] args) {
        System.out.println("Minimum Steps : " + fn(10));
    }
}
