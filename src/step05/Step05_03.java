// 1065. 한수 (https://www.acmicpc.net/problem/1065)

package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step05_03 {

    static boolean isArithmeticSeq(int num) {
        int prevDigit;
        int currDigit;
        int diff;

        prevDigit = num % 10;
        num /= 10;
        diff = prevDigit - num % 10;

        while (num != 0) {
            currDigit = num % 10;
            if (diff != prevDigit - currDigit)
                return false;
            prevDigit = currDigit;
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= N; ++i)
            if (isArithmeticSeq(i)) count++;

        System.out.println(count);
    }
}
