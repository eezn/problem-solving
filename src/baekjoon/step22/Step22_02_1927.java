// S2 1927. 최소 힙 (https://www.acmicpc.net/problem/1927)

package baekjoon.step22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Step22_02_1927 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

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
