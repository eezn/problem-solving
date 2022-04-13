// S4 13305. 주유소 (https://www.acmicpc.net/problem/13305)

package baekjoon.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step15_05_13305 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()) - 1;
        long[] distance = new long[n];
        long[] oilPrice = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i)
            distance[i] = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i)
            oilPrice[i] = Long.parseLong(st.nextToken());

        long answer = 0;
        long currPrice = oilPrice[0];
        for (int i = 0; i < n; ++i) {
            if (currPrice > oilPrice[i])
                currPrice = oilPrice[i];
            answer += currPrice * distance[i];
        }

        System.out.println(answer);
    }
}
