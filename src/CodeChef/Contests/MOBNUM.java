package CodeChef.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MOBNUM {

    static final String DIGITS = "0123456789";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String s = br.readLine();
            int n = s.length();
            if (n != 10)
                System.out.println("NO");
            else {
                if (!DIGITS.substring(1).contains(String.valueOf(s.charAt(0))))
                    System.out.println("NO");
                else {
                    boolean isNum = true;
                    for (int i=1; i<n; i++) {
                        if (!DIGITS.contains(String.valueOf(s.charAt(i)))) {
                            isNum = false;
                            break;
                        }
                    }
                    System.out.println(isNum ? "YES" : "NO");
                }
            }
        }
    }
}
