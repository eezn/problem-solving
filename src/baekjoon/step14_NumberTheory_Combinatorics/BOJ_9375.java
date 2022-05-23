// S3 9375. 패션왕 신해빈 (https://www.acmicpc.net/problem/9375)

package baekjoon.step14_NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_9375 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {

            HashMap<String, Integer> closet = new HashMap<>();
            int m = Integer.parseInt(br.readLine());

            while (m-- > 0) {

                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();

                String cloth = st.nextToken();
                if (closet.containsKey(cloth))
                    closet.put(cloth, closet.get(cloth) + 1);
                else
                    closet.put(cloth, 1);
            }

            int answer = 1;
            for (Integer value : closet.values())
                answer *= (value + 1);
            sb.append(answer - 1).append('\n');
        }

        System.out.print(sb);
    }
}
