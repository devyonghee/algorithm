package math.joon4153;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            int max = Math.max(a, Math.max(b, c));
            System.out.println(((a * a) + (b * b) + (c * c)) == max * max * 2 ?
                    "right" : "wrong");
        }
    }
}
