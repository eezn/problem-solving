// G5 5430. AC (https://www.acmicpc.net/problem/5430)

package baekjoon.step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Step19_07_5430 {

    private static Deque<Integer> deque = new ArrayDeque<>();
    private static boolean head;

    private static void R() {
        head = !head;
    }

    private static int D() throws NoSuchElementException {
        if (head)
            return deque.removeFirst();
        else
            return deque.removeLast();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {

            head = true;
            boolean exception = false;

            char[] cmd = br.readLine().toCharArray();
            int size = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(), "[],");

            for (int i = 0; i < size; ++i)
                deque.add(Integer.parseInt(st.nextToken()));

            for (char c : cmd) {
                switch (c) {
                    case 'R': R(); break;
                    case 'D':
                        try { D(); }
                        catch (NoSuchElementException e) {
                            sb.append("error\n");
                            exception = true;
                        }
                }
                if (exception) break;
            }

            if (exception)
                deque.clear();
            else {
                sb.append('[');
                while (!deque.isEmpty()) {
                    sb.append(D());
                    if (!deque.isEmpty())
                        sb.append(',');
                }
                sb.append(']').append('\n');
            }
        }

        System.out.println(sb);
    }
}
