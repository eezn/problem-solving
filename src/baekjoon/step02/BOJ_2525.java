// 2525. 오븐 시계 (https://www.acmicpc.net/problem/2525)

package baekjoon.step02;

import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int converted = A * 60 + B;

        sc.close();

        converted += C;
        if (converted >= 1440)
            A = converted / 60 - 24;
        else
            A = converted / 60;
        B = converted % 60;

        System.out.print(A + " " + B);
    }
}
