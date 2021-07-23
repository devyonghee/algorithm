package sort.joon2751;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < count; i++) {
            heap.add(Integer.valueOf(br.readLine()));
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < count; i++) {
            bw.write(heap.poll() + "\n");
        }

        bw.flush();
        bw.close();
    }
}
