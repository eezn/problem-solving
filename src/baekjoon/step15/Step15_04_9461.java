// S3 9461. 파도반 수열 (https://www.acmicpc.net/problem/9461)

package baekjoon.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Step15_04_9461 {

    static int SIZE = 100;
    static long[] dp = new long[SIZE + 1];

    private static long padovan(Long n) {

        int idx = n.intValue();
        if (n < 4) return 1;
        if (dp[idx] == 0) dp[idx] = padovan(n - 3) + padovan(n - 2);
        return dp[idx];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Long> answer = new ArrayList<>();

        for (int i = 0; i < n; ++i)
            answer.add(Long.parseLong(br.readLine()));

        answer.forEach(e -> System.out.println(padovan(e)));
    }
}
