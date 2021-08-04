package dynamicProgramming.joon9251;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] first = sc.next().toCharArray();
        char[] second = sc.next().toCharArray();
        int[][] dp = new int[first.length + 1][second.length + 1];

        for (int i = 1; i < first.length + 1; i++) {
            for (int j = 1; j < second.length + 1; j++) {
                if (first[i - 1] != second[j - 1]) {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                    continue;
                }

                dp[i][j] = dp[i - 1][j - 1] + 1;
            }
        }
        System.out.println(dp[first.length][second.length]);
    }
}