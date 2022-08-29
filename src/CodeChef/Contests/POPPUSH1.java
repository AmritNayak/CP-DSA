package CodeChef.Contests;

import java.util.HashSet;
import java.util.Scanner;

public class POPPUSH1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> p = new HashSet<>();
        int days = 0;
        for (int i=0; i<n; i++) {
            int n1 = sc.nextInt();
            if (p.contains(n1)) {
                p.remove(n1);
                days++;
            }
            else
                p.add(n1);
        }
        days += p.size();
        System.out.println(days);
    }

}
