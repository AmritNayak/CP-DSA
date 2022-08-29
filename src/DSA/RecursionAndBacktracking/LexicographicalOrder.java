package DSA.RecursionAndBacktracking;

public class LexicographicalOrder {
    public static void main(String[] args) {

        int n = 100;
        for (int i = 1; i < 10; i++) {
            lexicographicalOrdering(i, n);
        }

    }

    // lexicographical ordering -> dictionary ordering
    static void lexicographicalOrdering(int i, int n) {
        if (i > n)
            return;

        System.out.println(i);
        for (int j = 0; j < 10; j++) {
            lexicographicalOrdering(10 * i + j, n);
        }
    }
}
