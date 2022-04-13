// 4673. 셀프 넘버 (https://www.acmicpc.net/problem/4673)

package baekjoon.step05;

public class Step05_02_4673 {

    final static int SIZE = 10000;

    static int d(int n) {
        int ret = n;
        while (n != 0) {
            ret += n % 10;
            n /= 10;
        }
        return ret;
    }

    public static void main(String[] args) {

        boolean[] arr = new boolean[SIZE * 2];

        for (int i = 1; i < SIZE; ++i) {
            int num = d(i);
            arr[num] = true;
        }

        for (int i = 1; i < SIZE; ++i) {
            if (!arr[i]) System.out.println(i);
        }
    }
}
