package string.joon11720;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer sum = Arrays.stream(String.valueOf(sc.nextBigInteger()).split("")).map(Integer::valueOf).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
