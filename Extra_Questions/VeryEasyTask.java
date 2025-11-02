// Very Easy Task (Binary Search to Answer)

// This morning the jury decided to add one more ,Very Easy Problem to the problem set of the olympiad. The executive secretary of the Organizing Committee has printed its statement in one copy, and now they need to make n more copies before the start of the olympiad.
// They have two copies at his disposal, one of which copies a sheet in x seconds, and the other in y seconds.
// It is allowed to use one copier or both at the same time. You can copy not only from the original, but also from the copy.
// Help them find out what is the minimum time they need to make 'n' copies of the statement.

// Input --> The program receives three integers : n , x, y 
// Output -> Print one integer, the minimum time in seconds required to get 'n' copies.

// Example: input--> 4 1 1      output --> 3
// Example: input--> 5 1 2      output --> 4

import java.util.Scanner;

public class VeryEasyTask {

    public static int minTime(int n, int x, int y) {

        if (n == 1) {
            return Math.min(x, y);
        }

        int first = 0;
        int last = Math.max(x, y) * n;

        int ans = 0;

        while (first < last) {
            int mid = (first + last) / 2;

            if (good(n, x, y, mid)) {
                ans = mid;
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        return ans + Math.min(x, y);
    }

    public static boolean good(int n, int x, int y, int mid) {

        // Objective
        // If in mid amount of time, i am able to make n-1 copies
        // then my mid value is good, hence I should return true.

        // Check how many copies can be make in mid amount of time.
        // if no of copies >= n-1 , then return true
        // otherwise return false.

        // c1 copier can make mid/x copies in mid time.
        // c2 copier can make mid/y copies in mid time.

        return (mid / x) + (mid / y) >= n - 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of copies : ");
        int n = scanner.nextInt();
        System.out.print("Enter Copier x time(second) of per copy : ");
        int x = scanner.nextInt();
        System.out.print("Enter Copier y time(second) of per copy : ");
        int y = scanner.nextInt();

        System.out.println("The time(seconds) taken for " + n + " copies is " + minTime(n, x, y));
        scanner.close();
    }
}