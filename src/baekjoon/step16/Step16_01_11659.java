// S3 11659. 구간 합 구하기 4 (https://www.acmicpc.net/problem/11659)

package baekjoon.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step16_01_11659 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += Integer.parseInt(st.nextToken());
            arr[i] = sum;
        }

        for (int i = 0; i < m; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int answer = arr[end] - arr[start - 1];
            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}
