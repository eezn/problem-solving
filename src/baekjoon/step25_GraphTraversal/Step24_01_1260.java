// S2 1260. DFS와 BFS (https://www.acmicpc.net/problem/1260)

package baekjoon.step25_GraphTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Step24_01_1260 {

    private static int vertex;
    private static int start;
    private static boolean[][] graph;
    private static boolean[] visited;
    private static StringBuilder sb;

    private static void dfs() {

        sb = new StringBuilder();
        visited = new boolean[vertex + 1];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (!visited[curr])
                sb.append(curr).append(' ');
            visited[curr] = true;
            for (int i = vertex; i > 0; --i) {
                if (graph[curr][i] && !visited[i])
                    stack.push(i);
            }
        }

        System.out.println(sb);
    }

    private static void bfs() {

        sb = new StringBuilder();
        visited = new boolean[vertex + 1];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (!visited[curr])
                sb.append(curr).append(' ');
            visited[curr] = true;
            for (int i = 1; i < vertex + 1; ++i) {
                if (graph[curr][i] && !visited[i])
                    queue.add(i);
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        graph = new boolean[vertex + 1][vertex + 1];

        for (int i = 0; i < edge; ++i) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph[v1][v2] = true;
            graph[v2][v1] = true;
        }

        dfs();
        bfs();
    }
}
