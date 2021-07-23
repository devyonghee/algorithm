package loop.joon2439;

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
                    for (int j = 0; j < n - i; j++) {
                        writer.write(" ");
                    }

                    for (int j = n - i; j < n; j++) {
                        writer.write("*");
                    }
                    writer.write("\n");
                }

                writer.flush();
            }
        }
    }
}
