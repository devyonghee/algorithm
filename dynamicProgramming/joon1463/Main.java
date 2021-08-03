package dynamicProgramming.joon1463;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int[] minOperator;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        minOperator = new int[n + 1];
        if (n == 1) {
            System.out.println(0);
            return;
        }

        for (int i = 2; i <= n; i++) {
            minOperator[i] = minOperator[i - 1] + 1;
            if (i % 2 == 0) {
                minOperator[i] = Math.min(minOperator[i], minOperator[i / 2] + 1);
            }
            if (i % 3 == 0) {
                minOperator[i] = Math.min(minOperator[i], minOperator[i / 3] + 1);
            }
        }

        System.out.println(minOperator[n]);
    }
}
