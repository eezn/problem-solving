// 1008. A/B (https://www.acmicpc.net/problem/1008)

package step01;

import java.util.Scanner;

public class Step01_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        sc.close();

        System.out.println(num1 / num2);
    }
}
