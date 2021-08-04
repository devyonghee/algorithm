package dynamicProgramming.joon11053;

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
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");

        int max = 0;
        for(int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(tokenizer.nextToken());
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i] && dp[i] < dp[j]) {
                    dp[i] = dp[j];
                }
            }

            dp[i] = dp[i] + 1;
            if (max < dp[i]) {
                max = dp[i];
            }
        }

        System.out.println(max);
        br.close();
    }
}