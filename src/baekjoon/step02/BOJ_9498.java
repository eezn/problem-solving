// 9498. 시험 성적 (https://www.acmicpc.net/problem/9498)

package baekjoon.step02;

import java.util.Scanner;

public class BOJ_9498 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        sc.close();

        if (90 <= score && score <= 100) System.out.println("A");
        else if (80 <= score && score < 90) System.out.println("B");
        else if (70 <= score && score < 80) System.out.println("C");
        else if (60 <= score && score < 70) System.out.println("D");
        else System.out.println("F");
    }
}
