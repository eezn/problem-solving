// 1193. 분수찾기 (https://www.acmicpc.net/problem/1193)

package baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step07_03_1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int level = -1;
        while (x > 0) { x -= ++level; }

        int row = 0;
        int col = 0;

        if (level % 2 == 0) {
            row = level + x;
            col = level - row + 1;
        } else {
            col = level + x;
            row = level - col + 1;
        }

        System.out.println(row + "/" + col);
    }
}
