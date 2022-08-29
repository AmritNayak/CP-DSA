package DSA.RecursionAndBacktracking;

import java.util.Arrays;

public class Array_Reverse {

    static int[] reverse(int[] arr, int left, int right) {
        if (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            reverse(arr, left + 1, right - 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,9,8,7};
        System.out.println(Arrays.toString(reverse(arr, 0, arr.length-1)));
    }
}
