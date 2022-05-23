// 8958. OX퀴즈 (https://www.acmicpc.net/problem/8958)

package baekjoon.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_8958 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 0; i < count; ++i)
            arr.add(br.readLine());

        for (String str : arr) {
            int totalScore = 0;
            int currScore = 0;
            for (int i = 0; i < str.length(); ++i) {
                if (str.charAt(i) == 'O')
                    totalScore += ++currScore;
                else
                    currScore = 0;
            }
            System.out.println(totalScore);
        }
    }
}
