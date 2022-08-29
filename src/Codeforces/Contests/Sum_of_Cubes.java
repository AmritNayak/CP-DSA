package Codeforces.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum_of_Cubes {
    static boolean isValid(long n) {
        for (long i=1; i*i*i<=n; i++) {
            long a = n - i*i*i;
            long b = (long)Math.cbrt(a);
            if (b*b*b == a && b >= 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            System.out.println(isValid(sc.nextLong()) ? "YES" : "NO");
        }
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
