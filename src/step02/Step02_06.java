package step02;

import java.util.Scanner;

public class Step02_06 {
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
