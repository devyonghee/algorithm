package string.joon2941;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String croatia : croatias) {
            string = string.replaceAll(croatia, " ");
        }

        System.out.println(string.length());
    }
}
