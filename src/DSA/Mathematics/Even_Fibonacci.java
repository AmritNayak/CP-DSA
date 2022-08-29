package DSA.Mathematics;

import java.util.Scanner;

public class Even_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 2, c = 2;        // a = 0th fibonacci number and b = first even fibonacci number
        while (c <= n) {
            System.out.println(c);
            c = 4 * b + a;      // relation of nth even fibonacci number -> e(n) = 4 * e(n-1) + e(n-2)
            a = b;
            b = c;
        }
    }
}
