package recursive.joon11729;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int n;
    static int count;
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        move(n, 1, 2, 3);
        System.out.println(count);
        System.out.println(builder);
    }

    public static void move(int num, int from, int by, int to) {
        count++;
        if (num == 1) {
            builder.append(from + " " + to + "\n");
            return;
        }

        move(num - 1, from, to, by);
        builder.append(from + " " + to + "\n");
        move(num - 1, by, from, to);
    }

}
