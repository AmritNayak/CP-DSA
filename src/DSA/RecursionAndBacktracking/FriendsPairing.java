package DSA.RecursionAndBacktracking;

import java.util.Scanner;

public class FriendsPairing {

    static int numberOfWays(int n) {    // n number of friends
        if (n == 1) return 1;   // 1 person can go in 1 way (alone)
        if (n == 2) return 2;   // 2 friends can go in 2 ways -> {(A), (B)}, {(A,B)}
        // let f(n) = no. of ways n friends can go to the party
        // CASE 1: lets say among n friends, n1 chooses to go alone, then we can ignore n1 and f(n) = f(n-1)
        // CASE 2: now if n1 chooses to make a pair, it can make (n-1) number of pairs
        // and the remaining will form f(n-2) ways -> f(n) = (n-1) * f(n-2)
        return numberOfWays(n-1) + (n-1) * numberOfWays(n-2);
    }

    static void friendsPairing(int i, int n, boolean[] used, String res) {
        if (i > n) {
            System.out.println(res);
            return;
        }

        if (used[i]) {
            friendsPairing(i + 1, n, used, res);
        } else {
            // i will go alone
            used[i] = true;
            friendsPairing(i + 1, n, used, res + "(" + i + ") ");

            // i wll make pair with friends after i to ignore permutations, 12 is same as 21
            for (int j = i + 1; j <= n; j++) {
                if (!used[j]) {
                    used[j] = true;
                    friendsPairing(i + 1, n, used, res + "(" + i + j + ") ");
                    used[j] = false;
                }
            }
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        System.out.println(numberOfWays(friends));

        boolean[] used = new boolean[friends+1];
        friendsPairing(1, friends, used, "");
    }
}
