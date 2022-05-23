// 18108. 1998년생인 내가 태국에서는 2541년생?! (https://www.acmicpc.net/problem/18108)

package baekjoon.step01;

import java.util.Scanner;

public class BOJ_18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        System.out.println(year - 543);
    }
}
