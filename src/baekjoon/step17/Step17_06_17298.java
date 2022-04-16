// G4 17298. 오큰수 (https://www.acmicpc.net/problem/17298)

package baekjoon.step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Step17_06_17298 {

    // 시간 초과
    public static void sol_001() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; ++i)
            input[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; ++i) {
            int result = -1;
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = i; j < n; ++j) {
                if (input[i] < input[j])
                    arrayList.add(input[j]);
            }

            if (!arrayList.isEmpty())
                result = arrayList.get(0);
            sb.append(result).append(" ");
        }

        System.out.println(sb);
    }

    // Stack
    public static void sol_002() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] seq = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; ++i)
            seq[i] = (Integer.parseInt(st.nextToken()));

        for (int i = 0; i < n; ++i) {
            while(!stack.isEmpty() && seq[stack.peek()] < seq[i])
                seq[stack.pop()] = seq[i];
            stack.push(i);
        }

        while (!stack.isEmpty())
            seq[stack.pop()] = -1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; ++i)
            sb.append(seq[i]).append(' ');
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {

//        sol_001();
        sol_002();
    }
}
