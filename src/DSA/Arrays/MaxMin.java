package DSA.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,1,8,9,4,7};
        minMax(arr);
    }

    static void minMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int e : arr) {
            if (e < min)
                min = e;
            if (e > max)
                max = e;
        }

        System.out.println("Max: " + max + "\nMin: " + min);
    }
}
