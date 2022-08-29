package DSA.RecursionAndBacktracking;

public class PalindromicPartitioning {
    public static void main(String[] args) {
        String s = "abaaba";
        palindromicPartitioning(s, "");
    }

    static void palindromicPartitioning(String s, String res) {
        if (s.isEmpty()) {
            System.out.println(res);
            return;
        }

        int len = s.length();
        for (int i = 0; i < len; i++) {
            String sub = s.substring(0, i + 1);
            if (isPalindrome(sub, sub.length())) {
                palindromicPartitioning(s.substring(i + 1), res + sub + " ");
            }
        }
    }

    static boolean isPalindrome(String s, int n) {
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n-1-i))
                return false;
        }
        return true;
    }
}
