package math.joon9498;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 90) {
            System.out.println("A");
            return;
        }
        if (a >= 80) {
            System.out.println("B");
            return;
        }
        if (a >= 70) {
            System.out.println("C");
            return;
        }
        if (a >= 60) {
            System.out.println("D");
            return;
        }

        System.out.println("F");
    }
}
