package step03;

import java.util.Scanner;

public class Step03_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mulTable = sc.nextInt();

        sc.close();

        for (int i = 1; i < 10; ++i)
            System.out.println(mulTable + " * " + i + " = " + mulTable * i);
    }
}
