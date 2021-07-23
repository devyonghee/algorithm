package math.joon2739;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        IntStream.range(1, 10).forEach(i -> System.out.println(String.format("%d * %d = %d", n, i, n * i)));
    }
}
