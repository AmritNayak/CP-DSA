package DSA.RecursionAndBacktracking;

public class Check_Sorted {

    static boolean isSorted(int[] arr, int n) {
        if (n == 1)
            return true;
        if (arr[n-2] > arr[n-1])
            return false;
        return isSorted(arr, n-1);
    }

    public static void main(String[] args) {
//        int[] arr = {4, 8, 3, 7, 1, 2};
        int[] arr = {1, 2, 4, 5, 8, 9};
        System.out.println(isSorted(arr,arr.length));
    }
}
