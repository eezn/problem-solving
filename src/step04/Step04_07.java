package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step04_07 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        ArrayList<Double> ratio = new ArrayList<Double>();
        StringTokenizer st;

        for (int i = 0; i < C; ++i) {
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            ArrayList<Double> caseScores = new ArrayList<Double>();

            double caseTotal = 0;
            for (int j = 0; j < N; ++j) {
                caseScores.add(Double.parseDouble(st.nextToken()));
                caseTotal += caseScores.get(j);
            }
            double caseAvg = caseTotal / N;
            double aboveStudent = 0;
            for (double score : caseScores)
                if (score > caseAvg) aboveStudent++;
            ratio.add(aboveStudent / N);
        }

        for (double r : ratio) {
            System.out.printf("%.03f%%\n", r * 100);
        }
    }
}
