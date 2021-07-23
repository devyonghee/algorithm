package string.joon5622;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        int time = 0;
        for (char dialString : next.toCharArray()) {
            int dialAscii = dialString >= 'S' ? dialString - 'A' - 1 : dialString - 'A';
            int dialNumber = (dialAscii / 3) + 2;
            if (dialNumber > 9) {
                dialNumber = 9;
            }
            time += dialNumber + 1;
        }
        System.out.println(time);
    }
}
