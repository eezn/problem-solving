// S3 1904. 01타일 (https://www.acmicpc.net/problem/1904)

package baekjoon.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step15_03_1904 {

    static int SIZE = 1000000;
    static int[] dp = new int[SIZE + 1];

    private static int fib(int num) {

        if (num == 0) return 0;
        if (num == 1) return 1;
        if (num == 2) return 2;
        
        if (dp[num] == 0)
            dp[num] = (fib(num - 2) + fib(num - 1)) % 15746;

        return dp[num];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(fib(Integer.parseInt(br.readLine())));
    }
}
