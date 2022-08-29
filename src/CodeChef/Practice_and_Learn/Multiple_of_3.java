package CodeChef.Practice_and_Learn;

import java.util.Scanner;

public class Multiple_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long k = sc.nextLong();
            int d0 = sc.nextInt(), d1 = sc.nextInt();
            int sum = (d0 % 3 + d1 % 3) % 3;
            for (int i=2; i<k; i++) {
                sum *= 2;
                sum %= 3;
            }
            System.out.println(sum == 0 ? "YES" : "NO");
        }
    }
}
