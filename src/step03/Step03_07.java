// 11021. A+B - 7 (https://www.acmicpc.net/problem/11021)

package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step03_07 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());
        int[] result = new int[loop];

        StringTokenizer st;

        for (int i = 0; i < loop; ++i) {
            st = new StringTokenizer(br.readLine(), " ");
            result[i] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < loop; ++i) {
            System.out.println("Case #" + (i + 1) + ": " + result[i]);
        }
    }
}
