package string.joon1157;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String string = sc.next().toUpperCase();

        HashMap<String, Integer> results = new HashMap<>();
        for (String target : string.split("")) {
            if (!results.containsKey(target)) {
                results.put(target, 1);
                continue;
            }
            results.put(target, results.get(target) + 1);
        }

        AtomicReference<String> maxString = new AtomicReference<>("");
        AtomicInteger maxCount = new AtomicInteger();
        results.forEach((key, count) -> {
            if (maxCount.get() < count) {
                maxCount.set(count);
                maxString.set(key);
            }
        });

        if (results.values().stream().filter(value -> value == maxCount.get()).count() > 1) {
            System.out.println("?");
        } else {
            System.out.println(maxString);
        }
    }
}
