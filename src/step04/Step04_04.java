package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step04_04 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] rests = new int[42];
        int count = 0;

        for (int i = 0; i < 10; ++i)
            rests[Integer.parseInt(br.readLine()) % 42] += 1;

        for (int rest : rests)
            if (rest != 0) count++;

        System.out.println(count);
    }
}
