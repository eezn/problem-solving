// S4 4949. 균형잡힌 세상 (https://www.acmicpc.net/problem/4949)

package baekjoon.step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Step18_04_4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            char[] str = br.readLine().toCharArray();
            if (str[0] == '.' && str.length == 1)
                break;

            Stack<Character> brakets = new Stack<>();
            boolean isBalanced = true;

            int i = -1;
            while (str[++i] != '.') {

                if (str[i] == '(' || str[i] == '[') {
                    brakets.add(str[i]);
                } else if (str[i] == ')') {
                    if (brakets.isEmpty() || brakets.peek() != '(') {
                        isBalanced = false;
                        break;
                    }
                    brakets.pop();
                } else if (str[i] == ']') {
                    if (brakets.isEmpty() || brakets.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    brakets.pop();
                }
            }

            if (!brakets.isEmpty())
                isBalanced = false;

            if (isBalanced)
                sb.append("yes\n");
            else
                sb.append("no\n");
        }

        System.out.println(sb);
    }
}
