package CSES_Problem_Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weird_Algorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        while (n != 1) {
            System.out.print(n + " ");
            if ((n&1) == 1) n = n*3 + 1;
            else n /= 2;
        }
        System.out.print(1);
    }
}
