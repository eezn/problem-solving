// S1 1149. RGB거리 (https://www.acmicpc.net/problem/1149)

package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step14_05 {

    static int n;
    static int[][] cost;
    static int[][] dp;

    static final int R = 0;
    static final int G = 1;
    static final int B = 2;

    private static int rgb(int i, int color) {

        if (dp[i][color] == 0) {
            if (color == R) // call G, B
                dp[i][R] = cost[i][R] + Math.min(rgb(i - 1, G), rgb(i - 1, B));
            if (color == G) // call R, B
                dp[i][G] = cost[i][G] + Math.min(rgb(i - 1, R), rgb(i - 1, B));
            if (color == B) // call R, G
                dp[i][B] = cost[i][B] + Math.min(rgb(i - 1, R), rgb(i - 1, G));
        }
        return dp[i][color];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        cost = new int[n][3];
        dp = new int[n][3];

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 3; ++j)
                cost[i][j] = Integer.parseInt(st.nextToken());
        }

        dp[0][R] = cost[0][R];
        dp[0][G] = cost[0][G];
        dp[0][B] = cost[0][B];

        for (int i = 1; i < n; ++i) {
            rgb(i, R);
            rgb(i, G);
            rgb(i, B);
        }

        for (int i = 0; i < 3; ++i)
            answer = Math.min(answer, dp[n - 1][i]);
        System.out.println(answer);
    }
}
