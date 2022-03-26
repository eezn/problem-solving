package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step03_12 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> results = new ArrayList<Integer>();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int temp1 = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());
            if (temp1 == 0 && temp2 == 0)
                break;
            results.add(temp1 + temp2);
        }

        for (int result : results) {
            System.out.println(result);
        }
    }
}
