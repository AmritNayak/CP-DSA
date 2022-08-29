package CodeChef.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XOR_Sums {

    static int MOD = 998244353;
    static int[] ans = new int[200001];

    static int sumOfXor(int arr[], int n, int k) {
        int dp[][] = new int[n + 1][n + 1];

        for(int i = 0; i <= n; i++)
            for(int j = 0; j <= n; j++)
                dp[i][j] = 0;

        int cur_sum = 0;

        for(int i = 1; i <= n; i++)
        {
            dp[1][i] = arr[i - 1];
            cur_sum += arr[i - 1];
        }
        for(int i = 2; i <= k; i++) {
            int temp_sum = 0;

            for(int j = 1; j <= n; j++) {
                cur_sum -= dp[i - 1][j];
                dp[i][j] = arr[j - 1] ^ cur_sum;
                System.out.println(dp[i][j]);
                temp_sum += dp[i][j] % MOD;
            }
            cur_sum = temp_sum;
        }
        return cur_sum % MOD;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int[] arr = {1,5,6};
        System.out.println(sumOfXor(arr,3,2));
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i=0; i<n; i++)
//            arr[i] = sc.nextInt();
//        for (int i=1; i<=n; i++)
//            ans[i] = sumOfXor(arr,n,i);
//        int q = sc.nextInt();
//        while (q-- != 0) {
//            int m = sc.nextInt();
//            int sum = 0;
//            for (int i=1; i<=m; i++)
//                sum += ans[i] % MOD;
//            System.out.println(sum % MOD);
//        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
