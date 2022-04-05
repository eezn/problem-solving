// 2588. 곱셈 (https://www.acmicpc.net/problem/2588)

package baekjoon.step01;

import java.util.Scanner;

public class Step01_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int total = num1 * num2;
        sc.close();

        do {
            int digit = num2 % 10;
            num2 /= 10;
            System.out.println(num1 * digit);
        } while (num2 != 0);

        System.out.println(total);
    }
}
