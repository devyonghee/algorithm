package dynamicProgramming.joon11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int[] dp = new int[n];
        int[] dpReverse = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                }

                if (array[n - 1 - j] < array[n - 1 - i] && dpReverse[n - 1 - i] <= dpReverse[n - 1 - j]) {
                    dpReverse[n - 1 - i] = dpReverse[n - 1 - j] + 1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i] + dpReverse[i]);
        }
        System.out.println(max + 1);
        br.close();
    }
}