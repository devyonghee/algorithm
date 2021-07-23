package math.joon4948;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                return;
            }
            int count = 0;
            for (int i = number+1; i <= number * 2; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    private static boolean isPrime(int i) {
        if (i == 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(i);
        for (int j = 2; j <= sqrt; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
