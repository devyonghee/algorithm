package math.joon9020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        for (int i = 0; i < testCount; i++) {
            int n = sc.nextInt();

            int prime1 = 0;
            int prime2 = 0;
            for (int j = 2; j <= (n - j); j++) {
                if ((isPrime(j) && isPrime(n - j)) &&
                        (prime1 == 0 || (prime2 - prime1) > n - (2 * j))
                ) {
                    prime1 = j;
                    prime2 = n - j;
                }
            }
            System.out.println(
                    String.join(" ", String.valueOf(prime1), String.valueOf(prime2))
            );
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
