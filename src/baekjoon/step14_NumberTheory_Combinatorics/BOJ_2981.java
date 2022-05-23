// G5 2981. 검문 (https://www.acmicpc.net/problem/2981)

package baekjoon.step14_NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2981 {

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int temp = arr[1] - arr[0];

        for (int i = 2; i < n; ++i)
            temp = gcd(temp, arr[i] - arr[i - 1]);

        for (int i = 2; i < temp; ++i)
            if (temp % i == 0)
                sb.append(i).append(' ');
        sb.append(temp);

        System.out.println(sb);
    }
}
