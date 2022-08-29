package Codeforces.Problem_Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word_Capitalization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c = s.charAt(0);
        if (c >= 97 && c <= 122)
            c = (char) (c - 32);
        System.out.println(c + s.substring(1));
    }
}
