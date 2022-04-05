// 11022. A+B - 8 (https://www.acmicpc.net/problem/11022)

package baekjoon.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step03_08 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());
        int[] result = new int[loop];

        ArrayList<String> expression = new ArrayList<String>();
        StringTokenizer st;

        for (int i = 0; i < loop; ++i) {
            st = new StringTokenizer(br.readLine(), " ");
            String temp1 = st.nextToken();
            String temp2 = st.nextToken();
            expression.add(temp1 + " + " + temp2);
            result[i] = Integer.parseInt(temp1) + Integer.parseInt(temp2);
        }

        for (int i = 0; i < loop; ++i) {
            System.out.println("Case #" + (i + 1) + ": " + expression.get(i) + " = " + result[i]);
        }
    }
}
