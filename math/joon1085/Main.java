package math.joon1085;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(Arrays.asList(x, y, w - x, h - y).stream().min(Integer::compareTo).get());
    }
}
