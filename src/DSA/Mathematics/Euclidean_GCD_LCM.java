package DSA.Mathematics;

public class Euclidean_GCD_LCM {

    static int GCD(int a, int b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }

    static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(GCD(a,b));
        System.out.println(LCM(a,b));
    }
}
