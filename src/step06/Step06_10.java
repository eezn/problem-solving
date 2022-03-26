// 1316. 그룹 단어 체커 (https://www.acmicpc.net/problem/1316)

package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step06_10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; ++i) {

            boolean isGroup = true;
            boolean[] ascii = new boolean[128];
            char curr = 0;

            String word = br.readLine();

            for (char c : word.toCharArray()) {
                if (!ascii[(int) c]) {
                    ascii[(int) c] = true;
                    curr = c;
                }
                if (ascii[(int) c] && curr == c) continue;
                else {
                    isGroup = false;
                    break;
                }
            }

            if (isGroup) result++;
        }

        System.out.println(result);
    }
}
