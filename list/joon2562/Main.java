package list.joon2562;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer max = sc.nextInt();
        Integer index = 1;

        for (int i = 2; i <= 9; i++) {
            int nextInt = sc.nextInt();
            if (max < nextInt) {
                max = nextInt;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
