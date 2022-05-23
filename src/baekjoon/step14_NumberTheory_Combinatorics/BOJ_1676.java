// S4 1676. 펙토리얼 0의 개수 (https://www.acmicpc.net/problem/1676)

package baekjoon.step14_NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1676 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        while (n >= 5) {
            answer += n / 5;
            n /= 5;
        }

        System.out.println(answer);
    }
}
