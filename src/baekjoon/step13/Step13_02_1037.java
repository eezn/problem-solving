// S5 1037. 약수 (https://www.acmicpc.net/problem/1037)

package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step13_02_1037 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; ++i) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp < min) min = temp;
            if (temp > max) max = temp;
        }

        System.out.println(min * max);
    }
}
