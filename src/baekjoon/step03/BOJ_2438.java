// 2438. 별 찍기 - 1 (https://www.acmicpc.net/problem/2438)

package baekjoon.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
public class BOJ_2438 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        sc.close();

        String stars = "";

        for (int i = 1; i <= size; ++i) {
            stars += "*";
            System.out.println(stars);
        }
    }
}
*/

public class BOJ_2438 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        String stars = "";

        for (int i = 1; i <= size; ++i) {
            stars += "*";
            System.out.println(stars);
        }
    }
}
