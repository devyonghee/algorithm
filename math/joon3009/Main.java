package math.joon3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        HashSet<Integer> xs = new HashSet<>();
        HashSet<Integer> ys = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 3; i++) {
                StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
                int x = Integer.valueOf(tokenizer.nextToken());
                int y = Integer.valueOf(tokenizer.nextToken());
                if (xs.contains(x)) {
                    xs.remove(x);
                } else {
                    xs.add(x);
                }
                if (ys.contains(y)) {
                    ys.remove(y);
                } else {
                    ys.add(y);
                }
            }
            System.out.println(String.join(" ", String.valueOf(xs.iterator().next()), String.valueOf(ys.iterator().next())));
        }
    }
}
