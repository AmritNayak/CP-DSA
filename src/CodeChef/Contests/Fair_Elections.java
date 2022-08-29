package CodeChef.Contests;

import java.util.Arrays;
import java.util.Scanner;

public class Fair_Elections {

    static int sum(int[] arr) {
        int sum = 0;
        for (int n: arr)
            sum += n;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] nVotes = new int[n];
            int[] mVotes = new int[m];
            for (int j = 0; j < n; j++)
                nVotes[j] = sc.nextInt();
            for (int k = 0; k < m; k++)
                mVotes[k] = sc.nextInt();
            Arrays.sort(nVotes);
            Arrays.sort(mVotes);
            int moves = 0, x = 0, y = m-1;
            while (sum(nVotes) <= sum(mVotes) && x < n && y < m) {
                int temp = nVotes[x];
                nVotes[x] = mVotes[y];
                mVotes[y] = temp;
                x++;
                y--;
                moves++;
            }
            if (sum(nVotes) <= sum(mVotes))
                moves = -1;
            System.out.println(moves);
        }
    }
}
