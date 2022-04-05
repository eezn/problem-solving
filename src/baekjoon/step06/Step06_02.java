// 11720. 숫자의 합 (https://www.acmicpc.net/problem/11720)

package baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step06_02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        String nums = br.readLine();

        int sum = 0;
        for (char num : nums.toCharArray())
            sum += (int)num - 48;

        System.out.println(sum);
    }
}
