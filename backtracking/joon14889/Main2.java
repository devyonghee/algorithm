package backtracking.joon14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    private static int n;
    private static int[][] ability;
    private static boolean[] visited;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ability = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                ability[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        visited = new boolean[n];

        br.close();
        solution(0, 0);
        System.out.println(min);
    }

    private static void solution(int depth, int number) {
        if (depth >= n / 2) {
            int calculate = calculate();
            if (calculate == 0) {
                System.out.println(0);
                System.exit(0);
            }
            min = Math.min(min, calculate);
            return;
        }

        for (int i = number; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            solution(depth + 1, i);
            visited[i] = false;
        }
    }

    private static int calculate() {
        int startSum = 0;
        int linkSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i] && visited[j]) {
                    startSum += ability[i][j];
                }
                if (!visited[i] && !visited[j]) {
                    linkSum += ability[i][j];
                }
            }
        }

        return Math.abs(startSum - linkSum);
    }
}
