// 10430. 나머지 (https://www.acmicpc.net/problem/10430)

package step01;

import java.util.Scanner;

public class Step01_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        System.out.println( (A+B)%C );
        System.out.println( ((A%C)+(B%C))%C );
        System.out.println( (A*B)%C );
        System.out.println( ((A%C)*(B%C))%C );
    }
}
