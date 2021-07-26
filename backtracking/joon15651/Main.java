package backtracking.joon15651;

import java.util.Scanner;

public class Main {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        solution(0, n, m, new int[m]);
        System.out.println(sb);
    }

    private static void solution(int depth, int n, int m, int[] select) {
        if (depth == m) {
            for (int i : select) {
                sb.append(i).append(' ');
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            select[depth] = i + 1;
            solution(depth + 1, n, m, select);
        }
    }
}
