package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step03_05 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int endPoint = Integer.parseInt(br.readLine());

        for (int i = 1; i <= endPoint; ++i)
            System.out.println(i);
    }
}
