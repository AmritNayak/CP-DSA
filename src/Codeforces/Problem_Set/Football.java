package Codeforces.Problem_Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Football {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        boolean flag = false;
        for (int i=0; i<n-1; i++) {
            int count = 1;
            for (int j=i+1; j<n; j++) {
                if (s.charAt(i) != s.charAt(j))
                    break;
                else
                    count++;
                if (count == 7) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        System.out.println(flag ? "YES" : "NO");
    }
}
