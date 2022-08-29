package Codeforces.Contests;

import java.util.Scanner;

public class Fair_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++) {
            int n = sc.nextInt();
            int two=0, one=0;
            for (int j = 0; j < n; j++) {
                if (sc.nextInt() == 1)
                    one += 1;
                else
                    two += 1;
            }
            if ((one % 2 == 0)){
                if (one == 0 && (two %2 != 0))
                    System.out.println("NO");
                else
                    System.out.println( "YES");
            }
            else
                System.out.println("NO");
        }
    }
}
