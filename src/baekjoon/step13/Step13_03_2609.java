// S5 2609. 최대공약수와 최소공배수 (https://www.acmicpc.net/problem/2609)

package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step13_03_2609 {

    private static int gcd(int a, int b) {

        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = gcd(a, b);
        int lcm = a * b / gcd;

        System.out.println(gcd + "\n" + lcm);
    }
}
