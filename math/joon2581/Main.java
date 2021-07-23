package math.joon2581;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int resultMin = 0;
        int resultSum = 0;
        for (int i = min; i <= max; i++) {
            if (!isPrime(i)) {
                continue;
            }
            resultSum += i;
            if (resultMin == 0) {
                resultMin = i;
            }
        }
        if (resultSum == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(resultSum);
        System.out.println(resultMin);
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number != i && number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
