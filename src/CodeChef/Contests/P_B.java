package CodeChef.Contests;

import java.util.Scanner;

public class P_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++) {
            int k = sc.nextInt();
            int num = 0;
            for (int j = 1; j <= k; j++) {
                for (int l = 0; l < k; l++) {
                    System.out.print(j + j * l);
                }
                System.out.println();
            }
        }
    }
}
