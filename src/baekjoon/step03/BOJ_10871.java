// 10871. X보다 작은 수 (https://www.acmicpc.net/problem/10871)

package baekjoon.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < size; ++i) {
            int temp = Integer.parseInt(st.nextToken());
            if (target > temp) {
                System.out.print(temp + " ");
            }
        }
    }
}
