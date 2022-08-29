package CodeChef.Contests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Frog_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int jumps = 0;
            int n = sc.nextInt();
            ArrayList<Integer> w = new ArrayList<>();
            int[] l = new int[n];
            HashMap<Integer, Integer> pos = new HashMap<>();
            for (int i=0; i<n; i++)
                w.add(sc.nextInt());
            for (int i=0; i<n; i++)
                l[i] = sc.nextInt();
            for (int i=1; i<=n; i++)
                pos.put(i,w.indexOf(i));
            int temp;
            for (int i=2; i<=n; i++) {
                int b = pos.get(i);
                int a = pos.get(i-1);
                temp = 0;
                if (b <= a)
                    temp = (a-b) / l[b] + 1;
                jumps += temp;
                pos.put(i, pos.get(i)+temp*l[b]);
            }
            System.out.println(jumps);
        }
    }
}
