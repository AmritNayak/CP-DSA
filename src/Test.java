import BulaBuli.Animal;
import BulaBuli.Cat;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Test ob = new Test();
        int[] arr = {1,1,1};
        System.out.println(ob.avgDiff(3, arr));
    }

   public double avgDiff(int input1, int[] input2) {
       long total = 0L;
       for (int i : input2)
           total += i;
        ArrayList<Long> res = new ArrayList<>();
        solve(input1, input2, 0, 0, total, res);
        long s = 0L;
        for (long i : res)
            s += i;
        return (s / 2.0) / input1;
   }

   public void solve(int x, int[] arr, int i, long sum, long total, ArrayList<Long> res) {
        if (i == x) {
            if (!(sum == 0 || sum == total)) {
                res.add(Math.abs(total - 2 * sum));
            }
            return;
        }
        solve(x, arr, i+1, sum, total, res);
        solve(x, arr, i+1, sum + arr[i], total, res);
   }

}
