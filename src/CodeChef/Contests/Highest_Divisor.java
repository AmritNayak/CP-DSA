package CodeChef.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Highest_Divisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i;
        for (i=10; i>0; i--) {
            if (n % i == 0)
                break;
        }
        System.out.println(i);
    }
}
