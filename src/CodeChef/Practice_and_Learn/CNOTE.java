package CodeChef.Practice_and_Learn;

import java.util.Scanner;

public class CNOTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int flag = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int n = sc.nextInt();
            for (int j = 1; j <= n; j++) {
                int pi = sc.nextInt();
                int ci = sc.nextInt();
                if ((x-y) <= pi && k >= ci)
                    flag = 1;
            }
            if (flag == 1)
                System.out.println("LuckyChef");
            else
                System.out.println("UnluckyChef");
        }
    }
}
