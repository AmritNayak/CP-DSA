package DSA.Divide_and_Conquer;

public class Power {

    // Fast Exponentiation
    static int power(int x, int n) {
        if (n == 0)
            return 1;
        else if ((n&1) == 1)    // n is odd
            return x * power(x,n/2) * power(x, n/2);
        else    // n is even
            return power(x, n/2) * power(x, n/2);
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.println(power(x, y));
    }
}
