package recursive.joon10872;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0){
            System.out.println(1);
            return;
        }
        System.out.println(recursive(number));
    }

    public static int recursive(int num) {
        if (num == 1) {
            return num;
        }

        return num * recursive(num - 1);
    }

}
