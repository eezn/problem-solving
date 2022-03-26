package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Step04_02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 9; ++i)
            arr.add(Integer.parseInt(br.readLine()));

        int idx = 0;
        int maxValue = 0;

        for (int i = 0; i < 9; ++i) {
            int temp = arr.get(i);
            if (temp > maxValue) {
                maxValue = temp;
                idx = i + 1;
            }
        }

        System.out.println(maxValue);
        System.out.println(idx);
    }
}
