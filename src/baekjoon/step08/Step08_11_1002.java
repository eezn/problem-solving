// 1002. 터렛 (https://www.acmicpc.net/problem/1002)

package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step08_11_1002 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> results = new ArrayList<>();

        while (n-- != 0) {

            st = new StringTokenizer(br.readLine(), " ");

            int[] data = new int[6];

            for (int i = 0; i < 6; ++i)
                data[i] = Integer.parseInt(st.nextToken());

            double distance = Math.sqrt(Math.pow(data[0] - data[3], 2) + Math.pow(data[1] - data[4], 2));
            int diff = Math.abs(data[2] - data[5]);
            int sum = data[2] + data[5];

            if (distance == 0) {
                if (data[2] == data[5]) results.add(-1);
                else results.add(0);
            } else if (distance == sum) {
                results.add(1);
            } else if (distance > sum) {
                results.add(0);
            } else if (distance == diff) {
                results.add(1);
            } else if (distance < diff) {
                results.add(0);
            } else results.add(2);
        }

        for (int result : results)
            System.out.println(result);
    }
}
