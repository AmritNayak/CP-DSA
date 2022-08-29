package CSES_Problem_Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        long max = 1, temp = 1;
        for (int i=1; i<n; i++) {
            if (s.charAt(i) == s.charAt(i-1))
                temp++;
            else {
                max = Math.max(max, temp);
                temp = 1;
            }
        }
        System.out.println(Math.max(max, temp));
    }
}
