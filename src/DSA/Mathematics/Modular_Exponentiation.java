package DSA.Mathematics;

import java.util.Scanner;

public class Modular_Exponentiation {
    //Given three numbers x, y and p, compute (x^y) % p.
    //(ab) mod p = ( (a mod p) (b mod p) ) mod p
    //(a+b) mod p = ( (a mod p) + (b mod p) ) mod p

    static int power(int x, int y, int p) {
        int res = 1;
        x %= p;
        if (x % p == 0)
            return 0;
        while (y > 0) {
            if ((y & 1) == 1)   //y & 1 = 1 if y is odd and y & 1 = 0 if y is even
                res = (res * x) % p;
            y = y >> 1;     //shift 1 bit to right, y = y/2
            x = (x*x) % p;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(power(x,y,p));
    }
}
