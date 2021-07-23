package math.joon2884;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        LocalTime minus = LocalTime.of(x, y).minus(45, ChronoUnit.MINUTES);
        System.out.println(String.format("%d %d", minus.getHour(), minus.getMinute()));
    }
}
