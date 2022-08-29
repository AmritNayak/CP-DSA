package DSA.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(find(arr, arr.length));
    }

    static int find(int[] arr, int n) {
//        sum of n-1 terms
        int sum = (n-1) * n / 2;
        int arrSum = 0;
        for (int e: arr)
            arrSum += e;
        return arrSum - sum;
    }
}
