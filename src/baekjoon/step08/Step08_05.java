// 4948. 베르트랑 공준 (https://www.acmicpc.net/problem/4948)

package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Step08_05 {

    final static int MAX_INPUT = 123456;

    static boolean isPrime(int num) {

        if (num == 1) return false;
        else if (num < 4) return true;
        else {
            for (int i = 2; i <= Math.sqrt(num); ++i)
                if (num % i == 0) return false;
            return true;
        }
    }

    static void sol_001() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> results = new ArrayList<>();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int count = 0;

            for (int i = n + 1; i < n * 2 + 1; ++i)
                if (isPrime(i)) ++count;
            results.add(count);
        }

        for (int result : results)
            System.out.println(result);
    }

    static void sol_002() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> results = new ArrayList<>();
        boolean[] prime = new boolean[MAX_INPUT * 2 + 1];
        for (int i = 2; i < MAX_INPUT * 2 + 1; ++i)
            if (isPrime(i)) prime[i] = true;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int count = 0;

            for (int i = n + 1; i < n * 2 + 1; ++i)
                if (prime[i]) ++count;
            results.add(count);
        }

        for (int result : results)
            System.out.println(result);
    }

    public static void main(String[] args) throws IOException {

//        sol_001();
        sol_002();
    }
}
