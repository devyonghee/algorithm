package list.joon1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            solution(br);
        }
    }

    private static void solution(BufferedReader br) throws IOException {
        int n = Integer.valueOf(br.readLine());
        int[] scores = new int[n];
        Integer max = null;
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.valueOf(tokenizer.nextToken());
            if (max == null || max < scores[i]) {
                max = scores[i];
            }
        }

        double sum = 0;
        for (int score : scores) {
            sum += ((double)score / (double)max) * 100;
        }
        System.out.println(sum / n);
    }
}
