package CodeChef.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class CHEF_AND_STRINGS {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            long count = 0;
            char[] s1 = sc.nextLine().toCharArray();
            HashSet<Character> set1 = new HashSet<>();
            for (char c: s1)
                set1.add(c);
            char[] s2 = sc.nextLine().toCharArray();
            HashSet<Character> set2 = new HashSet<>();
            for (char c: s2)
                set2.add(c);
            int l = set1.size(), m = set2.size();
            Iterator<Character> i1 = set1.iterator();
            while (i1.hasNext()) {
                char c = i1.next();
                if (!set2.contains(c)) count++;
            }
            Iterator<Character> i2 = set2.iterator();
            while (i2.hasNext()) {
                char c = i2.next();
                if (!set1.contains(c)) count++;
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
