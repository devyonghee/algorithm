package math.joon1065;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            boolean isOne = true;
            String[] split = String.valueOf(i).split("");
            Integer prevInt = null;
            Integer different = null;
            for (String number : split) {
                Integer integer = Integer.valueOf(number);

                if (prevInt == null) {
                    prevInt = integer;
                    continue;
                }

                if (different == null) {
                    different = integer - prevInt;
                    prevInt = integer;
                    continue;
                }

                if (different != (integer - prevInt)) {
                    isOne = false;
                    break;
                }
                prevInt = integer;
            }
            if (isOne) {
                count++;
            }
        }

        System.out.println(count);
    }
}
