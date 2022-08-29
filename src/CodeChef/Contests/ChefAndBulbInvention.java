package CodeChef.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefAndBulbInvention {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while (t-- != 0) {
            long n = sc.nextLong();
            long p = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(solve(n, p, k));
        }
    }

    static long solve(long n, long p, long k) {
        long res = 0;
        if (p % k > (n-1) % k) {
            res += (n % k) * ((n-1) / k + 1) + (p % k - n % k) * ((n-1) / k);
        } else
            res += (p % k) * ((n-1) / k + 1);

        res += p / k + 1;
        return res;
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
