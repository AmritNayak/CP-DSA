package CodeChef.Contests;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Prime_Game {

//    static boolean isPrime(int x) {
//        int y = (int)Math.sqrt(x);
//        for (int i=2; i<=y; i++) {
//            if (x % i == 0)
//                return false;
//        }
//        return true;
//    }
//
//    static boolean countPrimes(int x, int y) {
//        int count = 0;
//        for (int i=2; i<=x; i++) {
//            if (isPrime(i))
//                count++;
//            if (count > y)
//                return false;
//        }
//        return true;
//    }

    static int N = 1000005;
    static long[] result = new long[N];

    static void checkPrimesCount() {
        boolean[] primes = new boolean[N];
        long count = 0;
        for (long i=2; i*i<N; i++) {
            if (!primes[(int)i]) {
                for (long j=i*i; j<N; j+=i)
                    primes[(int)j] = true;
            }
        }
        for (int i=2; i<N; i++) {
            if (!primes[i])
                count++;
            result[i] = count;
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        checkPrimesCount();
//        int t = Integer.parseInt(br.readLine());
        int t = sc.nextInt();
        while (t-- != 0) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.print(result[x] <= y ? "Chef\n" : "Divyam\n");
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
