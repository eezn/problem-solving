// 2675. 문자열 반복 (https://www.acmicpc.net/problem/2675)

package baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Step06_04_2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> results = new ArrayList<>();

        for (int i = 0; i < n; ++i) {

            st = new StringTokenizer(br.readLine(), " ");
            sb = new StringBuilder();

            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (char c : str.toCharArray()) {
                for (int j = 0; j < repeat; ++j)
                    sb.append(c);
            }
            results.add(sb.toString());
        }

        for (String result : results)
            System.out.println(result);
    }
}
