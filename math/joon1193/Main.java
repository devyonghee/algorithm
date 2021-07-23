package math.joon1193;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println(String.format("1/1"));
            return;
        }

        int index = 0;
        int sum = 0;

        while (true) {
            sum += index++;
            if (x > sum) {
                continue;
            }

            int mom = index;
            int sun = 0;
            while (true) {
                if (sum - sun == x) {
                    if (index % 2 != 0) {
                        System.out.println(String.format("%d/%d", mom - 1, sun + 1));
                    } else {
                        System.out.println(String.format("%d/%d", sun + 1, mom-1));
                    }
                    return;
                }
                mom--;
                sun++;
            }
        }
    }
}
