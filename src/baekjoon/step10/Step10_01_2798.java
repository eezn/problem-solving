// 2798. 블랙잭 (https://www.acmicpc.net/problem/2798)

package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step10_01_2798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; ++i)
            nums[i] = Integer.parseInt(st.nextToken());

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
                for (int k = 0; k < n; ++k)
                    if (i != j && j != k && k != i) {
                        int temp = nums[i] + nums[j] + nums[k];
                        if (result <= temp && temp <= m) result = temp;
                    }

        System.out.println(result);
    }
}
