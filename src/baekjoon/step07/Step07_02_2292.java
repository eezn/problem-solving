// 2292. 벌집 (https://www.acmicpc.net/problem/2292)

package baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step07_02_2292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int level = 0;
        int range = 1;

        if (n != 1) {
            while (true) {
                range += (++level - 1) * 6;
                if (range < n && n <= range + level * 6) break;
            }
        }
        System.out.println(level + 1);
    }
}
