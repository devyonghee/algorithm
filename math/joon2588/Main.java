package math.joon2588;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<String> list = Arrays.asList(String.valueOf(b).split(""));
        Collections.reverse(list);
        list.stream()
                .map(Integer::valueOf)
                .forEach(i -> System.out.println(a * i));
        System.out.println(a * b);
    }
}
