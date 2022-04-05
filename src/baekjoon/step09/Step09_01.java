// 10872. 펙토리얼 (https://www.acmicpc.net/problem/10872)

package baekjoon.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step09_01 {

    static int factorial(int num) {

        if (num < 2) return 1;
        return (num * factorial(num - 1));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(n));
    }
}
