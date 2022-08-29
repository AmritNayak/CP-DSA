package BulaBuli;

import java.util.Scanner;

public class FunctionsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 7, n2 = 10;
//        System.out.println(isPrime(n1));
        System.out.println(isPrime(n2));
    }

    static boolean isPrime(int a) {
        for (int i=2; i<a; i++) {
            if (a % i == 0)
                return false;
        }
        System.out.println("test");
        return true;
    }

    // <access modifier> <return type> <name> ( < args > ) {  }
    static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    static void print10times() {
        for (int i=0; i<10; i++) {
            System.out.println("hello");
        }
    }
    /*
    str1 = racecar
    str2 = carerc

    int[] arr1 = new int[26]
    2,0,2,0,1,0,...........2
    for (int i = 0 to str1.length) {
        char c = str1.charAt(i);
        int temp = c - 'a';
        arr1[temp] = arr1 + 1;
    }

    arr1 = {2, 0, 2, ............}
    arr2 = {1, 0, 2, ...........}

    for (i = 0 to 26)
        arr1[i] != arr2[i]
            return false

     return true



     */
}
