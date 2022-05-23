// 8393. 합 (https://www.acmicpc.net/problem/8393)

package baekjoon.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8393 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int endPoint = Integer.parseInt(br.readLine());
        int sum = ((endPoint + 1) * endPoint) / 2;

        System.out.println(sum);
    }
}
