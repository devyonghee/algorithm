package bruteForce.joon1436;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 1;
        int cur = 666;
        while (true) {
            if (n == index) {
                System.out.println(cur);
                return;
            }

            cur++;
            if (String.valueOf(cur).contains("666")) {
                index++;
            }
        }
    }
}
