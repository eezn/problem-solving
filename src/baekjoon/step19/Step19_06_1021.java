// S4 1021. 회전하는 큐 (https://www.acmicpc.net/problem/1021)

package baekjoon.step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Step19_06_1021 {

    private static LinkedList<Integer> deque = new LinkedList<>();

    private static void rotate() {
        if (!deque.isEmpty())
            deque.addLast(deque.pollFirst());
    }

    private static void rrotate() {
        if (!deque.isEmpty())
            deque.addFirst(deque.pollLast());
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        Queue<Integer> target = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; ++i)
            target.add(Integer.parseInt(st.nextToken()));
        for (int i = 1; i < size + 1; ++i)
            deque.addLast(i);

        int answer = 0;

        for (int i = 0; i < n; ++i) {
            int curr = target.poll();

            if (deque.indexOf(curr) <= size / 2) {
                while (deque.peekFirst() != curr) {
                    rotate();
                    answer++;
                }
            } else {
                while (deque.peekFirst() != curr) {
                    rrotate();
                    answer++;
                }
            }

            deque.pollFirst();
            size--;
        }

        System.out.println(answer);
    }
}
