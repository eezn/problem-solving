package programmers.dev_matching_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol_01 {

    static void recursion(int[][] dist, int idx, boolean[] flag, ArrayList<Integer> sequence) {

        int ret = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < dist.length; ++i)
            if (!flag[i] && i != idx && dist[idx][i] < min) {
                min = dist[idx][i];
                ret = i;
            }

        if (ret == -1)
            return;

        flag[ret] = true;
        sequence.add(ret);
        recursion(dist, ret, flag, sequence);
    }

    public static int[][] solution(int[][] dist) {

        int len = dist.length;
        int max = Integer.MIN_VALUE;
        int start = -1;

        for (int i = 0; i < len; ++i)
            for (int j = i + 1; j < len; ++j)
                if (dist[i][j] > max) {
                    max = dist[i][j];
                    start = i;
                }

        boolean[] flag = new boolean[len];
        ArrayList<Integer> sequence = new ArrayList<>();

        flag[start] = true;
        sequence.add(start);
        recursion(dist, start, flag, sequence);

        int[] seq = new int[len];
        int[] rev = new int[len];

        for (int i = 0; i < len; ++i) {
            seq[i] = sequence.get(i);
            rev[len - (i + 1)] = sequence.get(i);
        }

        int[][] answer = { seq, rev };

        return answer;
    }

    public static void main(String[] args) {

        int [][] input1 = {
                {0,5,2,4,1},
                {5,0,3,9,6},
                {2,3,0,6,3},
                {4,9,6,0,3},
                {1,6,3,3,0}
        };

        int [][] input2 = {
                {0, 2, 3, 1},
                {2, 0, 1, 1},
                {3, 1, 0, 2},
                {1, 1, 2, 0}
        };

        int[][] answer;

        // input1
        answer = solution(input1);
        for (int[] a : answer)
            System.out.println(Arrays.toString(a));

        // input2
        answer = solution(input2);
        for (int[] a : answer)
            System.out.println(Arrays.toString(a));
    }
}
