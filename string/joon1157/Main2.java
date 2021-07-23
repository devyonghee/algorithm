package string.joon1157;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String string = sc.next().toUpperCase();

        int[] ints = new int[26];
        for (char i : string.toCharArray()) {
            ints[i - 'A'] += 1;
        }
        int max = 0;
        char maxChar = '?';
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
                maxChar = (char) (i + 'A');
            }
        }

        for (int i = 0; i < ints.length; i++) {
            if (maxChar != (char) (i + 'A') && max == ints[i]) {
                System.out.println('?');
                return;
            }
        }

        System.out.println(maxChar);
    }
}
