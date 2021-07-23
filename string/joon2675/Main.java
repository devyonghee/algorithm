package string.joon2675;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
                Integer testCount = Integer.valueOf(br.readLine());
                for (int i = 0; i < testCount; i++) {
                    String[] split = br.readLine().split(" ");
                    Integer loopCount = Integer.valueOf(split[0]);
                    String string = split[1];
                    String newString = "";
                    for (String one : string.split("")) {
                        for (int j = 0; j < loopCount; j++) {
                            newString += one;
                        }
                    }
                    bw.write(newString + "\n");
                }

                bw.flush();
            }
        }

    }
}
