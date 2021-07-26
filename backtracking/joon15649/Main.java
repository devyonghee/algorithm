package backtracking.joon15649;

import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int[] result;
    static boolean[] visited;
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        result = new int[m];
        visited = new boolean[n];
        solution(0);

        System.out.println(builder);
    }

    private static void solution(int depth) {
        if (depth == m) {
            for (int select : result) {
                builder.append(select).append(' ');
            }
            builder.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = i + 1;
                solution(depth + 1);
                visited[i] = false;
            }
        }
    }
}
