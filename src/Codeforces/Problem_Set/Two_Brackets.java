package Codeforces.Problem_Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Two_Brackets {

    static int total(char[] s) {
        int count = 0;
        Stack<Character> b1 = new Stack<>();
        Stack<Character> b2 = new Stack<>();
        for (char c: s) {
            if (c == ')' && !b1.isEmpty()) {
                if (b1.peek() == '(') {
                    b1.pop();
                    count++;
                }
            }
            else if (c == ']' && !b2.isEmpty()) {
                if (b2.peek() == '[') {
                    b2.pop();
                    count++;
                }
            }
            else if (c == '(') b1.push(c);
            else if (c == '[') b2.push(c);
        }
        return count;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            System.out.println(total(sc.nextLine().toCharArray()));
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
