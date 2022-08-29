package CodeChef.Contests;

import java.util.Scanner;

public class P_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++) {
            int k = sc.nextInt();
            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= k; l++) {
                    if (l % 2 == 1)
                        System.out.print("1");
                    else
                        System.out.print("0");
                }
                System.out.println();
            }
        }
    }
}
