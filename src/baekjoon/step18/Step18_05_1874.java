// S3 1874. 스택 수열 (https://www.acmicpc.net/problem/1874)

package baekjoon.step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Step18_05_1874 {

    static StringBuilder sb = new StringBuilder();
    static Stack<Integer> stack = new Stack<>();

    private static void push(int i) {
        sb.append("+\n");
        stack.push(i);
    }

    private static int pop() {
        sb.append("-\n");
        return stack.pop();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] target = new int[n];

        for (int i = 0; i < n; ++i)
            target[i] = Integer.parseInt(br.readLine());

        int idx = 0;

        for (int i = 1; i < n + 1; ++i) {
            push(i);
            while (!stack.isEmpty()) {
                if (stack.peek() == target[idx]) {
                    pop();
                    idx++;
                } else break;
            }
        }

        if (!stack.isEmpty())
            System.out.println("NO");
        else
            System.out.print(sb);
    }
}
