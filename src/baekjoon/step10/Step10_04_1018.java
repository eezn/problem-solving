// 1018. 체스판 다시 칠하기 (https://www.acmicpc.net/problem/1018)

package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step10_04_1018 {

    static char revColor(char color) {
        if (color == 'B') return 'W';
        if (color == 'W') return 'B';
        return 0;
    }

    static int getMin(char[][] board, int row, int col) {

        int count = 0;
        char prev = revColor(board[row][col]);

        for (int i = row; i < row + 8; ++i) {
            for (int j = col; j < col + 8; ++j) {
                if (board[i][j] == prev)
                    count++;
                prev = revColor(prev);
            }
            prev = revColor(prev);
        }

        return Math.min(count, 64 - count);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        char[][] board = new char[row][];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < row; ++i)
            board[i] = br.readLine().toCharArray();

        for (int i = 0; i < row - 7; ++i)
            for (int j = 0; j < col - 7; ++j)
                min = Math.min(min, getMin(board, i, j));

        System.out.println(min);
    }
}
