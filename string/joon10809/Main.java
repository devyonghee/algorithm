package string.joon10809;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String result = "";
        for (char i = 'a'; i <= 'z'; i++) {
            if (i == 'a') {
                result += string.indexOf(i);
                continue;
            }
            result += " " + string.indexOf(i);
        }

        System.out.println(result);
    }

}
