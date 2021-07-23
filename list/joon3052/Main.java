package list.joon3052;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int nextInt = sc.nextInt();
            result.add(nextInt % 42);
        }
        System.out.println(result.size());
    }
}
