// 2751. 수 정렬하기 2 (https://www.acmicpc.net/problem/2751)

package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Step11_02 {

    final static int THRESHOLD = 3;
    static int[] buf;

    private static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    private static void insertionSort(int[] data, int left, int right) {

        for (int i = left; i <= right; ++i) {
            int min = i;
            for (int j = i; j <= right; ++j) {
                if (data[min] > data[j])
                    min = j;
            }
            swap(data, i, min);
        }
    }

    private static void merge(int[] data, int left, int pivot, int right) {

        int p = 0;
        int i = left;
        while (i <= pivot)
            buf[p++] = data[i++];

        int j = 0;
        int k = left;
        while (i <= right && j < p)
            data[k++] = (buf[j] <= data[i]) ? buf[j++] : data[i++];
        while (j < p)
            data[k++] = buf[j++];
    }

    private static void mergeSort(int[] data, int left, int right) {

        int len = right - left;
        if (len < THRESHOLD) {
            insertionSort(data, left, right);
            return;
        }

        int pivot = left + len / 2;
        mergeSort(data, left, pivot);
        mergeSort(data, pivot + 1, right);
        merge(data, left, pivot, right);
    }

    static void mergeSort(int[] data) {

        buf = new int[data.length];
        mergeSort(data, 0, data.length - 1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());

        // mergeSort(), THRESHOLD(5)    : 916ms
        // Arrays.sort()                : 1540ms
        // Collections.sort()           : 1500ms

        int[] data = new int[len];
        for (int i = 0; i < len; ++i)
            data[i] = Integer.parseInt(br.readLine());
        mergeSort(data);
//        Arrays.sort(data);

//        ArrayList<Integer> data = new ArrayList<>();
//        for (int i = 0; i < len; ++i)
//            data.add(Integer.parseInt(br.readLine()));
//        Collections.sort(data);

        // println() 으로 출력하면 시간 초과
        for (int i : data)
            sb.append(i).append('\n');
        System.out.print(sb);
    }
}
