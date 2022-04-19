// S3 1966. 프린터 큐 (https://www.acmicpc.net/problem/1966)

package baekjoon.step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Step19_04_1966 {

    static class Doc {

        private int idx;
        private int priority;

        public Doc(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }

        public int getIdx() { return idx; }
        public int getPriority() { return priority; }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {

            st = new StringTokenizer(br.readLine());

            int size = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            int count = 0;
            int currTop = -1;
            int[] docs = new int[10];

            Queue<Doc> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());

            for (int idx = 0; idx < size; ++idx) {
                int priority = Integer.parseInt(st.nextToken());
                if (priority > currTop)
                    currTop = priority;
                docs[priority]++;
                queue.add(new Doc(idx, priority));
            }

            while (true) {
                int priority = queue.peek().getPriority();
                if (priority < currTop)
                    queue.add(queue.poll());
                if (priority == currTop) {
                    count++;
                    docs[priority]--;
                    if (queue.poll().getIdx() == target)
                        break;
                }
                while (docs[priority--] == 0)
                    currTop--;
            }

            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }
}
