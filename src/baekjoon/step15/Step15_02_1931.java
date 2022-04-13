// S2 1931. 회의실 배정 (https://www.acmicpc.net/problem/1931)

package baekjoon.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Step15_02_1931 {

    static final int START = 0;
    static final int END = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] reservation = new int[n][2];

        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            reservation[i][START] = Integer.parseInt(st.nextToken());
            reservation[i][END] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(reservation, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[END] == o2[END])
                    return o1[START] - o2[START];
                return o1[END] - o2[END];
            }
        });

        int answer = 0;
        int currTime = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            if (currTime <= reservation[i][START]) {
                currTime = reservation[i][END];
                answer++;
            }
        }

        System.out.println(answer);
    }
}
