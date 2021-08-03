package dynamicProgramming.joon9184;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int[][][] data = new int[21][21][21];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            int c = Integer.parseInt(tokenizer.nextToken());

            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            sb.append("w(")
                    .append(a)
                    .append(", ")
                    .append(b)
                    .append(", ")
                    .append(c)
                    .append(") = ")
                    .append(w(a, b, c))
                    .append("\n");
        }

        br.close();

        System.out.println(sb);
    }

    static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if (a > 20 || b > 20 || c > 20) {
            if (data[20][20][20] != 0) {
                return data[20][20][20];
            }
            int w = w(20, 20, 20);
            data[20][20][20] = w;
            return w;
        }

        if (data[a][b][c] != 0) {
            return data[a][b][c];
        }

        if (a < b && b < c) {
            int w = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
            data[a][b][c] = w;
            return w;
        }

        int w = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        data[a][b][c] = w;
        return w;
    }
}