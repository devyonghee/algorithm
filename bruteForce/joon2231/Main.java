package bruteForce.joon2231;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();

        int maxSum = Math.min(result, String.valueOf(result).split("").length * 9);
        for (int i = result - maxSum; i < result; i++) {
            int sum = i;
            for (String value :
                    String.valueOf(i).split("")) {
                sum += Integer.valueOf(value);
            }

            if (sum == result) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
