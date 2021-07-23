package loop.joon11022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

                int n = Integer.valueOf(br.readLine());

                for (int i = 1; i <= n; i++) {
                    StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
                    Integer integer1 = Integer.valueOf(stringTokenizer.nextToken());
                    Integer integer2 = Integer.valueOf(stringTokenizer.nextToken());
                    writer.write(String.format("Case #%d: %d + %d = %d\n", i, integer1, integer2, integer1 + integer2));
                }

                writer.flush();
            }
        }
    }
}
