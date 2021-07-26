package backtracking.joon2580;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int[][] board = new int[9][9];
    private static boolean[][] sero = new boolean[9][10];
    private static boolean[][] garo = new boolean[9][10];
    private static boolean[][] sqaure = new boolean[9][10];
    private static List<Path> zeros = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < split.length; j++) {
                int number = Integer.parseInt(split[j]);
                board[i][j] = number;
                if (number == 0) {
                    zeros.add(new Path(i, j));
                } else {
                    garo[i][number] = true;
                    sqaure[((i / 3) * 3) + j / 3][number] = true;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int number = board[j][i];
                if (number != 0) {
                    sero[i][number] = true;
                }
            }
        }

        solution(0);
        br.close();
    }

    private static void solution(int depth) {
        if (depth == zeros.size()) {
            for (int[] i : board) {
                for (int number : i) {
                    sb.append(number).append(' ');
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }

        Path path = zeros.get(depth);
        for (int i = 1; i <= 9; i++) {
            if (!garo[path.x][i] && !sero[path.y][i] && !sqaure[(path.x / 3 * 3) + (path.y / 3)][i]) {
                board[path.x][path.y] = i;
                garo[path.x][i] = true;
                sero[path.y][i] = true;
                sqaure[(path.x / 3 * 3) + (path.y / 3)][i] = true;
                solution(depth + 1);
                board[path.x][path.y] = 0;
                garo[path.x][i] = false;
                sero[path.y][i] = false;
                sqaure[(path.x / 3 * 3) + (path.y / 3)][i] = false;
            }
        }
    }

    static class Path {

        int x;
        int y;

        public Path(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
