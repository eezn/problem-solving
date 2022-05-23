// B3 5086. 배수와 약수 (https://www.acmicpc.net/problem/5086)

package baekjoon.step14_NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5086 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0)
                break;

            if (a <= b && b % a == 0) sb.append("factor");
            else if (a >= b && a % b == 0) sb.append("multiple");
            else sb.append("neither");
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
