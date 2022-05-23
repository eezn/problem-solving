// S3 3036. 링 (https://www.acmicpc.net/problem/3036)

package baekjoon.step14_NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3036 {

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int main = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; ++i) {

            int temp = Integer.parseInt(st.nextToken());
            int lcm = main * temp / gcd(main, temp);

            sb.append(lcm / temp).append('/');
            sb.append(lcm / main).append('\n');
        }

        System.out.print(sb);
    }
}
