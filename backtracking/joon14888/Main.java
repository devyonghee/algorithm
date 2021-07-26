package backtracking.joon14888;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int[] numbers;
    static int[] operators = new int[4];
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }

        solution(1, numbers[0]);
        System.out.println(max);
        System.out.println(min);
    }

    private static void solution(int index, int result) {
        if (numbers.length == index) {
            if (result < min) {
                min = result;
            }

            if (result > max) {
                max = result;
            }
            return;
        }

        for (int i = 0; i < operators.length; i++) {
            if (operators[i] == 0) {
                continue;
            }

            operators[i]--;
            if (i == 0) {
                solution(index + 1, result + numbers[index]);
            }
            if (i == 1) {
                solution(index + 1, result - numbers[index]);
            }
            if (i == 2) {
                solution(index + 1, result * numbers[index]);
            }
            if (i == 3) {
                solution(index + 1, result / numbers[index]);
            }
            operators[i]++;
        }

    }

}
