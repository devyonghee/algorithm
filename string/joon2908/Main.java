package string.joon2908;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String first = String.valueOf(sc.nextInt());
        String second = String.valueOf(sc.nextInt());

        char[] chars = {first.charAt(2), first.charAt(1), first.charAt(0)};
        int newFirst = Integer.valueOf(String.valueOf(chars));
        char[] chars2 = {second.charAt(2), second.charAt(1), second.charAt(0)};
        int newSecond = Integer.valueOf(String.valueOf(chars2));

        if (newFirst > newSecond) {
            System.out.println(newFirst);
            return;
        }
        System.out.println(newSecond);
    }
}
