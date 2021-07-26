package backtracking.joon14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int n;
    private static int[][] ability;
    private static int[] start;
    private static int[] link;
    private static boolean[][] visited;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        start = new int[n / 2];
        link = new int[n / 2];
        ability = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                ability[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        br.close();
        solution(0, 0, 0);
        System.out.println(min);
    }

    private static void solution(int number, int depth, int linkIndex) {
        if (start.length <= depth && link.length <= linkIndex) {
            int calculate = calculate();
            if (calculate == 0) {
                System.out.println(0);
                System.exit(0);
            }

            if (calculate < min) {
                min = calculate;
            }
            return;
        }

        if (number >= n) {
            return;
        }

        if (depth < start.length) {
            start[depth] = number;
            solution(number + 1, depth + 1, linkIndex);
            start[depth] = 0;
        }

        if (linkIndex < link.length) {
            link[linkIndex] = number;
            solution(number + 1, depth, linkIndex + 1);
            link[linkIndex] = 0;
        }
    }

    private static int calculate() {
        int startSum = 0;
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < start.length; j++) {
                startSum += ability[start[i]][start[j]];
            }
        }

        int linkSum = 0;
        for (int i = 0; i < link.length; i++) {
            for (int j = 0; j < link.length; j++) {
                linkSum += ability[link[i]][link[j]];
            }
        }

        return Math.abs(startSum - linkSum);
    }
}
