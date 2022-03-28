// 10250. ACM 호텔 (https://www.acmicpc.net/problem/10250)

package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step07_05 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int[][] result = new int[T][2];

        for (int i = 0; i < T; ++i) {

            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            for (int w = 0; w < W; ++w) {
                for (int h = 0; h < H; ++h) {
                    if (--N == 0) {
                        result[i][0] = h + 1;
                        result[i][1] = w + 1;
                        break;
                    }
                }
                if (N == 0) break;
            }
        }

        for (int[] i : result)
            System.out.printf("%d%02d\n", i[0], i[1]);
    }
}
