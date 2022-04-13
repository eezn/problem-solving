// 10989. 수 정렬하기 3 (https://www.acmicpc.net/problem/10989)

package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step11_03_10989 {

    final static int RANGE = 10000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        int[] digit = new int[RANGE + 1];

        for (int i = 0; i < len; ++i)
            digit[Integer.parseInt(br.readLine())]++;

        for (int i = 0; i < RANGE + 1; ++i)
            for (int j = 0; j < digit[i]; ++j)
                sb.append(i).append('\n');

        System.out.print(sb);
    }
}
