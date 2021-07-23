package math.joon4673;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> notSelfInts = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            int current = i;
            String[] splitN = String.valueOf(i).split("");
            for (String n : splitN) {
                current += Integer.valueOf(n);
            }
            notSelfInts.add(current);
        }

        for (int j = 0; j < 10000; j++) {
            if (!notSelfInts.contains(j)) {
                System.out.println(j);
            }
        }

    }
}
