// S4 10773. 제로 (https://www.acmicpc.net/problem/10773)

package baekjoon.step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Step18_02_10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input, n = Integer.parseInt(br.readLine());
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; ++i) {
            answer += input = Integer.parseInt(br.readLine());
            if (input != 0)
                stack.add(input);
            else
                answer -= stack.pop();
        }

        System.out.println(answer);
    }
}
