package dynamicProgramming.joon1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] colorValues = new int[n][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            colorValues[i][0] = Integer.parseInt(tokenizer.nextToken());
            colorValues[i][1] = Integer.parseInt(tokenizer.nextToken());
            colorValues[i][2] = Integer.parseInt(tokenizer.nextToken());
        }

        int[] sumValue = new int[3];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sumValue[0] = colorValues[i][0];
                sumValue[1] = colorValues[i][1];
                sumValue[2] = colorValues[i][2];
                continue;
            }
            int i1 = sumValue[0];
            int i2 = sumValue[1];
            int i3 = sumValue[2];
            sumValue[0] = colorValues[i][0] + ((i2 < i3) ? i2 : i3);
            sumValue[1] = colorValues[i][1] + ((i1 < i3) ? i1 : i3);
            sumValue[2] = colorValues[i][2] + ((i1 < i2) ? i1 : i2);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if (sumValue[i] < min) {
                min = sumValue[i];
            }
        }
        br.close();
        System.out.println(min);
    }
}
