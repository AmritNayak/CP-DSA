package Codeforces.Problem_Set;

import java.util.Scanner;

public class LongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        String msg;
        for (int i=0; i<input; i++) {
            msg = sc.nextLine();
            if (msg.length()>10)
                msg = msg.charAt(0) +
                        Integer.toString(msg.length()-2) +
                        msg.charAt(msg.length() - 1);
            System.out.println(msg);
        }
    }
}
