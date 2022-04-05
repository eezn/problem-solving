// 15596. 정수 N개의 합 (https://www.acmicpc.net/problem/15596)

package baekjoon.step05;

public class Step05_01 {
    long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; ++i)
            ans += a[i];
        return ans;
    }
}
