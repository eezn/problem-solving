// S4 10828. 스택 (https://www.acmicpc.net/problem/10828)

package baekjoon.step19_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_10828 {

    private static Vector<Integer> stack = new Vector<>();
    private static int size = 0;
    private static final String[] method = {
            "push",
            "pop",
            "size",
            "empty",
            "top"
    };

    public static void push(int n) {
        stack.add(n);
        size++;
    }

    public static int pop() {
        if (size == 0)
            return -1;
        int ret = stack.get(--size);
        stack.remove(size);
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

    public static int top() {
        if (size == 0)
            return -1;
        else
            return stack.get(size - 1);
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
            for (idx = 0; idx < 5; ++idx)
                if (cmd.equals(method[idx])) break;

            switch (idx) {
                case 0: push(Integer.parseInt(st.nextToken())); break;
                case 1: sb.append(pop()).append('\n'); break;
                case 2: sb.append(size()).append('\n'); break;
                case 3: sb.append(empty()).append('\n'); break;
                case 4: sb.append(top()).append('\n'); break;
            }
        }

        System.out.print(sb);
    }
}
