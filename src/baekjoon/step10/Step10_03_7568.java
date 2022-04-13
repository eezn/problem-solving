// 7568. 덩치 (https://www.acmicpc.net/problem/7568)

package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step10_03_7568 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] data = new int[n][2];

        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            data[i][0] = Integer.parseInt(st.nextToken());
            data[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; ++i) {
            int count = 1;
            for (int j = 0; j < n; ++j)
                if (i != j && data[i][0] < data[j][0] && data[i][1] < data[j][1]) count++;
            answer.append(count).append(" ");
        }

        System.out.println(answer);
    }
}
