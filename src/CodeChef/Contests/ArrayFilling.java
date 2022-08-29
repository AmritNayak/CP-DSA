package CodeChef.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class ArrayFilling {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while (t-- != 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();

            TreeMap<Long, Long> map = new TreeMap<>(Collections.reverseOrder());
            while (m-- != 0) {
                map.put(sc.nextLong(), sc.nextLong());
            }

            System.out.println(solve(n, map));
        }
    }

    static long solve(long n, TreeMap<Long, Long> map) {
        long lcm = 1, rem = n, res = 0;

        for (long key: map.keySet()) {
            if (rem > 0) {
                long y = map.get(key);
                lcm = lcm * y / gcd(lcm, y);
                res += (rem - n / lcm) * key;
                rem = n / lcm;
            }
        }

        return res;
    }

    static long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
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

        String nextLine() {
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
