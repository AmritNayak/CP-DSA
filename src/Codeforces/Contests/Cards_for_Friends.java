package Codeforces.Contests;

import java.util.Scanner;

public class Cards_for_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();
            if (n == 1)
                System.out.println("YES");
            else {
                if ((w % 2 != 0) && (h % 2 != 0))
                    System.out.println("NO");
                else {
                    int p = w * h;
                    int c = 1, flag = 0;
                    while (p % 2 == 0) {
                        c *= 2;
                        if (c >= n) {
                            flag = 1;
                            break;
                        }
                        p /= 2;
                    }
                    if (flag == 1)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        }
    }
}
