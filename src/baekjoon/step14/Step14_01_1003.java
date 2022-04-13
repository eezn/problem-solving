// S3 1003. 피보나치 함수 (https://www.acmicpc.net/problem/1003)

package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step14_01_1003 {

    /**
    * called[idx][0]: idx 번째 피보나치 숫자가 호출될 때 0 이 출력되는 횟수
    * called[idx][1]: idx 번째 피보나치 숫자가 호출될 때 1 이 출력되는 횟수
    * called[idx][2]: idx 번째 피보나치 숫자가 재귀호출 된 적이 있는지 여부 (TRUE, FALSE)
    */
    static int[][] called;
    static final int FALSE = 0;
    static final int TRUE = 1;

    private static void dpFibCalled(int num) {

        if (num == 0) {
            called[num][0] = 1;
            called[num][1] = 0;
            called[num][2] = TRUE;
        } else if (num == 1) {
            called[num][0] = 0;
            called[num][1] = 1;
            called[num][2] = TRUE;
        } else {
            if (called[num][2] == FALSE) {
                dpFibCalled(num - 2);
                dpFibCalled(num - 1);
                called[num][2] = TRUE;
            }
            called[num][0] = called[num - 2][0] + called[num - 1][0];
            called[num][1] = called[num - 2][1] + called[num - 1][1];
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- != 0) {

            int num = Integer.parseInt(br.readLine());
            called = new int[num + 2][3];

            dpFibCalled(num);
            sb.append(called[num][0]).append(" ").append(called[num][1]).append("\n");
        }

        System.out.print(sb);
    }
}
