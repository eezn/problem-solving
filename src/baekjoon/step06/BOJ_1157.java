// 1157. 단어 공부 (https://www.acmicpc.net/problem/1157)

package baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] ascii = new int[128];

        for (char a : str.toUpperCase().toCharArray())
            ascii[(int) a]++;

        // 0: 반복 횟수
        // 1: 현재 문자
        // 2: 중복 여부
        int[] status = new int[3];

        for (int i = 65; i <= 90; ++i) {
            if (status[0] < ascii[i]) {
                status[0] = ascii[i];
                status[1] = i;
                status[2] = 0;
            } else if (status[0] != 0 && status[0] == ascii[i]) {
                status[1] = '?';
                status[2] = 1;
            }
        }

        System.out.println((char)status[1]);
    }
}
