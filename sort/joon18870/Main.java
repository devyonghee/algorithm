package sort.joon18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        long[] longs = new long[n];
        long[] sortedLongs = new long[n];
        for (int i = 0; i < n; i++) {
            long l = Long.parseLong(tokenizer.nextToken());
            longs[i] = l;
            sortedLongs[i] = l;
        }

        Arrays.sort(sortedLongs);
        long index = 0;
        HashMap<Long, Long> longIndex = new HashMap<>();
        for (long number : sortedLongs) {
            if (!longIndex.containsKey(number)) {
                longIndex.put(number, index++);
            }
        }

        for (int i = 0; i < longs.length; i++) {
            if(i > 0){
                sb.append(' ');
            }
            sb.append(longIndex.get(longs[i]));
        }

        br.close();
        System.out.println(sb);
    }
}
