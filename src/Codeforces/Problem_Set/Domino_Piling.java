package Codeforces.Problem_Set;

import java.util.Scanner;

public class Domino_Piling {

    static int solve(int m, int n) {
        int res = 0;
        // rows are even
        if ((m&1) == 0)
            res = n * m / 2;
        // rows are odd
        else {
            // columns are even
            if ((n&1) == 0)
                res = n * (m-1) / 2 + n / 2;
            // columns are odd
            else
                res = (n * m - 1) / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(solve(m,n));
    }
}
