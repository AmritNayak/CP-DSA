package DSA.RecursionAndBacktracking;

public class Josephus {
    public static void main(String[] args) {
        int n = 5, k = 3;
        System.out.println(josephus(n, k));
    }

    static int josephus(int n, int k) {
        if (n == 1)
            return 0;

        int x = josephus(n-1, k);
        return (x + k) % n;
    }
}
