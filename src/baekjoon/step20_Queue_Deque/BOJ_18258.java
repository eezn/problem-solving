// S4 18258. 큐 2 (https://www.acmicpc.net/problem/18258)

package baekjoon.step20_Queue_Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_18258 {

    private static LinkedList<Integer> queue = new LinkedList<>();
    private static int size = 0;
    private static final String[] method = {
            "push",
            "pop",
            "size",
            "empty",
            "front",
            "back"
    };

    public static void push(int n) {
        queue.add(n);
        size++;
    }

    public static int pop() {
        if (size == 0)
            return -1;
        int ret = queue.get(0);
        queue.remove(0);
        size--;
        return ret;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0)
            return 1;
        return 0;
    }

    public static int front() {
        if (size == 0)
            return -1;
        return queue.get(0);
    }

    public static int back() {
        if (size == 0)
            return -1;
        return queue.get(size - 1);
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; ++i) {

            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            int idx;
            for (idx = 0; idx < method.length; ++idx)
                if (cmd.equals(method[idx])) break;

            switch (idx) {
                case 0: push(Integer.parseInt(st.nextToken())); break;
                case 1: sb.append(pop()).append('\n'); break;
                case 2: sb.append(size()).append('\n'); break;
                case 3: sb.append(empty()).append('\n'); break;
                case 4: sb.append(front()).append('\n'); break;
                case 5: sb.append(back()).append('\n'); break;
            }
        }

        System.out.println(sb);
    }
}
