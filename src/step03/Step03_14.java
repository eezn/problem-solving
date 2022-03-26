// 1110. 더하기 사이클 (https://www.acmicpc.net/problem/1110)

package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step03_14 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int tenDigit = N / 10;
        int unitDigit = N % 10;

        int temp = tenDigit + unitDigit;
        int cycle = 1;

        while (true) {
            temp = unitDigit * 10 + (temp % 10);
            tenDigit = temp / 10;
            unitDigit = temp % 10;
            if (temp == N)
                break;
            temp = tenDigit + unitDigit;
            cycle++;
        }

        System.out.println(cycle);
    }
}
