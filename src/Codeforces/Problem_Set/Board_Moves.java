package Codeforces.Problem_Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Board_Moves {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            long sqSum = 0;
            for (int i=1; i<=n/2; i++)
                sqSum += (long) i * i;
            System.out.println(sqSum * 8);
        }
    }
}
