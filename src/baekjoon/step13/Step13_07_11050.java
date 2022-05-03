// B1 11050. 이항 계수 1 (https://www.acmicpc.net/problem/11050)

package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step13_07_11050 {

    static int factorial(int num) {
        if (num < 2) return 1;
        return (num * factorial(num - 1));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(factorial(a) / (factorial(a - b) * factorial(b)));
    }
}
