package recursive.joon10870;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static HashMap<Integer, Integer> fibonacci = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibonacci.put(0, 0);
        fibonacci.put(1, 1);
        System.out.println(recursive(sc.nextInt()));
    }

    public static int recursive(int num) {
        if (fibonacci.containsKey(num)) {
            return fibonacci.get(num);
        }

        int result = recursive(num - 1) + recursive(num - 2);
        fibonacci.put(num, result);
        return result;
    }

}
