package dynamicProgramming.joon12865;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());

        int maxWeight = Integer.parseInt(tokenizer.nextToken());
        int[][] dp = new int[maxWeight + 1][n + 1];
        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer weightValue = new StringTokenizer(br.readLine(), " ");
            weight[i] = Integer.parseInt(weightValue.nextToken());
            value[i] = Integer.parseInt(weightValue.nextToken());
        }
        br.close();

        for (int i = 1; i <= maxWeight; i++) {
            for (int j = 1; j <= n; j++) {
                if (i < weight[j - 1]) {
                    dp[i][j] = dp[i][j - 1];
                    continue;
                }

                dp[i][j] = Math.max(dp[i - weight[j - 1]][j - 1] + value[j - 1], dp[i][j - 1]);
            }
        }

        System.out.println(dp[maxWeight][n]);
    }
}