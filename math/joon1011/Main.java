package math.joon1011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
                int testCount = Integer.valueOf(br.readLine());

                for (int i = 0; i < testCount; i++) {
                    StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
                    int x = Integer.valueOf(tokenizer.nextToken());
                    int y = Integer.valueOf(tokenizer.nextToken());

                    int distance = y - x;
                    int maxV = (int) Math.sqrt(distance);

                    if (distance == maxV * maxV) {
                        bw.write((2 * maxV - 1) + "\n");
                        continue;
                    } else if (maxV * maxV + maxV >= distance) {
                        bw.write((2 * maxV) + "\n");
                        continue;
                    }
                    bw.write((2 * maxV + 1) + "\n");
                }

                bw.flush();
            }
        }

    }
}


