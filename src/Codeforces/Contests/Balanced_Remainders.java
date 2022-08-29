package Codeforces.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Balanced_Remainders {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int count = 0;
            int c = n/3;
            int c0, c1, c2;
            c0=c1=c2=0;
            for (int i=0; i<n; i++) {
                int a = sc.nextInt();
                if (a%3==0) c0++;
                else if (a%3==1) c1++;
                else c2++;
            }
            while (c0!=c || c1!=c || c2!=c) {
                count++;
                if (c0 < c) {
                    c0++;
                    c2--;
                }
                else if (c0 > c) {
                    c0--;
                    c1++;
                }

                else if (c1 < c) {
                    c1++;
                    c0--;
                }
                else if (c1 > c) {
                    c1--;
                    c2++;
                }

                else if (c2 < c) {
                    c2++;
                    c1--;
                }
                else if (c2 > c) {
                    c2--;
                    c0++;
                }
            }
            System.out.println(count);
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

