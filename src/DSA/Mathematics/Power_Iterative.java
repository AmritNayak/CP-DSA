package DSA.Mathematics;

import java.util.Scanner;

public class Power_Iterative {

    // Iterative approach
    static long powerIterative(long x, int y) {
        long res = 1;
        if (x == 0)
            return 0;
        while (y > 0) {
            if ((y&1) == 1)     //y is odd if y&1 = 1
                res *= x;
            y = y >>> 1;     //y = y/2
            x *= x;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int y = sc.nextInt();
        System.out.println(powerIterative(x,y));
    }
}
