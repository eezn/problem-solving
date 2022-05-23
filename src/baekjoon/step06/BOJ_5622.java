// 5622. 다이얼 (https://www.acmicpc.net/problem/5622)

package baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_5622 {
    public static void main(String[] args) throws IOException {

        HashMap<Character, Integer> dial = new HashMap<>();

        int result = 0;
        int alpha = (int) 'A';

        for (int i = 3; i < 11; ++i) {
            if ((char)alpha == 'P' || (char)alpha == 'W')
                for (int j = 0; j < 4; ++j) dial.put((char)alpha++, i);
            else
                for (int j = 0; j < 3; ++j) dial.put((char)alpha++, i);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (char c : str.toCharArray())
            result += dial.get(c);

        System.out.println(result);
    }
}
