package CodeChef.Contests;

import java.util.Scanner;

public class Chef_and_Division_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int d = sc.nextInt();
            int total = 0;
            for (int j = 0; j < n; j++)
                total += sc.nextInt();
            int contests = total / k;
            if (contests > d)
                contests = d;
            System.out.println(contests);
        }
    }
}
