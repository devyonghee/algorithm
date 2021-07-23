package math.joon11653;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number >= 2) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                    number /= i;
                    break;
                }
            }
        }
    }
}
