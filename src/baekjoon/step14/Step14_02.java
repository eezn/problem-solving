// S2 9184. 신나는 함수 실행 (https://www.acmicpc.net/problem/9184)

package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step14_02 {

    static int[][][] dp = new int[51][51][51];

    private static int w(int a, int b, int c) {

        if (a > 0 && b > 0 && c > 0 && dp[a][b][c] != 0)
            return dp[a][b][c];

        if (a <= 0 || b <= 0 || c <= 0)
            return 1;
        if (a > 20 || b > 20 || c > 20)
            return w(20, 20, 20);

        if (a < b && b < c)
            dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        else
            dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);

        return dp[a][b][c];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        ArrayList<StringBuilder> answer = new ArrayList<>();
        int a, b, c;
        String temp;

        while (true) {

            temp = br.readLine();
            if (temp.equals("-1 -1 -1"))
                break;

            st = new StringTokenizer(temp, " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            sb = new StringBuilder();
            sb.append("w(")
                    .append(a).append(", ")
                    .append(b).append(", ")
                    .append(c).append(") = ")
                    .append(w(a, b, c)).append("\n");

            answer.add(sb);
        }

        answer.forEach(System.out::print);
    }
}
