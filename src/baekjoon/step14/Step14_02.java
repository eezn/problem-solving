// S2 9184. 피보나치 함수 (https://www.acmicpc.net/problem/9184)

package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step14_02 {

    static int[][][] dp = new int[51][51][51];

    private static int w(int a, int b, int c) {

        int ret;

        if (a > 0 && b > 0 && c > 0 && dp[a][b][c] != 0)
            ret = dp[a][b][c];
        else {
            if (a <= 0 || b <= 0 || c <= 0)
                ret = 1;
            else if (a > 20 || b > 20 || c > 20)
                ret = w(20, 20, 20);
            else if (a < b && b < c)
                ret = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
            else
                ret = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }

        if (a > 0 && b > 0 && c > 0)
            dp[a][b][c] = ret;
        return ret;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        ArrayList<StringBuilder> answer = new ArrayList<>();
        int[] input = new int[3];

        while (true) {

            st = new StringTokenizer(br.readLine(), " ");
            sb = new StringBuilder();

            input[0] = Integer.parseInt(st.nextToken());
            input[1] = Integer.parseInt(st.nextToken());
            input[2] = Integer.parseInt(st.nextToken());

            if (input[0] == -1 && input[1] == -1 && input[2] == -1)
                break;

            sb.append("w(")
                    .append(input[0]).append(", ")
                    .append(input[1]).append(", ")
                    .append(input[2]).append(") = ")
                    .append(w(input[0], input[1], input[2])).append("\n");

            answer.add(sb);
        }

        answer.forEach(System.out::print);
    }
}
