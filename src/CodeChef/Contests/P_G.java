package CodeChef.Contests;

import java.util.Scanner;

public class P_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++) {
            int k = sc.nextInt();
            for (int j = 1; j <= k; j++) {
                int num = j+1;
                for (int l = 1; l <= k; l++) {
                    System.out.print(num++);
                }
                System.out.println();
            }
        }
    }
}
