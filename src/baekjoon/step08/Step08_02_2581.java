// 2581. 소수 (https://www.acmicpc.net/problem/2581)

package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step08_02_2581 {

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

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int min = -1;
        int sum = 0;

        for (int i = m; i <= n; ++i) {

            if (isPrime(i)) {
                sum += i;
                if (min == -1) min = i;
            }
        }

        if (min == -1) System.out.println(min);
        else System.out.println(sum + "\n" + min);
    }
}
