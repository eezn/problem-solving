// 14681. 사분면 고르기 (https://www.acmicpc.net/problem/14681)

package step02;

import java.util.Scanner;

public class Step02_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.close();

        if (x > 0) {
            if (y > 0) System.out.println("1");
            else if (y < 0) System.out.println("4");
        } else if (x < 0) {
            if (y > 0) System.out.println("2");
            else if (y < 0) System.out.println("3");
        }
    }
}
