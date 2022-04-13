// 2839. 설탕 배달 (https://www.acmicpc.net/problem/2839)

package baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step07_07_2839 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = -1;
        int div = n / 5;
        int mod = n % 5;

        if (mod == 3) result = div + 1;
        else {
            while (mod % 3 != 0 && div > 0) {
                div -= 1;
                mod += 5;
            }
            if (mod % 3 == 0) result = div + mod / 3;
        }

        System.out.println(result);
    }
}
