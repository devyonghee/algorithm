package loop.joon1110;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int origin = scanner.nextInt();

        int index = 0;
        int number = origin;
        do {
            String[] split = String.format("%2d", number).replace(" ", "0").split("");
            String s = split[0];
            String s2 = split[1];

            String[] split1 = s2.split("");
            String firstString = split1[split1.length - 1];

            int sum = Integer.valueOf(s) + Integer.valueOf(s2);
            String[] split2 = String.valueOf(sum).split("");
            String secondString = split2[split2.length - 1];
            number = Integer.valueOf(firstString + secondString);
            index++;
        } while (number != origin);
        System.out.println(index);
    }
}
