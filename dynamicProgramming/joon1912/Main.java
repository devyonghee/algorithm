package dynamicProgramming.joon1912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        int[] array = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(tokenizer.nextToken());
        }

        dp[0] = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            dp[i] = Math.max(array[i] + dp[i - 1], array[i]);
            if (max < dp[i]) {
                max = dp[i];
            }
        }

        System.out.println(max);
        br.close();
    }
}