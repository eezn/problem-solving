// 11654. 아스키 코드 (https://www.acmicpc.net/problem/11654)

package baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step06_01_11654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c = br.readLine().charAt(0);

        System.out.println((int) c);
    }
}
