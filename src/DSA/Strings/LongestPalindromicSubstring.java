package DSA.Strings;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "aaaabbaa";
        System.out.println(lps(s));
    }

    static String lps(String s) {
        int max = -1, start = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int l1 = pslen(s, i, i);
            int l2 = pslen(s, i, i+1);
            int m = Math.max(l1, l2);
            if (m > max) {
                max = m;
                start = i - (max - 1) / 2;
            }
        }
        return s.substring(start, start + max);
    }

    static int pslen(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }

}
