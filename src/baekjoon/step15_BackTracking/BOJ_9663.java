// G5 9663. N-Queen (https://www.acmicpc.net/problem/9663)

package baekjoon.step15_BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9663 {

    static int total = 0;
    static int n;

    // 하나의 행, 하나의 열에 유일하게 한 점만 존재하므로 단일 행렬로 좌표를 표현할 수 있다.
    // 행, 열 어느 한 쪽을 기준으로 잡고 생각하면 이해가 쉽다. (둘 다 가능)
    // -> board 행렬의 index 를 row 으로 기준 잡음
    // -> board 행렬의 각 값은 col
    static int[] board;

    private static void recursion(int nQueen) {

        if (nQueen == n) {
//            System.out.println(Arrays.toString(board));
            total++;
            return;
        }

        for (int col = 0; col < n; ++col) {

            boolean isPossible = true;

            // 한 행에 하나의 퀸
            // board[row] == col 조건으로 같은 열에 존재하는 퀸 여부 확인
            // abs(nQueen - row) == abs(col - board[row]) 조건으로 대각선상에 존재하는 퀸 여부 확인
            for (int row = 0; row < nQueen; ++row) {
                if (board[row] == col
                        || Math.abs(nQueen - row) == Math.abs(col - board[row])) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                board[nQueen] = col;
                recursion(nQueen + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        board = new int[n];

        recursion(0);

        System.out.println(total);
    }
}
