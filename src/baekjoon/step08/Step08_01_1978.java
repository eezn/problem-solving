// 1978. 소수 찾기 (https://www.acmicpc.net/problem/1978)

package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step08_01_1978 {

    static boolean isPrime(int num) {

        if (num == 1) return false;
        else if (num < 4) return true;
        else {
            int i = 2;
            while (i <= Math.sqrt(num))
                if (num % i++ == 0) return false;
            return true;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; ++i)
            if (isPrime(Integer.parseInt(st.nextToken()))) ++result;

        System.out.println(result);
    }
}
