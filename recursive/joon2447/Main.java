package recursive.joon2447;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    static char[][] results;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int num = sc.nextInt();
            results = new char[num][num];

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    recursive(i, j, num);
                }
            }

            for (char[] i : results) {
                for (char j : i) {
                    bw.write(j);
                }
                bw.write("\n");
            }
            bw.flush();
        }
    }

    public static void recursive(int x, int y, int num) {
        if ((x / num) % 3 == 1 && (y / num) % 3 == 1) {
            results[x][y] = ' ';
            return;
        }

        if (num == 1) {
            results[x][y] = '*';
        } else {
            recursive(x, y, num / 3);
        }
    }

}
