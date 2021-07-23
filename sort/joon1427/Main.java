package sort.joon1427;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        Arrays.sort(chars);
        System.out.println(new StringBuilder().append(chars).reverse());
    }
}
