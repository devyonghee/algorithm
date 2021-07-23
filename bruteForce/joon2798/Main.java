package bruteForce.joon2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int m;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            int n = Integer.valueOf(tokenizer.nextToken());
            m = Integer.valueOf(tokenizer.nextToken());

            numbers = new int[n];
            StringTokenizer numberTokenizer = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.valueOf(numberTokenizer.nextToken());
            }

            int a = findSum(0, 0, 0);
            System.out.println(a);
        }

    }

    private static int findSum(int sum, int index, int count) {
        if (count == 3) {
            if (m < sum) {
                return 0;
            }
            return sum;
        }
        if (index == numbers.length) {
            return 0;
        }
        return Math.max(
                findSum(sum + numbers[index], index + 1, count + 1),
                findSum(sum, index + 1, count));
    }
}
