// S3 2559. 수열 (https://www.acmicpc.net/problem/2559)

package baekjoon.step17_PrefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2559 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        int[] sum = new int[n + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i == 1)
                sum[i] = arr[i];
            else
                sum[i] = sum[i - 1] + arr[i];
        }

        int max = Integer.MIN_VALUE;
        for (int i = size; i <= n; ++i)
            max = Math.max(max, sum[i] - sum[i - size]);

        System.out.println(max);
    }
}
