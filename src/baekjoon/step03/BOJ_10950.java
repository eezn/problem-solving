// 10950. A+B - 3 (https://www.acmicpc.net/problem/10950)

package baekjoon.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Scanner
/*
public class BOJ_10950 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int loop = sc.nextInt();
        int[] result = new int[loop];

        for (int i = 0; i < loop; ++i) {
            int temp1 = sc.nextInt();
            int temp2 = sc.nextInt();
            result[i] = temp1 + temp2;
        }

        sc.close();

        for (int i = 0; i < loop; ++i)
            System.out.println(result[i]);
    }
}
*/

// StringTokenizer
public class BOJ_10950 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
