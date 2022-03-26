package step02;

import java.util.Scanner;

public class Step02_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] dice = new int[6];
        int target = 1;
        boolean dup = false;
        boolean tri = false;

        for (int i = 0; i < 3; ++i)
            dice[sc.nextInt() - 1]++;

        sc.close();

        for (int i = 0; i < 6; ++i) {
            if (!dup && !tri && dice[i] == 1) {
                target = i + 1;
            }
            else if (dice[i] == 2) {
                dup = true;
                target = i + 1;
            }
            else if (dice[i] == 3) {
                tri = true;
                target = i + 1;
            }
        }

        if (tri)
            System.out.println(target * 1000 + 10000);
        else if (dup)
            System.out.println(target * 100 + 1000);
        else
            System.out.println(target * 100);
    }
}
