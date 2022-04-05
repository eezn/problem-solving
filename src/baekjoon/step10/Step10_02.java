// 2231. 분해합 (https://www.acmicpc.net/problem/2231)

package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step10_02 {

    static int selfNumber(int m) {

        int ret = m;
        while (m != 0) {
            ret += m % 10;
            m /= 10;
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int candidate = n + 1;
        int last = 0;

        while (--candidate != 0)
            if (n == selfNumber(candidate))
                last = candidate;

        System.out.println(last);
    }
}
