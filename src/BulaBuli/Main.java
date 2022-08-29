package BulaBuli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] arr = {9,2,3,1,4};
        System.out.println(solve(arr));
    }

    static List<Integer> solve(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int i= arr.length-2; i>=0; i-=2) {
            res.add(arr[i]);
        }
        for (int i=arr.length % 2 == 0 ? 1 : 0; i<arr.length; i+=2) {
            res.add(arr[i]);
        }
        return res;
    }


    public void helper_function() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), k=1;
        long res = 0L;
        while (k < l) {
            if (l % k == 0)
                res += l / k;
            k++;
        }
        System.out.println(res);
    }
}
