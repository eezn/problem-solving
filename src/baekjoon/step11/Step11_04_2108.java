// S3 2108. 통계학 (https://www.acmicpc.net/problem/2108)

package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//        평균 : (arr[n - 1] + arr[n - 2]) / 2
//        중앙 : arr[n / 2]
//        최빈 :
//        범위 : arr[n - 1] - arr[0]

public class Step11_04_2108 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

    }
}
