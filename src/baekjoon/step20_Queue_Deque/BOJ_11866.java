// S4 11866. 요세푸스 문제 0 (https://www.acmicpc.net/problem/11866)

package baekjoon.step20_Queue_Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < n + 1; ++i)
            queue.add(i);

        sb.append("<");
        int interval = k;

        while (!queue.isEmpty()) {
            interval--;
            if (interval == 0) {
                sb.append(queue.poll());
                if (!queue.isEmpty())
                    sb.append(", ");
                interval = k;
            } else {
                queue.add(queue.poll());
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
