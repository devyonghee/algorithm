package loop.joon11021;

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
                    int result = Integer.valueOf(stringTokenizer.nextToken()) + Integer.valueOf(stringTokenizer.nextToken());
                    writer.write("Case #" + i + ": " + result + "\n");
                }

                writer.flush();
            }
        }
    }
}
