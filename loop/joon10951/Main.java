package loop.joon10951;

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
                try {
                    while (true) {
                        String s = br.readLine();
                        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
                        int i = Integer.valueOf(stringTokenizer.nextToken()) + Integer.valueOf(stringTokenizer.nextToken());
                        writer.write(i + "\n");
                    }
                } catch (Exception e) {
                }
                writer.flush();
            }
        }
    }
}
