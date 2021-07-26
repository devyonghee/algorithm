package backtracking.joon15652;

import java.util.Scanner;

public class Main {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        solution(0, n, m, new int[m], new boolean[n]);
        System.out.println(sb);
    }

    private static void solution(int depth, int n, int m, int[] select, boolean[] visited) {
        if (depth == m) {
            for (int i : select) {
                sb.append(i).append(' ');
            }
            sb.append("\n");
            return;
        }

        boolean[] newVisited = visited.clone();
        for (int i = 0; i < n; i++) {
            if (!newVisited[i]) {
                select[depth] = i + 1;
                solution(depth + 1, n, m, select, newVisited);
                newVisited[i] = true;
            }
        }
    }
}
