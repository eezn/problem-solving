// 10818. 최소, 최대 (https://www.acmicpc.net/problem/10818)

package baekjoon.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        TreeSet<Integer> ts = new TreeSet<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; ++i)
            ts.add(Integer.parseInt(st.nextToken()));

        System.out.println(ts.first() + " " + ts.last());
    }
}
