// S1 11286. 절댓값 힙 (https://www.acmicpc.net/problem/11286)

package baekjoon.step22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

import static java.lang.Math.abs;

public class Step22_03_11286 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) ->
                abs(o1) == abs(o2) ? Integer.compare(o1, o2) : Integer.compare(abs(o1), abs(o2)));

        for (int i = 0; i < n; ++i) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0) {
                if (!pq.isEmpty()) { sb.append(pq.poll()); }
                else { sb.append(0); }
                sb.append('\n');
            } else { pq.add(temp); }
        }

        System.out.print(sb);
    }
}
