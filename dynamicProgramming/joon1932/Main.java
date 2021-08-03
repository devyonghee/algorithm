package dynamicProgramming.joon1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] triangle;
    static int[][] maxMap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        triangle = new int[n][n];
        maxMap = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                if (i == n - 1) {
                    maxMap[i][j] = triangle[i][j];
                    continue;
                }
                maxMap[i][j] = triangle[i][j] + Math.max(maxMap[i + 1][j], maxMap[i + 1][j + 1]);
            }
        }

        System.out.println(maxMap[0][0]);
        br.close();
    }
}
