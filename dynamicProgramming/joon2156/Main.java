package dynamicProgramming.joon2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] quantity;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        quantity = new int[n + 2];
        dp = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            quantity[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = quantity[1];
        dp[2] = quantity[1] + quantity[2];
        if (n <= 2) {
            System.out.println(dp[n]);
            return;
        }

        for (int i = 3; i <= n + 1; i++) {
            dp[i] = quantity[i] + Math.max(quantity[i - 1] + dp[i - 3], dp[i - 2]);
            dp[i] = Math.max(dp[i - 1], dp[i]);
        }
        br.close();
        System.out.println(dp[n + 1]);
    }
}
