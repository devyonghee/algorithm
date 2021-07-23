package loop.joon2438;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
                int n = Integer.valueOf(br.readLine());

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        writer.write("*");
                    }
                    writer.write("\n");
                }

                writer.flush();
            }
        }
    }
}
