package backtracking.joon15650;

import java.util.Scanner;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        solution(0, n, m, new int[m], new boolean[n]);
        System.out.println(sb);
    }

    private static void solution(int depth, int n, int m, int[] selects, boolean[] visited) {
        if (depth == m) {
            for (int number : selects) {
                sb.append(number).append(' ');
            }
            sb.append("\n");
            return;
        }

        boolean[] clone = visited.clone();
        for (int i = 0; i < n; i++) {
            if (!clone[i]) {
                clone[i] = true;
                selects[depth] = i + 1;
                solution(depth + 1, n, m, selects, clone);
            }
        }
    }
}
