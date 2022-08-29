package DSA.Arrays;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//        4, -1, -2, 1, 5
        System.out.println(kadane(arr, arr.length));
    }

    static int kadane(int[] arr, int n) {
        int temp = 0;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            temp = Math.max(arr[i], temp + arr[i]);
            max = Math.max(max, temp);
        }
        return max;
    }
}
