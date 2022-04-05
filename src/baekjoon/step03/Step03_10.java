// 2439. 별 찍기 - 2 (https://www.acmicpc.net/problem/2439)

package baekjoon.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step03_10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        String stars = "";
        String empty = "";

        for (int i = 0; i < size; ++i)
            empty += " ";

        for (int i = 1; i <= size; ++i ) {
            System.out.print(empty.substring(i));
            stars += "*";
            System.out.println(stars);
        }
    }
}
