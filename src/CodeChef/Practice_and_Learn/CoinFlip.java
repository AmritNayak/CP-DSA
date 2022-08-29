package CodeChef.Practice_and_Learn;

import java.util.Arrays;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int g = sc.nextInt();
            while (g-- != 0) {
                int i = sc.nextInt();
                int n = sc.nextInt();
                int q = sc.nextInt();
                if (n%2 == 0)
                    System.out.println(n/2);
                else {
                    if (i==1) {
                        if (q==1)
                            System.out.println(n/2);
                        else
                            System.out.println(n/2+1);
                    }
                    else {
                        if (q==1)
                            System.out.println(n/2+1);
                        else
                            System.out.println(n/2);
                    }
                }
            }
        }
    }
}
//        1
//        2
//        1 5 1
//        1 5 2