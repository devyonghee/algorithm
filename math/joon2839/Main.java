package math.joon2839;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n % 5) == 0) {
            System.out.println(n / 5);
            return;
        }

        for (int i = (n / 5); i >= 0; i--) {
            int rest = n - (i * 5);
            if (rest % 3 == 0) {
                System.out.println(i + rest / 3);
                return;
            }
        }
        System.out.println(-1);
    }
}
