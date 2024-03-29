package CodeChef.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LuckyNumber {
    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int t = sc.nextInt();
        while (t-- != 0) {
            if (willWin(sc.nextInt(), sc.nextInt(), sc.nextInt()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    static boolean willWin(int a, int b, int c) {
        return a == 7 || b == 7 || c == 7;
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
