package Codeforces.Contests;

import java.util.Scanner;

public class New_Years_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            boolean ans = false;
            if (n%2020 == 0)
                ans = true;
            else if (n%2021 == 0)
                ans = true;
            else {
                int m = n / 2021;
                for (int i=1; i<=m; i++) {
                    if ((n-i)%2020 == 0) {
                        ans = true;
                        break;
                    }
                }
            }
            System.out.println(ans ? "YES" : "NO");
        }
    }
}
