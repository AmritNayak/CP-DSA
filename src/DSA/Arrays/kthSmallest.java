package DSA.Arrays;

import java.util.Arrays;

public class kthSmallest {
    public static void main(String[] args) {
        int[] arr = {2,3,6,1,5,4,8,9,7};
        int k = 5;
        System.out.println(kth(arr, k));
    }

    static int kth(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[k-1];
    }
}
