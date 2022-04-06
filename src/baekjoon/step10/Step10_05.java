// 1436. 영화감독 숌 (https://www.acmicpc.net/problem/1436)

package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step10_05 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int num = 665;

        while (n-- != 0) {
            while (true) {
                num++;
                if (Integer.toString(num).contains("666")) break;
            }
        }

        System.out.println(num);
    }
}
