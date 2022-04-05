// 1546. 평균 (https://www.acmicpc.net/problem/1546)

package baekjoon.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Step04_05 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; ++i)
            arr.add(Integer.parseInt(st.nextToken()));
        arr.sort(Comparator.reverseOrder());
        int M = arr.get(0);

        double total = 0;
        for (int elem : arr)
            total += ((double)elem / M) * 100;

        System.out.println(total / N);
    }
}
