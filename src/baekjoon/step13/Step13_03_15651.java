// 15651. N과 M (3) (https://www.acmicpc.net/problem/15651)

package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step13_03_15651 {

    static int n, m;
    static int[] sequence;
    static StringBuilder sb = new StringBuilder();

    private static void recursion(int level) {

        if (level == m) {
            for (int term : sequence)
                sb.append(term).append(' ');
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; ++i) {
            sequence[level] = i + 1;
            recursion(level + 1);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        sequence = new int[m];

        recursion(0);
        System.out.print(sb);
    }
}
