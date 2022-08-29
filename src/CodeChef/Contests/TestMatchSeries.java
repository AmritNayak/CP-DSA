package CodeChef.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestMatchSeries {
    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int t = sc.nextInt();
        while (t-- != 0) {
            int[] res = new int[3];
            for (int i = 0; i < 5; i++) {
                res[sc.nextInt()]++;
            }
            System.out.println(solve(res));
        }
    }

    static String solve(int[] res) {
        if (res[1] > res[2])
            return "INDIA";
        else if (res[1] < res[2])
            return "ENGLAND";
        return "DRAW";
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
