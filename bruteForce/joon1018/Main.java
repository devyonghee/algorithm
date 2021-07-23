package bruteForce.joon1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        int sero = Integer.valueOf(tokenizer.nextToken());
        int garo = Integer.valueOf(tokenizer.nextToken());
        char[][] chars = new char[sero][garo];

        for (int i = 0; i < sero; i++) {
            String s = br.readLine();
            for (int j = 0; j < garo; j++) {
                chars[i][j] = s.charAt(j);
            }
        }

        Integer minCount = null;
        for (int i = 0; i + 8 <= sero; i++) {
            for (int j = 0; 8 + j <= garo; j++) {

                int count = Math.min(getCount(chars, i, j, 'B'),
                        getCount(chars, i, j, 'W')
                );

                if (minCount == null || count < minCount) {
                    minCount = count;
                }
            }
        }

        System.out.println(minCount);
        br.close();
    }

    private static int getCount(char[][] chars, int i, int j, char first) {
        int count = 0;

        for (int k = i; k < i + 8; k++) {
            for (int l = j; l < j + 8; l++) {

                if ((k + l) % 2 == 0) {
                    if (chars[k][l] != first) {
                        count++;
                    }
                } else {
                    if (chars[k][l] == first) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
