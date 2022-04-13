// 10870. 피보나치 수 5 (https://www.acmicpc.net/problem/10870)

package baekjoon.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step09_02_10870 {

    static int fibonacci(int num) {

        if (num == 0) return 0;
        else if (num <= 2) return 1;
        else if (num == 3) return 2;
        return (fibonacci(num - 2) + fibonacci(num - 1));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }
}
