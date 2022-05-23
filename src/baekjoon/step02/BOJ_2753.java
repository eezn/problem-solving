// 2753. 윤년 (https://www.acmicpc.net/problem/2753)

package baekjoon.step02;

import java.util.Scanner;

public class BOJ_2753 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
