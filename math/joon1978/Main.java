package math.joon1978;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        int count = 0;
        for (int i = 0; i < testCount; i++) {
            int number = sc.nextInt();
            if (number == 1) {
                continue;
            }
            int sqrt = (int) Math.sqrt(number);
            if (isPrime(number, sqrt)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int number, int sqrt) {
        for (int j = 2; j <= sqrt; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
