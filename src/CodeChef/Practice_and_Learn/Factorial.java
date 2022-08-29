package CodeChef.Practice_and_Learn;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = 5;
            int zeroes = 0;
            while (m < n) {
                zeroes += n/m;
                m *= 5;
            }
            System.out.println(zeroes);
        }
    }
}
