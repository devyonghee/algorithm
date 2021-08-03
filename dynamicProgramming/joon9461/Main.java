package dynamicProgramming.joon9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCount; i++) {
            int n = Integer.parseInt(br.readLine());

            long value1 = 1;
            long value2 = 1;
            long value3 = 1;
            long sum = 0;
            if (n <= 3) {
                System.out.println(1);
                continue;
            }

            for (int j = 3; j < n; j++) {
                sum = value1 + value2;
                value1 = value2;
                value2 = value3;
                value3 = sum;
            }
            System.out.println(sum);
        }
        br.close();
    }
}
