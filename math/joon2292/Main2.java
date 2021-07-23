package math.joon2292;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long target = sc.nextLong();
        int index = 1;
        while (true) {
            if (target <= ((long) index * index - index) * 3 + 1) {
                System.out.println(index);
                break;
            }
            index++;
        }
    }
}
