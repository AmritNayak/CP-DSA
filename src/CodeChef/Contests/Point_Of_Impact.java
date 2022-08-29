package CodeChef.Contests;

import java.util.Scanner;

public class Point_Of_Impact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            k %= 4;
            if (k == 0)
                k = 4;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a, b;
            int[][] corners = new int[4][2];
            if (x == y)
                a = b = n;
            else if (x > y) {
                corners[0][0] = n;
                corners[0][1] = n - x + y;
                corners[1][0] = corners[0][1];  //n-x+y
                corners[1][1] = corners[0][0];  //n
                corners[2][0] = 0;
                corners[2][1] = x - y;
                corners[3][0] = corners[2][1];  //x-y
                corners[3][1] = corners[2][0];  //0
                a = corners[k - 1][0];
                b = corners[k - 1][1];
            } else {
                corners[0][0] = n - y + x;
                corners[0][1] = n;
                corners[1][0] = corners[0][1];  //n
                corners[1][1] = corners[0][0];  //n-y+x
                corners[2][0] = y-x;
                corners[2][1] = 0;
                corners[3][0] = corners[2][1];  //0
                corners[3][1] = corners[2][0];  //y-x
                a = corners[k - 1][0];
                b = corners[k - 1][1];
            }
            System.out.println(a + " " + b);
        }
    }
}
