// 3009. 네 번째 점 (https://www.acmicpc.net/problem/3009)

package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step08_08 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] pool = new int[2][1001];
        int[] result = new int[2];

        for (int i = 0; i < 3; ++i) {
            st = new StringTokenizer(br.readLine());
            pool[0][Integer.parseInt(st.nextToken())]++;
            pool[1][Integer.parseInt(st.nextToken())]++;
        }

        for (int i = 1; i < 1001; ++i) {
            if (pool[0][i] == 1) result[0] = i;
            if (pool[1][i] == 1) result[1] = i;
        }

        System.out.println(result[0] + " " + result[1]);
    }
}
