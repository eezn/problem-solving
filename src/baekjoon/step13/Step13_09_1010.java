// S5 1010. 다리 놓기 (https://www.acmicpc.net/problem/1010)

package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step13_09_1010 {

    private static int[][] dp = new int[30][30];;

    private static int combination(int n, int r) {

        if (dp[n][r] > 0)
            return dp[n][r];
        if (n == r || r == 0)
            return dp[n][r] = 1;

        return combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < 30; ++i) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for (int i = 2; i < 30; ++i)
            for (int j = 1; j < 30; ++j)
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];

        while (n-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

//            sb.append(combination(b, a)).append('\n');
            sb.append(dp[b][a]).append('\n');
        }

        System.out.print(sb);
    }
}
