package CodeChef.Contests;

import java.util.*;

public class Watching_CPL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int T = 0; T < t; T++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] N = new int[n];
            for (int i = 0; i < n; i++) {
                N[i] = sc.nextInt();
            }
            Arrays.sort(N);
            LinkedHashSet<Integer> H1 = new LinkedHashSet<>();
            int boxes = -1;
            int sum = N[n-1];
            H1.add(sum);
            for (int j = n-2; j >= 0; j--) {
                sum += N[j];
                LinkedHashSet<Integer> H2 = new LinkedHashSet<>();
                for (int z : H1) {
                    H2.add(z);
                    H2.add(N[j]);
                    H2.add(z + N[j]);
                    if ((z + N[j] >= k) && ((sum - z - N[j]) >= k)) {
                        boxes = n - j;
                        break;
                    }
                    if ((N[j] >= k) && ((sum - N[j]) >= k)) {
                        boxes = n - j;
                        break;
                    }
                }
                if (boxes != -1)
                    break;
                H1 = H2;
            }
            System.out.println(boxes);
        }
    }
}
