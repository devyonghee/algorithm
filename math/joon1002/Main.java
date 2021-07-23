package math.joon1002;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCounts = scanner.nextInt();
        for (int i = 0; i < testCounts; i++) {
            int firstX = scanner.nextInt();
            int firstY = scanner.nextInt();
            int firstR = scanner.nextInt();
            int secondX = scanner.nextInt();
            int secondY = scanner.nextInt();
            int secondR = scanner.nextInt();

            int distance = (int) (Math.pow(firstX - secondX, 2) + Math.pow(firstY - secondY, 2));
            if (distance == 0 && firstR == secondR) {
                System.out.println(-1);
                continue;
            }

            if ((distance < Math.pow(firstR - secondR, 2)) || (distance > Math.pow(firstR + secondR, 2))) {
                System.out.println(0);
                continue;
            }

            if ((distance == Math.pow(firstR + secondR, 2)) || (distance == Math.pow(firstR - secondR, 2))) {
                System.out.println(1);
                continue;
            }

            System.out.println(2);
        }
    }
}
