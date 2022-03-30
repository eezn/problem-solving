// 1085. 직사각형에서 탈출 (https://www.acmicpc.net/problem/1085)

package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step08_07 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;

        if (w - x < min) min = w - x;
        if (h - y < min) min = h - y;
        if (x < min) min = x;
        if (y < min) min = y;

        System.out.println(min);
    }
}
