// S4 10866. 덱 (https://www.acmicpc.net/problem/10866)

package baekjoon.step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Step18_05_10866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        while (n-- > 0) {

            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "size": sb.append(deque.size()).append('\n'); break;
                case "push_front": deque.addFirst(Integer.parseInt(st.nextToken())); break;
                case "push_back": deque.addLast(Integer.parseInt(st.nextToken())); break;
                case "pop_front":
                    if (deque.isEmpty()) sb.append("-1\n");
                    else sb.append(deque.pollFirst()).append('\n');
                    break;
                case "pop_back":
                    if (deque.isEmpty()) sb.append("-1\n");
                    else sb.append(deque.pollLast()).append('\n');
                    break;
                case "empty":
                    if (deque.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "front":
                    if (deque.isEmpty()) sb.append("-1\n");
                    else sb.append(deque.peekFirst()).append('\n');
                    break;
                case "back":
                    if (deque.isEmpty()) sb.append("-1\n");
                    else sb.append(deque.peekLast()).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }
}
