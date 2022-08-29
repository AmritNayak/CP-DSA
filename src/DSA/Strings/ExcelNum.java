package DSA.Strings;

public class ExcelNum {
    public static void main(String[] args) {
        System.out.println(solve(1));
        System.out.println(solve(26));
        System.out.println(solve(52));
        System.out.println(solve(51));
        System.out.println(solve(700));
        System.out.println(solve(703));
    }

    static String solve(int n) {
        StringBuilder sb = new StringBuilder();
        int rem;
        while (n > 0) {
            rem = n % 26;
            if (rem == 0) {
                sb.append('Z');
                n = n / 26 - 1;
            } else {
                sb.append((char) (rem - 1 + 'A'));
                n /= 26;
            }
        }
        return sb.reverse().toString();
    }
}
