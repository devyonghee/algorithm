package string.joon11654;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next().getBytes(StandardCharsets.US_ASCII)[0]);
    }
}
