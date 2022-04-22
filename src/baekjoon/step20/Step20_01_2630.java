// S3 2630. 색종이 만들기 (https://www.acmicpc.net/problem/2630)

package baekjoon.step20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step20_01_2630 {

    private static int[][] arr;
    private static int white = 0;
    private static int blue = 0;

    static final int WHITE = 0;
    static final int BLUE = 1;

    private static boolean traversal(int row, int col, int size, int color) {

        for (int i = row; i < size + row; ++i)
            for (int j = col; j < size + col; ++j)
                if (arr[i][j] != color)
                    return false;
        return true;
    }

    private static void divide(int row, int col, int size) {

        int color = arr[row][col];

        if (traversal(row, col, size, color)) {
            if (color == WHITE) white++;
            if (color == BLUE) blue++;
            return;
        }

        int divideSize = size / 2;

        divide(row, col, divideSize);
        divide(row, col + divideSize, divideSize);
        divide(row + divideSize, col, divideSize);
        divide(row + divideSize, col + divideSize, divideSize);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        divide(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }
}
