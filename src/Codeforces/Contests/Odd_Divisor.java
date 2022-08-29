package Codeforces.Contests;

import java.util.Scanner;

public class Odd_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextLong();
            boolean flag = false;
            if (n % 2 != 0)
                System.out.println("YES");
            else {
                while (n > 1) {
                    if (n % 2 != 0) {
                        flag = true;
                        break;
                    }
                    n /= 2;
                }
                if (flag)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
