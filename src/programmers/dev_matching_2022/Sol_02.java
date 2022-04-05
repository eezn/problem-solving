package programmers.dev_matching_2022;

public class Sol_02 {

    public static int solution(String[] grid) {

        int answer = -1;
        int row = grid.length;
        int col = grid[0].length();

        int[][] arr = new int[row + 2][col + 2];

        for (int i = 1; i < row + 1; ++i)
            for (int j = 1; j < col + 1; ++j)
                arr[i][j] = grid[i - 1].toCharArray()[j - 1];


        for (int i = 0; i < row + 2; ++i) {
            for (int j = 0; j < col + 2; ++j)
                System.out.print((char) arr[i][j]);
            System.out.println();
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] grid = {
                "??b",
                "abc",
                "cc?"
        };

        solution(grid);
    }
}
