// Generate Binary Number

// Given a number 'n'. Write a program that generates and prints all binary numbers with decimal values from 1 to n.

// Example : n = 5
// Output : 1 , 10 , 11, 100 , 101

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static void generateBN(int n) {

        Queue<String> que = new LinkedList<>();
        que.add("1");

        while (n-- > 0) {
            String s1=que.remove();

            System.out.println(s1);

            que.add(s1+"0");
            que.add(s1+"1");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generateBN(n);
    }
}
