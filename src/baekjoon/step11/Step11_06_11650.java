// S5 11650. 좌표 정렬하기 (https://www.acmicpc.net/problem/11650)

package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Step11_06_11650 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer[]> arr = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            Integer[] elem = new Integer[2];
            elem[0] = Integer.parseInt(st.nextToken());
            elem[1] = Integer.parseInt(st.nextToken());
            arr.add(elem);
        }

        List<Integer[]> r = arr.stream()
                .sorted(Comparator.comparingInt((Integer[] o) -> o[0]).thenComparingInt(o -> o[1]))
                .collect(Collectors.toList());

        for (Integer[] integers : r)
            System.out.println(integers[0] + " " + integers[1]);
    }
}
