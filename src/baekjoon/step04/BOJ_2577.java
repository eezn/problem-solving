// 2577. 숫자의 개수 (https://www.acmicpc.net/problem/2577)

package baekjoon.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] digits = new int[10];
        int[] inputs = new int[3];
        long num = 1;

        for (int input : inputs)
            num *= Integer.parseInt(br.readLine());

        while (num != 0) {
            digits[(int)num % 10] += 1;
            num /= 10;
        }

        for (int digit : digits)
            System.out.println(digit);
    }
}
