// 2775. 부녀회장이 될테야 (https://www.acmicpc.net/problem/2775)

package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step07_06 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] results = new int[T];

        for (int t = 0; t < T; ++t) {

            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            int[][] apt = new int[++a][b];

            for (int i = 0; i < b; ++i)
                apt[0][i] = i + 1;

            // apt[a][b] = apt[a][a-1] + apt[a-1][b]
            for (int i = 1; i < a; ++i)
                for (int j = 0; j < b; ++j)
                    if (j > 0) apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
                    else apt[i][j] = apt[i - 1][j];

            results[t] = apt[a - 1][b - 1];
        }

        for (int result : results)
            System.out.println(result);
    }
}
