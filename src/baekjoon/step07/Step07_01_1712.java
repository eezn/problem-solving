// 1712. 손익분기점 (https://www.acmicpc.net/problem/1712)

package baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step07_01_1712 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] input = new int[3];

        for (int i = 0; i < 3; ++i)
             input[i] = Integer.parseInt(st.nextToken());

        if (input[1] >= input[2]) System.out.println(-1);
        else System.out.println(input[0] / (input[2] - input[1]) + 1);
    }
}
