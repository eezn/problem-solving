// S2 1541. 잃어버린 괄호 (https://www.acmicpc.net/problem/1541)

package baekjoon.step18_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1541 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        List<String> num = Arrays.asList(input.split("[^0-9]"));
        Queue<Character> operator = new LinkedList<>();

        for (char c : input.toCharArray()) {

            if (c == '+')
                operator.add('+');
            if (c == '-')
                operator.add('-');
        }

        char op;
        boolean minus = false;
        int answer = Integer.parseInt(num.get(0));

        for (int i = 1; i < num.size(); ++i) {
            op = operator.poll();
            if (op == '+' && !minus)
                answer += Integer.parseInt(num.get(i));
            if (op == '-' || minus) {
                answer -= Integer.parseInt(num.get(i));
                minus = true;
            }
        }

        System.out.println(answer);
    }
}
