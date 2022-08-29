package DSA.Mathematics;

import java.util.Scanner;

public class Sieve_of_Eratosthenes {

    static void all_primes_till_N(int N) {
        // size = N+1 cuz primes till N (inclusive)
        boolean[] prime = new boolean[N+1];     // all values false
        for (int i=2; i*i<=N; i++) {
            if (!prime[i]) {
                for (int j=i*i; j<=N; j+=i)
                    // set prime[j] not prime
                    prime[j] = true;
            }
        }
        for (int i=2; i<=N; i++)
            if (!prime[i])
                System.out.print(i + " ");
    }

    public static void main(String[] args) {
        // use FastReader
        // FastReader sc = new FastReader();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        all_primes_till_N(n);
    }
}
