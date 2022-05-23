// S2 11279. 최대 힙 (https://www.acmicpc.net/problem/11279)

package baekjoon.step23_PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_11279 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

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
