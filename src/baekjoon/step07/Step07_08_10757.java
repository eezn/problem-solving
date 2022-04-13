// 10757. 큰 수 A+B (https://www.acmicpc.net/problem/10757)

package baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step07_08_10757 {

    static void sol_001() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        char[] num1 = new StringBuffer(st.nextToken()).reverse().toString().toCharArray();
        char[] num2 = new StringBuffer(st.nextToken()).reverse().toString().toCharArray();

        char[] bigger = num2;
        if (num1.length > num2.length)
            bigger = num1;

        ArrayList<Character> result = new ArrayList<>();

        int min = Math.min(num1.length, num2.length);
        int max = Math.max(num1.length, num2.length);

        int idx = -1;
        boolean over = false;

        while (++idx < min) {
            int temp = (int)num1[idx] + (int)num2[idx] - 48;
            if (over) {
                temp += 1;
                over = false;
            }
            if (temp > 57) {
                temp -= 10;
                over = true;
            }
            result.add((char)temp);
        }

        while (idx < max) {
            int temp = (int)bigger[idx];
            if (over) {
                temp += 1;
                over = false;
            }
            if (temp > 57) {
                temp -= 10;
                over = true;
            }
            result.add((char)temp);
            idx++;
        }
        if (over)
            result.add('1');

        for (int i = result.size() - 1; i >= 0; --i)
            System.out.print(result.get(i));
        System.out.println();
    }

    static void sol_002() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger num1 = new BigInteger(st.nextToken());
        BigInteger num2 = new BigInteger(st.nextToken());

        System.out.println(num1.add(num2));
    }

    public static void main(String[] args) throws IOException {

//        sol_001();
        sol_002();
    }
}
