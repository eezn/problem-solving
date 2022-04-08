// G4 2580. 스도쿠 (https://www.acmicpc.net/problem/2580)

package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step13_06 {

    static int SIZE = 9;
    static int[][] sudoku = new int[SIZE][SIZE];

    /*
    static int X = 0;
    static boolean[] digit;

    private static void row() {

        for (int i = 0; i < SIZE; ++i) {
            int index = 0;
            int count = 0;
            digit = new boolean[SIZE + 1];
            for (int j = 0; j < SIZE; ++j) {
                if (sudoku[i][j] != 0)
                    digit[sudoku[i][j]] = true;
                else {
                    index = j;
                    count++;
                }
            }
            if (count == 1) {
                X--;
                for (int j = 1; j < SIZE + 1; ++j)
                    if (!digit[j]) sudoku[i][index] = j;
            }
        }
    }

    private static void col() {

        for (int i = 0; i < SIZE; ++i) {
            int index = 0;
            int count = 0;
            digit = new boolean[SIZE + 1];
            for (int j = 0; j < SIZE; ++j) {
                if (sudoku[j][i] != 0)
                    digit[sudoku[j][i]] = true;
                else {
                    index = j;
                    count++;
                }
            }
            if (count == 1) {
                X--;
                for (int j = 1; j < SIZE + 1; ++j)
                    if (!digit[j]) sudoku[index][i] = j;
            }
        }
    }

    private static void grid() {

        for (int i = 1; i < SIZE; i += 3) {

            int x = 0;
            int y = 0;
            int count = 0;
            digit = new boolean[SIZE + 1];

            for (int j = 1; j < SIZE; j += 3) {
                for (int k = 0; k < SIZE; ++k) {
                    int temp_x = k / 3 - 1 + i;
                    int temp_y = k % 3 - 1 + j;
                    if (sudoku[temp_x][temp_y] != 0) digit[sudoku[temp_x][temp_y]] = true;
                    else {
                        x = temp_x;
                        y = temp_y;
                        count++;
                    }
                }
                if (count == 1) {
                    X--;
                    for (int k = 1; k < SIZE; ++k)
                        if (!digit[k]) sudoku[x][y] = k;
                }
            }
        }
    }

    public static void sol_001() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < SIZE; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < SIZE; ++j) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
                if (sudoku[i][j] == 0) X++;
            }
        }

        while (X > 0) {
            row();
            col();
            grid();
        }
    }
    */

    private static boolean isValid(int row, int col, int value) {

        for (int i = 0; i < 9; ++i)
            if (sudoku[row][i] == value) return false;

        for (int i = 0; i < 9; ++i)
            if (sudoku[i][col] == value) return false;

        int gridRow = (row / 3) * 3;
        int gridCol = (col / 3) * 3;

        for (int i = gridRow; i < gridRow + 3; ++i)
            for (int j = gridCol; j < gridCol + 3; ++j)
                if (sudoku[i][j] == value) return false;

        return true;
    }

    private static void recursion(int row, int col) {

        if (col == SIZE) {
            recursion(row + 1, 0);
            return;
        }

        if (row == SIZE) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; ++i) {
                for (int j = 0; j < 9; ++j)
                    sb.append(sudoku[i][j]).append(' ');
                sb.append('\n');
            }
            System.out.print(sb);
            System.exit(0);
        }

        if (sudoku[row][col] == 0) {
            for (int i = 0; i < SIZE; ++i) {
                if (isValid(row, col, i + 1)) {
                    sudoku[row][col] = i + 1;
                    recursion(row, col + 1);
                }
            }
            sudoku[row][col] = 0;
            return;
        }

        recursion(row, col + 1);
    }

    public static void sol_002() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < SIZE; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < SIZE; ++j) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
//                if (sudoku[i][j] == 0) X++;
            }
        }

        recursion(0 ,0);
    }

    public static void main(String[] args) throws IOException {

//        sol_001();  // Time out, 무지성한 방법
        sol_002();  // 480ms, 시간 더 줄일 수 있음, 나중에 시도해보기
    }
}
