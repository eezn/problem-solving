package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step06_07 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String num1 = new StringBuffer(st.nextToken()).reverse().toString();
        String num2 = new StringBuffer(st.nextToken()).reverse().toString();

        if (num1.compareTo(num2) > 0)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
}
