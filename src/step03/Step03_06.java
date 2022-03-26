package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step03_06 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int entryPoint = Integer.parseInt(br.readLine());

        for (int i = entryPoint; i > 0; --i)
            System.out.println(i);
    }
}
