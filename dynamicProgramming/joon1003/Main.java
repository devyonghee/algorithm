package dynamicProgramming.joon1003;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static HashMap<Integer, Integer> zeroCount = new HashMap<>();
    public static HashMap<Integer, Integer> oneCount = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCounts = scanner.nextInt();

        zeroCount.put(0, 1);
        zeroCount.put(1, 0);
        oneCount.put(0, 0);
        oneCount.put(1, 1);

        for (int i = 0; i < testCounts; i++) {
            int n = scanner.nextInt();
            int zero = getCount(zeroCount, n);
            int one = getCount(oneCount, n);
            System.out.println(String.join(" ", String.valueOf(zero), String.valueOf(one)));
        }
    }

    static int getCount(HashMap<Integer, Integer> target, int n) {
        if (target.containsKey(n)) {
            return target.get(n);
        }

        int i = getCount(target, n - 1) + getCount(target, n - 2);
        target.put(n, i);
        return i;
    }
}
