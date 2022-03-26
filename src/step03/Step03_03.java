package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step03_03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int endPoint = Integer.parseInt(br.readLine());
        int sum = ((endPoint + 1) * endPoint) / 2;

        System.out.println(sum);
    }
}
