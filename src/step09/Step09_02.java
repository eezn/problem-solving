// 10870. 피보나치 수 5 (https://www.acmicpc.net/problem/10870)

package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step09_02 {

    static int fibonacci(int num) {

        if (num == 0) return 0;
        if (num == 1) return 1;
        if (num == 2) return 1;
        if (num == 3) return 2;
        return (fibonacci(num - 2) + fibonacci(num - 1));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }
}
