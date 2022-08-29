package Codeforces.Contests;

import java.util.Scanner;

public class K_divisible_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = 1;
            if (n == 1)
                ans = k;
            else if (n % k == 0)
                ans = 1;
            else if (k % n == 0)
                ans = k/n;
            else if (n < k) {
                ans = k/n +1;
            }
            else if (n > k) {
                ans = 2;
            }
            System.out.println(ans);
        }
    }
}
