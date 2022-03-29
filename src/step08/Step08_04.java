// 1929. 소수 구하기, 에라토스테네스의 체 (https://www.acmicpc.net/problem/1929)

package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step08_04 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[n + 1];
        arr[1] = true;

        for (int i = 2; i < n + 1; ++i)
            for (int j = 2; i * j < n + 1; ++j)
                arr[i * j] = true;

        for (int i = m; i < n + 1; ++i)
            if (!arr[i]) System.out.println(i);
    }
}
