package dynamicProgramming.joon1904;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value1 = 0;
        int value2 = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = (value1 + value2) % 15746;
            value1 = value2;
            value2 = sum;
        }

        System.out.println(sum);
    }
}
