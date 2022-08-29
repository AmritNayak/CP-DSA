package CodeChef.Practice_and_Learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Color_Me_Yellow {
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

    public static void main(String[] args) {
        FastReader sc= new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextLong();
            long r = sc.nextLong();
            long g = sc.nextLong();
            long b = sc.nextLong();
            long right = Math.min(n, Math.min(r, b));
            long left = 0;
            long ans = 0;
            while (left <= right) {
                long mid = (left + right) / 2;
                if (solve(mid, r, g, b)) {
                    ans = mid;
                    left = mid + 1;
                }
                else right = mid - 1;
            }
            System.out.println(ans);
        }
    }

    private static boolean solve(long mid, long r, long g, long b) {
        return (r-mid) + (b-mid) + g >= mid;
    }
}
