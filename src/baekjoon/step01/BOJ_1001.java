// 1001. A-B (https://www.acmicpc.net/problem/1001)

package baekjoon.step01;

import java.util.Scanner;

public class BOJ_1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        System.out.println(num1 - num2);
    }
}
