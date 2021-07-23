package sort.joon2108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] ints = new int[8001];

        int sum = 0;
        int addedIndex = 4000;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            ints[number + addedIndex]++;
            sum += number;
        }

        int midNumber = 0;
        Integer minNumber = null;
        int count = 0;
        int maxNumber = 0;
        int maxCount = 0;
        int[] maxCountNumbers = new int[2];
        int maxCountsIndex = 0;
        for (int i = 0; i < ints.length; i++) {
            int numberCount = ints[i];
            for (int j = 0; j < numberCount; j++) {
                count++;
                if (count == (n / 2 + 1)) {
                    midNumber = i - addedIndex;
                }
            }

            if (1 <= numberCount) {
                maxNumber = i - addedIndex;
                if (minNumber == null) {
                    minNumber = i - addedIndex;
                }

                if (maxCount < ints[i]) {
                    maxCount = ints[i];
                    maxCountsIndex = 0;
                    maxCountNumbers[maxCountsIndex] = i - addedIndex;
                } else if (maxCount == ints[i] && maxCountsIndex == 0) {
                    maxCountsIndex = 1;
                    maxCountNumbers[maxCountsIndex] = i - addedIndex;
                }
            }
        }

        bw.write(Math.round(((double) sum) / ((double) n)) + "\n");
        bw.write(midNumber + "\n");
        bw.write(maxCountNumbers[maxCountsIndex] + "\n");
        bw.write(maxNumber - minNumber + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
