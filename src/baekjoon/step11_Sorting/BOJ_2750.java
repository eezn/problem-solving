// 2750. 수 정렬하기 (https://www.acmicpc.net/problem/2750)

package baekjoon.step11_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2750 {

    private static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    static void bubbleSort(int[] data) {

        for (int i = 1; i < data.length; ++i)
            for (int j = 0; j < data.length - i; ++j)
                if (data[j] > data[j + 1])
                    swap(data, j, j + 1);
    }

    static void insertionSort(int[] data) {

        for (int i = 0; i < data.length; ++i) {
            int min = i;
            for (int j = i; j < data.length; ++j) {
                if (data[min] > data[j])
                    min = j;
            }
            swap(data, i, min);
        }
    }

    static void selectionSort(int[] data) {

        int i = 0;
        while (++i < data.length) {
            int temp = data[i];
            int j = i;
            while (--j >= 0 && temp < data[j])
                data[j + 1] = data[j];
            data[j + 1] = temp;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // Array
        int[] data = new int[n];
        for (int i = 0; i < n; ++i)
            data[i] = Integer.parseInt(br.readLine());

//        bubbleSort(data);
//        insertionSort(data);
//        selectionSort(data);
        Arrays.sort(data);

        // Collection
//        ArrayList<Integer> data = new ArrayList<>();
//        for (int i = 0; i < n; ++i)
//            data.add(Integer.parseInt(br.readLine()));
//
//        Collections.sort(data);

        for (int i : data)
            System.out.println(i);
    }
}
