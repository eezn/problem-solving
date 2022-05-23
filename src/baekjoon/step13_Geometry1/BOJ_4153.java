// 4153. 직각삼각형 (https://www.acmicpc.net/problem/4153)

package baekjoon.step13_Geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_4153 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            ArrayList<Integer> data = new ArrayList<>();

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 3; ++i)
                data.add(Integer.parseInt(st.nextToken()));
            data.sort(Comparator.naturalOrder());

            if (data.get(2) == 0) break;

            if (Math.pow(data.get(0), 2) + Math.pow(data.get(1), 2) == Math.pow(data.get(2), 2))
                sb.append("right\n");
            else
                sb.append("wrong\n");
        }

        System.out.print(sb);
    }
}
