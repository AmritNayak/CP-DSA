package DSA.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            swap(arr, i, n - i - 1);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
