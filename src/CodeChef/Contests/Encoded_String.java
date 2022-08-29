package CodeChef.Contests;

import java.util.Scanner;

public class Encoded_String {

    static final char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            StringBuilder res = new StringBuilder();
            String s = sc.nextLine();
            for (int j = 0; j < n; j += 4) {
                int d = Integer.parseInt(s.substring(j,j+4),2);
                res.append(alphabets[d]);
            }
            System.out.println(res.toString());
        }
    }
}
