// S3 11399. ATM (https://www.acmicpc.net/problem/11399)

package baekjoon.step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step17_03_11399 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] waitPerPerson = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; ++i)
            waitPerPerson[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(waitPerPerson);

        int total = 0;
        int delay = 0;
        for (int i = 0; i < n; ++i) {
            delay += waitPerPerson[i];
            total += delay;
        }

        System.out.println(total);
    }
}
