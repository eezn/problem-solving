// 10809. 알파벳 찾기 (https://www.acmicpc.net/problem/10809)

package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step06_03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ascii = new int[128];
        for (int i = 0; i < 128; ++i)
            ascii[i] = -1;

        String str = br.readLine();

        int count = 0;
        for (char c : str.toCharArray()) {
            if (ascii[(int) c] == -1)
                ascii[(int) c] = count;
            ++count;
        }

        for (int i = 97; i <= 122; ++i)
            System.out.print(ascii[i] + " ");
    }
}
