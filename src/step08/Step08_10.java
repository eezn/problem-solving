// 3053. 택시 기하학 (https://www.acmicpc.net/problem/3053)

package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step08_10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double R = Double.parseDouble(br.readLine());

        System.out.printf("%.6f\n", Math.pow(R, 2) * Math.PI);
        System.out.printf("%.6f\n", Math.pow(R, 2) * 2);
    }
}
