package math.joon10250;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();

        for (int i = 0; i < testCount; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int customer = sc.nextInt();
            int x = (customer % h == 0) ? (customer / h) : (customer / h) + 1;
            int y = (customer % h == 0) ? h : (customer % h);
            System.out.println(String.format("%d%2d", y, x).replace(' ', '0'));
        }
    }
}
