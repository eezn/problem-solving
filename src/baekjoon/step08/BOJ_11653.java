// 11653. 소인수분해 (https://www.acmicpc.net/problem/11653)

package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11653 {

    static boolean isPrime(int num) {

        if (num == 1) return false;
        else if (num < 4) return true;
        else {
            int i = 2;
            while (i <= Math.sqrt(num))
                if (num % i++ == 0) return false;
            return true;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int prime = 2;

        if (isPrime(n)) System.out.println(n);
        else {
            while (true) {
                if (n == 1) return;
                while (n % prime == 0) {
                    System.out.println(prime);
                    n /= prime;
                }
                ++prime;
            }
        }
    }
}
