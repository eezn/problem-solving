// 2739. 구구단 (https://www.acmicpc.net/problem/2739)

package baekjoon.step03;

import java.util.Scanner;

public class BOJ_2739 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mulTable = sc.nextInt();

        sc.close();

        for (int i = 1; i < 10; ++i)
            System.out.println(mulTable + " * " + i + " = " + mulTable * i);
    }
}
