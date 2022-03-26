// 2941. 크로아티아 알파벳 (https://www.acmicpc.net/problem/2941)

package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step06_09 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        int result = 0;

        for (String s : arr) {
            while (true) {
                String temp = str.replaceFirst(s, " ");
                if (!str.equals(temp)) {
                    str = temp;
                    result++;
                } else break;
            }
        }

        for (char c : str.toCharArray())
            if (Character.isLowerCase(c)) result++;

        System.out.println(result);
    }
}
