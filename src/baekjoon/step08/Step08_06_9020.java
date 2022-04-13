// 9020. 골드바흐의 추측 (https://www.acmicpc.net/problem/9020)

package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Step08_06_9020 {

    final static int MAX_INPUT = 10000;

    static boolean isPrime(int num) {

        if (num == 1) return false;
        else if (num < 4) return true;
        else {
            for (int i = 2; i <= Math.sqrt(num); ++i)
                if (num % i == 0) return false;
            return true;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<String> results = new ArrayList<>();
        boolean[] prime = new boolean[MAX_INPUT + 1];

        for (int i = 2; i < MAX_INPUT + 1; ++i)
            if (isPrime(i)) prime[i] = true;

        while (n-- != 0) {

            int num = Integer.parseInt(br.readLine());
            if (num < 4) return;
            int left = num / 2;
            int right = num / 2;

            while (true) {
                if (prime[left] && prime[right]) {
                    results.add(left + " " + right);
                    break;
                }
                --left;
                ++right;
            }
        }

        for (String result : results)
            System.out.println(result);
    }
}
