package DSA.RecursionAndBacktracking;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int disks = 3;
        toh(disks, 'A', 'B', 'C');
    }

    static void toh(int disks, char tower1, char tower2, char tower3) {
        if (disks == 0)
            return;

        // move n-1 disks from tower1 to tower3 using tower2
        toh(disks-1, tower1, tower3, tower2);
        // print last disk from tower1 to tower2
        System.out.println("Move " + disks + ": " + tower1 + " -> " + tower2);
        // move n-1 disks from tower3 to tower2 using tower1
        toh(disks-1, tower3, tower2, tower1);
    }
}
