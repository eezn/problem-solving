// 15649. N과 M (1) (https://www.acmicpc.net/problem/15649)

package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step13_01_15649 {

    static int n, m;
    static boolean[] visit;
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
            if (!visit[i]) {
                visit[i] = true;
                sequence[level] = i + 1;
                recursion(level + 1);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visit = new boolean[n];
        sequence = new int[m];

        recursion(0);
        System.out.print(sb);
    }
}
