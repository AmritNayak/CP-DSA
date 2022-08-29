package DSA.Arrays;

import java.util.Arrays;

public class RotateOne {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        rotate(arr, arr.length);
    }

    static void rotate(int[] arr, int n) {
        int temp = arr[n-1];
        for (int i=n-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
