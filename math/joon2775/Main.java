package math.joon2775;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        for (int i = 0; i < testCount; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(find(k, n));
        }
    }

    public static int find(int x, int y) {
        if (x == 0) {
            return y;
        }

        int sum = 0;
        for (int i = 1; i <= y; i++) {
            sum += find(x - 1, i);
        }
        return sum;
    }
}
