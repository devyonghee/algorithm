package dynamicProgramming.joon2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] stair;
    static int[] maxMap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        maxMap = new int[n + 1];
        stair = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                maxMap[i] = stair[i];
                continue;
            }

            if (i == 2) {
                maxMap[i] = stair[i] + maxMap[1];
                continue;
            }

            maxMap[i] = stair[i] + Math.max(maxMap[i - 2], stair[i - 1] + maxMap[i - 3]);
        }

        System.out.println(maxMap[n]);
        br.close();
    }
}
