package DSA.Dynamic_Programming;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "qwerty";
        String s2 = "sghwnerty";
        System.out.println(lcs(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length()));
//        System.out.println(printLCS(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length()));
    }

    static int lcs(char[] s1, char[] s2, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (s1[i-1] == s2[j-1])
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

//        for (int[] row: dp) {
//            for (int e: row) {
//                System.out.print(e + " ");
//            }
//            System.out.println();
//        }

        int i = m, j = n, index = dp[m][n];
        char[] lcs = new char[index];
        while (i > 0 && j > 0) {
            if (s1[i-1] == s2[j-1]) {
                lcs[--index] = s1[i-1];
                i--;
                j--;
            } else {
                if (dp[i-1][j] > dp[i][j-1])
                    i--;
                else j--;
            }
        }
        for (char e : lcs)
            System.out.print(e);
        System.out.println();

        return dp[m][n];
    }

//    static String printLCS(char[] s1, char[] s2, int m, int n) {
//        int[][] dp = new int[m+1][n+1];
//        for (int i = 0; i <= m; i++) {
//            for (int j = 0; j <= n; j++) {
//                if (i == 0 || j == 0)
//                    dp[i][j] = 0;
//                else if (s1[i-1] == s2[j-1])
//                    dp[i][j] = dp[i-1][j-1] + 1;
//                else
//                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
//            }
//        }
//
//        int i = m, j = n, index = dp[m][n];
//        char[] lcs = new char[index];
//        while (i > 0 && j > 0) {
//            if (s1[i-1] == s2[j-1]) {
//                lcs[--index] = s1[i-1];
//                i--;
//                j--;
//            } else {
//                if (dp[i-1][j] > dp[i][j-1])
//                    i--;
//                else j--;
//            }
//        }
//
//        return Arrays.toString(lcs);
//    }
}
