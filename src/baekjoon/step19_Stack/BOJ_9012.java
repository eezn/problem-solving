// S4 9012. 괄호 (https://www.acmicpc.net/problem/9012)

package baekjoon.step19_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; ++i) {

            boolean isVPS = true;
            Stack<Character> stack = new Stack<>();

            char[] PS = br.readLine().toCharArray();

            for (char P : PS) {
                if (P == '(')
                    stack.add('(');
                else {
                    if (stack.size() == 0) {
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (stack.size() != 0)
                isVPS = false;

            if (isVPS)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }

        System.out.print(sb);
    }
}
