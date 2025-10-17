// Given 'n' friends, each one can remain single or can be paires up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.

// Example--> Input: n=3 Output: 4

import java.util.Scanner;

public class WaysToPairUp {

    public static int fn(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        return fn(n - 1) + (n - 1) * fn(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Friends: ");
        int n = scanner.nextInt();
        System.out.println(fn(n));
        scanner.close();
    }
}