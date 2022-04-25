// G2 1655. 가운데를 말해요 (https://www.acmicpc.net/problem/1655)

package baekjoon.step22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Step22_04_1655 {

    static PriorityQueue<Integer> upper = new PriorityQueue<>(Comparator.naturalOrder());  // Min Heap
    static PriorityQueue<Integer> lower = new PriorityQueue<>(Comparator.reverseOrder());  // Max Heap

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; ++i) {

            if (upper.size() == lower.size())
                lower.add(Integer.parseInt(br.readLine()));
            else
                upper.add(Integer.parseInt(br.readLine()));

            if (!upper.isEmpty() && !lower.isEmpty() && upper.peek() < lower.peek()) {
                int temp = upper.poll();
                upper.offer(lower.poll());
                lower.offer(temp);
            }

            sb.append(lower.peek()).append('\n');
        }

        System.out.print(sb);
    }
}
