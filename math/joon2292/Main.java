package math.joon2292;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long target = sc.nextLong();

        int index = 0;
        long prevNumber = 1;
        while (true) {
            if (target <= prevNumber + (index * 6L)) {
                System.out.println(index + 1);
                break;
            }
            prevNumber += index * 6L;
            index++;
        }
    }
}
