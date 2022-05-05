// S1 11051. 이항 계수 2 (https://www.acmicpc.net/problem/11051)

/* 모듈러 연산
(a + b) % m == ((a % m) + (b % m)) % m
(a * b) % m == ((a % m) * (b % m)) % m
*/

package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step13_08_11051 {

    private static final int div = 10007;

    static int factorial(int num) {
        if (num < 2) return 1;
        return (num * factorial(num - 1)) % div;
    }

    static int mod_inverse(int a, int p) {
        int ret = 1;
        while (p > 0) {
            if (p % 2 == 1) {
                ret *= a;
                p--;
                ret %= div;
            }
            a *= a;
            a %= div;
            p >>= 1;
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(
                (factorial(a) * mod_inverse((factorial(a - b) * factorial(b)) % div, div - 2)) % div);
    }
}
