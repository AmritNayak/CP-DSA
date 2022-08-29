package DSA.Arrays;

import java.util.Arrays;

public class MoveNegativeLeft {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        move(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void move(int[] arr, int n) {
        int idx = 0;
        for (int low = 0; low < n; low++) {
            if (arr[low] < 0) {
                swap(arr, low, idx);
                idx++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
