package CodeChef.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ProblemDifficulties {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while (t-- != 0) {
            int[] nums = new int[4];
            for (int i = 0; i < 4; i++)
                nums[i] = sc.nextInt();

            int[] freq = new int[11];
            for (int x : nums)
                freq[x]++;

            System.out.println(Arrays.toString(freq));
            System.out.println(solve(nums, freq));
        }
    }

    static int solve(int[] nums, int[] freq) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums)
            set.add(x);

        int n = set.size();
        if (n == 1)
            return 0;
        else if (n == 2) {
            for (int x : set) {
                if (freq[x] == 2)
                    return 2;
            }
            return 1;
        }
        return 2;
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
