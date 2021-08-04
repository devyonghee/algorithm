package dynamicProgramming.joon2565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] left = new int[n];
        int[] dp = new int[n];
        int[] right = new int[501];

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            left[i] = Integer.parseInt(tokenizer.nextToken());
            right[left[i]] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(left);
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (right[left[j]] < right[left[i]] && dp[i] <= dp[j]) {
                    dp[i] = dp[j];
                }
            }

            dp[i] = dp[i] + 1;
            if (max < dp[i]) {
                max = dp[i];
            }
        }

        System.out.println(n - max);
        br.close();
    }
}