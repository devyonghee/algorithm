package backtracking.joon9663;

import java.util.Scanner;

public class Main {

    private static int count = 0;
    private static int n;
    private static int[] path;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        path = new int[n];
        solution(0);
        System.out.println(count);
    }

    private static void solution(int depth) {
        if (depth == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            path[depth] = i;
            if (isAttacked(depth)) {
                continue;
            }
            solution(depth + 1);
        }
    }

    private static boolean isAttacked(int depth) {
        for (int i = 0; i < depth; i++) {
            if (path[depth] == path[i] || depth - i == Math.abs(path[depth] - path[i])) {
                return true;
            }
        }
        return false;
    }
}
