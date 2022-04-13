// S3 11047. 동전 0 (https://www.acmicpc.net/problem/11047)

package baekjoon.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Step15_01_11047 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt((st.nextToken()));
        int amount = 0;

        ArrayList<Integer> coins = new ArrayList<>();

        for (int i = 0; i < n; ++i)
            coins.add(Integer.parseInt(br.readLine()));
        coins.sort(Comparator.reverseOrder());

        for (Integer coin : coins) {
            if (price / coin > 0) {
                amount += price / coin;
                price %= coin;
            }
        }

        System.out.println(amount);
    }
}
