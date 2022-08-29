package DSA.Mathematics;

import java.util.Scanner;

public class Sum_Product_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int sq_sum = 0;
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            sum += x;
            sq_sum += x*x;
        }
        // ex: (a+b+c)^2 = a^2 + b^2 + c^2 + 2 * (ab + bc + ca)
        // ex: (a+b+c+d)^2 = a^2 + b^2 + c^2 + d^2 + 2 * (ab + bc + cd +da)
        //  sum of product pairs = ((sum)^2 - (sq_sum)) / 2
        System.out.println((sum*sum - sq_sum) / 2);
    }
}
