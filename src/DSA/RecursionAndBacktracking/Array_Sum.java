package DSA.RecursionAndBacktracking;

public class Array_Sum {

    static int arraySum(int[] arr, int n) {
        if (n == 0)
            return 0;
        return arraySum(arr,n-1) + arr[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {2,6,4,3,7};
        System.out.println(arraySum(arr, arr.length));
    }
}
