package sort.joon2750;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(br.readLine());
        int[] ints = new int[count];
        for (int i = 0; i < count; i++) {
            ints[i] = Integer.valueOf(br.readLine());
        }
        br.close();
        Arrays.sort(ints);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int num : ints) {
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
    }
}
