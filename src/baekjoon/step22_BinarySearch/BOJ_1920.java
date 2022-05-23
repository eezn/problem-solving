// S4 1920. 수 찾기 (https://www.acmicpc.net/problem/1920)

package baekjoon.step22_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920 {

    private static int binarySearch(int[] data, int lookFor) {

        int left, right, mid;
        left = 0;
        right = data.length - 1;

        while (left <= right) {
            mid = (left + right) / 2;

            if (lookFor == data[mid])
                return mid;
            else if (lookFor > data[mid])
                left = mid + 1;
            else if (lookFor < data[mid])
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] seq = new int[n];

        for (int i = 0; i < n; ++i)
            seq[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] lookFor = new int[m];

        for (int i = 0; i < m; ++i)
            lookFor[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(seq);

        for (int elem : lookFor) {
            if (binarySearch(seq, elem) < 0) // or Arrays.binarySearch()
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}
