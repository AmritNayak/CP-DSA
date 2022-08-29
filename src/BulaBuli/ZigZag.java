package BulaBuli;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        zigZag(n);
    }

    static void zigZag(int n) {
        if (n == 0)
            return;
        System.out.println("Pre " + n);
        zigZag(n-1);
        System.out.println("In " + n);
        zigZag(n-1);
        System.out.println("Post " + n);
    }

    static int sum(int a, int b) {
        return a+b;
    }
}
