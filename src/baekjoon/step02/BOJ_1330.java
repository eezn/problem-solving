// 1330. 두 수 비교하기 (https://www.acmicpc.net/problem/1330)

package baekjoon.step02;

import java.util.Scanner;

public class BOJ_1330 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        if (num1 < num2) System.out.println("<");
        else if (num1 > num2) System.out.println(">");
        else System.out.println("==");
    }
}
