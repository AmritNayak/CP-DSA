package CodeChef.Practice_and_Learn;

import java.util.HashSet;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Integer> P = new HashSet<>();
        HashSet<Integer> H = new HashSet<>();
        HashSet<Integer> K = new HashSet<>();
        HashSet<Integer> T = new HashSet<>();
        boolean f = false;
        for (int i=0; i<s.length()-2; i+=3) {
            String s1 = s.substring(i,i+3);
            char c = s1.charAt(0);
            int x = Integer.parseInt(s1.substring(1));
            if (c == 'P') {
                if (P.contains(x)) {
                    f = true;
                    break;
                }
                else
                    P.add(x);
            }
            else if (c == 'K') {
                if (K.contains(x)) {
                    f = true;
                    break;
                }
                else
                    K.add(x);
            }
            else if (c == 'H') {
                if (H.contains(x)) {
                    f = true;
                    break;
                }
                else
                    H.add(x);
            }

            else {
                if (T.contains(x)) {
                    f = true;
                    break;
                }
                else
                    T.add(x);
            }
        }
        if (f)
            System.out.println("ERROR");
        else {
            System.out.println((13-P.size()) + " " + (13-K.size()) + " " + (13-H.size()) + " " + (13-T.size()) + " ");
        }
    }
}
